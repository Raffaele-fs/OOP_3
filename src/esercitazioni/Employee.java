package esercitazioni;

public abstract class Employee {
    private String nome;
    private Integer id;

    private float efficencyIndex;

    public Employee(String nome, Integer id, float efficencyIndex) {
        this.nome = nome;
        this.id = id;
        this.efficencyIndex = efficencyIndex;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getEfficencyIndex() {
        return efficencyIndex;
    }

    public void setEfficencyIndex(float efficencyIndex) {
        this.efficencyIndex = efficencyIndex;
    }

    public abstract boolean canApplyForPromotion();



    public abstract boolean mayBeDemoted();


}