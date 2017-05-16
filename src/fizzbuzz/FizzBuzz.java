package fizzbuzz;


import java.util.List;

public class FizzBuzz {

    List<ISay> rules;

    public FizzBuzz(List<ISay> rules){
        this.rules = rules;
    }

    public String say(Integer number) {
        String out = "";
        for(ISay rule : rules){
            out += rule.say(number);
        }
        if(out.isEmpty()){
            out = number.toString();
        }
        return out;
    }
}
