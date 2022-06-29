import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import model.Idol;
import model.InvalidSalaryIncreaseException;

class IdolTest {
    Idol iu;

    public IdolTest() {
        iu = new Idol("Lisa", 1997, 2016);
    }

    @Test
    void salaryIncreaseTest() throws InvalidSalaryIncreaseException {
        iu.salaryCalculator(2);
        double expected = 200;
        double actual = iu.getSalary();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void danceTest() {
        String expected = "Sorry not a dancer!";
        String actual = iu.dance();

        Assertions.assertTrue(expected.compareTo(actual) == 0);
    }

    @Test
    void isRapTest() {
        boolean expected = false;
        boolean actual = iu.isRap();

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isDanceTest() {
        boolean expected = false;
        boolean actual = iu.isDance();

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void toStringTest() {
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

    @ParameterizedTest(name = "#{index} - Test with Argument={0}")
    @ValueSource(ints = {1990, 2003})
    void compareManagersTest(int arg) {
        Idol other = new Idol("Park Bom", arg, 2016);

        int expected = 0;

        if (iu.getDateOfBirth() < other.getDateOfBirth())
            expected = 1;
        else if (iu.getDateOfBirth() > other.getDateOfBirth())
            expected = -1;

        int actual = iu.compareTo(other);

        assertEquals(expected, actual);
    }

}
