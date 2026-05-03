package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void printOne_shouldReturnCorrectAsciiArt() {
        assertEquals(EXPECTED_I, RomanPrinter.print(1));
    }

    @Test
    public void printTwo_shouldReturnCorrectAsciiArt() {
        assertEquals(EXPECTED_II, RomanPrinter.print(2));
    }

    @Test
    public void printThree_shouldReturnCorrectAsciiArt() {
        assertEquals(EXPECTED_III, RomanPrinter.print(3));
    }

    @Test
    public void printFour_shouldReturnCorrectAsciiArt() {
        assertEquals(EXPECTED_IV, RomanPrinter.print(4));
    }

    @Test
    public void printFive_shouldReturnCorrectAsciiArt() {
        assertEquals(EXPECTED_V, RomanPrinter.print(5));
    }

    @Test
    public void printSix_shouldReturnCorrectAsciiArt() {
        assertEquals(EXPECTED_VI, RomanPrinter.print(6));
    }

    @Test
    public void printZero_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
    }

    @Test
    public void printSeven_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(7));
    }

    @Test
    public void printNegative_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(-1));
    }
}
