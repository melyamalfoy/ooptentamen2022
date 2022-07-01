import io.javalin.Javalin;
import io.javalin.http.Context;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class MainJavalin {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(3412);
        app.before(ctx -> {

        });
        app.get("/idols", ctx -> getFile(ctx));

        app.post("/upload", ctx -> {
            postFile(ctx);
        });


    }

    /**
     * Return file content on GET
     *
     * @param ctx Javalin context app
     * @throws FileNotFoundException when file is not found
     */
    public static void getFile(Context ctx) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/main/java/idolFile.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        try (BufferedReader reader = new BufferedReader(inputStreamReader)) {
            ctx.result(reader.lines().collect(Collectors.joining()));
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Write POST body to text file
     *
     * @param ctx Javalin context
     * @throws IOException if not able to write
     */
    public static void postFile(Context ctx) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/idolPostFile.txt");
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8)) {
            try (BufferedWriter writer = new BufferedWriter(outputStreamWriter)) {
                writer.write(ctx.body());
                writer.flush();
            }
        }

    }


}
