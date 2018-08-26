package Options;

import fileReader.FilesFacade;
import fileReader.PasswordEntryFileWriter;
import model.PasswordEntry;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LoadingOption implements userOptionRealization {

    FilesFacade filesFacade;

    LoadingOption() {
        this.filesFacade = new FilesFacade();
    }

    Scanner scanner = new Scanner(System.in);
    //metoda wyciagajaca obiekt na podstawie nazwy strony i zwracaja obiekt entry do stringa

    @Override
    public void userOptionRealize(String path) throws IOException, URISyntaxException {

    }


//    public PasswordEntry getEntry(String web) {
//
//        List<PasswordEntry> listOfEntries = filesFacade.getEntries(path);
//        System.out.println("Podaj nazwe strony do pobrania entry");
//        String userWebDeclaration = scanner.nextLine();
//        for (PasswordEntry t : listOfEntries) {
//            if (userWebDeclaration.equals(t.getWebsite())) {
//                return t;
//                PasswordEntry declarationEntry = listOfEntries.
//            }
//
//        }
//    }
}
