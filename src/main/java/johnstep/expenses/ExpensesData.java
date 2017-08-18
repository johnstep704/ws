package johnstep.expenses;

/**
 * Created by evgenyandroshchuk on 01.06.17.
 */
public class ExpensesData {

    public  ExpensesData(){

    }

    private int id;
    private String description;
    private String typeDesc;
    private String updateDate;
    private double amount;
    private int monthId;
    private int yearId;

    public int getMonthId() {
        return monthId;
    }

    public void setMonthId(int monthId) {
        this.monthId = monthId;
    }

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }



    public int getId() {
        return id;
    }

    public String getDescription(){
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
}
