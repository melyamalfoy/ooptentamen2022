package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class GroupsDB {
    private static final Map<Integer, Group> groups = new HashMap<>();
    private static final AtomicInteger lastId;

    static {
        Group g1 = new Group("Blackpink");

        Idol Lisa = new Idol("Lisa",
                1990,
                2015,
                true,
                true,
                "front",
                true,
                "lalala",
                false);

        Idol Rose = new Idol("Rose",
                1996,
                2015,
                false,
                true,
                "left",
                false,
                "lalala",
                false);

        g1.joinGroup(Rose);
        g1.joinGroup(Lisa);

        groups.put(0, g1);
        lastId = new AtomicInteger(groups.size());
    }

    public static void save(Group g) {
        int id = lastId.incrementAndGet();
        groups.put(id, g);
    }

    public static Collection<Group> getAll() {
        return groups.values();
    }

    public static void update(Group g, int groupId) {
        groups.put(groupId, g);
    }

    public static Group findById(int groupId) {
        return groups.get(groupId);
    }

    public static void delete(int groupId) {
        groups.remove(groupId);
    }
}
