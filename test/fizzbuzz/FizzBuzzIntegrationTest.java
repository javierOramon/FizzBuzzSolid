package fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FizzBuzzIntegrationTest {

    FizzBuzz fizzbuzz;

    @Before
    public void setUp() throws Exception {
        fizzbuzz = new FizzBuzz(Arrays.asList(new Fizz(), new Buzz(), new NotNumber()));
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void sayOneReturnOne() {
        //Arrange
        final String expected = "1";
        //Act
        String actual = fizzbuzz.say("1");
        //Assert
        assertEquals("Does not return one", expected, actual);
    }

    @Test
    public void sayThreeReturnTwo() {
        //Arrange
        final String expected = "2";
        //Act
        String actual = fizzbuzz.say("2");
        //Assert
        assertEquals("Does not return two", expected, actual);
    }

    @Test
    public void sayThreeReturnFizz() {
        //Arrange
        final String expected = "Fizz";
        //Act
        String actual = fizzbuzz.say("3");
        //Assert
        assertEquals("Does not return Fizz", expected, actual);
    }

    @Test
    public void sayFiveReturnBuzz() {
        //Arrange
        final String expected = "Buzz";
        //Act
        String actual = fizzbuzz.say("5");
        //Assert
        assertEquals("Does not return Buzz", expected, actual);
    }

    @Test
    public void saySixReturnSix() {
        //Arrange
        final String expected = "Fizz";
        //Act
        String actual = fizzbuzz.say("6");
        //Assert
        assertEquals("Does not return Fizz", expected, actual);
    }

    @Test
    public void sayNineReturnFizz() {
        //Arrange
        final String expected = "Fizz";
        //Act
        String actual = fizzbuzz.say("9");
        //Assert
        assertEquals("Does not return Fizz", expected, actual);
    }

    @Test
    public void sayTenReturnBuzz() {
        //Arrange
        final String expected = "Buzz";
        //Act
        String actual = fizzbuzz.say("10");
        //Assert
        assertEquals("Does not return Buzz", expected, actual);
    }

    @Test
    public void sayFifteenReturnFizzBuzz() {
        //Arrange
        final String expected = "FizzBuzz";
        //Act
        String actual = fizzbuzz.say("15");
        //Assert
        assertEquals("Does not return FizzBuzz", expected, actual);
    }

    @Test
    public void sayASentenceReturnIsNotANumber() {
        //Arrange
        final String expected = NotNumber.IS_NOT_A_NUMBER;
        //Act
        String actual = fizzbuzz.say("I shouldn't be here");
        //Assert
        assertEquals("Does not return FizzBuzz", expected, actual);
    }
}
