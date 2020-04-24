/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis;

import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author shady
 */
public class LOBICollegeMIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
         try {
            // Set cross-platform Java L&F (also called "Metal")
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
            
        // TODO code application logic here
        Login login=new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
       
       
    }
    
}
