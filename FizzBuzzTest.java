package com.controle.tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest { 
 @Test
    void testFizzBuzzReturnsFizzForMultipleOf3() {
        //Given
     int nb =1;
     String expected = "1";
     //when
      String aclual=FizzBuzz.de(3);
      //then
     assertEquals(expected, aclual);
    }
}
