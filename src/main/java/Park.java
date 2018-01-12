import java.util.ArrayList;

public class Park {
    protected String parkName;
    protected int totalCapacity;
    protected ArrayList<Paddock> paddock1;
    protected ArrayList<Paddock> paddock2;

    public Park(String parkName, int totalCapacity) {
        this.parkName = parkName;
        this.totalCapacity = totalCapacity;
        this.paddock1 = new ArrayList<Paddock>();
        this.paddock2 = new ArrayList<Paddock>();
    }

    public String getParkName() {
        return this.parkName;
    }

    public int addPaddock(ArrayList paddock) {
        this.paddock1.add(paddock);
    }

    public Paddock removeFromPaddock(Pterodactyl terry1) {
        return this.paddock1.remove(0);
    }


}
