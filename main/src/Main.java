//import Model.Manager;

import Model.Employee;
import Model.Idol;
import Model.Manager;


public class Main {
    // fout? lees foutmelding
    //uml bij de hand houden
    public static void main(String[] args) {


        Idol jungkook = new Idol();
        Employee namjoon = new Idol("namjoon",
                1990,
                2005);
        Employee hoseok = new Idol("hoseok",
                1991,
                2010,
                false,
                true,
                "In front",
                false,
                "lalalalala",
                true
        );

        Manager manager1 = new Manager("manager1",
                1991,
                2020);

        Manager manager2 = new Manager("manager2",
                1991,
                2020, 3);


//        if (jungkook.isInGroup()) {
//            System.out.println("BTS is created");
//        } else {
//            System.out.println("not in group");
//        }

        System.out.println(jungkook.sing());
        System.out.println(jungkook.workHard());
        System.out.println(jungkook.dance());
        System.out.println("Idol 1: \n" + jungkook);
        System.out.println("Idol 2: \n" + namjoon);
        System.out.println("Idol 3: \n" + hoseok);

        System.out.println("Mangaers: \n");
        System.out.println(manager1);
        System.out.println(manager2);
        if (manager1.compare(manager2)) {
            System.out.println("Manager 1 have more skills");
        } else {
            System.out.println("Manger 1 null");
        }
    }
}