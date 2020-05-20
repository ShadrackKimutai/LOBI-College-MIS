/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author shady
 */
public class Database {
    public static Connection getConnection() {
          try  {
              Configurations cf = new Configurations();
            String myUrl = cf.getProperties().getProperty("url");
            Class.forName(cf.getProperties().getProperty("driverClassName"));
              Connection con = DriverManager.getConnection(myUrl, cf.getProperties().getProperty("username"), cf.getProperties().getProperty("password"));
              return con;
          }
          catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Database Connection Error \n," + e.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
              return null;
          }
      }
 
       public static void close(Connection con) {
          try  {
              con.close();
          }
          catch(Exception ex) {
          }
      }
}