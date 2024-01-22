package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FizzBuzzTest {

	@Test
	void leaveNormalNumbersAlone(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertThat(fizzBuzz.convert(1)).isEqualTo("1");
		assertThat(fizzBuzz.convert(2)).isEqualTo("2");
	}

	@Test
	void multipleOfThree(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertThat(fizzBuzz.convert(3)).isEqualTo("Fizz");
		assertThat(fizzBuzz.convert(6)).isEqualTo("Fizz");
	}

	@Test
	void multipleOfFive(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertThat(fizzBuzz.convert(5)).isEqualTo("Buzz");
		assertThat(fizzBuzz.convert(10)).isEqualTo("Buzz");
	}
}
