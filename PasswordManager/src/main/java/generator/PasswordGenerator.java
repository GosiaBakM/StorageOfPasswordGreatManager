package generator;

public interface PasswordGenerator {
    String generate(int length);
    GeneratorType getType();
}
