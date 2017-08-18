package johnstep;

import johnstep.expenses.ExpensesData;
import johnstep.expenses.ExpensesDataInput;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 * Created by evgenyandroshchuk on 10.06.17.
 */
public class ExpensesTest {


    @Test
    public void TestGetExpenses() throws MalformedURLException {

        int month = LocalDate.now().getMonthValue();
        int year = LocalDate.now().getYear();
        String query = "select * from v_expenses where month_id = " + month + " and year_id = " + year;
        try(
                Connection connector = TestConnector.connectToMySQL();
                Statement statement = connector.createStatement();
                ResultSet rs = statement.executeQuery(query);
        ){
            int count = 0;
            while(rs.next()){
                count++;
            }
            final String WS_URL = "http://localhost:8080/startup-1.0/Expenses?wsdl";

            URL url = new URL(WS_URL);



            ExpensesImpl expenses = new ExpensesImpl();

            ExpensesDataInput expensesDataInput = new ExpensesDataInput();
            expensesDataInput.setMonth(month);
            expensesDataInput.setYear(year);

//            int countResult = expenses.getExpensesData(expensesDataInput).size();
  //          assertTrue("Row numbers is different!", count == countResult);
    //        System.out.println("Test GetExpenses: count = " + count + " countResult = " + countResult);


        }catch(SQLException e){
            System.out.println("Connection failed!");
        }

    }


}
