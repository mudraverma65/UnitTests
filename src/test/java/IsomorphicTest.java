import org.junit.Test;
import static org.junit.Assert.*;

public class IsomorphicTest {
    @Test
    public void testStringInputIfNull(){
        String stringInput1 = null;
        String stringInput2 = null;
        Isomorphic isomorphic = new Isomorphic();
        assertEquals(isomorphic.checkIsomorphic(stringInput1, stringInput2), false);
    }
}
