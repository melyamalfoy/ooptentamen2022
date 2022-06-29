package model;

import io.javalin.http.Context;

//Note to Ronny: Alles wat hier gecomment zit ben ik nog mee aan het stoeien, als het niet ana de praat krijg gooi ik het er uit ivm
//               ivm coding conventions :)
public class GroupController {
    public static void create(Context ctx, Group g) {
        //NewGroupRequest group = ctx.bodyAsClass(NewGroupRequest.class);
        GroupsDB.save(g);
        ctx.status(201);
    }

    public static void getAll(Context ctx) {
        ctx.json(GroupsDB.getAll());
    }

    /*public static void getOne(Context ctx) {
        Group user = GroupsDB.findById(ctx(ctx));
        if (user == null) {
            throw new NotFoundResponse("User not found");
        } else {
            ctx.json(user);
        }
    }*/

    /*public static void update(Context ctx) {
        Group group = GroupsDB.findById(0);
        if (group == null) {
            throw new NotFoundResponse("User not found");
        } else {
        	GroupsDB newUser = ctx.bodyAsClass(GroupsDB.class);
        	//GroupsDB.update(user.id, newUser.name, newUser.email);
            ctx.status(204);
        }
    }*/

    /*public static void delete(Context ctx) {
        Group group = GroupsDB.findById(ctx);
        if (group == null) {
            throw new NotFoundResponse("User not found");
        } else {
        	GroupsDB.delete(ctx);
            ctx.status(204);
        }
    }*/
}
