package model;

import java.util.ArrayList;
import java.util.List;


public class Group implements GroupInterface {
    public List<Idol> groupList;
    private final Manager manager;

    public Group() {
        groupList = new ArrayList();
        manager = new Manager();

    }

    public Group(String name) {
        groupList = new ArrayList();
        manager = new Manager();

    }

    public Group(Manager manager) {
        groupList = new ArrayList();
        this.manager = manager;
    }


    /**
     * One constructor calls the other
     *
     * @param group
     * @param manager
     */
    public Group(List<Idol> group,
                 Manager manager) {
        this(manager);
        this.groupList = group;
    }

    public List<Idol> getGroupMembers() {
        return this.groupList;
    }

    public void joinGroup(Idol idol) {
        groupList.add(idol);
    }


    /**
     * Idol leaves group
     *
     * @param name of the Idol
     * @return true if the Idol was present in the grup, false if not
     */
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

        for (Idol id : groupList)
            information = information + id.toString() +
                    "\n";
        return information;
    }


    //Maknae is the youngest one of the group who isn't a dancer. filter is an intermediate
    // stream that checks who's the maknae of a group
    public Idol maknae() {
        return groupList.stream()
                .filter(x -> !x.isDance()) // .filter is intermediate
                .min((a, b) -> a.compareTo(b))
                .get();  //.min is terminal stream
    }

}
