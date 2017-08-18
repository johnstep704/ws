
package johnstep;

import johnstep.expenses.ExpensesData;
import johnstep.expenses.ExpensesDataInput;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloWorldImplTest {

    @Test
    public void testSayHi() {
        HelloWorldImpl helloWorldImpl = new HelloWorldImpl();
        String response = helloWorldImpl.sayHi("Sam");
        assertEquals("HelloWorldImpl not properly saying hi", "Hello Sam", response);
        System.out.println("test 01 passed");
    }


    @Test
    public void testGetExpenses(){

        ExpensesImpl expenses = new ExpensesImpl();
        ExpensesDataInput expensesDataInput = new ExpensesDataInput();
        expensesDataInput.setMonth(LocalDate.now().getMonthValue()-1);
        expensesDataInput.setYear(LocalDate.now().getYear());
/*
        List<ExpensesData> expensesDataList = new ArrayList<>();
        for(ExpensesData expData : expenses.getExpensesData(expensesDataInput)){
            expensesDataList.add(expData);
        }

        List<ExpensesData> expensesResultList = expenses.getExpensesData(expensesDataInput);


        assertTrue("test", (LocalDate.now().getMonthValue()-1 ) == expensesDataList.get(0).getMonthId());
        System.out.println("test 02 passed");
*/
    }
}
