package geteratorTest;
import generator.StrongPasswordGenerator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class StrongPasswordGeneratorTest {

    StrongPasswordGenerator generator;
    @Before
    public  void startUp(){
        generator = new StrongPasswordGenerator();
    }

    @Test
    public void shouldGiveProperLenghtOfPassword(){
        assertThat(generator.generate(8)).hasSize(8);
    }
    @Test
    public void shouldGiveNotNull(){
        assertThat(generator.generate(6)).isNotNull();
    }
    @Test
    public void shouldNotBeBlank(){

        assertThat(generator.generate(999)).isNotBlank();
    }
}
