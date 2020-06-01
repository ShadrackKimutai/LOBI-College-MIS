/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author shady
 */
public class Util {

    private int departmentID, userDeptID;

    public Util() {
        this.departmentID = 0;
        this.userDeptID = 0;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getUserDeptID() {
        return userDeptID;
    }

    public void setUserDeptID(int userDeptID) {
        this.userDeptID = userDeptID;
    }

    public int getDepartmentID(String Department) {

        try {
            Connection cnn = Database.getConnection();
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery("select DeptID from Departments where DeptName='" + Department + "'");
            rs.next();
            departmentID = rs.getInt(1);
rs.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Issue on Getting Department ID ," + e.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);

        }

        return departmentID;
    }

    public int getCourseID(String Course) {
        int courseID = 0;
        try {
            Connection cnn = Database.getConnection();
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery("select CourseID from Courses where CourseName='" + Course + "'");
            rs.next();
            courseID = rs.getInt(1);
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Issue on Getting Course ID ," + e.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
        }
        return courseID;
    }

    public String formatString(String unsanitizedString) {
        return unsanitizedString.replace("'", "`");
    }

    public int getCourseID(String Course, String Level) {
 int courseID = 0;
        try {
            Connection cnn = Database.getConnection();
            Statement st = cnn.createStatement();
     String Query="select CourseID from Courses where CourseName='" + Course + "' and Level='"+Level+"'";
            System.out.println(Query);
            ResultSet rs = st.executeQuery(Query);
            rs.next();
            courseID = rs.getInt(1);
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Issue on Getting Course ID ," + e.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
        }
        return courseID;
    }

}
