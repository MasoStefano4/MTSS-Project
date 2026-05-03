////////////////////////////////////////////////////////////////////
// MARCO BELTRAME 2111021
// STEFANO MASO 2110983
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] VALUES = {5, 4, 1};
    private static final String[] SYMBOLS = {"V", "IV", "I"};

    public static String convert(int number) {
        if (number < 1 || number > 6) {
            throw new IllegalArgumentException(
                "Il numero deve essere tra 1 e 6."
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
