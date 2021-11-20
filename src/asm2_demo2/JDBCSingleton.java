/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asm2_demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class JDBCSingleton {
       private static JDBCSingleton getuni;
    
    
    private JDBCSingleton(){}
    
    
    
    
    public static JDBCSingleton getInstance()
    {
    if(getuni == null)
        getuni = new JDBCSingleton();
        return getuni;
 
    }
    
    public static Connection getConnection(){
        
        String path= "jdbc:mysql://localhost:3306/studentManagement";
        Connection conn = null;
        
        
        try{
        Class.forName("com.mysql.jdbc.Driver");///Driver là trình điều kiển giúp người dùng kết nối với csld
        conn = DriverManager.getConnection(path, "root", "");
        
        
        }catch(Exception ex){
        Logger.getLogger(JDBCSingleton.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    return conn;
    
    
    }
}
