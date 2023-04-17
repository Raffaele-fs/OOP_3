package javaoopadvanced._2;

public class Instrument implements Playable {
    private String name;
    private  String brand;

    private Boolean risposta;


    public Instrument(String name, String brand,Boolean risposta){
        this.name=name;
        this.brand=brand;
        this.risposta=risposta;
    }

    public Boolean getRisposta() {
        return risposta;
    }

    public void setRisposta(Boolean risposta) {
        this.risposta = risposta;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String play() {
        if(risposta==true){
            return"sta suonando ";
        }else{
            return "non sta suonando";
        }
    }
    }

