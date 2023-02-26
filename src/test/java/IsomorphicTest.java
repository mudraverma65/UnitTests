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
}
