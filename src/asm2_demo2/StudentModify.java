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
public class StudentModify {
    
    public static List<Student> findAll() throws SQLException{
        List<Student> list = new ArrayList<>();
        Connection conn = null;
        Statement st = null;
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        conn = jdbc.getConnection();
        String sql = "select* from student";
        st = conn.createStatement();
        ResultSet re= st.executeQuery(sql);
        while(re.next()){
            Student std = new Student(re.getInt(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5), re.getInt(6), re.getString(7), re.getDouble(8));
            list.add(std);
              
        }
    return list;
    
    }
    
    public static void insert(Student std){
    Connection conn = null;
        PreparedStatement pp = null;
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        conn= jdbc.getConnection();
        String sql = "insert into student(stuName, stuGender, stuDob, stuAddress, stuPhone, stuDepartment, stuGpa) values(?,?,?,?,?,?,?)";
        try {
            pp = conn.prepareStatement(sql);
            pp.setString(1, std.getName());
            pp.setString(2, std.getGender());
            pp.setString(3, std.getDob());
            pp.setString(4, std.getAddress());
            pp.setInt(5, std.getPhone());
            pp.setString(6, std.getDepartment());
            pp.setDouble(7, std.getGpa());
            pp.execute();
                    } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  
    }
        
      public static void delete(int id){
    Connection conn = null;
        PreparedStatement pp = null;
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        conn= jdbc.getConnection();
        String sql = "delete from student where stuId=?";
        try {
            pp = conn.prepareCall(sql);
            pp.setInt(1, id);
            pp.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static List<Student> findByName(String stuName)   {
     
     List<Student> listStudent = new ArrayList<Student>();
     Connection conn = null;
        PreparedStatement pp = null;
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        conn= jdbc.getConnection();
        String sql = "select *from student where stuName like?";
        try {
            pp= conn.prepareStatement(sql);
            pp.setString(1, "%"+ stuName+ "%");
            ResultSet re= pp.executeQuery();// query the database to get list of student
            while(re.next()){
           
                Student std = new Student(re.getInt(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5), re.getInt(6), re.getString(7), re.getDouble(8));
            listStudent.add(std);
            
        
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return listStudent;
     }
     
     public static void update(Student std){
     
     Connection conn = null;
        PreparedStatement pp = null;
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        conn= jdbc.getConnection();
        String sql = "update student set stuName=?,stuGender=?,stuDob=?,stuAddress=?,stuPhone=?,stuDepartment=?,stuGpa=? where stuId=?";
        try {
          pp = conn.prepareCall(sql);
            pp.setString(1, std.getName());
            pp.setString(2, std.getGender());
            pp.setString(3, std.getDob());
            pp.setString(4, std.getAddress());
            pp.setInt(5, std.getPhone());
            pp.setString(6, std.getDepartment());
            pp.setDouble(7, std.getGpa());
            pp.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
     }
     
        
    
}
