import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {
    Park park;
    Paddock paddock1;
    Pterodactyl terry1;

    @Test
    public void canAddDinosaur() {
        paddock1.addToPaddock(terry1);
        assertEquals(1, paddock1.dinoCount());
    }

    @Test
    public void canTransferDinosaur() {
        paddock1.removeFromPaddock(terry1);
    }

}
