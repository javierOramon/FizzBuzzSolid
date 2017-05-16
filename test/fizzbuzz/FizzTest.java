package fizzbuzz;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzTest {

    private Fizz fizz;

    @Before
    public void setUp(){
        fizz = new Fizz();
    }

    @Test
    public void sayThreeReturnFizz() {
        //Arrange
        final String expected = Fizz.FIZZ;
        //Act
        String actual = fizz.say(3);
        //Assert
        assertEquals("Don't return Fizz", expected, actual);
    }

    @Test
    public void sayTwoReturnEmpty() {
        //Arrange
        final String expected = "";
        //Act
        String actual = fizz.say(2);
        //Assert
        assertEquals("Text is not empty", expected, actual);
    }

    @Test
    public void saySixReturnFizz() {
        //Arrange
        final String expected = Fizz.FIZZ;
        //Act
        String actual = fizz.say(6);
        //Assert
        assertEquals("Text is not empty", expected, actual);
    }
}
