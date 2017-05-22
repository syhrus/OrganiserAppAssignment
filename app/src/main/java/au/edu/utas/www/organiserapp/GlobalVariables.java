package au.edu.utas.www.organiserapp;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Vector;

import static java.lang.System.in;

/**
 * Created by Rhys on 14/05/2017.
 */

public class GlobalVariables extends Application {

    private TaskVector allTasks;
    private static int currentID = 0;
    private int tmqScore = 0;

    //Returns all tasks
    public Vector<taskObject> getAllTasks() {
        if(allTasks == null) {
            //If no tasks exist, create the list
            allTasks = new TaskVector();
        }else{
            //Otherwise just load the data
            allTasks = allTasks.load("SavedTasks", this);
        };
        return allTasks;
    }

    //Returns all tasks due before the input date.
    public Vector<taskObject> getTasksBeforeDate(java.util.Date maxDate){
        Vector<taskObject> tasksBefore = new TaskVector();
        if(allTasks == null) {
            //If no tasks exist, create the list
            allTasks = new TaskVector();
        }else {
            for (int i = 0; i<allTasks.size(); i++) {
                if(allTasks.get(i).dueDate.before(maxDate) || allTasks.get(i).dueDate.equals(maxDate))
                    tasksBefore.add(allTasks.get(i));
            }
        }
        return tasksBefore;
    }

    //Returns a certain number of tasks in order of importance vs due date
    public Vector<taskObject> getTasksByPriority(float threshhold){
        Vector<taskObject> priorityTasks = new Vector<taskObject>();
        if(allTasks == null){
            //make list exist if it doesn't
            allTasks = new TaskVector();
        }
        for (int i = 0; i<allTasks.size(); i++){
            //Use importance and duedate to determine importance
            taskObject current = allTasks.get(i);
            float importance;
            if(current.urgency<1){
                //To avoid divide-by-zero errors
                importance = 1;
            }else{
                importance = current.urgency;
            }
            int daystogo = (int)( (current.dueDate.getTime() - new Date().getTime()) / (1000 * 60 * 60 * 24));
            int priority = (int) (daystogo/importance);
            if(priority <= threshhold) {
                if(!priorityTasks.isEmpty()){
                    boolean found = false;
                    int ii = 0;
                    while(!found){
                        taskObject current2 = priorityTasks.get(ii);
                        int daystogo2 = (int)( (current2.dueDate.getTime() - new Date().getTime()) / (1000 * 60 * 60 * 24));
                        int priority2 = (int) (daystogo2/current2.urgency);
                        if(priority>priority2){
                            ii++;
                        }else{
                            priorityTasks.add(ii, allTasks.get(i));
                            found = true;
                        }
                    }
                }else {
                    priorityTasks.add(allTasks.get(i));
                }
            }
        }

        return priorityTasks;
    }

    //Creates a new task and adds it to the list
    public void addNewTask(String name, String description, java.util.Date dueDate, float Urgency){
        taskObject newTask = new taskObject(name, description, dueDate, Urgency);
        if(allTasks == null){
            allTasks = new TaskVector();
        }
        int i = 0;
        if(!allTasks.isEmpty()) {
            taskObject current = allTasks.get(i);
            //Add tasks in date order to make sorting faster later.
            do {
                //Traverse until date is after the one being added
                current = allTasks.get(i);
                i++;
            } while (i < allTasks.size() && current.dueDate.before(newTask.dueDate));
        }
        allTasks.add(i, newTask);
        allTasks.save("SavedTasks", this);
    }

    //Assigns a task a unique ID on creation.
    public static int assignID(){
        return currentID++;
    }

    //Returns a task matching the ID provided. Returns NULL when task doesn't exist.
    public taskObject getTaskByID(int id){
        taskObject task;
        if(allTasks != null) {
            int i = 0;
            do {
                task = allTasks.get(i);
                i++;
            } while (i < allTasks.size() && task.getID() != id);
            if (task.getID() == id) {
                return task;
            } else {
                return null;
            }
        }else {
            return null;
        }
    }

    //removes task from list
    public void completeTask(taskObject task){
            allTasks.remove(task);
        allTasks.save("SavedTasks", this);
    }

    public int getScore(String name, Context ctx){
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(new File(new File(ctx.getFilesDir(),"")+File.separator+name)));
            int loaded = (int) input.readObject();
            input.close();
            tmqScore = loaded;
        }
        catch(IOException e) {
            e.printStackTrace();
            tmqScore = 0;
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
            tmqScore = 0;
        }

        return tmqScore;
    }

    public void setScore(int a, String name, Context ctx){

        tmqScore = a;
        try {
            File file = new File(ctx.getFilesDir(), name);
            if(!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = ctx.openFileOutput(name, Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

}
