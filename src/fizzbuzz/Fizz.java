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
        return null;
    }


    private boolean isFizz(Integer numero) {
        return (numero % NUMBER_FIZZ == 0);
    }
}
