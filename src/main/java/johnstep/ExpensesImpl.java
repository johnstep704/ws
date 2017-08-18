package johnstep;

/**
 * Created by evgenyandroshchuk on 02.06.17.
 */

import javax.jws.WebMethod;
import javax.jws.WebService;

import johnstep.expenses.*;
import johnstep.sqlmanager.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.ws.handler.MessageContext;

@WebService(endpointInterface = "johnstep.Expenses")
public class ExpensesImpl implements Expenses {


    @WebMethod
    public List<ExpensesData> getExpensesData(ExpensesDataInput expensesDataInput){

        List<ExpensesData> expensesDataList = new ArrayList<>();
        String query = "select * from v_expenses where month_id = " + expensesDataInput.getMonth() + " and year_id = " + expensesDataInput.getYear();
        try(Connection connection = Connector.connectToMySQL();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);){

            while(resultSet.next()){
                ExpensesData expensesData = new ExpensesData();
                expensesData.setId(resultSet.getInt("id"));
                expensesData.setUpdateDate(resultSet.getDate("update_Date").toString());
                expensesData.setAmount(resultSet.getDouble("amount"));
                expensesData.setDescription(resultSet.getString("description"));
                expensesData.setTypeDesc(resultSet.getString("type_Desc"));
                expensesData.setMonthId(resultSet.getInt("month_id"));
                expensesData.setYearId(resultSet.getInt("year_id"));
                expensesDataList.add(expensesData);
            }

        }catch(SQLException sce){
            sce.printStackTrace();
            System.out.println("sqlExpeption");
        }

        return  expensesDataList;

    }

}
