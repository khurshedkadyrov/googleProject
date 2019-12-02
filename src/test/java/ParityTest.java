import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParityTest {
    public static boolean isEven(int digit) {
        boolean isEven = false;
        System.out.println("Is " + digit + " even?");
        if (digit % 2 == 0) {
            return true;
        } else {
            return isEven;
        }

    }


    @Test
    public void positiveDigitTest() {
        assertEquals(false, isEven(1));
    }

    @Test
    public void negativeDigitTest() {
        assertEquals(false, isEven(-1));
    }

    @Test
    public void zeroTest() {
        assertEquals(true, isEven(0));
    }

    @Test
    public void maxIntegerValueTest() {
        assertEquals(false, isEven(Integer.MAX_VALUE));
    }

    @Test
    public void minimalIntegerValueTest() {
        assertEquals(true, isEven(Integer.MIN_VALUE));
    }
}


