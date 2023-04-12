package javaoopadvanced._1;

class Animal {
    private double height, weight;
    private double currentSpeed;

    private double fastestCurrentSpeed;

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Animal(){

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getFastestCurrentSpeed() {
        return fastestCurrentSpeed;
    }

    public void setFastestCurrentSpeed(double fastestCurrentSpeed) {
        this.fastestCurrentSpeed = fastestCurrentSpeed;
    }

    public double fastestAnimal(double currentSpeed, double fastestCurrentSpeed){// metodo che servira' a misurare chi e' il piu' veloce
        if(currentSpeed>=fastestCurrentSpeed){
            return currentSpeed;
        }
        return fastestCurrentSpeed;
    }
}
