////////////////////////////////////////////////////////////////////
// MARCO BELTRAME 2111021
// STEFANO MASO 2110983
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] VALUES =
        {500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS =
        {"D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int number) {
        if (number < 1 || number > 500) {
            throw new IllegalArgumentException(
                "Il numero deve essere tra 1 e 500."
            );
        }

        String result = "";
        for (int i = 0; i < VALUES.length; i++) {
            while (number >= VALUES[i]) {
                result += SYMBOLS[i];
                number -= VALUES[i];
            }
        }
        return result;
    }
}