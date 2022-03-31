//import Model.Manager;


import Model.Group;
import Model.Idol;
import Model.Manager;


public class Main {
    public static void main(String[] args) {


        Manager manager = new Manager("Fernando",
                2008,
                1990,
                5);
        Idol jungkook = new Idol("Jungkook",
                1993,
                2015,
                false,
                true,
                "front",
                true,
                "lalala",
                false
        );
        Idol Namjoon = new Idol("Namjoon",
                1993,
                2015,
                true,
                true,
                "front",
                true,
                "lalala",
                false
        );

        Idol Hoseok = new Idol("Hoseok",
                1992,
                2015,
                false,
                true,
                "left side",
                true,
                "rapraprap",
                true
        );

        Idol Jinseok = new Idol("Jinseok",
                1991,
                2015,
                false,
                true,
                "right side",
                false,
                "ladieladieda",
                false
        );

        Group g = new Group(manager,"EXO");
        System.out.println(jungkook.dance());
        g.joinGroup(jungkook);
        System.out.println(Namjoon.Rap());
        g.joinGroup(Namjoon);
        System.out.println(Hoseok.dance());
        System.out.println(Hoseok.sing());
        g.joinGroup(Hoseok);
        System.out.println(Jinseok.sing());
        g.joinGroup(Jinseok);
        System.out.print(g);
        System.out.println(g.givePerformance());
        if(g.leaveGroup(jungkook)){
            System.out.println(jungkook.getName()+" removed!");
        }
        System.out.println(g);
        System.out.println(g.givePerformance());
    }
}