package fizzbuzz;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotNumberTest {

    private NotNumber notNumber;

    @Before
    public void setUp(){
        notNumber = new NotNumber();
    }

    @Test
    public void sayCharacterReturnNotNumber(){
        //Arrange
        final String expected = "Is not a number";
        final String input = "a";
        //Act
        String result = notNumber.say(input);
        //Assert
        assertEquals("is a number", expected, result);
    }


}
