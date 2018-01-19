import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.util.concurrent.locks.LockSupport.park;

public class Park {
    protected String parkName;
    protected int totalCapacity;
    protected ArrayList<Paddock> paddocks;

    public Park(String parkName, int totalCapacity) {
        this.parkName = parkName;
        this.totalCapacity = totalCapacity;
    }

    public String getParkName() {
        return this.parkName;
    }

    public void addPaddock(Paddock paddock) {
        paddocks.add(paddock);
        paddocks.add(paddock);
    }

    public int getNumberOfPaddocks() {
        return paddocks.size();
    }



//    public ArrayList<Dinosaur> getPaddock1() {
//        return paddock1;
//    }

    //    public ArrayList addDinosaur(Pterodactyl terry1) {
//        this.paddock1(terry1);
//    }
//
//    //public Paddock removeFromPaddock(Pterodactyl terry1) {
//        //return this.paddock1.remove(0);
//    }


}
