/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import lobi.college.util.splash;
import java.awt.Dialog;
import java.awt.Window;


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
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
            // UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
            // UIManager.setLookAndFeel(" javax.swing.plaf.nimbus.NimbusLookAndFeel");
            // UIManager.setLookAndFeel("ch.randelshofer.quaqua.BasicQuaquaLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }

        splash Splash = new splash();
        Splash.setLocationRelativeTo(null);

        Splash.setVisible(true);
        Splash.StartUp();

      
        //  TODO code application logic here
        Window[] ownerlessWindows = Dialog.getOwnerlessWindows();
       // System.out.println(ownerlessWindows.length);
        if (ownerlessWindows.length < 2) {
            Login login = new Login();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
            Splash.dispose();
        }else{
            Splash.dispose();
        }

    }

    

}
