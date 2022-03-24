import Model.Employee;
import Model.Idol;

public class Main {

    public static void main(String[] args) {

        var Jungkook = new Idol("Jungkook", 1997, "Busan", 2011 );
        var Sungdeuk = new Employee("Sungdeuk", 1983, "Seoul", 2013);


        Jungkook.sing();
        Sungdeuk.teachDancemove();
        Jungkook.workHard();
        Sungdeuk.workHard();
        Sungdeuk.teachNewSong();







    }}