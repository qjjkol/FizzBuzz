package com.controle.tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
 @Test
    void testFizzBuzzReturnsFizzForM1() {
        //Given
     int nb =1;
     String expected = "1";
     //when
      String aclual=FizzBuzz.de(nb);
      //then
     assertEquals(expected, aclual);
    }



    @Test
    void testFizzBuzzReturnsFizzForM2() {
        //Given
        int nb =2;
        String expected = "2";
        //when
        String aclual=FizzBuzz.de(nb);
        //then
        assertEquals(expected, aclual);
    }

}
