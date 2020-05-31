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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import lobi.college.util.Database;
import lobi.college.util.Util;

/**
 *
 * @author shady
 */
public class ManageCourses extends javax.swing.JPanel {

    private final Color Silver;
    private final String User;
    private final String Dept;

    /**
     * Creates new form ManageCourses
     */
    public ManageCourses(String user,String dept) {
        this.User=user;
        this.Dept=dept;
        Silver = new Color(247, 247, 247);
        initComponents();
        populateTable();
        populateDepartments();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboLevel = new javax.swing.JComboBox<>();
        txtMinRequirements = new javax.swing.JTextField();
        txtAltRequirements = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegisterCourse = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        cboAccreditationBody = new javax.swing.JComboBox<>();
        cboExaminingBody = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboDepartment = new javax.swing.JComboBox<>();
        cboCourseFormat = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSlug = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourses = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Course"));

        jLabel1.setText("Course Level / Name");

        jLabel3.setText("Minimum Requirements");

        jLabel4.setText("Alternate Requirements");

        cboLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Short Course", "Artisan", "Craft", "Diploma", "Higher Diploma" }));

        jLabel2.setText("Course Accrediting Body");

        jLabel5.setText("Course Examining Body");

        btnRegisterCourse.setText("Register Course");
        btnRegisterCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterCourseMouseClicked(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        cboAccreditationBody.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "K.I.C.D", "TVET CDACC", "N.I.T.A", "K.A.S.N.E.B", "Internal " }));

        cboExaminingBody.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "K.N.E.C", "TVETA CDACC", "N.I.T.A.", "K.A.S.N.E.B", "Internal" }));

        jLabel6.setText("Course Department");

        cboDepartment.setAutoscrolls(true);
        cboDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDepartmentActionPerformed(evt);
            }
        });

        cboCourseFormat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MODULAR", "STAGE" }));

        jLabel7.setText("Course Format");

        jLabel8.setText("Slug / Abbreviation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAltRequirements)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cboAccreditationBody, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboExaminingBody, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMinRequirements)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSlug, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboCourseFormat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegisterCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSlug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cboCourseFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinRequirements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltRequirements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(cboAccreditationBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboExaminingBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisterCourse)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRegisterCourse, btnReset});

        /*tblCourses.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus,
                int row, int column) {
                Component c = super.getTableCellRendererComponent(table,
                    value, isSelected, hasFocus, row, column);
                c.setBackground(row%2==0 ? Color.white : Color.lightGray);
                return c;
            };
        });*/
        tblCourses.setAutoCreateRowSorter(true);
        tblCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Level", "Course Name", "Short Name ", "Course Type", "Min Requirements", "Alt Requirments", "Accreditation Body", "Examining Body"
            }
        ));
        tblCourses.setDoubleBuffered(true);
        tblCourses.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jScrollPane1.setViewportView(tblCourses);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterCourseMouseClicked
        // TODO add your handling code here:
        Util x = new Util();
        int deptID = x.getDepartmentID(String.valueOf(cboDepartment.getSelectedItem()));
        try {
            // create a mysql database connection

            // create a sql date object so we can use it in our INSERT statement
            Connection cnn = Database.getConnection();
            // create a sql date object so we can use it in our INSERT statement
            String Query = "insert into Courses (CourseName,Level,Requirement,AltRequirement,Accreditor,Examiner,deptID,courseFormat, slug) values (?,?,?,?,?,?,?,?,?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = cnn.prepareStatement(Query);
            preparedStmt.setString(1, txtCourseName.getText().toUpperCase());
            preparedStmt.setString(2, cboLevel.getSelectedItem().toString().toUpperCase());
            preparedStmt.setString(3, txtMinRequirements.getText().toUpperCase());
            preparedStmt.setString(4, txtAltRequirements.getText().toUpperCase());
            preparedStmt.setString(5, cboAccreditationBody.getSelectedItem().toString());
            preparedStmt.setString(6, cboExaminingBody.getSelectedItem().toString());
            preparedStmt.setInt(7, deptID);
            preparedStmt.setString(8,cboCourseFormat.getSelectedItem().toString());
            preparedStmt.setString(9,txtSlug.getText().toUpperCase());
            

            // execute the preparedstatement
            preparedStmt.execute();
            JOptionPane.showMessageDialog(this, "Course has been regstered successfuly", "Entry Successful", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.err.println("Error Encountered!");
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Error Occured", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        populateTable();
    }//GEN-LAST:event_btnRegisterCourseMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:

        txtAltRequirements.setText("");
        txtMinRequirements.setText("");
        txtCourseName.setText("");
    }//GEN-LAST:event_btnResetMouseClicked

    private void cboDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDepartmentActionPerformed
        // TODO add your handling code here:
        // System.out.println(Util.getDepartmentID(String.valueOf(cboDepartment.getSelectedItem().toString())));

    }//GEN-LAST:event_cboDepartmentActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterCourse;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cboAccreditationBody;
    private javax.swing.JComboBox<String> cboCourseFormat;
    private javax.swing.JComboBox<String> cboDepartment;
    private javax.swing.JComboBox<String> cboExaminingBody;
    private javax.swing.JComboBox<String> cboLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourses;
    private javax.swing.JTextField txtAltRequirements;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtMinRequirements;
    private javax.swing.JTextField txtSlug;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        try {

            // create a sql date object so we can use it in our INSERT statement
            File f = new File("server.properties");
            Connection cnn = Database.getConnection();

            PreparedStatement ps = cnn.prepareStatement("Select * from Courses");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) tblCourses.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object o[] = {rs.getString("Level").toUpperCase(), rs.getString("CourseName").toUpperCase(),rs.getString("Slug").toUpperCase(),rs.getString("CourseFormat"), rs.getString("Requirement"), rs.getString("AltRequirement"), rs.getString("Accreditor"), rs.getString("Examiner")};
                tm.addRow(o);

            }

            tblCourses.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void populateDepartments() {

        try {

            // create a sql date object so we can use it in our INSERT statement
            Connection conn = Database.getConnection();
            Statement st = conn.createStatement();
            cboDepartment.removeAllItems();
            ResultSet rs = st.executeQuery("select DeptName from Departments where AdmittingFlag=1");

            while (rs.next()) {
                cboDepartment.addItem(rs.getString("DeptName"));

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(this, "When Populating Departments," + e.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);

        }

    }

}
