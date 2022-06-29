package model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class IdolController {
    IdolDB idolDB = new IdolDB();

    public boolean createIdol(String idolJSON) {
        boolean success = false;
        try {
            idolDB.save(idolJSON);
            success = true;
        } catch (IOException e) {
            // We just dump the error here. Not nice:
            // the only way to know something went wrong is to check the logs.
            e.printStackTrace();
        }
        return success;
    }

    private Idol jsonToIdol(String idolJSON) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader reader = objectMapper.readerFor(Idol.class);
        return reader.readValue(idolJSON);
    }

}
