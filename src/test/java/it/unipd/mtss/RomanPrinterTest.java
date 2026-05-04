package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RomanPrinterTest {

    private String invokePrintAsciiArt(String roman) throws Throwable {
        try {
            Method method = RomanPrinter.class.getDeclaredMethod(
                "printAsciiArt", String.class
            );
            method.setAccessible(true);
            return (String) method.invoke(null, roman);
        } catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(
                "Failed to get printAsciiArt via reflection", e
            );
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new RuntimeException(
                "Failed to invoke printAsciiArt via reflection", e
            );
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

    @Test
    public void shouldPrintAsciiForI() throws Throwable {
        String roman = "I";
        String result = invokePrintAsciiArt(roman);
        String[] expected = new String[]{
            "  _____   ",
            " |_   _|  ",
            "   | |    ",
            "   | |    ",
            "  _| |_   ",
            " |_____|  ",
            ""
        };
        assertEquals(String.join("\n", expected), result);
    }

    @Test
    public void shouldPrintAsciiForV() throws Throwable {
        String roman = "V";
        String result = invokePrintAsciiArt(roman);
        String[] expected = new String[]{
            "__      __  ",
            "\\ \\    / /  ",
            " \\ \\  / /   ",
            "  \\ \\/ /    ",
            "   \\  /     ",
            "    \\/      ",
            ""
        };
        assertEquals(String.join("\n", expected), result);
    }

    @Test
    public void shouldPrintAsciiForX() throws Throwable {
        String roman = "X";
        String result = invokePrintAsciiArt(roman);
        String[] expected = new String[]{
            "__   __  ",
            "\\ \\ / /  ",
            " \\ V /   ",
            "  > <    ",
            " / . \\   ",
            "/_/ \\_\\  ",
            ""
        };
        assertEquals(String.join("\n", expected), result);
    }

    @Test
    public void shouldPrintRepeatedSymbol() throws Throwable {
        String roman = "III";
        String result = invokePrintAsciiArt(roman);
        String[] expected = new String[]{
            "  _____     _____     _____   ",
            " |_   _|   |_   _|   |_   _|  ",
            "   | |       | |       | |    ",
            "   | |       | |       | |    ",
            "  _| |_     _| |_     _| |_   ",
            " |_____|   |_____|   |_____|  ",
            ""
        };
        assertEquals(String.join("\n", expected), result);
    }

    @Test
    public void shouldPrintSubtractiveCombination() throws Throwable {
        String roman = "XIV";
        String result = invokePrintAsciiArt(roman);
        String[] expected = new String[]{
            "__   __    _____   __      __  ",
            "\\ \\ / /   |_   _|  \\ \\    / /  ",
            " \\ V /      | |     \\ \\  / /   ",
            "  > <       | |      \\ \\/ /    ",
            " / . \\     _| |_      \\  /     ",
            "/_/ \\_\\   |_____|      \\/      ",
            ""
        };
        assertEquals(String.join("\n", expected), result);
    }

    @Test
    public void testInRangeNumber() throws Throwable {
        int number = 18;
        String expectedOutput = invokePrintAsciiArt(IntegerToRoman.convert(number));
        String actualOutput = RomanPrinter.print(number);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidArgumentExceptionOnPrint_LowerBound() {
        int number = 0;
        Executable result = () -> RomanPrinter.print(number);
        assertThrows(IllegalArgumentException.class, result);
    }

    @Test
    public void testInvalidArgumentExceptionOnPrint_UpperBound() {
        int number = 21;
        Executable result = () -> RomanPrinter.print(number);
        assertThrows(IllegalArgumentException.class, result);
    }

    @Test
    public void testInvalidCharacter() {
        String invalid = "AAA";
        Executable result = () -> invokePrintAsciiArt(invalid);
        assertThrows(IllegalArgumentException.class, result);
    }
}
