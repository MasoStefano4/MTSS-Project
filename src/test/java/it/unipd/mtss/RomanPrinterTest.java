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
    public void shouldPrintAsciiForL() throws Throwable {
        String roman = "L";
        String result = invokePrintAsciiArt(roman);
        String[] expected = new String[]{
            " _        ",
            "| |       ",
            "| |       ",
            "| |       ",
            "| |____   ",
            "|______|  ",
            ""
        };
        assertEquals(String.join("\n", expected), result);
    }

    @Test
    public void shouldPrintAsciiForC() throws Throwable {
        String roman = "C";
        String result = invokePrintAsciiArt(roman);
        String[] expected = new String[]{
            "  _____   ",
            " / ____|  ",
            "| |       ",
            "| |       ",
            "| |____   ",
            " \\_____|  ",
            ""
        };
        assertEquals(String.join("\n", expected), result);
    }

    @Test
    public void shouldPrintAsciiForD() throws Throwable {
        String roman = "D";
        String result = invokePrintAsciiArt(roman);
        String[] expected = new String[]{
            " _____    ",
            "|  __ \\   ",
            "| |  | |  ",
            "| |  | |  ",
            "| |__| |  ",
            "|_____/   ",
            ""
        };
        assertEquals(String.join("\n", expected), result);
    }

    @Test
    public void shouldPrintAsciiForM() throws Throwable {
        String roman = "M";
        String result = invokePrintAsciiArt(roman);
        String[] expected = new String[]{
            " __  __   ",
            "|  \\/  |  ",
            "| \\  / |  ",
            "| |\\/| |  ",
            "| |  | |  ",
            "|_|  |_|  ",
            ""
        };
        assertEquals(String.join("\n", expected), result);
    }

    @Test
    public void shouldPrintSubtractiveCombination() throws Throwable {
        String roman = "CDLXXXIX";
        String[] expectedLines = new String[]{
            "  _____    _____     _        __   __  __   __  __   __    _____   __   __  ",
            " / ____|  |  __ \\   | |       \\ \\ / /  \\ \\ / /  \\ \\ / /   |_   _|  \\ \\ / /  ",
            "| |       | |  | |  | |        \\ V /    \\ V /    \\ V /      | |     \\ V /   ",
            "| |       | |  | |  | |         > <      > <      > <       | |      > <    ",
            "| |____   | |__| |  | |____    / . \\    / . \\    / . \\     _| |_    / . \\   ",
            " \\_____|  |_____/   |______|  /_/ \\_\\  /_/ \\_\\  /_/ \\_\\   |_____|  /_/ \\_\\  ",
            ""
        };
        String expected = String.join("\n", expectedLines);
        String result = invokePrintAsciiArt(roman);
        assertEquals(expected, result);
    }



    @Test
    public void testInRangeNumber() throws Throwable {
        int number = 444;
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
        int number = 1001;
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