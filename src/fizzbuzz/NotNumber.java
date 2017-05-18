package fizzbuzz;


public class NotNumber implements ISay {

    public static final String IS_NOT_A_NUMBER = "Is not a number";

    @Override
    public String say(String number) {
        if(isNumber(number)) return "";

        return IS_NOT_A_NUMBER;
    }

    private boolean isNumber(String number) {
        try
        {
            Integer.parseInt(number);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
