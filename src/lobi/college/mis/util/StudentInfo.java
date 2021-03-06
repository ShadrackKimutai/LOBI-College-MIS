/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Shady
 */
public class StudentInfo extends javax.swing.JDialog {

    private String studentID;

    /**
     * Creates new form NewJDialog
     * @param parent
     * @param modal
     */
    public StudentInfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

    }

    public StudentInfo(String StudentID) {
        this.studentID = StudentID;
        initComponents();
        populateInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picpassportphoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCourse = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Information");
        setAlwaysOnTop(true);
        setBackground(java.awt.SystemColor.text);
        setIconImage(null);
        setIconImages(null);
        setModal(true);
        setPreferredSize(new java.awt.Dimension(535, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 365));
        setType(java.awt.Window.Type.POPUP);

        picpassportphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picpassportphoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        picpassportphoto.setFocusable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtCourse.setEditable(false);
        txtCourse.setBackground(javax.swing.UIManager.getDefaults().getColor("Panel.background"));
        txtCourse.setColumns(20);
        txtCourse.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCourse.setLineWrap(true);
        txtCourse.setRows(2);
        txtCourse.setWrapStyleWord(true);
        txtCourse.setAutoscrolls(false);
        txtCourse.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaptionBorder));
        txtCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCourse.setDoubleBuffered(true);
        txtCourse.setFocusable(false);
        jScrollPane1.setViewportView(txtCourse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picpassportphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(picpassportphoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap(273, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, picpassportphoto});

        getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentInfo dialog = new StudentInfo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel picpassportphoto;
    private javax.swing.JTextArea txtCourse;
    // End of variables declaration//GEN-END:variables

    private void populateInfo() {
        try {

            // create a sql date object so we can use it in our INSERT statement
            File f = new File("server.properties");
            Connection cnn = Database.getConnection();

            PreparedStatement ps = cnn.prepareStatement("Select * from Students where studentId='" + studentID + "'");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
             
                txtCourse.setText(studentID+" \n"+rs.getString("Student_Name")+"\n"+ getCourseName(studentID)[0]+ " IN " + getCourseName(studentID)[1]+" ("+ getCourseName(studentID)[2] + ")"+"\n"+"PHONE:" + rs.getString("Phone")+", "+( rs.getString("IDNo")!=null? "ID NO:" + rs.getString("IDNo"): "STUDENT HAS NO ID") );
            
                BufferedImage img = ImageIO.read(rs.getBinaryStream("photo"));
                Image dimg = img.getScaledInstance(picpassportphoto.getWidth(), picpassportphoto.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon passPortPhoto = new ImageIcon(dimg);
                picpassportphoto.setIcon(passPortPhoto);
             

            }

        } catch (IOException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }

    public String[] getCourseName(String StudentID) {
        String [] CourseName = null;
        try {
            Connection cnn = Database.getConnection();
            Statement st = cnn.createStatement();
            String Query = "SELECT CRS.LEVEL, CRS.COURSENAME,CRSENR.COHORT FROM COURSEENROLLMENT CRSENR INNER JOIN COURSES CRS ON CRSENR.COURSEID=CRS.COURSEID WHERE CRSENR.STUDENTID='" + StudentID + "'";
           System.out.println(Query);
            ResultSet rs = st.executeQuery(Query);
            rs.next();
            String []temp = {rs.getString(1).toUpperCase(), rs.getString(2).toUpperCase(),rs.getString(3)};
            CourseName=temp;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Issue on Getting Course Name ," + e.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);

        }

        return CourseName;
    }
}
