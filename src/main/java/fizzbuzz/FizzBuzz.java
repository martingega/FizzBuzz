package fizzbuzz;

public class FizzBuzz {

    public String convert(int num) {
        if (num%3 == 0) {
            return "Fizz";
        } else if (num%5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }

}
