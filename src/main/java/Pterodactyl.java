public class Pterodactyl extends Dinosaur{

    protected Pterodactyl pterodactyl;
    protected dinoType dinoType;


    public Pterodactyl(String name) {
        super(false, dinoType.CARNIVORE, name);
    }

    public boolean fly() {
        return this.fullness = false;
    }
}
