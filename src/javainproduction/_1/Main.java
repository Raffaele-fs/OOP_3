package javainproduction._1;

public class Main {
    private double x=Math.random() * 100;

    private int BigInteger=23823434;

    private String answer=(x>=50) ? "x is greater than or equal to 50":"x is less than 50";

    public Main() {
    }

    public void print(){
        System.out.println(answer);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
