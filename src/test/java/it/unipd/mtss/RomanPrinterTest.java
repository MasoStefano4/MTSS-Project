package it.unipd.mtss;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.function.Executable;

public class RomanPrinterTest {

    private static final String EXPECTED_I =
        "  _____   \n" +
        " |_   _|  \n" +
        "   | |    \n" +
        "   | |    \n" +
        "  _| |_   \n" +
        " |_____|  \n";

    private static final String EXPECTED_II =
        "  _____     _____   \n" +
        " |_   _|   |_   _|  \n" +
        "   | |       | |    \n" +
        "   | |       | |    \n" +
        "  _| |_     _| |_   \n" +
        " |_____|   |_____|  \n";

    private static final String EXPECTED_III =
        "  _____     _____     _____   \n" +
        " |_   _|   |_   _|   |_   _|  \n" +
        "   | |       | |       | |    \n" +
        "   | |       | |       | |    \n" +
        "  _| |_     _| |_     _| |_   \n" +
        " |_____|   |_____|   |_____|  \n";

    private static final String EXPECTED_IV =
        "  _____   __      __  \n" +
        " |_   _|  \\ \\    / /  \n" +
        "   | |     \\ \\  / /   \n" +
        "   | |      \\ \\/ /    \n" +
        "  _| |_      \\  /     \n" +
        " |_____|      \\/      \n";

    private static final String EXPECTED_V =
        "__      __  \n" +
        "\\ \\    / /  \n" +
        " \\ \\  / /   \n" +
        "  \\ \\/ /    \n" +
        "   \\  /     \n" +
        "    \\/      \n";

    private static final String EXPECTED_VI =
        "__      __    _____   \n" +
        "\\ \\    / /   |_   _|  \n" +
        " \\ \\  / /      | |    \n" +
        "  \\ \\/ /       | |    \n" +
        "   \\  /       _| |_   \n" +
        "    \\/       |_____|  \n";

    private static final String EXPECTED_VII =
        "__      __    _____     _____   \n" +
        "\\ \\    / /   |_   _|   |_   _|  \n" +
        " \\ \\  / /      | |       | |    \n" +
        "  \\ \\/ /       | |       | |    \n" +
        "   \\  /       _| |_     _| |_   \n" +
        "    \\/       |_____|   |_____|  \n";

    private static final String EXPECTED_VIII =
        "__      __    _____     _____     _____   \n" +
        "\\ \\    / /   |_   _|   |_   _|   |_   _|  \n" +
        " \\ \\  / /      | |       | |       | |    \n" +
        "  \\ \\/ /       | |       | |       | |    \n" +
        "   \\  /       _| |_     _| |_     _| |_   \n" +
        "    \\/       |_____|   |_____|   |_____|  \n";

    private static final String EXPECTED_IX =
        "  _____   __   __  \n" +
        " |_   _|  \\ \\ / /  \n" +
        "   | |     \\ V /   \n" +
        "   | |      > <    \n" +
        "  _| |_    / . \\   \n" +
        " |_____|  /_/ \\_\\  \n";

    private static final String EXPECTED_X =
        "__   __  \n" +
        "\\ \\ / /  \n" +
        " \\ V /   \n" +
        "  > <    \n" +
        " / . \\   \n" +
        "/_/ \\_\\  \n";

    @Test
    public void printOne_shouldReturnCorrectAsciiArt() {
        int input = 1;
        String result = RomanPrinter.print(input);
        assertEquals(EXPECTED_I, result);
    }


    @Test
    public void printTwo_shouldReturnCorrectAsciiArt() {
        int input = 2;
        String result = RomanPrinter.print(input);
        assertEquals(EXPECTED_II, result);
    }

    @Test
    public void printThree_shouldReturnCorrectAsciiArt() {
        int input = 3;
        String result = RomanPrinter.print(input);
        assertEquals(EXPECTED_III, result);    }

    @Test
    public void printFour_shouldReturnCorrectAsciiArt() {
        int input = 4;
        String result = RomanPrinter.print(input);
        assertEquals(EXPECTED_IV, result);
    }

    @Test
    public void printFive_shouldReturnCorrectAsciiArt() {
        int input = 5;
        String result = RomanPrinter.print(input);
        assertEquals(EXPECTED_V, result);
    }

    @Test
    public void printSix_shouldReturnCorrectAsciiArt() {
        int input = 6;
        String result = RomanPrinter.print(input);
        assertEquals(EXPECTED_VI, result);
    }

    @Test
    public void printSeven_shouldReturnCorrectAsciiArt() {
        int input = 7;
        String result = RomanPrinter.print(input);
        assertEquals(EXPECTED_VII, result);
    }

    @Test
    public void printEight_shouldReturnCorrectAsciiArt() {
        int input = 8;
        String result = RomanPrinter.print(input);
        assertEquals(EXPECTED_VIII, result);
    }

    @Test
    public void printNine_shouldReturnCorrectAsciiArt() {
        int input = 9;
        String result = RomanPrinter.print(input);
        assertEquals(EXPECTED_IX, result);
    }

    @Test
    public void printTen_shouldReturnCorrectAsciiArt() {
        int input = 10;
        String result = RomanPrinter.print(input);
        assertEquals(EXPECTED_X, result);
    }

    @Test
    public void printZero_shouldThrowException() {
        int input = 0;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);
    }

    @Test
    public void printEleven_shouldThrowException() {
        int input = 11;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);    }

    @Test
    public void printNegative_shouldThrowException() {
        int input = -1;
        Executable result = () -> IntegerToRoman.convert(input);
        assertThrows(IllegalArgumentException.class, result);    }
}