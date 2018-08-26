import Options.Interface;
import Options.SavingOption;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException {

//        PasswordEntry obiekt1 = new PasswordEntry("fb", "23213", "gb");
//        PasswordEntry obiekt2 = new PasswordEntry("fb", "23213", "gb");
//        List <PasswordEntry> lista1 = new ArrayList<>();
//        lista1.add(obiekt1);
//        lista1.add(obiekt2);
//        PasswordEntryFileWriter write = new PasswordEntryFileWriter();
//        try {
//            write.writeToFile("passwords.txt", lista1);
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
//
//        LineFileReader reader = new LineFileReader();
//        System.out.println(reader.read("passwords.txt"));

//        Interface i= new Interface();
//        i.generatirng();

        SavingOption opt = new SavingOption();
        //opt.

        try {
            opt.userOptionRealize("passwords.txt");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        int x = 10;
        Integer y = Integer.valueOf(10);
        System.out.println(y);

    }
}
