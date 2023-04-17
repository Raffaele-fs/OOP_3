package javaoopadvanced._2;

public class Boat implements Movable{

    private Boolean answer;

    public Boat(Boolean answer) {
        this.answer = answer;
    }

    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }


    @Override
    public String moveForward() {
        if(answer==true) {
            return "la macchina si muove in avanti";
        }else {
            return "la macchina NON si muove in avanti ";
        }
    }

    @Override
    public String moveBackward() {
        if(answer==true) {
            return "la macchina si muove indietro";
        }else {
            return "la macchina NON si muove indietro ";
        }
    }
}
