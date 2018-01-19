import java.util.ArrayList;

public class Paddock {
    private String paddockName;
    private int capacity;
    private ArrayList<Dinosaur> dinosaurs;

    public Paddock(String paddockName, int capacity) {
        this.paddockName = paddockName;
        this.capacity = capacity;
    }

    public String getPaddockName() {
        return this.paddockName;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int dinoCount() {
        return this.dinosaurs.size();
    }

    public void addToPaddock(Pterodactyl terry1) {
        this.dinosaurs.add(terry1);
        this.dinosaurs.add(te)
    }

    public void removeDinosaur(Dinosaur dinosaur) {
        .remove(dinosaur);
    }

//    public void removeFromPaddock(Pterodactyl terry1) {
//    }
}
