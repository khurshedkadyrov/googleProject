import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCharactersTest {
    /**
     * This method should return amount of specified characters in the text. Upper and lower case characters are meant to be the same character
     *
     * @param text      - text sentence
     * @param character - character amount of which we are counting
     * @return - amount oof character in text
     */
    public static int countCharacters(String text, char character) {
        int amountOfCharactersInText = 0;
        char[] charArray;
        charArray = text.toCharArray();
        for (char c : charArray) {
            if (c == character) {
                amountOfCharactersInText++;
            }

        }
        return amountOfCharactersInText;
    }

    @Test
    public void singleWordTest() {
        assertEquals(2, countCharacters("digitsArray", 'r'));
    }

    @Test
    public void singleWordTest1() {
        assertEquals(1, countCharacters("buBbleGum", 'B'));
    }

    @Test
    public void sentenceTest() {
        assertEquals(2, countCharacters("My name is Jorik and i don't get java", 'J'));
    }

    @Test
    public void twoWordsTest() {
        assertEquals(2, countCharacters("its hot", 't'));
    }
}