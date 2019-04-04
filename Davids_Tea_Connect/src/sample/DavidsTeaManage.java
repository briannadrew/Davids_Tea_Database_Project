package sample;

import java.sql.*;

public class DavidsTeaManage {
    Connection connection;
    public DavidsTeaManage(){
        connection = SqliteConnection.connector();
        if (connection == null){
            System.exit(1);
        }
    }

    public boolean isDBConnected(){
        try{
            return !connection.isClosed();
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    private static class SqliteConnection {
        public static Connection connector() {
            try{
                Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection("jdbc:sqlite:davids_tea.db");
                return conn;
            }catch(Exception e){
                return null;
            }
        }
    }
}
