package fizzbuzz;

public class Fizz implements ISay {

    public static final String FIZZ = "Fizz";

    private static final int NUMBER_FIZZ = 3;

    @Override
    public String say(Integer number) {
        String word = "";
        if(isFizz(number)){
            word = FIZZ;
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


    private boolean isFizz(Integer numero) {
        return (numero % NUMBER_FIZZ == 0);
    }
}
