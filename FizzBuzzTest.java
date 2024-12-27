package com.controle.tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
 @Test
    void testFizzBuzzReturnsFizzForMultipleOf3() {
        assertEquals("Fizz", FizzBuzz.de(3));
    }

    @Test
    void testFizzBuzzReturnsBuzzForMultipleOf5() {
        assertEquals("Buzz", FizzBuzz.de(5));
    }

    @Test
    void testFizzBuzzReturnsFizzBuzzForMultipleOf3And5() {
        assertEquals("FizzBuzz", FizzBuzz.de(15));
    }

    @Test
    void testFizzBuzzReturnsNumberForNonMultiplesOf3And5() {
        assertEquals("7", FizzBuzz.de(7));
    }
}


