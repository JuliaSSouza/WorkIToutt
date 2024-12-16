package main.java;

import java.util.HashMap;

public class Membership {
    private User user;
    private HashMap<Project, Role> memberships;
    
    public Membership(User user) {
        this.user = user;
        this.memberships = new HashMap<Project, Role>();
    }   

    public boolean newMembership(Project project, Role role){
        memberships.add(project, role);
    }

    public HashMap<Project, Role> getMemberships() {
        return memberships;
    }
    
    public User getUser(){
        return user;
    }
}


