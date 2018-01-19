public class Pterodactyl extends Dinosaur{

    public Pterodactyl(String name) {
        super(false, DinoType.CARNIVORE, name);
    }

    public boolean fly() {
        return this.fullness = false;
    }
}
