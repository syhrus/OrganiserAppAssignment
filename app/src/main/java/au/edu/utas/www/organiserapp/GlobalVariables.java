package au.edu.utas.www.organiserapp;

import android.app.Application;
import android.util.Log;

import java.util.Vector;

/**
 * Created by Rhys on 14/05/2017.
 */

public class GlobalVariables extends Application {

    private Vector<taskObject> allTasks;
    private static int currentID = 0;
    private int tmqScore = 0;

    //Returns all tasks
    public Vector<taskObject> getAllTasks() {
        if(allTasks == null) {
            //If no tasks exist, create the list
            allTasks = new Vector<taskObject>();
        };
        return allTasks;
    }

    //Returns all tasks due before the input date.
    public Vector<taskObject> getTasksBeforeDate(java.util.Date maxDate){

        if(allTasks == null) {
            //If no tasks exist, create the list
            allTasks = new Vector<taskObject>();
        };
        //TODO: Add check to make this select only tasks before the input date
        return allTasks;
    }

    //Creates a new task and adds it to the list
    public void addNewTask(String name, String description, java.util.Date dueDate, float Urgency){
        taskObject newTask = new taskObject(name, description, dueDate, Urgency);
        if(allTasks == null){
            allTasks = new Vector<taskObject>();
        }
        int i = 0;
        if(!allTasks.isEmpty()) {
            taskObject current = allTasks.get(i);
            //Add tasks in date order to make sorting faster later.
            while (current != null && current.dueDate.after(newTask.dueDate)) {
                //Traverse until date is after the one being added
                i++;
                current = allTasks.get(i);
            }
        }
        allTasks.add(i, newTask);
    }

    //Assigns a task a unique ID on creation.
    public static int assignID(){
        return currentID++;
    }

    //Returns a task matching the ID provided. Returns NULL when task doesn't exist.
    public taskObject getTaskByID(int id){
        taskObject task;

        int i = 0;
        do {
            task = allTasks.get(i);
            i++;
        }while (i < allTasks.size() && task.getID() != id);
        if(task.getID() == id){
            return task;
        }else{
            return null;
        }
    }

    //removes task from list
    public void completeTask(taskObject task){
            allTasks.remove(task);
    }

    public int getScore(){

        return tmqScore;
    }

    public void setScore(int a){

        tmqScore = a;
    }

}
