package Model;

public class Idol extends Employee {

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
                dateStartOfContract);
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

    public String Rap() {
       if(rap==true){
           return "ho ho ho!";
       }
       return "sorry I don't rap!";
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
        String information = getName()+ "\n"+ getDateOfBirth()+"\n"+getDateStartOfContract();
        if(dance==true
                && rap == true
                && isLeader==true
                && inGroup==true){
            return information+ "\n"+getRole()+"\n"+
                    "Idol in group\n"+
                    "Leader of the group\n"+
                    "Rapper\n"+
                    "Dancer\n"+
                    vocal;
        }
        else{
            if(dance == true && inGroup==true){
                return information+ "\n"+getRole()+ "\n" + "Idol in group\n"+" Dancer";
            }
            if(rap == true && inGroup==true) {
                return information + "Idol in group\n" + "Rapper";
            }
        }
        return information;
    }
}

