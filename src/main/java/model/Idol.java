package model;

import java.util.function.Function;

public class Idol extends Employee {

    private final boolean isLeader;
    private boolean inGroup;
    private final String role;
    private final boolean rap;
    private final boolean dance;
    private final String vocal;
    private double salary;
    private final Function<Double, Double> salaryIncrease;

    public Idol() {
        super();
        isLeader = false;
        inGroup = false;
        role = "None";
        dance = false;
        rap = false;
        vocal = "vocal";
        this.salaryIncrease = this::apply;
        this.salary = 100;
    }

    public Idol(boolean isLeader,
                boolean inGroup,
                String role,
                boolean rap,
                String vocal,
                boolean dance) {
        super();
        this.isLeader = isLeader;
        this.inGroup = inGroup;
        this.role = role;
        this.rap = rap;
        this.vocal = vocal;
        this.dance = dance;
        this.salaryIncrease = increase -> this.salary * increase;
        this.salary = 100;
    }

    public Idol(String name,
                int dateOfBirth,
                int dateStartOfContract) {
        super(name,
                dateOfBirth,
                dateStartOfContract);
        isLeader = false;
        inGroup = false;
        role = "None";
        dance = false;
        rap = false;
        vocal = "vocal";
        this.salaryIncrease = (Double increase) -> this.salary * increase;
        this.salary = 100;
    }


    public Idol(String name,
                int dateOfBirth,
                int dateStartOfContract,
                boolean isLeader,
                boolean inGroup,
                String role,
                boolean rap,
                String vocal,
                boolean dance
    ) {
        //zelfde als bij employee
        super(name,
                dateOfBirth,
                dateStartOfContract);
        this.isLeader = isLeader;
        this.inGroup = inGroup;
        this.role = role;
        this.rap = rap;
        this.vocal = vocal;
        this.dance = dance;
        this.salaryIncrease = increase -> this.salary * increase;
        this.salary = 100;
    }


    public Idol(boolean isLeader,
                boolean inGroup,
                String role,
                boolean rap,
                String vocal,
                boolean dance, double salary) {
        super();
        this.isLeader = isLeader;
        this.inGroup = inGroup;
        this.role = role;
        this.rap = rap;
        this.vocal = vocal;
        this.dance = dance;
        this.salaryIncrease = this::apply2;
        this.salary = salary;
    }

    public void setInGroup(boolean inGroup) {

        this.inGroup = inGroup;
    }

    public String rap() {
        if (rap) {
            return "yo yo yo!";
        }
        return "sorry I don't rap!";
    }

    public String workHard() {

        return "Practicing very hard!";
    }

    public String sing() {

        return vocal + "!";
    }

    public String dance() {
        if (dance) {
            return "step step step";
        }
        return "Sorry not a dancer!";
    }

    public String getRole() {

        return role;
    }

    public boolean isRap() {

        return rap;
    }

    public boolean isDance() {

        return dance;
    }


    @Override
    public String toString() {
        final String positon = "Position: \t";
        final String idolInGroup = "Idol in group\n";

        if (dance
                && rap
                && isLeader
                && inGroup) {

            return super.toString() + "\n" +
                    positon +
                    getRole() + "\n" +
                    idolInGroup +
                    "Leader of the group\n" +
                    "Rapper\n" +
                    "Dancer\n" +
                    vocal;
        } else {
            if (dance && inGroup) {
                return super.toString() +
                        "\n" + positon +
                        getRole() +
                        "\n"
                        + idolInGroup
                        + " Dancer";
            }
            if (rap && inGroup) {
                return super.toString() + "\n"
                        + positon + getRole() + "\n"
                        + idolInGroup
                        + "Rapper";
            }
        }
        return super.toString();
    }

    public void salaryCalculator(double increase) throws InvalidSalaryIncreaseException {
        if (increase < 0)
            throw new InvalidSalaryIncreaseException();
        this.salary = salaryIncrease.apply(increase);
    }

    public double getSalary() {
        return this.salary;
    }


    //tells how to compare the idols in the stream
    public int compareTo(Object o) {
        Idol idol = (Idol) o;
        return Integer.compare(idol.getDateOfBirth(), this.getDateOfBirth());
    }

    private Double apply(Double increase) {
        return this.salary * increase;
    }

    private Double apply2(Double increase) {
        return this.salary * increase;
    }
}


