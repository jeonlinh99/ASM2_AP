/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asm2_demo2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class StudentMenu extends javax.swing.JFrame {
    
    DefaultTableModel tableModel;
    List<Student> listStudent = new ArrayList<>();
    
    

    /**
     * Creates new form StudentMenu
     */
    public StudentMenu() {
        initComponents();
        tableModel = (DefaultTableModel) jTable1student.getModel();
        
    }
    public void showStudent() throws SQLException{
    
    listStudent = StudentModify.findAll();
    tableModel.setRowCount(0);
        for (Student student : listStudent) {
            tableModel.addRow(new Object[]{tableModel.getRowCount()+1, student.getName(), student.getGender(), student.getDob(), student.getAddress(), student.getPhone(), student.getDepartment(), student.getGpa()});
            
        }
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1findbyname = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1fullname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1gender = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1dob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2department = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1gpa = new javax.swing.JTextField();
        jButton1Insert = new javax.swing.JButton();
        jButton1delete = new javax.swing.JButton();
        jButton1edit = new javax.swing.JButton();
        jButton4Load = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1student = new javax.swing.JTable();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jButton1findbyname.setBackground(new java.awt.Color(255, 255, 153));
        jButton1findbyname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1findbyname.setText("Find By Name");
        jButton1findbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1findbynameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Fullname");

        jTextField1fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1fullnameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Gender");

        jComboBox1gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male", "" }));
        jComboBox1gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1genderActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Date of Birth");

        jTextField1dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1dobActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Address");

        jLabel9.setBackground(new java.awt.Color(255, 51, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel9.setText("Student Management");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Phone ");

        jTextField1phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1phoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Department");

        jTextField2department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2departmentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("GPA");

        jTextField1gpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1gpaActionPerformed(evt);
            }
        });

        jButton1Insert.setText("INSERT");
        jButton1Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InsertActionPerformed(evt);
            }
        });

        jButton1delete.setText("DELETE");
        jButton1delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1deleteActionPerformed(evt);
            }
        });

        jButton1edit.setText("EDIT");
        jButton1edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1editActionPerformed(evt);
            }
        });

        jButton4Load.setText("Load");
        jButton4Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4LoadActionPerformed(evt);
            }
        });

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3reset.setText("RESET");
        jButton3reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3resetActionPerformed(evt);
            }
        });

        jTable1student.setBackground(new java.awt.Color(255, 153, 255));
        jTable1student.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jTable1student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Full Name", "Gender", "Date of birth", "Address", "Phone", "Department", "GPA"
            }
        ));
        jScrollPane1.setViewportView(jTable1student);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(237, 237, 237))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField1address, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox1gender, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(237, 237, 237))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(46, 46, 46))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1phone, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField1gpa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                        .addComponent(jTextField2department, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(jTextField1dob, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton1findbyname)
                        .addGap(247, 247, 247)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1Insert)
                                .addGap(24, 24, 24)
                                .addComponent(jButton1edit)
                                .addGap(32, 32, 32)
                                .addComponent(jButton1delete)
                                .addGap(39, 39, 39)
                                .addComponent(jButton4Load)))
                        .addGap(39, 39, 39)
                        .addComponent(jButton3reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton1findbyname))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jTextField2department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jComboBox1gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField1gpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Insert)
                    .addComponent(jButton1delete)
                    .addComponent(jButton1edit)
                    .addComponent(jButton4Load)
                    .addComponent(jButton2)
                    .addComponent(jButton3reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3resetActionPerformed
        // TODO add your handling code here:
        jTextField1fullname.setText("");
        jTextField1dob.setText("");
        jTextField1address.setText("");
        jTextField1phone.setText("");
        jTextField2department.setText("");
        jTextField1gpa.setText("");
    }//GEN-LAST:event_jButton3resetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainFunction mainmenu = new MainFunction();
        mainmenu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4LoadActionPerformed

        try {
            // TODO add your handling code here:
            showStudent();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButton4LoadActionPerformed

    private void jButton1editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1editActionPerformed
        // TODO add your handling code here:
        int indexselect = jTable1student.getSelectedRow();
        int id = listStudent.get(indexselect).getId();// get id of student need to edit

        String name = jTextField1fullname.getText();
        String gender = jComboBox1gender.getSelectedItem().toString();
        String dob = jTextField1dob.getText();
        String address = jTextField1address.getText();
        int phone = Integer.parseInt(jTextField1phone.getText());
        String department = jTextField2department.getText();
        double gpa = Double.parseDouble(jTextField1gpa.getText());
        Student std = new Student(id, name, gender, dob, address, phone, department, gpa);
        StudentModify.update(std);
        try {
            showStudent();
        }catch(Exception ex){
            System.out.println("Error"+ ex.getMessage());
        }
    }//GEN-LAST:event_jButton1editActionPerformed

    private void jButton1deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1deleteActionPerformed
        // TODO add your handling code here:
        /// get the index of element that you want to delete
        int selecindex = jTable1student.getSelectedRow();
        if(selecindex > 0){

            Student std = listStudent.get(selecindex);
            int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?");
            if(option==0){
                StudentModify.delete(std.getId());
                try {
                    showStudent();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentMenu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }//GEN-LAST:event_jButton1deleteActionPerformed

    private void jButton1InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InsertActionPerformed
        // TODO add your handling code here:
        String name = jTextField1fullname.getText();
        String gender = jComboBox1gender.getSelectedItem().toString();
        String dob = jTextField1dob.getText();
        String address = jTextField1address.getText();
        int phone = Integer.parseInt(jTextField1phone.getText());
        String department = jTextField2department.getText();
        double gpa = Double.parseDouble(jTextField1gpa.getText());
        Student std = new Student(name, gender, dob, address, phone, department, gpa);
        StudentModify.insert(std);

        try{
            showStudent();
        }
        catch(Exception e){
            System.out.println("Error:" + e.getMessage());
        }
    }//GEN-LAST:event_jButton1InsertActionPerformed

    private void jTextField2departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2departmentActionPerformed

    private void jTextField1dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1dobActionPerformed

    private void jComboBox1genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1genderActionPerformed

    private void jTextField1fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1fullnameActionPerformed

    private void jButton1findbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1findbynameActionPerformed
        // TODO add your handling code here:
        String inputname = JOptionPane.showInputDialog(this,"Enter full name to search");
        if(inputname != null && inputname.length()>0){
            {
                listStudent= StudentModify.findByName(inputname);

            }
            tableModel.setRowCount(0);
            for (Student student : listStudent) {
                tableModel.addRow(new Object[]{tableModel.getRowCount()+1,student.getName(), student.getGender(), student.getDob(), student.getAddress(), student.getPhone(), student.getDepartment(), student.getGpa() });

            }

        }
        else{

            try {
                showStudent();
            } catch (SQLException ex) {
                Logger.getLogger(StudentMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton1findbynameActionPerformed

    private void jTextField1phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1phoneActionPerformed

    private void jTextField1gpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1gpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1gpaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Insert;
    private javax.swing.JButton jButton1delete;
    private javax.swing.JButton jButton1edit;
    private javax.swing.JButton jButton1findbyname;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3reset;
    private javax.swing.JButton jButton4Load;
    private javax.swing.JComboBox jComboBox1gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1student;
    private javax.swing.JTextField jTextField1address;
    private javax.swing.JTextField jTextField1dob;
    private javax.swing.JTextField jTextField1fullname;
    private javax.swing.JTextField jTextField1gpa;
    private javax.swing.JTextField jTextField1phone;
    private javax.swing.JTextField jTextField2department;
    // End of variables declaration//GEN-END:variables
}
