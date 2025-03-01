import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void testFizzBuzzMultiplo3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }

    @Test
    void testFizzBuzzMultiplo5() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }

    @Test
    void testFizzBuzzMultiplo3y5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }

    @Test
    void testFizzBuzzNoMultiplo() {
        assertEquals("7", FizzBuzz.fizzbuzz(7));
    }

    @Test
    void testFizzBuzzCero() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(0));
    }

    @Test
    void testFizzBuzzNegativo() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(-3));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(-5));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(-15));
    }
}
