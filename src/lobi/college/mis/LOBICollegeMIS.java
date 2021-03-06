/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import lobi.college.mis.util.splash;
import java.awt.Dialog;
import java.awt.Window;
import javax.swing.JOptionPane;


/**
 *
 * @author shady
 */
public class LOBICollegeMIS {

    private static void dispose() {
    }

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
           //UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
            //UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
             UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
            // UIManager.setLookAndFeel(" javax.swing.plaf.nimbus.NimbusLookAndFeel");
          //UIManager.setLookAndFeel("ch.randelshofer.quaqua.BasicQuaquaLookAndFeel");
        //  UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }

        splash Splash = new splash();
        Splash.setLocationRelativeTo(null);

        Splash.setVisible(true);
       boolean status;
        status = Splash.StartUp();

    
        //  TODO code application logic here
        Window[] ownerlessWindows = Dialog.getOwnerlessWindows();
       // System.out.println(ownerlessWindows.length);
        if (ownerlessWindows.length < 2 && status==true) {
            Login login = new Login();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
            Splash.dispose();
        }else{
            JOptionPane.showMessageDialog(Splash, "Database Connection Error encountered. The application can not reach the database. Quiting...","Database Connection Failed",JOptionPane.ERROR_MESSAGE);
            Splash.dispose();
        }

    }

    

}
