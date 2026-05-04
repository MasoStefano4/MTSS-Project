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

    private static final String[] ASCII_X = {
        "__   __",
        "\\ \\ / /",
        " \\ V / ",
        "  > <  ",
        " / . \\ ",
        "/_/ \\_\\"
    };

    private static final String[] ASCII_L = {
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|"
    };

    private static final String[] ASCII_C = {
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
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
            case 'X': return ASCII_X;
            case 'L': return ASCII_L;
            case 'C': return ASCII_C;
            default: throw new IllegalArgumentException(
                "Carattere romano non riconosciuto: " + c
            );
        }
    }
}
