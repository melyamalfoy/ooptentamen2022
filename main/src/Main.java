//import Model.Manager;

import Model.Idol;


public class Main {
    // fout? lees foutmelding
    //uml bij de hand houden
    public static void main(String[] args) {


        Idol jungkook = new Idol();


//        if (jungkook.isInGroup()) {
//            System.out.println("BTS is created");
//        } else {
//            System.out.println("not in group");
//        }

        System.out.println(jungkook.sing());
        System.out.println(jungkook.workHard());
        System.out.println(jungkook.dance());
        System.out.println(jungkook);
    }
}