/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lobi.college.mis.components.newStudent;

/**
 *
 * @author shady
 */
public class Configurations {

    private Properties properties;
    private String filename;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Properties getProperties() {
        return properties;
    }

    public String getFilename() {
        return filename;
    }

    public Configurations() {
        
        new File("rxt").mkdir();
        filename = "rxt/molotov.ini";

        try (OutputStream output = new FileOutputStream(filename)) {

            Properties prop = new Properties();

            // set the properties value
            prop.setProperty("url", "jdbc:mysql://localhost:3306/collegemis?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]");
            prop.setProperty("username", "root");
            prop.setProperty("password", "");
            prop.setProperty("driverClassName", "org.mariadb.jdbc.Driver");

            // save properties to project root folder
            prop.store(output, null);

            //   System.out.println(prop);
        } catch (IOException io) {
            io.printStackTrace();
        }

        try {
            properties = readPropertiesFile(filename);
        } catch (IOException ex) {
            Logger.getLogger(newStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fileInputStream = null;
        Properties prop = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            // create Properties class object
            prop = new Properties();
            // load properties file into it
            prop.load(fileInputStream);

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
        } catch (IOException e) {

            System.out.println(e.getMessage());
        } finally {
            fileInputStream.close();
        }

        return prop;
    }

    /**
     *
     */
    public void checkCrucialFiles() {
       
            JOptionPane.showMessageDialog(null, "File Missing Error. \nThe Application has detected that a crucial file is Missing. \nQuiting...", "File Missing Error", JOptionPane.ERROR_MESSAGE);

    }

    public void deletePropertiesFile() {
        File file = new File(filename);
        try {
            file.delete();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
