import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.util.concurrent.locks.LockSupport.park;

public class Park {
    protected String parkName;
    protected int totalCapacity;
    protected ArrayList<Dinosaur> paddock1;

    public Park(String parkName, int totalCapacity) {
        this.parkName = parkName;
        this.totalCapacity = totalCapacity;
        this.paddock1 = new ArrayList<Dinosaur>();
    }

    public String getParkName() {
        return this.parkName;
    }

//    public ArrayList addDinosaur(Pterodactyl terry1) {
//        this.paddock1(terry1);
//    }
//
//    //public Paddock removeFromPaddock(Pterodactyl terry1) {
//        //return this.paddock1.remove(0);
//    }


}
