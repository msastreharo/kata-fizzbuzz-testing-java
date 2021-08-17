import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest {

    @Test
    void shouldLeaveNormalNumbersAlone() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.assigning(1);
        assertThat(fizzbuzz.counter(1), equalTo("1"));
    }

    @Test
    void shouldReturnFizzIfTheNumberIsDivisibleByThree(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.assigning(3);
        assertThat(fizzbuzz.counter(3), equalTo("Fizz"));
    }

    @Test
    void shouldReturnBuzzIfTheNumberIsDivisibleByFive() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.assigning(5);
        assertThat(fizzbuzz.counter(5), equalTo("Buzz"));
    }

    @Test
    void shouldReturnFizzBuzzIfTheNumberIsDivisibleByThreeAndFive() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.assigning(15);
        assertThat(fizzbuzz.counter(15), equalTo("FizzBuzz"));
    }
}
