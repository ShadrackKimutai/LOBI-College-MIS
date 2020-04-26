/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import lobi.college.mis.components.newStudent;

/**
 *
 * @author shady
 */
public class Configurations {
    
private  Properties properties;

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
    private String filename;
    public Configurations() {
            filename="configurations.properties";
           
        try {
            properties = readPropertiesFile(filename);
        } catch (IOException ex) {
            Logger.getLogger(newStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

     public static Properties readPropertiesFile(String fileName) throws IOException  {
        FileInputStream fileInputStream = null;
        Properties prop = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            // create Properties class object
            prop = new Properties();
            // load properties file into it
            prop.load(fileInputStream);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            fileInputStream.close();
        }

        return prop;
    }
}
