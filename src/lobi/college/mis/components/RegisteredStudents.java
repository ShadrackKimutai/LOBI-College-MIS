/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis.components;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import lobi.college.util.Configurations;

/**
 *
 * @author shady
 */
public class RegisteredStudents extends javax.swing.JPanel {

    /**
     * Creates new form RegisteredStudents
     */
    public RegisteredStudents() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane(tblStudents);
        tblStudents = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Number", "Name", "Department", "Course", " " }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/research.png"))); // NOI18N
        jButton1.setText("<html><b>Search</b>");

        jScrollPane3.setAutoscrolls(true);

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        tblStudents.setDoubleBuffered(true);
        jScrollPane3.setViewportView(tblStudents);
        tblStudents.getAccessibleContext().setAccessibleParent(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblStudents;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
         
        
        
        
        try{
    Configurations cf=new Configurations();
     String myUrl = cf.getProperties().getProperty("url");
            Class.forName(cf.getProperties().getProperty("driverClassName"));
            // create a sql date object so we can use it in our INSERT statement
           
            File f = new File("server.properties");
           Connection conn = DriverManager.getConnection(myUrl, cf.getProperties().getProperty("username"), cf.getProperties().getProperty("password")); 
            
       
        PreparedStatement ps = conn.prepareStatement("Select * from Students");
        ResultSet rs=ps.executeQuery();
        DefaultTableModel tm = (DefaultTableModel)tblStudents.getModel();
        tm.setRowCount(0);

        while(rs.next()){

            Object o[] = {rs.getInt("B_Certificate"),rs.getString("Student_Name"),rs.getInt("IDNo"),rs.getString("Gender"),rs.getString("Nationality"),rs.getString("County"),rs.getString("Subcounty"),rs.getString("Phone"),rs.getString("email"),rs.getString("Address"),rs.getString("Gender"),rs.getString("NextOfKin"),rs.getString("NextofKinPhone")};
            tm.addRow(o);



        }

tblStudents.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
    }
    catch(ClassNotFoundException | SQLException e){

        JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
    }  }
}
