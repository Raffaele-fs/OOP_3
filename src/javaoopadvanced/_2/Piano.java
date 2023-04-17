package javaoopadvanced._2;

public class Piano extends Instrument{

    public Piano(String name, String brand,Boolean risposta) {
        super(name, brand, risposta);
    }

    @Override
    public String play() {
        return super.play();
    }

    @Override
    public String toString() {
        return "Piano{}";
    }
}
