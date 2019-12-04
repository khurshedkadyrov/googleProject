import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumCalculator {                       //While condition
    public int calculateSumForWhile(int maxvalue) {
        int sum = 0;
        int i = 0;
        while (i <= maxvalue) {
            sum = sum + i;
            ++i;
        }
        System.out.println("The sum is " + sum);
        return sum;
    }

    @Test
    public void calculateSumForWhileZero() {
        assertEquals(0, new SumCalculator().calculateSumForWhile(0));
    }

    @Test
    public void calculateSumForWhileOne() {
        assertEquals(1, new SumCalculator().calculateSumForWhile(1));
    }

    @Test
    public void calculateSumForWhileTwo() {
        assertEquals(3, new SumCalculator().calculateSumForWhile(2));
    }

    @Test
    public void calculateSumForWhileThree() {
        assertEquals(6, new SumCalculator().calculateSumForWhile(3));
    }

    @Test
    public void calculateSumForWhileFour() {
        assertEquals(10, new SumCalculator().calculateSumForWhile(4));
    }

    @Test
    public void calculateSumForWhileOneTwenty() {
        assertEquals(120, new SumCalculator().calculateSumForWhile(15));
    }

    public int calculateSumForDoWhile(int maxValue) {      // Do While condition
        int sum = 0;
        int i = 0;
        do {
            sum += i;
            i++;
        } while (i <= maxValue);

        System.out.println("The sum is " + sum);
        return sum;
    }

    @Test
    public void calculateSumForDoWhileZero() {
        assertEquals(0, new SumCalculator().calculateSumForDoWhile(0));
    }

    @Test
    public void calculateSumForDoWhileOne() {
        assertEquals(1, new SumCalculator().calculateSumForDoWhile(1));
    }

    @Test
    public void calculateSumForDoWhileTwo() {
        assertEquals(3, new SumCalculator().calculateSumForDoWhile(2));
    }

    @Test
    public void calculateSumForDoWhileThree() {
        assertEquals(6, new SumCalculator().calculateSumForDoWhile(3));
    }

    @Test
    public void calculateSumForDoWhileFour() {
        assertEquals(10, new SumCalculator().calculateSumForDoWhile(4));
    }

    @Test
    public void calculateSumForDoWhileOneTwenty() {
        assertEquals(120, new SumCalculator().calculateSumForDoWhile(15));
    }

    public int calculateSumForFor(int maxValue) {      // Condition For
        int sum = 0;
        for (int i = 0; i <= maxValue; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
        return sum;
    }

    @Test
    public void calculateSumForForZero() {
        assertEquals(0, new SumCalculator().calculateSumForFor(0));
    }

    @Test
    public void calculateSumForForOne() {
        assertEquals(1, new SumCalculator().calculateSumForFor(1));
    }

    @Test
    public void calculateSumForForTwo() {
        assertEquals(3, new SumCalculator().calculateSumForFor(2));
    }

    @Test
    public void calculateSumForForThree() {
        assertEquals(6, new SumCalculator().calculateSumForFor(3));
    }

    @Test
    public void calculateSumForForFour() {
        assertEquals(10, new SumCalculator().calculateSumForFor(4));
    }

    @Test
    public void calculateSumForForOneTwenty() {
        assertEquals(120, new SumCalculator().calculateSumForFor(15));
    }
}


