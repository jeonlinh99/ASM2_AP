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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class ProfessorMenu extends javax.swing.JFrame {
    
    DefaultTableModel tableModel;
    List<Professor> listProfessor = new ArrayList<>();
    
    

    /**
     * Creates new form StudentMenu
     */
    public ProfessorMenu() {
        initComponents();
        tableModel = (DefaultTableModel) jTable1professor.getModel();
        
    }
    public void showProfessor() throws SQLException{
    
    listProfessor = ProfessorModify.findAll();
    tableModel.setRowCount(0);
        for (Professor professor  : listProfessor) {
            tableModel.addRow(new Object[]{tableModel.getRowCount()+1, professor.getName(), professor.getGender(), professor.getDob(), professor.getAddress(), professor.getPhone(), professor.getDepartment(), professor.getSalary()});
            
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
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1delete = new javax.swing.JButton();
        jTextField2department = new javax.swing.JTextField();
        jButton1findbyname = new javax.swing.JButton();
        jTextField1fullname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1edit = new javax.swing.JButton();
        jTextField1salart = new javax.swing.JTextField();
        jComboBox1gender = new javax.swing.JComboBox();
        jButton1Insert = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1dob = new javax.swing.JTextField();
        jButton3reset = new javax.swing.JButton();
        jButton4Load = new javax.swing.JButton();
        jTextField1address = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1professor = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel9.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel9.setText("Professor Management");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Fullname");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Gender");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Date of Birth");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Department");

        jButton1delete.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton1delete.setText("DELETE");
        jButton1delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1deleteActionPerformed(evt);
            }
        });

        jTextField2department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2departmentActionPerformed(evt);
            }
        });

        jButton1findbyname.setBackground(new java.awt.Color(255, 255, 153));
        jButton1findbyname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1findbyname.setText("Find By Name");
        jButton1findbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1findbynameActionPerformed(evt);
            }
        });

        jTextField1fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1fullnameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Salary");

        jButton1edit.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton1edit.setText("EDIT");
        jButton1edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1editActionPerformed(evt);
            }
        });

        jComboBox1gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male", "" }));
        jComboBox1gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1genderActionPerformed(evt);
            }
        });

        jButton1Insert.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton1Insert.setText("INSERT");
        jButton1Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InsertActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1dobActionPerformed(evt);
            }
        });

        jButton3reset.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton3reset.setText("RESET");
        jButton3reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3resetActionPerformed(evt);
            }
        });

        jButton4Load.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton4Load.setText("Load");
        jButton4Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4LoadActionPerformed(evt);
            }
        });

        jTable1professor.setBackground(new java.awt.Color(204, 255, 255));
        jTable1professor.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jTable1professor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Full Name", "Gender", "Date of birth", "Address", "Phone", "Department", "Salary"
            }
        ));
        jScrollPane1.setViewportView(jTable1professor);
        if (jTable1professor.getColumnModel().getColumnCount() > 0) {
            jTable1professor.getColumnModel().getColumn(0).setHeaderValue("Id");
            jTable1professor.getColumnModel().getColumn(1).setHeaderValue("Full Name");
            jTable1professor.getColumnModel().getColumn(2).setHeaderValue("Gender");
            jTable1professor.getColumnModel().getColumn(3).setHeaderValue("Date of birth");
            jTable1professor.getColumnModel().getColumn(4).setHeaderValue("Address");
            jTable1professor.getColumnModel().getColumn(5).setHeaderValue("Phone");
            jTable1professor.getColumnModel().getColumn(6).setHeaderValue("Department");
            jTable1professor.getColumnModel().getColumn(7).setHeaderValue("Salary");
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Phone ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(507, 507, 507)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1findbyname))
                                .addGap(103, 103, 103)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(jTextField1phone, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1dob, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1gender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1address, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(49, 49, 49)
                                        .addComponent(jTextField1salart, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2department, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton4Load)
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton1Insert)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1delete)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1edit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jButton2)
                                .addGap(28, 28, 28)
                                .addComponent(jButton3reset)
                                .addGap(96, 96, 96)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1findbyname)
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField1phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1salart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Insert)
                    .addComponent(jButton1delete)
                    .addComponent(jButton1edit)
                    .addComponent(jButton4Load)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3reset))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1fullnameActionPerformed

    private void jComboBox1genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1genderActionPerformed

    private void jTextField1dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1dobActionPerformed

    private void jTextField2departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2departmentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainFunction mainmenu = new MainFunction();
        mainmenu.setVisible(true);
        
        
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4LoadActionPerformed
        
            try {
                // TODO add your handling code here:
                showProfessor();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        
        
        
        
    }//GEN-LAST:event_jButton4LoadActionPerformed

    private void jButton1InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InsertActionPerformed
        // TODO add your handling code here:
        String name = jTextField1fullname.getText();
        String gender = jComboBox1gender.getSelectedItem().toString();
        String dob = jTextField1dob.getText();
        String address = jTextField1address.getText();
        int phone = Integer.parseInt(jTextField1phone.getText());
        String department = jTextField2department.getText();
        double salary = Double.parseDouble(jTextField1salart.getText());
        Professor std = new Professor(name, gender, dob, address, phone, department,salary);
        ProfessorModify.insert(std);
         
        try{
        showProfessor();
        }
        catch(Exception e){
            System.out.println("Error:" + e.getMessage());
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1InsertActionPerformed

    private void jButton3resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3resetActionPerformed
        // TODO add your handling code here:
        jTextField1fullname.setText("");
        jTextField1dob.setText("");
        jTextField1address.setText("");
        jTextField1phone.setText("");
        jTextField2department.setText("");
        jTextField1salart.setText("");
        
      
    }//GEN-LAST:event_jButton3resetActionPerformed

    private void jButton1deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1deleteActionPerformed
        // TODO add your handling code here:
        /// get the index of element that you want to delete
        int selectindex = jTable1professor.getSelectedRow();
        if(selectindex > 0){
        Professor std = listProfessor.get(selectindex);
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?");
        ProfessorModify.delete(std.getId());
            try {
                showProfessor();
            } catch (SQLException ex) {
                Logger.getLogger(ProfessorMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_jButton1deleteActionPerformed

    private void jButton1findbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1findbynameActionPerformed
        // TODO add your handling code here:
        String inputname = JOptionPane.showInputDialog(this,"Enter full name to search");
        if(inputname != null && inputname.length()>0){
            {
        listProfessor= ProfessorModify.findByName(inputname);
        
        
        }
        tableModel.setRowCount(0);
        for (Professor professor : listProfessor) {
            tableModel.addRow(new Object[]{tableModel.getRowCount()+1,professor.getName(), professor.getGender(), professor.getDob(), professor.getAddress(), professor.getPhone(), professor.getDepartment(), professor.getSalary() });
            
            
        }
        
        }
        else{
        
            try {
                showProfessor();
            } catch (SQLException ex) {
                Logger.getLogger(ProfessorMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
      
        
        }
    }//GEN-LAST:event_jButton1findbynameActionPerformed

    private void jButton1editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1editActionPerformed
        // TODO add your handling code here:
        int indexselect = jTable1professor.getSelectedRow();
        int id = listProfessor.get(indexselect).getId();// get id of student need to edit
      
        String name = jTextField1fullname.getText();
        String gender = jComboBox1gender.getSelectedItem().toString();
        String dob = jTextField1dob.getText();
        String address = jTextField1address.getText();
        int phone = Integer.parseInt(jTextField1phone.getText());
        String department = jTextField2department.getText();
        double salary = Double.parseDouble(jTextField1salart.getText());
         Professor std = new Professor(id, name, gender, dob, address, phone, department, salary);
        ProfessorModify.update(std);
        try {
            showProfessor();
        }catch(SQLException ex){
            System.out.println("Error"+ ex.getMessage());
    }
        
        
    }//GEN-LAST:event_jButton1editActionPerformed

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
            java.util.logging.Logger.getLogger(ProfessorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ProfessorMenu().setVisible(true);
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
    private javax.swing.JTable jTable1professor;
    private javax.swing.JTextField jTextField1address;
    private javax.swing.JTextField jTextField1dob;
    private javax.swing.JTextField jTextField1fullname;
    private javax.swing.JTextField jTextField1phone;
    private javax.swing.JTextField jTextField1salart;
    private javax.swing.JTextField jTextField2department;
    // End of variables declaration//GEN-END:variables
}
