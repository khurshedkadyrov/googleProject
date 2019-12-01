import org.junit.Assert;
import org.junit.Test;

public class PalindromeWithForLoopTest {
    public static boolean isPalindrome(String word) {
        boolean isPalindrome = false;
        System.out.println("Was: " + word);
        String wordWithoutPunctuation = word.replaceAll("\\W+", ""); // \\W+ removing all punctuation by replacing with empty string
        System.out.println("Now without punctuation: " + wordWithoutPunctuation); //printing the result of the above line
        String wordWithoutPunctuationInLowerCase = wordWithoutPunctuation.toLowerCase(); //converting the whole text into a lower case using toLowerCase method
        System.out.println("Now same but with LowerCase: " + wordWithoutPunctuationInLowerCase);
        String reversedWordWithoutPunctuationInLowerCase = "";
        char[] textCharacters = wordWithoutPunctuationInLowerCase.toCharArray();
        for (int i = textCharacters.length - 1; i >= 0; i--) {
            reversedWordWithoutPunctuationInLowerCase += textCharacters[i];
        }
        System.out.println(reversedWordWithoutPunctuationInLowerCase + " - Is an original word without punctuation and in lower case");
        System.out.println(reversedWordWithoutPunctuationInLowerCase + " - Is a reversed word");
        isPalindrome = reversedWordWithoutPunctuationInLowerCase.equals(wordWithoutPunctuationInLowerCase);
        System.out.println("Are these sentences the same? is it a palindrome: " + isPalindrome);
        return isPalindrome;
    }
        @Test
        public void singleWordTest() {
            Assert.assertTrue(isPalindrome("Are we not pure? “No, sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man—a prisoner up to new era."));
        }

    }
