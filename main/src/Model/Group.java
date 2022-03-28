package Model;

public class Group implements GroupInterface {
    public boolean joinGroup(Idol idol) { //zie playlist voorbeeld
        return false;
    }


    @Override
    public void givePerformance() {
        System.out.println("We don't need permission to dance!");

    }
}
