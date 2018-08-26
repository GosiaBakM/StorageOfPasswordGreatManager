package fileReader;

import com.opencsv.CSVWriter;
import model.PasswordEntry;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;

import static com.opencsv.CSVParser.DEFAULT_QUOTE_CHARACTER;
import static com.opencsv.CSVWriter.DEFAULT_ESCAPE_CHARACTER;
import static com.opencsv.CSVWriter.DEFAULT_LINE_END;
import static com.opencsv.CSVWriter.NO_ESCAPE_CHARACTER;
//class PasswordEntryFileWriter
public class PasswordEntryFileWriter {

    private static String PATH = "C:\\Passwords";

    //void
//    public void writeToFile(String path, List<PasswordEntry> passwordEntries) throws URISyntaxException, IOException {
//        CSVWriter csvWriter = new CSVWriter(
//                new FileWriter(Paths.get(PATH + "\\" + path).toFile(), true), ';',
//        DEFAULT_QUOTE_CHARACTER,
//                NO_ESCAPE_CHARACTER,
//                DEFAULT_LINE_END);
//        for (PasswordEntry passwordentry : passwordEntries) {
//            csvWriter.writeNext(passwordEntry.toArray());
//}
//
//        csvWriter.close();hk
//    }
}
