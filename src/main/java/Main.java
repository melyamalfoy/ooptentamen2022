import io.javalin.Javalin;
import model.Group;
import model.Idol;
import model.Manager;
import model.Managercollection;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(3412);
        app.get("/", ctx -> ctx.result("Hello World"));



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
                true
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

        app.get("/idols", ctx -> ctx.result(hoseok.getName()));

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


        Group g = new Group(manager, "BTS");
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
        System.out.println(m3.teachNewSong());

        if (m1.compare(m2)) {
            System.out.println(m2.getName()
                    + " manages more idol groups than "
                    + m1.getName());
        } else {
            System.out.println(m1.getName()
                    + " manages more idol groups than "
                    + m2.getName());
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How much do you want to increase the salary?");
//        double profit = sc.nextDouble();
//        System.out.println("2021 Salary");
//       System.out.println(hoseok.salaryCalculator(profit));
//        hoseok.salaryRaise();
//        System.out.println("2022 Salary");
//       System.out.println(hoseok.salaryCalculator(profit));

        m1.create_song(9); //want user to give the imput for the song
        System.out.println();
        System.out.println(m1.showSong());
  }


}






