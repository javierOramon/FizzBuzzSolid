package fizzbuzz;


public class NotNumber implements ISay {

    @Override
    public String say(String number) {
        return "Is not a number";
    }
}
