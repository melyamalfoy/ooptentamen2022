public class Main {

    public static void main(String[] args) {
        var KimNamjoon = new Talent(" Kim Namjoon", 1994, 2015);
        var outputKimNamjoon = String.format("De naam van het talent is %s, het geboortejaar " +
                        "is %s en " +
                        "hij is gestart bij BigHit in %s",
                KimNamjoon.getNaam(),
                KimNamjoon.getGeboortedatum(),
                KimNamjoon.getStartDatum());
        System.out.println(outputKimNamjoon);
    }

}