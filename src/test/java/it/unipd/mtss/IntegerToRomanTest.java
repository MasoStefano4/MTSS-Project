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
    public void convertTwo_shouldReturnII() {
        int input = 2;
        String result = IntegerToRoman.convert(input);
        assertEquals("II", result);
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
    public void convertSix_shouldReturnVI() {
        int input = 6;
        String result = IntegerToRoman.convert(input);
        assertEquals("VI", result);    }

    @Test
    public void convertSeven_shouldReturnVII() {
        int input = 7;
        String result = IntegerToRoman.convert(input);
        assertEquals("VII", result);
    }

    @Test
    public void convertEight_shouldReturnVIII() {
        int input = 8;
        String result = IntegerToRoman.convert(input);
        assertEquals("VIII", result);
    }

    @Test
    public void convertNine_shouldReturnIX() {
        int input = 9;
        String result = IntegerToRoman.convert(input);
        assertEquals("IX", result);
    }

    @Test
    public void convertTen_shouldReturnX() {
        int input = 10;
        String result = IntegerToRoman.convert(input);
        assertEquals("X", result);
    }

    @Test
    public void convertZero_shouldThrowException() {
        int input = 0;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);
    }

    @Test
    public void convertEleven_shouldThrowException() {
        int input = 11;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);
    }

    @Test
    public void convertNegative_shouldThrowException() {
        int input = -1;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);
    }
}
