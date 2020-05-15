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
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import lobi.college.util.Configurations;

/**
 *
 * @author shady
 */
public class ManageDepartments extends javax.swing.JPanel {

    private final Color Silver;

    /**
     * Creates new form ManageDepartments
     */
    public ManageDepartments() {
        initComponents();
        Silver=new Color(200, 200, 200);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDeptName = new javax.swing.JTextField();
        txtDeptSlugName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        optYes = new javax.swing.JRadioButton();
        optNo = new javax.swing.JRadioButton();
        btnRegisterDept = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtModifyDept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartment = new javax.swing.JTable();

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Deparment Registration"));

        jLabel1.setText("Department Name");

        jLabel2.setText("Department Name Slug");

        jLabel3.setText("Admitting");

        buttonGroup1.add(optYes);
        optYes.setText("Yes");

        buttonGroup1.add(optNo);
        optNo.setText("No");

        btnRegisterDept.setText("Register ");
        btnRegisterDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterDeptMouseClicked(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDeptName)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDeptSlugName, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optNo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegisterDept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRegisterDept, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDeptName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDeptSlugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(optYes)
                    .addComponent(optNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegisterDept, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Register Department", new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/document.png")), jPanel1); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Modify Existing Details"));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Select Department");

        jLabel5.setText("Head of Department");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtModifyDept.setText("Update");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, 0, 516, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtModifyDept, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModifyDept, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Assign Departmental Head", new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/manager.png")), jPanel2); // NOI18N

        tblDepartment.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus,
                int row, int column) {
                Component c = super.getTableCellRendererComponent(table,
                    value, isSelected, hasFocus, row, column);
                c.setBackground(row%2==0 ? Color.white : Silver);
                c.setForeground(row%2==0 ? Color.black :Color.white);
                return c;
            };
        });
        tblDepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Department Name", "Dept Slug (Abbrev)", "Current H.O.D", "Is Admitting Dept Or Not"
            }
        ));
        tblDepartment.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblDepartment);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        txtDeptName.setText("");
        txtDeptSlugName.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnRegisterDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterDeptMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
         
        try {
            // create a mysql database connection
            Configurations cf = new Configurations();
            String myUrl = cf.getProperties().getProperty("url");
            Class.forName(cf.getProperties().getProperty("driverClassName"));
            // create a sql date object so we can use it in our INSERT statement

            Connection conn = DriverManager.getConnection(myUrl, cf.getProperties().getProperty("username"), cf.getProperties().getProperty("password"));
            // create a sql date object so we can use it in our INSERT statement
            String Query = "insert into Departments(DeptName,DeptSlug , AdmittingFlag) values (?,?,?)";
            // create the mysql insert preparedstatement
            String Admitting;
            if (optYes.isSelected()){
                Admitting="1";
            }else if(optNo.isSelected()){
                Admitting="0";
            }else {
                JOptionPane.showMessageDialog(this, "Please Specify whether department is admitting or a not", "Specify Department", JOptionPane.WARNING_MESSAGE);
                optYes.grabFocus();
                return;
            }
            
            PreparedStatement preparedStmt = conn.prepareStatement(Query);
            preparedStmt.setString(1, txtDeptName.getText());
            preparedStmt.setString(2, txtDeptSlugName.getText());
           
            preparedStmt.setString(3, Admitting);

            // execute the preparedstatement
            preparedStmt.execute();
JOptionPane.showConfirmDialog(this, "Department has been registered successfuly", "Entry Successful", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error Encountered!");
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Error Occured", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        populateTable();
    }//GEN-LAST:event_btnRegisterDeptMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterDept;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton optNo;
    private javax.swing.JRadioButton optYes;
    private javax.swing.JTable tblDepartment;
    private javax.swing.JTextField txtDeptName;
    private javax.swing.JTextField txtDeptSlugName;
    private javax.swing.JButton txtModifyDept;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
 try {
            Configurations cf = new Configurations();
            String myUrl = cf.getProperties().getProperty("url");
            Class.forName(cf.getProperties().getProperty("driverClassName"));
            // create a sql date object so we can use it in our INSERT statement

            File f = new File("server.properties");
            Connection conn = DriverManager.getConnection(myUrl, cf.getProperties().getProperty("username"), cf.getProperties().getProperty("password"));

            PreparedStatement ps = conn.prepareStatement("Select * from Departments");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) tblDepartment.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object Admitting;
                if (rs.getBoolean("AdmittingFlag")){
                    Admitting="True";
                }else{
                    Admitting="False";
                }
              
                Object o[] = {rs.getInt("DeptID"), rs.getString("DeptName"), rs.getString("DeptSlug"), rs.getString("DeptHead"),Admitting};
                tm.addRow(o);

            }

            tblDepartment.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this,  "Error Occured",e.getMessage() ,JOptionPane.ERROR_MESSAGE);

        }    }
}
