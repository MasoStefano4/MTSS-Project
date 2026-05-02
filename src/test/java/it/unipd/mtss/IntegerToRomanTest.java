package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

    @Test
    public void convertOne_shouldReturnI() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void convertTwo_shouldReturnII() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void convertThree_shouldReturnIII() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void convertZero_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(0);
        });
    }

    @Test
    public void convertFour_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(4);
        });
    }

    @Test
    public void convertNegative_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(-1);
        });
    }
}