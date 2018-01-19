import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PaddockTest {
    Paddock paddock1;
    Paddock paddock2;
    Pterodactyl terry1;
    Pterodactyl terry2;
    Diplodocus dippy1;
    Diplodocus dippy2;

    @Before
    public void before() {
        paddock1 = new Paddock("Roses", 3);
        paddock2 = new Paddock("Lillies", 3);
    }

    @Test
    public void hasPaddockName() {
        assertEquals("Roses", paddock1.getPaddockName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, paddock1.getCapacity());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, paddock1.dinoCount());
    }


}
