package fileReader;

import model.PasswordEntry;

import java.io.IOException;
import java.util.List;

public interface
FileReader {

    public List<String> read (String path) throws IOException;
    List<PasswordEntry> getPasswordEntries(String path) throws IOException;

}
