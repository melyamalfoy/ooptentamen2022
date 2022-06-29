import io.javalin.Javalin;
import model.*;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(3412);

        Manager manager = new Manager("Fernando",
                2008,
                1990,
                5);

        Group g = new Group(manager, "BTS");

        app.get("/idols", GroupController::getAll);

        g.joinGroup(new Idol("Jungkook",
                1993,
                2015,
                false,
                true,
                "front",
                true,
                "lalala",
                true
        ));
        g.joinGroup(new Idol("Namjoon",
                1993,
                2015,
                true,
                true,
                "front",
                true,
                "lalala",
                false
        ));
        g.joinGroup(new Idol("Hoseok",
                1992,
                2015,
                false,
                true,
                "left side",
                true,
                "rapraprap",
                true
        ));
        g.joinGroup(new Idol("Jinseok",
                1991,
                2015,
                false,
                true,
                "right side",
                false,
                "ladieladieda",
                false
        ));

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

        try (Scanner sc = new Scanner(in)) {
            out.println("Increase the salary of an idolgroup. Please enter a number to multipy the 2021 salary with:  ");
            double profit = sc.nextDouble();
            out.println("2021 Salary");
            out.println(g.getGroupMembers().get(0).getSalary());  //get the salary of the first member (they all have the same salary)

            out.println("2022 Salary");
            try {
                for (Idol idol : g.getGroupMembers()) {
                    idol.salaryCalculator(profit);
                }

                out.println(g.getGroupMembers().get(0).getSalary());

            } catch (InvalidSalaryIncreaseException e) {
                //trycatch
                out.println(e.getMessage());

            }
        }

        app.put("/idols", ctx -> GroupController.create(ctx, g));


        m1.createSong(3); //want user to give the imput for the song
        out.println("The manager wrote the following title for the next song: ");
        out.println(m1.showSong());

    }


}





