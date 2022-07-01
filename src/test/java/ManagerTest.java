import model.Manager;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagerTest { //comparetest
    Manager manager;

    public ManagerTest() {
        manager = new Manager("Yi Hyeo-rae",
                2021,
                1980,
                2);
    }

    @ParameterizedTest(name = "#{index} - Test with Argument={0}")
    @ValueSource(ints = {1, 5, 6})
    void compareManagersTest(int arg) {
        Manager other = new Manager("Yi Hyeo-rae",
                2021,
                1980,
                arg);

        boolean expected = manager.getNumberGroup() < other.getNumberGroup();
        boolean actual = manager.compare(other);

        assertEquals(expected, actual);
    }


}
