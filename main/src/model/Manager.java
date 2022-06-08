package model;

public class Manager extends Employee {
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

        return "Teach dance move!";
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    @Override
    public String toString() {

        return super.toString() + "\n"
                + "Number of groups:\t" +
                getNumberGroup();
    }

    // hier wordt gecheckt of employee een instance van manager is
    // als het een manager is wordt de employee een manager
    // vervolgens wordt er gekeken hoe veel groepen een manager managed
    // vervolgens worden de twee managers vergeleken en
    // bepaald welke manager de beste is
    // bij false kunnen ze niet vergeleken worden of de manager is niet beter dan de andere
    public boolean compare(Employee emp) {
        if (emp instanceof Manager) {
            Manager man = (Manager) emp; //castof
            return man.numberGroup > numberGroup;
        }
        return false;
    }
}

