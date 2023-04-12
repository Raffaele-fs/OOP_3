package javaoopadvanced._1;

public class Fish extends Animal{
    private String species;
    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species=species;
    }

    public String getSpecies() {
        return species;
    }

    public double swimSpeedMetersPerSecond(){
        double multiply= getWeight()*2;
        return multiply;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
