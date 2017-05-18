package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;
    private ISay rule1;
    private ISay rule2;

    @Before
    public void setUp(){
        rule1 = mock(ISay.class);
        rule2 = mock(ISay.class);
        fizzBuzz = new FizzBuzz(Arrays.asList(rule1, rule2));
    }

    @Test
    public void ifAnyRuleWorkReturnTheNumber(){
        //Arrange
        final String expected = "5";
        String anyNumber = "5";
        when(rule1.say(anyNumber)).thenReturn("");
        when(rule2.say(anyNumber)).thenReturn("");
        //Act
        String result = fizzBuzz.say("5");
        //Assert
        assertEquals("is not the same number", expected, result);
    }

    @Test
    public void iffirstRuleWorkReturnYourText(){
        //Arrange
        final String expected = "Juan";
        String anyNumber = "5";
        when(rule1.say(anyNumber)).thenReturn(expected);
        when(rule2.say(anyNumber)).thenReturn("");
        //Act
        String result = fizzBuzz.say("5");
        //Assert
        assertEquals("is not the same number", expected, result);
    }

    @Test
    public void ifSecondtRuleWorkReturnYourText(){
        //Arrange
        final String expected = "Juan";
        String anyNumber = "5";
        when(rule1.say(anyNumber)).thenReturn("");
        when(rule2.say(anyNumber)).thenReturn(expected);
        //Act
        String result = fizzBuzz.say("5");
        //Assert
        assertEquals("is not the same number", expected, result);
    }

    @Test
    public void ifAlltRulesWorksReturnAllAppendText(){
        //Arrange
        final String first = "first";
        final String second = "second";
        final String expected = first + second;
        String anyNumber = "5";
        when(rule1.say(anyNumber)).thenReturn(first);
        when(rule2.say(anyNumber)).thenReturn(second);
        //Act
        String result = fizzBuzz.say("5");
        //Assert
        assertEquals("is not the same number", expected, result);
    }
}
