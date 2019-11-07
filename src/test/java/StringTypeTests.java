import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class StringTypeTests {

    @Test
    public void verifyMySalary() {
        long myLong = 1001111111;
        String myLongString = String.valueOf(myLong);
        Assert.assertEquals(100, myLongString);
    }

    @Test
    public void verifyMySalary1() {
        long myLong = 10011;
        String myLongString = String.valueOf(myLong);
        Assert.assertNotEquals(100, myLong);
    }

    @Test

    public void myISuckAtJavaNPositive() {
        Assert.assertEquals(14, "Я не вкуриваю Джавку".indexOf("Джавку"));

    }

    @Test

    public void myISuckAtJavaNegative() {
        Assert.assertEquals(7, "Я не вкуриваю Джавку".indexOf("Джавку"));

    }

    @Test
    public void myContainsTrueTest() {
        Assert.assertTrue("Hey! Im from a different world".contains("from"));
    }

    @Test
    public void myContainsFalseTest() {
        Assert.assertFalse("Hey! Im from a different world".contains("jey"));
    }

    @Test
    public void MySubStrings() {
        String text = "20 First Measurements";
        String updatedText = text.substring(12, 16);
        String myText = "20 First Measurements";
        String myUpdatedText = text.substring(12, 16);
        String myExpectedResult = "sure";
        assertEquals(myExpectedResult, myUpdatedText);
        Assert.assertEquals("sure", "20 First Measurements".substring(12, 16));

    }

    @Test
    public void MySubStrings1() {
        String text = "20 First Measurements";
        String updatedText = text.substring(12, 16);
        String myText = "20 First Measurements";
        String myUpdatedText = text.substring(12, 16);
        String myExpectedResult = "sure";
        assertEquals(myExpectedResult, myUpdatedText);
        Assert.assertEquals("Ure", "20 First Measurements".substring(12, 16));
    }

    @Test

    public void myValueOfTest() {
        Assert.assertEquals(2, 22);
    }


    @Test

    public void myValueOfTest1() {
        Assert.assertEquals(22, 22);
    }

    @Test
    public void myStartWithTest() {
        Assert.assertFalse("Bubblegum".startsWith("B"));

    }

    @Test
    public void myEndWithTest() {
        Assert.assertTrue("Bubblegum".endsWith("m"));
    }

    @Test
    public void myLengthTest() {
        String myStr = "Bubblegum";
        Assert.assertEquals("5", myStr.length());
    }

    @Test
    public void myEmptyTest() {
        String myStr = "Bubblegum";
        Assert.assertEquals("", myStr.isEmpty());
    }

    @Test
    public void myEmptyTest1() {
        String myStr = "";
        Assert.assertEquals("", myStr.isEmpty());

    }

    @Test
    public void myLowerCaseTest() {

        String myStr = "Bubblegum";
        Assert.assertEquals("Bubblegum", myStr.toLowerCase());
    }

    @Test
    public void myUpperCaseTest() {

        String myStr = "Bubblegum";
        Assert.assertEquals("Bubblegum", myStr.toUpperCase());

    }

    @Test
    public void mySumTest () {
    assertEquals("aaabbb", "aaa" + "bbb");

    }
    @Test
    public void myConcatTest() {
    assertEquals("aaabbb", "aaa".concat("bbb"));

        }

        @Test

    public void myTest () {
        assertEquals("aaa", String.format("aaa%s", "bbb"));
        }

@Test
    public  void myTest4 () {
    assertEquals("aaa", String.format("%s%s", "aaa", "bbb"));
}
    @Test
    public  void myTest5() {
        assertEquals("aaa", String.format("%sbbb", "Aaa"));
    }
}





//valueOf
//substring
//contains, startsWith and endsWith
//isEmpty and length
//toLowerCase and toUpperCase
//String output = “Aaa” + “bbb”;
//String output = “Aaa”.concat(“bbb”);
//String output = String.format(“Aaa%s”, “bbb”);
//String output = String.format(“%s%s”, “Aaa”, “bbb”);
//String output = String.format(“%sbbb”, “Aaa”);



