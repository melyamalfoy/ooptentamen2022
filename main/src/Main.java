import Model.Manager;
import Model.Idol;
import Model.Position;

public class Main {
// fout? lees foutmelding
    //uml bij de hand houden
    public static void main(String[] args) {


        var jungkook = new Idol("Jungkook",
                1997,
                2011,
                Position.Dance,
                false,
                true);

        var sejin = new Manager("Sejin",
                1983,
                2013);

        if (jungkook.isInGroup()) { //why doesnt this work?
            System.out.println("BTS is gemaakt");
        } else {
            System.out.println("not in group");




        }
        jungkook.sing();
        sejin.teachDancemove();
        jungkook.workHard();
        sejin.workHard();
        sejin.teachNewSong();
        jungkook.dance();
    }
}