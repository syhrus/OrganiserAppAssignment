package au.edu.utas.www.organiserapp;

import java.io.Serializable;

/**
 * Created by Rhys on 14/05/2017.
 */

public class taskObject implements Serializable {
    private static final long serialVersionUID = -291684561391L;


    public String name;
    public String description;
    public java.util.Date dueDate;
    public float urgency;
    private int ID;

    //create blank task
    taskObject(){
        name = "";
        description = "";
        dueDate = new java.util.Date();
        urgency = 0.0f;
        ID = GlobalVariables.assignID();
    }

    //create task with all details
    taskObject(String n, String d, java.util.Date dd, float u){
        name = n;
        description = d;
        dueDate = dd;
        urgency = u;
        ID = GlobalVariables.assignID();
    }

    //returns the task's unique ID
    int getID (){
        return ID;
    }

    //Modifies existing task
    public void changeTask (String newName, String newDescription, java.util.Date newDate, float newUrgency) {
        name = newName;
        description = newDescription;
        dueDate = newDate;
        urgency = newUrgency;
    }
    @Override
    public String toString() {
        return this.name + "    DUE: " + this.dueDate.getDate() + "/" + (this.dueDate.getMonth() + 1) + "/" + (this.dueDate.getYear() + 1900);
    }


}
