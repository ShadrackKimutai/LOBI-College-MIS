/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import lobi.college.util.Configurations;

/**
 *
 * @author shady
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
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
        btnRegistry = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnAcademicPane = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnProcurement = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnAdmin = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoBi College MIS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnRegistry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/details1.png"))); // NOI18N
        btnRegistry.setText("Registry");
        btnRegistry.setFocusable(false);
        btnRegistry.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistry.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/details.png"))); // NOI18N
        btnRegistry.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/details.png"))); // NOI18N
        btnRegistry.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/details.png"))); // NOI18N
        btnRegistry.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistryActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRegistry);
        jToolBar1.add(jSeparator2);

        btnAcademicPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/progress1.png"))); // NOI18N
        btnAcademicPane.setText("Academics");
        btnAcademicPane.setFocusable(false);
        btnAcademicPane.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcademicPane.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/progress.png"))); // NOI18N
        btnAcademicPane.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/progress.png"))); // NOI18N
        btnAcademicPane.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/progress.png"))); // NOI18N
        btnAcademicPane.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAcademicPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcademicPaneMouseClicked(evt);
            }
        });
        btnAcademicPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcademicPaneActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAcademicPane);
        jToolBar1.add(jSeparator1);

        btnProcurement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/export1.png"))); // NOI18N
        btnProcurement.setText("Procurement");
        btnProcurement.setFocusable(false);
        btnProcurement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProcurement.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/export.png"))); // NOI18N
        btnProcurement.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/export.png"))); // NOI18N
        btnProcurement.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/export.png"))); // NOI18N
        btnProcurement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProcurement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProcurementMouseClicked(evt);
            }
        });
        jToolBar1.add(btnProcurement);
        jToolBar1.add(jSeparator4);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/accounting.png"))); // NOI18N
        jButton2.setText("Accounts");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/accounting1.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/accounting1.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/accounting1.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator6);

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/config1.png"))); // NOI18N
        btnAdmin.setText("Administration");
        btnAdmin.setFocusable(false);
        btnAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdmin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/config.png"))); // NOI18N
        btnAdmin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/config.png"))); // NOI18N
        btnAdmin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/config.png"))); // NOI18N
        btnAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });
        jToolBar1.add(btnAdmin);

        desktopPane.setAutoscrolls(true);
        desktopPane.setDoubleBuffered(true);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnRegistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistryActionPerformed
        // TODO add your handling code here:
        int c = desktopPane.getAllFrames().length;
        Random r = new Random();
        if (c < 5) {
            RegistryDash registry = new RegistryDash();
            registry.setVisible(true);

            desktopPane.add(registry);
            //registry.setLocation(r.nextInt(200),r.nextInt(200));
            registry.setLocation(c * 50, c * 50);
            try {
                registry.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }

        } else {
            JOptionPane.showMessageDialog(this, "More than Five (5) WIndows are currently active. \nClose some to allow new windows.", "Multiple Window Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int c = desktopPane.getAllFrames().length;
        Random r = new Random();
        if (c < 5) {
            AccountsPane sp = new AccountsPane();
            sp.setVisible(true);
            desktopPane.add(sp);
            sp.setLocation(c * 50, c * 50);
            try {
                sp.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
        }else {
            JOptionPane.showMessageDialog(this, "More than Five (5) WIndows are currently active. \nClose some to allow new windows.", "Multiple Window Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAcademicPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcademicPaneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcademicPaneActionPerformed

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        // TODO add your handling code here:
        int c = desktopPane.getAllFrames().length;
        Random r = new Random();
        if (c < 5) {
            AdminPane admPane = new AdminPane();
            admPane.setVisible(true);
            desktopPane.add(admPane);
            admPane.setLocation(c * 50, c * 50);
            try {
                admPane.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
        }else {
            JOptionPane.showMessageDialog(this, "More than Five (5) WIndows are currently active. \nClose some to allow new windows.", "Multiple Window Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnProcurementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcurementMouseClicked
        // TODO add your handling code here:
        int c = desktopPane.getAllFrames().length;
        Random r = new Random();
        if (c < 5) {
            ProcurementPane procPane = new ProcurementPane();
            procPane.setVisible(true);
            desktopPane.add(procPane);
            procPane.setLocation(c * 50, c * 50);
            try {
                procPane.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
        }else {
            JOptionPane.showMessageDialog(this, "More than Five (5) WIndows are currently active. \nClose some to allow new windows.", "Multiple Window Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnProcurementMouseClicked

    private void btnAcademicPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcademicPaneMouseClicked
        // TODO add your handling code here:
        
                  int c = desktopPane.getAllFrames().length;
        Random r = new Random();
        if (c < 5) {
            AcademicPane academicPane = new AcademicPane();
            academicPane.setVisible(true);
            desktopPane.add(academicPane);
            academicPane.setLocation(c * 50, c * 50);
            try {
                academicPane.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
        }else {
            JOptionPane.showMessageDialog(this, "More than Five (5) WIndows are currently active. \nClose some to allow new windows.", "Multiple Window Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAcademicPaneMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Configurations conf=new Configurations();
        conf.deletePropertiesFile();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");

        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (InstantiationException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btnAcademicPane;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnProcurement;
    private javax.swing.JButton btnRegistry;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
