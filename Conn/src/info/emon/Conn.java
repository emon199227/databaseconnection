/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.emon;

import java.sql.Connection;

/**
 *
 * @author Emon
 */
public class Conn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getconnection("pos", "root", "1234");
        // TODO code application logic here
    }
    
}
