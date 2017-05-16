package fizzbuzz;

public class Buzz implements ISay {


    public static final String BUZZ = "Buzz";


    public static final int NUMBER_BUZZ = 5;

    @Override
    public String say(Integer number) {
        String word = "";
        if(isBuzz(number)){
            word = BUZZ;
        }
        return word;
    }



    private boolean isBuzz(Integer numero) {
        return (numero % NUMBER_BUZZ == 0);
    }
}
