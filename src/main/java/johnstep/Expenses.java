package johnstep;

/**
 * Created by evgenyandroshchuk on 01.06.17.
 */

import johnstep.expenses.*;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.List;

@WebService
public interface Expenses {
    @WebMethod
    public List<ExpensesData> getExpensesData(
            @WebParam(name = "inputParams")
            ExpensesDataInput expensesDataInput);
}
