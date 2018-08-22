package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineFileReader extends AbstractFileReader {

    @Override
    public List<String> read(String path) throws IOException {
        return Files.readAllLines(getFile(path).toPath());
    }
}

