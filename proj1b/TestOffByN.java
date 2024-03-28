import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class TestOffByN {
    CharacterComparator cc = new OffByN(2);

    @Test
    public void testOffByOne() {
        assertTrue(cc.equalChars('a', 'c'));
        assertTrue(cc.equalChars('c', 'e'));
        assertFalse(cc.equalChars('&', '%'));
        assertFalse(cc.equalChars('a', 'b'));
    }
}
