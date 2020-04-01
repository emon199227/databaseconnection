/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.emon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emon
 */
public class DatabaseConnection {
    private static final String HOST ="jdbc:mysql://localhost:3306";
    private static Connection  conn = null;
    
    public static Connection getconnection(String dbName,String userName,String password){
        String URL=HOST+ "/" +dbName;
        try {
            conn = DriverManager.getConnection(URL,userName , password);
            System.err.println("::Connected ::");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName());
        }
        return conn;
    }
    
}
