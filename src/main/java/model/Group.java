package model;

import java.util.ArrayList;



public class Group implements GroupInterface {
    public ArrayList<Idol> groupList;
    private Manager manager;
    private final String groupName;

    public Group() {
        groupList = new ArrayList();
        manager = new Manager();
        groupName = "None";

    }

    public Group(String name) {
        groupList = new ArrayList();
        manager = new Manager();
        groupName = name;

    }

    public Group(Manager manager, String groupName) {
        groupList = new ArrayList();
        this.manager = manager;
        this.groupName = groupName;
    }

    //de ene constructer roept de andere aan
    public Group(ArrayList<Idol> group,
                 Manager manager,
                 String groupName) {
        this(manager, groupName);
        this.groupList = group;
    }

    public ArrayList<Idol> getGroupMembers() {
        return this.groupList;
    }

    public void joinGroup(Idol idol) {
        groupList.add(idol);
    }

    public boolean leaveGroup(String name) {
        if (groupList.isEmpty())
            return false;

        Idol idol = groupList.stream()
                .filter(e -> e.getName().compareTo(name) == 0)
                .toList()
                .get(0);

        groupList.remove(idol);
        return true;
    }

    @Override
    public String performance() {
        return "We don't need permission to dance!";
    }

    public void training() {
        for (Idol id : groupList) {
            System.out.println(id.workHard());
        }
    }

    public String toString() {
        String information = "The manager: \n"
                + manager.toString()
                + "\n" + "Idols:\n";

        for (Idol id : groupList) {
            information = information + id.toString() +
                    "\n";
        }
        return information;
    }


    //Maknae is the youngest one of the group who isn't a dancer. filter is an intermediate
    // stream that checks who's the maknae of a group
    public Idol maknae() {
        return groupList.stream()
                .filter(x -> x.isDance() == false) // .filter is intermediate
                .min((a, b) -> a.compareTo(b))
                .get();  //.min is terminal stream
    }

}
