import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ParkTest {
    Park park;
    Paddock paddock1;
    Pterodactyl terry1;

    //@Before for paddock1 and terry1

    @Before
    public void before() {
        park = new Park("Jurassic Park", 4);
        paddock1 = new Paddock("roses", 2);
        terry1 = new Pterodactyl("terry");
    }


    @Test
    public void canAddPaddock() {
        park.addPaddock(paddock1);
        assertEquals(1, park.getNumberOfPaddocks());
    }

    @Test
    public void canAddDinosaur() {
        paddock1.addToPaddock(terry1);
        assertEquals(1, paddock1.dinoCount());
    }

    @Test
    public void canTransferDinosaur() {
        paddock1.addToPaddock(terry1);
        park.removeFromPaddock(terry1);
        assertEquals(0, paddock1.dinoCount());
    }

}
