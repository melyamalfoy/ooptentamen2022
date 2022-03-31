package model;

import java.util.ArrayList;


public class Group implements GroupInterface {
    private ArrayList<Idol> group;
    private Manager manager;
    private String groupName;

    public Group() {
        group = new ArrayList();
        manager = new Manager();
        groupName = "None";

    }
    public Group(Manager manager, String groupName) {
        group = new ArrayList();
        this.manager = manager;
        this.groupName = groupName;
    }

    //de ene constructer roept de andere aan
    public Group(ArrayList<Idol> group, Manager manager, String groupName) {
        this(manager,groupName);
        this.group = group;

    }



    public void joinGroup(Idol idol) {
        group.add(idol);
    }

    public boolean leaveGroup(Idol idol) {
        if (group.size() > 0) {
            group.remove(idol);
            return true;
        }
        return false;
    }

    @Override
    public String performance() {
        return "We don't need permission to dance!";
    }

    public void Training() {
        for (Idol id : group) {
            System.out.println(id.workHard());
        }
    }

    public String toString() {
        String information = "The manager: \n" + manager.toString() + "\n" + "Idols:\n";
        for (Idol id : group) {
            information = information + id.toString() + "\n";
        }
        return information;
    }
}