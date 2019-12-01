import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseNumberTest{

    public static int getReversedDigit(int digit) {
        String inputString = String.valueOf(digit);  //с методом StringBuffer получается тоже самое что и с методом toString, 3 из 5 тестов passed И 2 теста failed
        StringBuffer stringBuffer = new StringBuffer(inputString);
        stringBuffer.reverse();
        String reversedDigit = stringBuffer.toString();
        int reversedInt = Integer.parseInt(reversedDigit);

      /*  String input = String.valueOf(digit); - пытался использовать метод toString - 3 passed и 2 failed
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result = result + input.charAt(i);
        }
        int reversedDigit = Integer.parseInt(result);*/
        return reversedInt;
    }

    @Test
    public void positiveDigitTest() {
        assertEquals(1, getReversedDigit(1));
        assertEquals(321, getReversedDigit(123));
    }

    @Test
    public void negativeDigitTest() {
        assertEquals(1, getReversedDigit(-1));
    }

    @Test
    public void zeroTest() {
        assertEquals(0, getReversedDigit(0));
    }

    @Test
    public void bigValueTest() {
        assertEquals(76723, getReversedDigit(Short.MAX_VALUE));
    }

    @Test
    public void smallValueTest() {
        assertEquals(86723, getReversedDigit(Short.MIN_VALUE));
    }
}


