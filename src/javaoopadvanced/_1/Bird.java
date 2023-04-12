package javaoopadvanced._1;

public class Bird extends Animal{
    private double wingSpan;
    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan=wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public double flySpeedMetersPerSecond(){
        double multiply= getWingSpan()*4;
        return multiply;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
