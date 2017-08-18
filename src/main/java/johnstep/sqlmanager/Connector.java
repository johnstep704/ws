package johnstep.sqlmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by evgenyandroshchuk on 05.06.17.
 */
public class Connector {

    public static Connection connectToMySQL()throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String database = "test";
        String userName = "johnstep";
        String password = "johnedition";
        return DriverManager.getConnection(url + database, userName, password);
    }
}
