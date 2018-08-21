package geteratorTest;

import org.junit.Before;
import org.junit.Test;
import generator.PasswordGeneratorFactory;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class PasswordGeneratorFactoryTest {
    PasswordGeneratorFactory generator;
    @Before
    public void startUp(){

        generator = new PasswordGeneratorFactory();
    }

    @Test
    public void testing(){
        //assertThat(generator.
    }

}
