package model;

import java.util.ArrayList;

public class Managercollection implements GroupInterface {
    private final ArrayList<Manager> managers;

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

        if(managers.isEmpty()){
            managers.remove(manager);
            return true;
        }
        return false;}

    public String toString(){

        String information= "List of managers in the company: \n";
        for(Manager man : managers){
            information = information
                    + man.toString()+"\n";
        }

    return information;
    }

    @Override
    public String performance() {

        return "managing the group";


}

