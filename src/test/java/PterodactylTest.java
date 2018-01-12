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

    @Test
    public void getName() {
        assertEquals("Terry", terry1.getName());
    }

    @Test
    public void getFullness() {
        assertEquals(true, terry1.getFullness());
    }

    @Test
    public void getDinoType() {
        assertEquals( dinoType.CARNIVORE, terry1.getDinoType());
    }

    // test dino eat method
    @Test
    public void eatTest() {
        assertEquals(true, terry1.eat());
    }

    // test fly
    @Test
    public void flyTest() {
        assertEquals(false, terry1.fly());
    }
}