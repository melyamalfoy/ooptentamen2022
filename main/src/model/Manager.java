package model;

public class Manager extends Employee implements  Comparable<Manager> {
    private int numberGroup;

    public Manager() {
        super();
        numberGroup = 0;
    }


    public Manager(int numberGroup) {
        super();
        this.numberGroup = numberGroup;
    }

    public Manager(String name,
                   int dateOfBirth,
                   int dateStartOfContract) {
        super(name,
                dateOfBirth,
                dateStartOfContract);
        numberGroup = 0;
    }

    public Manager(String name,
                   int dateStartOfContract,
                   int dateOfBirth, int numberGroup) {
        super(name,
                dateOfBirth,
                dateStartOfContract);
        this.numberGroup = numberGroup;
    }


    public String workHard() {
        return "Helping the idol!";
    }

    public String teachNewSong() {
        return "Teaching new song";
    }

    public String teachDancemove() {
        return "teaching dance move";
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public String toString() {
        return super.toString()+"\n" +"Number of groups:\t"+ getNumberGroup();
    }

    public boolean compare(Employee emp) {
        if (emp instanceof Manager) {
            Manager man = (Manager) emp; //castof
            return man.numberGroup > numberGroup;
        }
        return false;
    }
    @Override
    public int compareTo(Manager m){
        if(this.compare(m)){
            return 0;
        }
        return 1;
    }
}
