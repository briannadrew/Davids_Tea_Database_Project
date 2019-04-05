package davidsteaapp;

import dbUtil.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectDB {
    Connection connection;

    public ConnectDB(){
        try{
            this.connection = DBConnection.getConnection();
        }catch(SQLException e){
            e.printStackTrace();
        }
        if (this.connection == null){
            System.exit(1);
        }
    }

    public boolean isDBConnected(){
        return this.connection!=null;
    }
}
