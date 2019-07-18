import org.junit.Test;
import static org.junit.Assert.*;

public class SpaceListTest {

    @Test
    public void testFor() {
        SpaceList<Integer> a = new SpaceList<>();
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        int count = 0;
        for (Integer i : a) {
            count += i;
        }
        assertEquals(6, count);
    }
}
