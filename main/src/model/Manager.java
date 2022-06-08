package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.Random;

public class Manager extends Employee {
    private int numberGroup;
    private List<String> newSong = new ArrayList<>();

    public Manager() {
        super();
        numberGroup = 0;
    }


    public Manager(int numberGroup) {
        super();
        this.numberGroup = numberGroup;
    }

    public Manager(String name,
                   int dateOfBirth,
                   int dateStartOfContract) {
        super(name,
                dateOfBirth,
                dateStartOfContract);
        numberGroup = 0;
    }

    public Manager(String name,
                   int dateStartOfContract,
                   int dateOfBirth, int numberGroup) {
        super(name,
                dateOfBirth,
                dateStartOfContract);
        this.numberGroup = numberGroup;
    }



    public String workHard() {
        return "Helping the idol!";
    }

    public String teachNewSong() {
        return "Teaching new song";
    }

    public String teachDancemove() {

        return "Teach dance move!";
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    @Override
    public String toString() {

        return super.toString() + "\n"
                + "Number of groups:\t" +
                getNumberGroup();
    }

    // hier wordt gecheckt of employee een instance van manager is
    // als het een manager is wordt de employee een manager
    // vervolgens wordt er gekeken hoe veel groepen een manager managed
    // vervolgens worden de twee managers vergeleken en
    // bepaald welke manager de beste is
    // bij false kunnen ze niet vergeleken worden of de manager is niet beter dan de andere
    public boolean compare(Employee emp) {
        if (emp instanceof Manager) {
            Manager man = (Manager) emp; //castof
            return man.getNumberGroup() > numberGroup;
        }
        return false;
    }

    //de lijst met woorden voor het liedje, deze lijst wordt door de manager random gebruikt om een liedje
    // samen te stellen. In het Koreaans maakt de woordvolgorde in een zin niet uit.
    public void create_song(int l) {
        List<String> s = Arrays.asList(
                "가자", " 내", "피", " 땀", "눈물도몸", "마음", "영혼도",
                "회망", "머리", "머리", "처음", "처음", "하루", "몰라",
                "가자", "내", "피", "땀", "눈물도몸", "마음", "영혼도",
                "회망", "몰라", "하루");
        Random rand = new Random();
// This function returns a random value.

                Supplier<Integer> randomValue = () -> rand.nextInt((s.size() + 1));
                for(int i=0; i<l;i++){
                    newSong.add(s.get(randomValue.get()));
                }
    }

    public List<String> getSong() {
        return newSong;
    }

    public String showSong(){
        String show="";
        for(int i=0;i<newSong.size();i++){
            show = show + newSong.get(i)+" ";
        }
        return show;
    }
}

