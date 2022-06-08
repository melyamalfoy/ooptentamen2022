package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IdolTest {

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
    }

    @Test
    void isRap() {
        Idol iu = new Idol();
        boolean expected = false;

        boolean actual = iu.isRap();

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isDance() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}