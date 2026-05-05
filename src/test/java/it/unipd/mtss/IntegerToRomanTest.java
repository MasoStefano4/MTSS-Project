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
    public void convertTen_shouldReturnX() {
        int input = 10;
        String result = IntegerToRoman.convert(input);
        assertEquals("X", result);
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
    public void convertThreeHundredFortyNine_shouldReturnCCCXLIX() {
        int input = 349;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXLIX", result);
    }

    @Test
    public void convertFourHundred_shouldReturnCD() {
        int input = 400;
        String result = IntegerToRoman.convert(input);
        assertEquals("CD", result);
    }

    @Test
    public void convertFourHundredNinetyNine_shouldReturnCDXCIX() {
        int input = 499;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCIX", result);
    }

    @Test
    public void convertFiveHundred_shouldReturnD() {
        int input = 500;
        String result = IntegerToRoman.convert(input);
        assertEquals("D", result);
    }

    @Test
    public void convertSevenHundred_shouldReturnDCC() {
        int input = 700;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCC", result);
    }

    @Test
    public void convertNineHundred_shouldReturnCM() {
        int input = 900;
        String result = IntegerToRoman.convert(input);
        assertEquals("CM", result);
    }

    @Test
    public void convertNineHundredNinetyNine_shouldReturnCMXCIX() {
        int input = 999;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCIX", result);
    }

    @Test
    public void convertThousand_shouldReturnM() {
        int input = 1000;
        String result = IntegerToRoman.convert(input);
        assertEquals("M", result);
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
        int input = 1001;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);
    }
}