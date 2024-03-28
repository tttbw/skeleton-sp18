
public class Palindrome {
    public Deque<Character> wordToDeque(String word) {
        /** Given a string and return a Deque contains the string */
        Deque<Character> dq = new LinkedListDeque<>();
        for(int i = 0; i < word.length(); i++) {
            dq.addLast(word.charAt(i));
        }
        return dq;
    }
    public boolean isPalindrome(String word) {
        int ptrStart = 0;
        int ptrTail = word.length() - 1;
        while(ptrStart < ptrTail ) {
            if(word.charAt(ptrStart) != word.charAt(ptrTail)){
                return false;
            }
            ptrTail --;
            ptrStart ++;
        }
        return true;
    }
    public boolean isPalindromeDeque(String word) {
        Deque<Character> WordDq = wordToDeque(word);
        while(WordDq.size() > 1) {
            if(WordDq.removeFirst() != WordDq.removeLast()) {
                return false;
            }
        }
        return true;
    }

}
