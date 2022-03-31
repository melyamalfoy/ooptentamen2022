package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Managercollection implements GroupInterface{
    private ArrayList<Manager> managers;

    public Managercollection(){
        managers = new ArrayList();
    }
    public Managercollection(ArrayList<Manager> managers){
        this.managers = managers;
    }

    public void addManager(Manager manager){
        managers.add(manager);
    }

    public boolean removeManager(Manager manager){
        if(managers.size()>0){
            managers.remove(manager);
            return true;
        }
        return false;}

    public String toString(){
        String information= "List of managers in the company: \n";
        for(Manager man : managers){
            information = information + man.toString()+"\n";
        }

    return information;}

    @Override
    public String Performance() {
        return "managing the group";
    }

    public void sort(){
        Collections.sort(managers);
    }
}

