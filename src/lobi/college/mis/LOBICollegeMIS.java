/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis;

import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//import com.formdev.flatlaf.FlatIntelliJLaf
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
           UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }
        
            
        // TODO code application logic here
        Login login=new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
       
       
    }
    
}
