import org.junit.Test;
import static org.junit.Assert.*;

public  class OffByOne implements CharacterComparator {
    @Override
    public boolean equalChars(char x, char y) {
        return x - y == 1 || y - x == 1;
    }
    @Test
    public void testOffByOne() {
        assertTrue(equalChars('a','b'));
        assertTrue(equalChars('c','b'));
        assertTrue(equalChars('&','%'));
        assertFalse(equalChars('a','c'));

    }

}
