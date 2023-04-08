package exercises;

public class ContoBancario {

    private Double saldo;
    private  Double numeroConto;


    public ContoBancario(Double saldo, Double numeroConto){
        this.saldo=saldo;
        this.numeroConto=numeroConto;

    }

    public Double deposito(Double deposito){
        saldo=saldo+deposito;
        return saldo;
    }
    public Double prelievo(Double prelievo){
        saldo=saldo-prelievo;
        return saldo;
    }
}
