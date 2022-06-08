package maincode;

import model.Group;
import model.Idol;
import model.Manager;
import model.Managercollection;


/*
 Melanie Grimminck
 Doel Kpop programma;
 1. kpop idols toevoegen en hun info toevoegen aan het programma
 2. managers van de groepen toevoegen
 3. kpop idols aan een groep toevoegen
 4. manager aan een groep toevoegen
 5. idols en managers uit groep verwijderen
 6. idols kunnen met Performance(); een optreden geven
 7. managers managen een groep met Performance();
 8. idols en managers kunnen gebruik maken van Workhard();
*/

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
        Idol namjoon = new Idol("Namjoon",
                1993,
                2015,
                true,
                true,
                "front",
                true,
                "lalala",
                false
        );

        Idol hoseok = new Idol("Hoseok",
                1992,
                2015,
                false,
                true,
                "left side",
                true,
                "rapraprap",
                true
        );

        Idol jinseok = new Idol("Jinseok",
                1991,
                2015,
                false,
                true,
                "right side",
                false,
                "ladieladieda",
                false
        );

        Group g = new Group(manager, "EXO");
        System.out.println(jungkook.dance());
        g.joinGroup(jungkook);
        System.out.println(namjoon.rap());
        g.joinGroup(namjoon);
        System.out.println(hoseok.dance());
        System.out.println(hoseok.sing());
        g.joinGroup(hoseok);
        System.out.println(jinseok.sing());
        g.joinGroup(jinseok);
        System.out.print(g);
        System.out.println(g.performance());
        if (g.leaveGroup(jungkook)) {
            System.out.println(jungkook.getName() + " removed!");
        }
        System.out.println(g);
        System.out.println(g.performance());
        System.out.println(jungkook.workHard());
        System.out.println(manager.workHard());
        System.out.println(manager.teachDancemove());


        System.out.println("List of Managers");
        Manager m1 = new Manager("Carlos",
                2010,
                1991,
                4);
        Manager m2 = new Manager("Camillia",
                2011,
                1989,
                10);
        Manager m3 = new Manager("Felipe",
                2007,
                1990,
                3);
        Managercollection collect = new Managercollection();
        collect.addManager(m1);
        collect.addManager(m2);
        collect.addManager(m3);
        System.out.println(collect);
        collect.sort();
        System.out.println(collect);
    }


}
