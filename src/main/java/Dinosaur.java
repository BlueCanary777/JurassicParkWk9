public abstract class Dinosaur {
    protected boolean fullness;
    protected DinoType dinoType;
    protected String name;

    public Dinosaur(boolean fullness, DinoType dinoType, String name) {
        this.fullness = fullness;
        this.dinoType = dinoType;
        this.name = name;
    }

    public boolean getFullness() {return this.fullness;}

    public DinoType getDinoType() {return this.dinoType;}

    public String getName() {
        return this.name;
    }

    // eat method
    public boolean eat() {
        return this.fullness = true;
    }
}
