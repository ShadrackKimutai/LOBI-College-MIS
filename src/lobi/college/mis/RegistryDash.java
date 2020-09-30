/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis;

import java.awt.BorderLayout;
import lobi.college.mis.components.RegisteredStudents;
import lobi.college.mis.components.newStudent;

/**
 *
 * @author shady
 */
public class RegistryDash extends javax.swing.JInternalFrame {
private String User,Dept;
    /**
     * Creates new form NewJInternalFrame
     * @param User
     * @param Dept
     */
    public RegistryDash(String user,String dept) {
        this.User=user;
        this.Dept=dept;
        initComponents();
       // JinternalFrame.getRootPane().setWindowDecorationStyle(5);
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnBulkRegister = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        registryPane = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registy Pane");
        setDoubleBuffered(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/gfx/details.png"))); // NOI18N
        setName(""); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                WindowClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                loadRegisteredStudents(evt);
            }
        });

        jToolBar1.setBorder(null);
        jToolBar1.setRollover(true);

        jButton1.setText("Registered Students");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        jButton2.setText("Register Student");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator2);

        btnBulkRegister.setText("Bulk Register Students (KUCCPS)");
        btnBulkRegister.setFocusable(false);
        btnBulkRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBulkRegister.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnBulkRegister);
        jToolBar1.add(jSeparator3);

        jButton3.setText("Modify Student");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator4);

        jButton4.setText("Registry Reports");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        javax.swing.GroupLayout registryPaneLayout = new javax.swing.GroupLayout(registryPane);
        registryPane.setLayout(registryPaneLayout);
        registryPaneLayout.setHorizontalGroup(
            registryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        registryPaneLayout.setVerticalGroup(
            registryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
            .addComponent(registryPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registryPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RegisteredStudents registeredStudents = new RegisteredStudents(User,Dept);
        //registeredStudents.setVisible(true);
        registryPane.removeAll();
        registryPane.setVisible(false);
        registeredStudents.setSize(registryPane.getSize().width,registryPane.getSize().height);
        //registeredStudents.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        registeredStudents.setVisible(true);
        registryPane.setLayout(new BorderLayout());
        registryPane.add(registeredStudents);

        registryPane.setVisible(true);
        pack();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        newStudent newStudents = new newStudent(User,Dept);
        registryPane.removeAll();
        registryPane.setVisible(false);
        newStudents.setSize(registryPane.getSize().width,registryPane.getSize().height);
        newStudents.setVisible(true);
        registryPane.setLayout(new BorderLayout());
        registryPane.add(newStudents);

        registryPane.setVisible(true);
        pack();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        System.out.println(registryPane.getSize().height);
    }//GEN-LAST:event_jButton3MouseClicked

    private void WindowClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_WindowClosing
        // TODO add your handling code here:
       
    }//GEN-LAST:event_WindowClosing

    private void loadRegisteredStudents(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_loadRegisteredStudents
        // TODO add your handling code here:
        jButton1.doClick();
    }//GEN-LAST:event_loadRegisteredStudents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBulkRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel registryPane;
    // End of variables declaration//GEN-END:variables
}
