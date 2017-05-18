package fizzbuzz;

public class Buzz implements ISay {


    public static final String BUZZ = "Buzz";


    public static final int NUMBER_BUZZ = 5;

    private String say(Integer number) {
        String word = "";
        if(isBuzz(number)){
            word = BUZZ;
        }
        return word;
    }

    @Override
    public String say(String number) {
        if (isNotNumber(number)) return "";
        return say(Integer.parseInt(number));
    }

    private boolean isNotNumber(String number) {
        try
        {
            Integer.parseInt(number);
        }
        catch(NumberFormatException nfe)
        {
            return true;
        }
        return false;
    }


    private boolean isBuzz(Integer numero) {
        return (numero % NUMBER_BUZZ == 0);
    }
}
