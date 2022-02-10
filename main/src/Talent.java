import java.util.Date;

public class Talent {
    private String naam;
    private int geboortedatum;
    private int startDatum;
    // TODO position


    public Talent(String naam, int geboortedatum, int startDatum) {
        this.naam = naam;
        this.geboortedatum = geboortedatum;
        this.startDatum = startDatum;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(int geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public int getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(int startDatum) {
        this.startDatum = startDatum;
    }
}


