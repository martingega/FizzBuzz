package fizzbuzz;

public class FizzBuzz {

    public String convert(int num) {
        if(num%3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(num);
        }
    }

}
