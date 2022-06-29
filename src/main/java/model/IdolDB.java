package model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class IdolDB {

    public List<Idol> findAll() throws IOException {
        URL url = IdolDB.class.getResource("/idols.json");

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader reader = objectMapper.readerFor(Idol.class);

        List<Idol> idolList = reader.readValues(url).readAll(new ArrayList());
        return idolList;
    }

    public void save(String idolJSON) throws IOException {
        writeObjectToFile(idolJSON, "/idols.json");
    }


    /**
     * @param json,     the json String
     * @param jsonFile, the file to append to
     * @throws IOException
     */
    private void writeObjectToFile(String json, String jsonFile) throws IOException {
        URL url = IdolDB.class.getResource(jsonFile);
        File file = new File(url.getFile());

        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.append(json);
        writer.flush();
        writer.close();
    }
}


