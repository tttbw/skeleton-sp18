import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testIsPalindrome() {
        String[] word = {"ttbwbtt","wttbbttw","bbtwwbbt"};
        assertEquals(true,palindrome.isPalindrome(word[0]));
        assertEquals(true,palindrome.isPalindrome(word[1]));
        assertEquals(false,palindrome.isPalindrome(word[2]));
    }
    @Test
    public void testIsPalindromeDeque() {
        String[] word = {"ttbwbtt","wttbbttw","bbtwwbbt"};
        assertEquals(true,palindrome.isPalindromeDeque(word[0]));
        assertEquals(true,palindrome.isPalindromeDeque(word[1]));
        assertEquals(false,palindrome.isPalindromeDeque(word[2]));
    }


}
