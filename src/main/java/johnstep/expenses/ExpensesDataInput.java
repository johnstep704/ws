package johnstep.expenses;

/**
 * Created by evgenyandroshchuk on 02.06.17.
 */
public class ExpensesDataInput {

    public ExpensesDataInput(){
        super();
    }

    private int month;
    private int year;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
