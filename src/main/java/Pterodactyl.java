public class Pterodactyl extends Dinosaur{

    protected String name;

    public Pterodactyl(String name) {
        super(true, dinoType.CARNIVORE, name);
    }

    // fly to make fullness false
    public Boolean fly() {
        return !this.eat();
    }
}
