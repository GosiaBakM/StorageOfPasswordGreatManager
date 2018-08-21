package geteratorTest;

import generator.GeneratorType;
import generator.PasswordFacade;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class PasswordFacadeTest {

    PasswordFacade facade;

    @Before
    public void startUp (){
        facade = new PasswordFacade();
    }

    @Test
    public void shouldHasProperSize(){
        assertThat(facade.getPassword(10,GeneratorType.STRONG_PASSWORD)).hasSize(10);
    }
    @Test
    public void shouldNotBeNullOrEmptyOrBlank(){
        assertThat(facade.getPassword(10,GeneratorType.STRONG_PASSWORD))
                .isNotBlank()
                .isNotNull()
                .isNotEmpty();
    }
}
