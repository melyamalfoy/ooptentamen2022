import Model.Manager;
import Model.Idol;
import Model.Position;

public class Main {

    public static void main(String[] args) {

        var Jungkook = new Idol("Jungkook", 1997, 2011, Position.Dance, false, true);
        var Sejin = new Manager("Sejin", 1983, 2013);

        if (Jungkook.isInGroup()) { //why doesnt this work?
            System.out.println("BTS <3");
        } else {
            System.out.println("not in group");

            Jungkook.sing();
            Sejin.teachDancemove();
            Jungkook.workHard();
            Sejin.workHard();
            Sejin.teachNewSong();
            Jungkook.dance();


        }
    }
}