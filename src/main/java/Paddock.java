import java.util.ArrayList;

public class Paddock {
    private String paddockName;
    private int capacity;
    protected ArrayList<Dinosaur> dinos;

    public Paddock(String paddockName, int capacity) {
        this.paddockName = paddockName;
        this.capacity = capacity;
        this.dinos = new ArrayList<Dinosaur>();
    }

    public String getPaddockName() {
        return this.paddockName;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int dinoCount() {
        return this.dinos.size();
    }

    public void addToPaddock(Pterodactyl terry1) {
        this.dinos.add(terry1);
    }

    public void removeFromPaddock(Pterodactyl terry1) {
    }
}
