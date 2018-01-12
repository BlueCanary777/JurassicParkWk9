import java.util.ArrayList;

public class Paddock {
    private String paddockName;
    private int capacity;
    protected ArrayList<Dinosaur> paddock;

    public Paddock(String paddockName, int capacity) {
        this.paddockName = paddockName;
        this.capacity = capacity;
        this.paddock = new ArrayList<Dinosaur>();
    }

    public String getPaddockName() {
        return this.paddockName;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int dinoCount() {
        return this.paddock.size();
    }

    public void addToPaddock(Pterodactyl terry1) {
        this.paddock.add(terry1);
    }

    public void removeFromPaddock(Pterodactyl terry1) {
    }
}
