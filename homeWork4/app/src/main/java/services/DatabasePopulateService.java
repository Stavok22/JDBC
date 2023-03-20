package services;

import Prefs.Prefs;
import java.nio.file.Files;
import java.nio.file.Path;

public class DatabasePopulateService {

    public static void main(String[] args) {
        Database database=Database.getInstanse();
        new DatabasePopulateService().populateDb(database);
    }
    public void populateDb(Database database) {
        try {
            String populateDbFilename = new Prefs().getString(Prefs.POPULATE_DB_FILE_PATH);
            String sql = String.join("\n", Files.readAllLines(Path.of(populateDbFilename)));

            database.executeUpdate(sql);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
