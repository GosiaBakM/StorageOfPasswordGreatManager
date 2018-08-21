package generator;


public class PasswordFacade {

    private PasswordGeneratorFactory passwordGeneratorFactory;

    public PasswordFacade() {
        passwordGeneratorFactory = new PasswordGeneratorFactory();
    }

    public String getPassword(int length, GeneratorType type) {
        return passwordGeneratorFactory.getGenerator(type).generate(length);
    }

}
