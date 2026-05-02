////////////////////////////////////////////////////////////////////
// MARCO BELTRAME 2111021
// STEFANO MASO 2110983
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    private static final String[] ASCII_I = {
        "  _____ ",
        " |_   _|",
        "   | |  ",
        "   | |  ",
        "  _| |_ ",
        " |_____|"
    };

    private static final String[] ASCII_V = {
        "__      __",
        "\\ \\    / /",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   \\  /   ",
        "    \\/    "
    };

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < 6; row++) {
            for (char c : romanNumber.toCharArray()) {
                result.append(getAsciiChar(c)[row]);
                result.append("  ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    private static String[] getAsciiChar(char c) {
        switch (c) {
            case 'I': return ASCII_I;
            case 'V': return ASCII_V;
            default: throw new IllegalArgumentException(
                "Carattere romano non riconosciuto: " + c
            );
        }
    }
}
