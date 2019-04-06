package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String conn = "jdbc:sqlite:davids_tea.db";

    public static Connection getConnection() throws SQLException{
        try{
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(conn);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
