/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asm2_demo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class ProfessorModify {
    
    public static List<Professor> findAll() throws SQLException{
        List<Professor> list = new ArrayList<>();
        Connection conn = null;
        Statement st = null;
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        conn = jdbc.getConnection();
        String sql = "select* from professor";
        st = conn.createStatement();
        ResultSet re= st.executeQuery(sql);
        while(re.next()){
            Professor std = new Professor(re.getInt(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5), re.getInt(6), re.getString(7), re.getDouble(8));
            list.add(std);
              
        }
    return list;
    
    }
    
    public static void insert(Professor std){
    Connection conn = null;
        PreparedStatement pp = null;
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        conn= jdbc.getConnection();
        String sql = "insert into professor(proName, proGender, proDob, proAddress, proPhone, proDepartment, proSalary) values(?,?,?,?,?,?,?)";
        try {
            pp = conn.prepareStatement(sql);
            pp.setString(1, std.getName());
            pp.setString(2, std.getGender());
            pp.setString(3, std.getDob());
            pp.setString(4, std.getAddress());
            pp.setInt(5, std.getPhone());
            pp.setString(6, std.getDepartment());
            pp.setDouble(7, std.getSalary());
            pp.execute();
                    } catch (SQLException ex) {
            Logger.getLogger(ProfessorModify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  
    }
        
      public static void delete(int id){
    Connection conn = null;
        PreparedStatement pp = null;
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        conn= jdbc.getConnection();
        String sql = "delete from professor where proId=?";
        try {
            pp = conn.prepareCall(sql);
            pp.setInt(1, id);
            pp.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorModify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static List<Professor> findByName(String proName)   {
     
     List<Professor> listProfessor = new ArrayList<Professor>();
     Connection conn = null;
        PreparedStatement pp = null;
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        conn= jdbc.getConnection();
        String sql = "select *from professor where proName like?";
        try {
            pp= conn.prepareStatement(sql);
            pp.setString(1, "%"+ proName+ "%");
            ResultSet re= pp.executeQuery();// query the database to get list of student
            while(re.next()){
           
                Professor std = new Professor(re.getInt(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5), re.getInt(6), re.getString(7), re.getDouble(8));
            listProfessor.add(std);
            
        
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorModify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return listProfessor;
     }
     
     public static void update(Professor std){
     
     Connection conn = null;
        PreparedStatement pp = null;
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        conn= jdbc.getConnection();
        String sql = "update professor set proName=?,proGender=?,proDob=?,proAddress=?,proPhone=?,proDepartment=?,proGpa=? where proId=?";
        try {
          pp = conn.prepareCall(sql);
            pp.setString(1, std.getName());
            pp.setString(2, std.getGender());
            pp.setString(3, std.getDob());
            pp.setString(4, std.getAddress());
            pp.setInt(5, std.getPhone());
            pp.setString(6, std.getDepartment());
            pp.setDouble(7, std.getSalary());
            pp.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorModify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
     }
     
        
    
}
