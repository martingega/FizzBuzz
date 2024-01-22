package fizzbuzz;

import org.junit.jupiter.api.Test;

public class ActualFizzBuzzAppTest {

    @Test
    public void outputForHundredFizzBuzz(){

        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++){
            System.out.println(fizzBuzz.convert(i));
        }

    }
}
