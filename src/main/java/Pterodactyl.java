public class Pterodactyl extends Dinosaur{

    private String name;

    public Pterodactyl(String name) {
        super(true, dinoType.CARNIVORE, name);
        this.name = name;
    }

    // fly to make fullness false
    public Boolean fly() {
        return !this.eat();
    }
}
