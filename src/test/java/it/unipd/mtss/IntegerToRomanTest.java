package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.function.Executable;

public class IntegerToRomanTest {

    @Test
    public void convertOne_shouldReturnI() {
        int input = 1;
        String result = IntegerToRoman.convert(input);
        assertEquals("I", result);
    }

    @Test
    public void convertThree_shouldReturnIII() {
        int input = 3;
        String result = IntegerToRoman.convert(input);
        assertEquals("III", result);
    }

    @Test
    public void convertFour_shouldReturnIV() {
        int input = 4;
        String result = IntegerToRoman.convert(input);
        assertEquals("IV", result);
    }

    @Test
    public void convertFive_shouldReturnV() {
        int input = 5;
        String result = IntegerToRoman.convert(input);
        assertEquals("V", result);
    }

    @Test
    public void convertNine_shouldReturnIX() {
        int input = 9;
        String result = IntegerToRoman.convert(input);
        assertEquals("IX", result);
    }

    @Test
    public void convertForty_shouldReturnXL() {
        int input = 40;
        String result = IntegerToRoman.convert(input);
        assertEquals("XL", result);
    }

    @Test
    public void convertFifty_shouldReturnL() {
        int input = 50;
        String result = IntegerToRoman.convert(input);
        assertEquals("L", result);
    }

    @Test
    public void convertEightyEight_shouldReturnLXXXVIII() {
        int input = 88;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXXVIII", result);
    }

    @Test
    public void convertNinety_shouldReturnXC() {
        int input = 90;
        String result = IntegerToRoman.convert(input);
        assertEquals("XC", result);
    }

    @Test
    public void convertNinetyNine_shouldReturnXCIX() {
        int input = 99;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCIX", result);
    }

    @Test
    public void convertHundred_shouldReturnC() {
        int input = 100;
        String result = IntegerToRoman.convert(input);
        assertEquals("C", result);
    }

    @Test
    public void convertZero_shouldThrowException() {
        int input = 0;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);
    }

    @Test
    public void convertNegative_shouldThrowException() {
        int input = -1;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);
    }

    @Test
    public void convertOverLimit_shouldThrowException() {
        int input = 101;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);
    }
}
