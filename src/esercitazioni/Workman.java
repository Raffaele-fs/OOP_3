package esercitazioni;

public class Workman extends Employee{
    private Integer weeklyWorkingHours;

    public Workman(String nome, Integer id, float efficencyIndex, Integer weeklyWorkingHours) {
        super(nome, id, efficencyIndex);
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    public Integer getWeeklyWorkingHours() {
        return weeklyWorkingHours;
    }

    public void setWeeklyWorkingHours(Integer weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    @Override
    public boolean canApplyForPromotion() {
        return (weeklyWorkingHours > 35 && getEfficencyIndex() > 0.65);
    }

    @Override
    public boolean mayBeDemoted() {
        return false;
    }
}
