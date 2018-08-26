package model;

import generator.GeneratorType;
import generator.PasswordGeneratorFacade;

import java.util.logging.Logger;

public class PasswordFacade {
    final static Logger LOG = Logger.getLogger(String.valueOf(PasswordFacade.class));
    private PasswordGeneratorFacade passwordGeneratorFacade;

    public PasswordFacade() {
        this.passwordGeneratorFacade = new PasswordGeneratorFacade();
    }

    public PasswordEntry generatePassword(String website, String login, GeneratorType strategy, int length) {

        String password = passwordGeneratorFacade.getPassword(length, strategy);
        return new PasswordEntry(website, password, login);

    }
}
