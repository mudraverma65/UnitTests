import org.junit.Test;
import static org.junit.Assert.*;

public class IsomorphicTest {
    @Test
    /**
     * Checks if the strings passed is null
     * If yes it should return false
     * */
    public void testStringInputIfNull(){
        String stringInput1 = null;
        String stringInput2 = null;
        Isomorphic isomorphic = new Isomorphic();
        assertEquals(isomorphic.checkIsomorphic(stringInput1, stringInput2), false);
    }

    /**
     * Checks if the strings passed is empty ""
     * If yes it should return true
     * */
    @Test
    public void testStringIsEmpty(){
        String stringInput1 = "";
        String stringInput2 = "";
        Isomorphic isomorphic = new Isomorphic();
        assertEquals(isomorphic.checkIsomorphic(stringInput1, stringInput2), true);
    }

    /**
     * Checks if the string is of same length
     * if no returns false
     * */
    @Test
    public void testStringDiffLength(){
        String stringInput1 = "abc";
        String stringInput2 = "xyzz";
        Isomorphic isomorphic = new Isomorphic();
        assertEquals(isomorphic.checkIsomorphic(stringInput1, stringInput2), false);
    }

    /**
     * Checks if the two provided strings are equal
     * If yes returns true
     * */
    @Test
    public void testStringIfEqual(){
        String stringInput1 = "abc";
        String stringInput2 = "abc";
        Isomorphic isomorphic = new Isomorphic();
        assertEquals(isomorphic.checkIsomorphic(stringInput1, stringInput2), true);
    }
}
