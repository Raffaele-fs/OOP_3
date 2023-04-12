package proggettopersonale;

public class Libreria {
    private String nome;
    private String type;

    private Integer scaffale;



    public Libreria(String nome, String type, Integer scaffale){
        this.nome=nome;
        this.type=type;
        this.scaffale = scaffale;

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

    public Integer getScaffale() {
        return scaffale;
    }

    public void setScaffale(Integer scaffale) {
        this.scaffale = scaffale;
    }
}
