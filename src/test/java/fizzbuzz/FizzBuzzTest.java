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

}
