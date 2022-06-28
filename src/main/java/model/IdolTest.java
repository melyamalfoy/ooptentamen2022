package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IdolTest {
    Idol iu;

    public IdolTest(){
        iu = new Idol("Lisa", 1997, 2016);
    }

    @Test
    void rap() {

    }

    @Test
    void workHard() {
    }

    @Test
    void sing() {
    }

    @Test
    void dance() {
        String expected = "Sorry not a dancer!";
        String actual = iu.dance();

        Assertions.assertTrue(expected.compareTo(actual) == 0);
    }

    @Test
    void isRap() {
        boolean expected = false;
        boolean actual = iu.isRap();

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isDance() {
        boolean expected = false;
        boolean actual = iu.isDance();

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String expected = "Name:\t"
                + "Lisa"
                + "\n" + "Date of birth:\t"
                + "1997"
                + "\n"
                + "Start contract at:\t"
                + "2016";
        String actual = iu.toString();

        Assertions.assertTrue(expected.compareTo(actual) == 0);
    }
}
