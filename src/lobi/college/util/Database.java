/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author shady
 */
public class Database {

    public static Connection getConnection() {
        Configurations cf = new Configurations();
        String myUrl = cf.getProperties().getProperty("url");
        Connection con = null;
        try {

            Class.forName(cf.getProperties().getProperty("driverClassName"));
            con = DriverManager.getConnection(myUrl, cf.getProperties().getProperty("username"), cf.getProperties().getProperty("password"));
         

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database Connection Error. Application cant reach the Database. \nQuiting...", "Database Connection Failed", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}
