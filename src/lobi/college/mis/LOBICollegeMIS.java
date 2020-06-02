/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import lobi.college.util.splash;
import ch.randelshofer.quaqua.QuaquaLookAndFeel;


//import ch.randelshofer.quaqua.BasicQuaquaLookAndFeel;
//import ch.randelshofer.quaqua.QuaquaLookAndFeel15
//import com.formdev.flatlaf.FlatDarculaLaf;

//import //
/**
 *
 * @author shady
 */
public class LOBICollegeMIS {

   
    public LOBICollegeMIS() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // Set cross-platform Java L&F (also called "Metal")
           // UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
           UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }

        splash Splash = new splash();
        Splash.setLocationRelativeTo(null);

        Splash.setVisible(true);
        Splash.progressBar();
//        try {
//            Thread.sleep(4500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//
//        }
        // TODO code application logic here
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        Splash.dispose();

    }

}
