package johnstep.help;

import johnstep.expenses.ExpensesData;
import johnstep.expenses.ExpensesDataInput;
import johnstep.sqlmanager.*;
import johnstep.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by evgenyandroshchuk on 05.06.17.
 */
public class Utils {

    public static void main(String [] args){

        String query = "select * from expenses where month_id = 6 and year_id = 2017";

        try(Connection connection = Connector.connectToMySQL();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        ){
            int count = 0;
            while(resultSet.next()){
                count++;
                System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("description") + "\t" + resultSet.getDouble("amount"));
            }

            System.out.println("count = " + count);

        }catch(SQLException e){
            e.printStackTrace();
            System.exit(-1);
        }


        ExpensesImpl expenses = new ExpensesImpl();
        ExpensesDataInput expensesDataInput = new ExpensesDataInput();
        expensesDataInput.setMonth(4);
        expensesDataInput.setYear(2017);
        System.out.println(expenses.getExpensesData(expensesDataInput).toString());



    }
}
