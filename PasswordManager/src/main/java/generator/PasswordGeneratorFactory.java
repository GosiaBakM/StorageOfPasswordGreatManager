package generator;

public class PasswordGeneratorFactory {

    PasswordGenerator getGenerator(GeneratorType type) {

        switch (type) {
            case STRONG_PASSWORD:
                return new StrongPasswordGenerator();

            case MEDIUM_PASSWORD:
                return new MediumPasswordGenerator();

            default:
                throw new PasswordGeneratorException("No such generator");
        }

    }
}
