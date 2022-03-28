package Model;

public class Idol extends Employee {


    private Position position;
    private boolean isLeader;
    private boolean inGroup ;


    public Idol(String name,
                int dateOfBirth,
                int dateStartOfContract,
                Position dance,
                boolean isLeader, boolean inGroup) {
        //zelfde als bij employee
        super(name,
                dateOfBirth,
                dateStartOfContract,
                dance);
        this.isLeader = isLeader;
        this.inGroup = inGroup;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    public boolean isInGroup() {
        return inGroup;
    }

    public void setInGroup(boolean inGroup) {
        this.inGroup = inGroup;
    }



    public void workHard() {
        System.out.println("Practicing very hard!");
    }

    public void sing() {
        System.out.println("lalalala! ");
    }

    public void dance() {
        System.out.println("dance your butt off");
    }
}

