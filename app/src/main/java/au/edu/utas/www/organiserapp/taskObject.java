package au.edu.utas.www.organiserapp;

/**
 * Created by Rhys on 14/05/2017.
 */

public class taskObject {


    public String name;
    public String description;
    public java.util.Date dueDate;
    public float urgency;

    taskObject(){
        name = "";
        description = "";
        dueDate = new java.util.Date();
        urgency = 0.0f;
    }

    taskObject(String n, String d, java.util.Date dd, float u){
        name = n;
        description = d;
        dueDate = dd;
        urgency = u;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
