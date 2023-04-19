package exercises;

public class Operazioni {
    private double a;
    private double b;

    public Operazioni(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double addizione(){
        double risltutato= a+b;
        return risltutato;
    }
    public double moltiplicazione(){
        double risltutato= a*b;
        return risltutato;
    }
    public double sottrtazione(){
        double risltutato= a-b;
        return risltutato;
    }
    public double divisione(){
        double risltutato= a/b;
        return risltutato;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
