/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBasedeDatos;
import java.sql.*;
/**
 *
 * @author WILLIAM PC
 */
public class bD {
    private static Connection con = null;
    public  Connection getCon (){
        try {
            String url = "jdbc:mysql://localhost:3306/pr";
        String user = "root";
        String pass = "root";
        
        con = DriverManager.getConnection(url,user,pass);
        
        
        } catch (Exception e) {
            System.err.println(e);
        }
        return con;
        
    }
    
}
