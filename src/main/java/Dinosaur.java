public abstract class Dinosaur {
    private Boolean fullness;
    private Enum dinoType;
    protected String name;

    public Dinosaur(Boolean fullness, Enum dinoType, String name) {
        this.fullness = fullness;
        this.dinoType = dinoType;
        this.name = name;
    }

    public Boolean getFullness() {return this.fullness;}

    public Enum getDinoType() {return this.dinoType;}

    public String getName() {
        return this.name;
    }

    // eat method
    public Boolean eat() {
        return this.fullness = true;
    }
}
