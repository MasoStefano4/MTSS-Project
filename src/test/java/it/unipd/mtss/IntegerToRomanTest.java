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
    public void convertFourteen_shouldReturnXIV() {
        int input = 14;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIV", result);
    }

    @Test
    public void convertNineteen_shouldReturnXIX() {
        int input = 19;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIX", result);
    }

    @Test
    public void convertTwenty_shouldReturnXX() {
        int input = 20;
        String result = IntegerToRoman.convert(input);
        assertEquals("XX", result);
    }

    @Test
    public void convertFourtyfour_shouldReturnXLIV() {
        int input = 44;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLIV", result);
    }

    @Test
    public void convertFourtynine_shouldReturnXLIX() {
        int input = 49;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLIX", result);
    }

    @Test
    public void convertFifty_shouldReturnL() {
        int input = 50;
        String result = IntegerToRoman.convert(input);
        assertEquals("L", result);
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
        int input = 51;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);
    }
}
