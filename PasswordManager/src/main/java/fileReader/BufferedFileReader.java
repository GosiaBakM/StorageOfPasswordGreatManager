package fileReader;

import javafx.scene.shape.Path;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BufferedFileReader extends AbstractFileReader{

//    public List<String> read(String path) {
//        File file = new File("passwords.txt");
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fileReader);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
    @Override
    public List<String> read(String path) throws IOException {
        File file = getFile(path);

        List<String> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                result.add(line);
                line = reader.readLine();
            }
        }
        return result;
    }
}
