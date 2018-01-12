public class Diplodocus extends Dinosaur {

    String name;
    dinoType dinoType;


    public Diplodocus(String name) {
        super(false, dinoType.HERBIVORE, name);
    }

    public Enum getDinoType() {return this.dinoType;}


}
