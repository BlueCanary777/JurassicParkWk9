import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PterodactylTest {

    Pterodactyl terry1;
    Pterodactyl terry2;

    @Before
    public void setUp() {
        Pterodactyl terry1 = new Pterodactyl("Terry");
        Pterodactyl terry2 = new Pterodactyl("June");
    }

    // test fly
    @Test
    public void flyTest() {
        assertEquals(false, terry1.fly());
    }
}