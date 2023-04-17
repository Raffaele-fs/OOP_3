package proggettopersonale;

import java.util.ArrayList;

public class Libreria {
    private String nome;
    private String type;


    public Libreria(){

    }
    public Libreria(String nome, String type){
        this.nome=nome;
        this.type=type;


    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
