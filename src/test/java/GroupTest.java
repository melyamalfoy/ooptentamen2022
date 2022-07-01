import model.Group;
import model.Idol;
import model.Manager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GroupTest {
    Group group;
    Idol Rose, Lisa, Jennie, Jisoo;

    @BeforeAll
    public void initialize() {
        Manager manager = new Manager("Yi Hyeo-rae",
                2021,
                1980,
                2);

        Lisa = new Idol("Lisa",
                1990,
                2015,
                true,
                true,
                "front",
                true,
                "lalala",
                false);

        Rose = new Idol("Rose",
                1996,
                2015,
                false,
                true,
                "left",
                false,
                "lalala",
                false);

        Jennie = new Idol("Jennie",
                1990,
                2015,
                false,
                true,
                "left",
                false,
                "lalala",
                false);

        Jisoo = new Idol("Jisoo",
                1995,
                2015,
                false,
                true,
                "left",
                false,
                "lalala",
                false);


        group = new Group(manager, "BlackPink");
        group.joinGroup(Rose);
        group.joinGroup(Lisa);
        group.joinGroup(Jisoo);

    }

    @Test
    void maknaeTest() { //tests if member is not a dancer and the youngest. Should be Rose

        assertEquals(Rose, group.maknae());

    }

    @Test
    void leaveGroupTest() {
        group.leaveGroup("Lisa");
        List<Idol> result = group.getGroupMembers().stream()
                .filter(e -> e.getName().compareTo("Lisa") == 0)
                .toList();

        assertTrue(result.isEmpty());
    }

    @Test
    void joinGroupTest() {
        group.joinGroup(Jennie);

        assertEquals(Jennie, group.getGroupMembers().get(group.getGroupMembers().size() - 1)); //returning last member added
    }


}

