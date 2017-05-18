package fizzbuzz;


public class NotNumber implements ISay {

    @Override
    public String say(String number) {
        if(isNumber(number)) return "";

        return "Is not a number";
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
