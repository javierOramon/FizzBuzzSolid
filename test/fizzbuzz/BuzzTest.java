package fizzbuzz;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuzzTest {
    private Buzz buzz;

    @Before
    public void setUp(){
        buzz = new Buzz();
    }

    @Test
    public void sayFiveReturnBuzz() {
        //Arrange
        final String expected = Buzz.BUZZ;
        //Act
        String actual = buzz.say("5");
        //Assert
        assertEquals("Don't return Buzz", expected, actual);
    }

    @Test
    public void sayTwoReturnEmpty() {
        //Arrange
        final String expected = "";
        //Act
        String actual = buzz.say("2");
        //Assert
        assertEquals("Text is not empty", expected, actual);
    }

    @Test
    public void sayTenReturnBuzz() {
        //Arrange
        final String expected = Buzz.BUZZ;
        //Act
        String actual = buzz.say("10");
        //Assert
        assertEquals("Text is not Buzz", expected, actual);
    }
}
