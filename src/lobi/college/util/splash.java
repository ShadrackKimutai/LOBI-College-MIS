/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shady
 */
public class splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public splash() {
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

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        txtOutput = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.inactiveForeground"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setFocusable(false);
        setFocusableWindowState(false);
        setMaximumSize(new java.awt.Dimension(450, 250));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(450, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(450, 250));
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new ImageIcon("/lobi/college/mis/resources/splash.png"));
        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("controlText"));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lobi/college/mis/resources/gfx/splash.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jLabel1.setDoubleBuffered(true);

        jProgressBar1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(102, 0, 102));
        jProgressBar1.setToolTipText("");
        jProgressBar1.setDoubleBuffered(true);
        jProgressBar1.setFocusable(false);
        jProgressBar1.setStringPainted(true);

        txtOutput.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        txtOutput.setText("progress");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setText("Version 0.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOutput)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new splash().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel txtOutput;
    // End of variables declaration//GEN-END:variables

    public void StartUp() {
        String report = "";
        Configurations conf = null;
        int i = 0;
        File file = null;

        jProgressBar1.setValue(i);
        try {
            do {
                i++;
                jProgressBar1.setValue(i);
                if (i < 18) {
                    file = new File("molotov.ini");
                    if (file.exists()) {
                        txtOutput.setText("Loading module" + file.getName());
                        Thread.sleep(10);
                        //check whether jars exist

                    } else {
                        conf.checkCrucialFiles();
                    }
                }
                if ((i >= 18) && (i < 36)) {
                    file = new File("lib/mariadb-java-client-2.6.0.jar");
                    if (file.exists()) {
                        txtOutput.setText("Loading module" + file.getName());
                        Thread.sleep(40);

                    } else {
                        conf.checkCrucialFiles();
                    }
                }

                if ((i >= 36) && (i < 56)) {
                    file = new File("lib/flatlaf-0.33.jar");
                    if (file.exists()) {
                        txtOutput.setText("Loading module" + file.getName());
                        Thread.sleep(40);

                    } else {
                        conf.checkCrucialFiles();
                    }
                }
                if ((i >= 56 && i < 70)) {
                    file = new File("lib/swingx-0.9.1.jar");
                    if (file.exists()) {
                        txtOutput.setText("Loading module" + file.getName());
                        Thread.sleep(40);

                    } else {
                        conf.checkCrucialFiles();
                    }
                }
                if ((i >= 70) && (i < 80)) {
                    txtOutput.setText("Trying to connect to database");
                    Thread.sleep(20);
                }
                if (i == 80) {
                    Connection cnn = Database.getConnection();
                    Statement st = cnn.createStatement();
                    String Query = "show tables";
                    ResultSet rs = st.executeQuery(Query);
                    if (rs.first()) {
                        // System.out.println(rs.getString(1));
                        report = "Established Database Connectivity";

                    } else {

                        report = "Failed to Establish Database Connection ";
                        //this.cancel(true);
                        Thread.sleep(1000);

                    }

                    Thread.sleep(100);
                }
                if (i >= 80) {
                    txtOutput.setText(report);
                    Thread.sleep(20);
                }

            } while ((int) jProgressBar1.getValue() < 100);
        } catch (InterruptedException | SQLException ex) {
            Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
        }
        return;
    }
}
