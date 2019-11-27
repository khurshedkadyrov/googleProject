import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMaxTest {

        public static int getMaxDigit(int[] digits) {
            int maxDigit = Integer.MIN_VALUE;

            for (int digit : digits) {

                if (digit > maxDigit) {
                    maxDigit = digit;
                }
            }
            return maxDigit;
        }

        @Test
        public void singleElementArrayTest() {
            int[] digitsArray = new int[]{126};
            assertEquals(126, getMaxDigit(digitsArray));
        }

        @Test
        public void positiveDigitsArrayTest() {
            int[] digitsArray = new int[]{0, 12, 1, 3, 5};
            assertEquals(12, getMaxDigit(digitsArray));
        }

        @Test
        public void negativeDigitsArrayTest() {
            int[] digitsArray = new int[]{-1, -12, -45, -6};
            assertEquals(-1, getMaxDigit(digitsArray));
        }

        @Test
        public void mixedDigitsArrayTest() {
            int[] digitsArray = new int[]{-1, -12, 12, 5, -45, -6};
            assertEquals(12, getMaxDigit(digitsArray));
        }
    }


