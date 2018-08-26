package Options;

import fileReader.PasswordEntryFileWriter;
import generator.GeneratorType;
import model.PasswordEntry;
import model.PasswordFacade;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SavingOption implements userOptionRealization {

    Scanner scanner = new Scanner(System.in);
    PasswordEntryFileWriter writer;

    public SavingOption() {
        writer = new PasswordEntryFileWriter();
    }

    @Override
    public void userOptionRealize(String path) throws IOException, URISyntaxException {

        System.out.println("Podaj strone internetowa");
        String userWebsite = scanner.nextLine();
        System.out.println("Podaj swój login");
        String userLogin = scanner.nextLine();
        System.out.println("Podaj rodzaj generatora");
        String userHasloString = scanner.nextLine();
        //GeneratorType userHaslo = GeneratorType.valueOf(.toString());
        if (userHasloString.equals(GeneratorType.valueOf(userHasloString))) ;
        GeneratorType userHaslo = GeneratorType.valueOf(userHasloString);

        System.out.println("Podaj długość hasła");
        int userLength = Integer.parseInt(scanner.nextLine());
        PasswordFacade facade = new PasswordFacade();

//       List <PasswordEntry> listOfEntry = Arrays.asList(facade.generatePassword(userWebsite, userLogin, userHaslo, userLength));
//        writer.writeToFile(path, listOfEntry);
    }


}
