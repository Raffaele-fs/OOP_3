package esercitazioni;

public class Head extends Employee{
    private Integer yearsAsHead;

    public Head(String nome, Integer id, float efficencyIndex, Integer yearsAsHead) {
        super(nome, id, efficencyIndex);
        this.yearsAsHead = yearsAsHead;
    }

    public Integer getYearsAsHead() {
        return yearsAsHead;
    }

    public void setYearsAsHead(Integer yearsAsHead) {
        this.yearsAsHead = yearsAsHead;
    }

    @Override
    public boolean canApplyForPromotion() {
        return false;
    }

    @Override
    public boolean mayBeDemoted() {
        return (yearsAsHead < 10 && getEfficencyIndex() < 0.5);
    }
}
