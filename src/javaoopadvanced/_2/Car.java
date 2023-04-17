package javaoopadvanced._2;

public class Car implements Movable {

    private Boolean answer;

    public Car(Boolean answer) {
        this.answer = answer;
    }
    @Override
    public String moveForward() {
        if(answer==true) {
            return "la barca si muove in avanti";
        }else {
            return "la barca NON si muove in avanti ";
        }
    }

    @Override
    public String moveBackward() {
        if(answer==true) {
            return "la barca si muove indietro";
        }else {
            return "la barca NON si muove indietro ";
        }
    }
}
