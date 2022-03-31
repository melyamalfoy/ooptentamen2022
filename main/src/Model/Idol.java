package Model;

public class Idol extends Employee {

    private boolean isLeader;
    private boolean inGroup;
    private String role;
    private boolean rap;
    private boolean dance;
    private String vocal;

    public Idol() {
        super();
        isLeader = false;
        inGroup = false;
        role = "None";
        dance = false;
        rap = false;
        vocal = "vocal";
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
    }

    public Idol(String name,
                int dateOfBirth,
                int dateStartOfContract, boolean b, boolean b1, boolean b2, boolean b3, boolean b4) {
        super(name,
                dateOfBirth,
                dateStartOfContract);
        isLeader = false;
        inGroup = false;
        role = "None";
        dance = false;
        rap = false;
        vocal = "vocal";
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

    public String Rap() {
       if(rap==true){
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
        if (dance == true) {
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

    public String toString(){

        if(dance==true
                && rap == true
                && isLeader==true
                && inGroup==true){
            return super.toString()+ "\n" +"Position:\t"+ getRole()+"\n"+
                    "Idol in group\n"+
                    "Leader of the group\n"+
                    "Rapper\n"+
                    "Dancer\n"+
                    vocal;
        }
        else{
            if(dance == true && inGroup==true){
                return super.toString()+
                        "\n"+getRole()+ "\n"
                        + "Idol in group\n"
                        + " Dancer";
            }
            if(rap == true && inGroup==true) {
                return super.toString()
                        + "Idol in group\n"
                        + "Rapper";
            }
        }
        return super.toString();
    }
}

