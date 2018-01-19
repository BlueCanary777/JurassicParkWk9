import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiplodocusTest {

    Diplodocus dippy1;
    Diplodocus dippy2;

    @Before
    public void setUp()  {
        dippy1 = new Diplodocus("diplomat");
        dippy2 = new Diplodocus("diphthong");
    }

    @Test
    public void getName() {
        assertEquals("diplomat", dippy1.name);
    }

    @Test
    public void getFullness() {
        assertEquals(false, dippy1.getFullness());
    }

    @Test
    public void getDinoType() {
        assertEquals( DinoType.HERBIVORE, dippy1.getDinoType());
    }

    // test dino eat method
    @Test
    public void eatTest() {
        assertEquals(true, dippy1.eat());
    }
}