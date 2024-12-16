package main.java.Projects;

import java.util.*;

public class Project {
    String name;
    String desc;
    protected ArrayList<Object> currentTasks = new ArrayList<Object>();
    protected ArrayList<Object> finishedTasks;
    protected ArrayList<Object> members;
    String[] tags = new String[100];


    public Project(String name, String desc) {
        this.name = name;
        this.desc = desc;

    }

    //adds a task to the list of task
    public Boolean generateTask(Object task) {
        if (!currentTasks.contains(task)) {
            currentTasks.add(task);
            return true;
        } else { 
            return false;
        }
    }

    //removes a task if it exists in current tasks
    public String finishTask(Object task) {
        if (currentTasks.contains(task)) {
            currentTasks.remove(task);
            finishedTasks.add(task);
            return "Succesfully finished";
        } else {
            return "Task doesn't exist, try changing the name";
        }
        
    }

    //adds members to the project
    public Boolean addMember(Object membership) {
        return members.add(membership);
    }


    //remvoes members from the project
    public Boolean removeMember(Object membership) {
        return members.remove(membership);
    }

    //Add tags in order to sort projects based on key words
    public String[] addTags(String text) {
        tags = text.split(" ");
        return tags;

    }
}