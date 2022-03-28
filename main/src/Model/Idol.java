package Model;

public class Idol extends Employee {
    private String name;
    private int dateOfBirth;
    private int dateStartOfContract;
    private Position position;
    private boolean isLeader;
    private boolean inGroup ;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateStartOfContract() {
        return dateStartOfContract;
    }

    public void setDateStartOfContract(int dateStartOfContract) {
        this.dateStartOfContract = dateStartOfContract;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }



    public Idol(String name,
                int dateOfBirth,
                int dateStartOfContract,
                Position position,
                boolean isLeader, boolean inGroup) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateStartOfContract = dateStartOfContract;
        this.position = position;
        this.isLeader = false;
        this.inGroup = false;


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

