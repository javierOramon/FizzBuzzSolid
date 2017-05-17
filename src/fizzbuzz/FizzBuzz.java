package fizzbuzz;


import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    private List<ISay> rules;

    public FizzBuzz(List<ISay> rules){
        this.rules = rules;
    }

    public String say(Integer number) {
        String out = rules.stream().map(r -> r.say(number)).collect(Collectors.joining());
        out = sanitizeOut(number, out);
        return out;
    }

    private String sanitizeOut(Integer number, String out) {
        if(out.isEmpty()){
            out = number.toString();
        }
        return out;
    }
}
