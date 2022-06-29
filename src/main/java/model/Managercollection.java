package model;

import java.util.ArrayList;
import java.util.List;

public class Managercollection implements GroupInterface {
    private final ArrayList<Manager> managers;

    public Managercollection() {

        managers = new ArrayList<>();
    }

    public Managercollection(List<Manager> managers) {

        this.managers = (ArrayList<Manager>) managers;
    }

    public void addManager(Manager manager) {

        managers.add(manager);
    }

    public boolean removeManager(Manager manager) {

        if (!managers.isEmpty()) {
            managers.remove(manager);
            return true;
        }
        return false;
    }

    public String toString() {

        String information = "List of managers in the company: \n";
        for (Manager man : managers)
            information = new StringBuilder().append(information).append(man.toString()).append("\n").toString();

        return information;
    }

    @Override
    public String performance() {

        return "managing the group";

    }
}

