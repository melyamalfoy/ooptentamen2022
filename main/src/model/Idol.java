package model;

import java.util.function.Function;

public class Idol extends Employee {

    private boolean isLeader;
    private boolean inGroup;
    private String role;
    private boolean rap;
    private boolean dance;
    private String vocal;
    private Function<Double, Double> salary;

    public Idol() {
        super();
        isLeader = false;
        inGroup = false;
        role = "None";
        dance = false;
        rap = false;
        vocal = "vocal";
        salary = a -> 100 + a * 0.3;
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
        salary = a -> 100 + a * 0.3;
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
        salary = a -> 100 + a * 0.3;
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
        salary = a -> 100 + a * 0.3;
    }

    public boolean getLeader() {

        return isLeader;
    }

    public boolean getInGroup() {

        return inGroup;
    }

    public void setInGroup(boolean inGroup) {

        this.inGroup = inGroup;
    }

    public String rap() {
        if (rap) {
            return "ho ho ho!";
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

    public String getVocal() {

        return vocal;
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

    public double salaryCalculator(double profit) {
        return salary.apply(profit);
    }

    public void salaryRaise() {
        //salaris wordt verhoogd
        //
        try {
            salary = salary.andThen(a -> 3 * a);
        } catch (Exception e) {
            System.out.println("Exception thrown "
                    + "while passing null: "
                    + e);}
    }
}


