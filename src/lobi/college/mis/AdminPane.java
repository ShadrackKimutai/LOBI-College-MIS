/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis;

import java.awt.BorderLayout;
import lobi.college.mis.components.ManageCourses;
import lobi.college.mis.components.ManageDepartments;
import lobi.college.mis.components.newStudent;

/**
 *
 * @author shady
 */
public class AdminPane extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdminPane
     */
    public AdminPane() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnMgtDepartments = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnCourses = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnStaff = new javax.swing.JButton();
        adminPane = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Administration Pane");
        setDoubleBuffered(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/config.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jToolBar1.setRollover(true);

        btnMgtDepartments.setText("Departments");
        btnMgtDepartments.setFocusable(false);
        btnMgtDepartments.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMgtDepartments.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMgtDepartments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMgtDepartmentsMouseClicked(evt);
            }
        });
        btnMgtDepartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMgtDepartmentsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMgtDepartments);
        jToolBar1.add(jSeparator2);

        btnCourses.setText("Courses");
        btnCourses.setFocusable(false);
        btnCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCoursesMouseClicked(evt);
            }
        });
        jToolBar1.add(btnCourses);
        jToolBar1.add(jSeparator1);

        btnStaff.setText("Staff");
        jToolBar1.add(btnStaff);

        javax.swing.GroupLayout adminPaneLayout = new javax.swing.GroupLayout(adminPane);
        adminPane.setLayout(adminPaneLayout);
        adminPaneLayout.setHorizontalGroup(
            adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        adminPaneLayout.setVerticalGroup(
            adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
            .addComponent(adminPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoursesMouseClicked
        // TODO add your handling code here:
         ManageCourses courses = new ManageCourses();
        adminPane.removeAll();
       adminPane.setVisible(false);
        adminPane.setSize(adminPane.getSize().width,adminPane.getSize().height);
        adminPane.setVisible(true);
        adminPane.setLayout(new BorderLayout());
        adminPane.add(courses);

        adminPane.setVisible(true);
        pack();
    }//GEN-LAST:event_btnCoursesMouseClicked

    private void btnMgtDepartmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMgtDepartmentsMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnMgtDepartmentsMouseClicked

    private void btnMgtDepartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMgtDepartmentsActionPerformed
        // TODO add your handling code here:
         ManageDepartments dept = new ManageDepartments();
        adminPane.removeAll();
       adminPane.setVisible(false);
        adminPane.setSize(adminPane.getSize().width,adminPane.getSize().height);
        adminPane.setVisible(true);
        adminPane.setLayout(new BorderLayout());
        adminPane.add(dept);

        adminPane.setVisible(true);
        pack();
    }//GEN-LAST:event_btnMgtDepartmentsActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        btnMgtDepartments.doClick();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPane;
    private javax.swing.JButton btnCourses;
    private javax.swing.JButton btnMgtDepartments;
    private javax.swing.JButton btnStaff;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
