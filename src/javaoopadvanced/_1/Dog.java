package javaoopadvanced._1;

public class Dog extends Animal {//richiamo della classe padre Animal
    private String breed;

    public Dog(double height, double weight,String breed) {//costruttore contenente i parametri della classe sia padre che figlio

        super(height, weight);
        this.breed=breed;
    }

    public double runSpeedMetersPerSecond(){
        double multiply= getHeight()*2;
        return multiply;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



}

