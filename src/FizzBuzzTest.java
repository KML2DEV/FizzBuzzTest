import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testSpecificValues() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        assertEquals("17", fizzBuzz.fizzBuzz(17));
    }
}