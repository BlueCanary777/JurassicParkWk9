public class Pterodactyl extends Dinosaur{

    Pterodactyl pterodactyl;
    dinoType dinoType;


    public Pterodactyl(String name) {
        super(false, dinoType.CARNIVORE, name);
    }

    // fly to make fullness false
    public boolean fly() {
        this.fullness = false;
    }
}
