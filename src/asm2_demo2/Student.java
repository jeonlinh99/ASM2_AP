/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asm2_demo2;

/**
 *
 * @author dell
 */
public class Student {
 int id;
     String name;
     String gender;
     String dob;
   
     String address;
    int phone;
     String department;
    double gpa;

    public Student() {
    }

    public Student(int id, String name, String gender, String dob, String address, int phone, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        
        this.address = address;
        this.phone = phone;
        this.department = department;
        this.gpa = gpa;
    }
      public Student( String name, String gender, String dob, String address, int phone, String department, double gpa) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        
        this.address = address;
        this.phone = phone;
        this.department = department;
        this.gpa = gpa;
    }
      

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    

}

