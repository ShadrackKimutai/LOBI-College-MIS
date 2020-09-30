/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobi.college.mis.util;

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
//
//    public int getCourseID(String Course) {
//        int courseID = 0;
//        try {
//            Connection cnn = Database.getConnection();
//            Statement st = cnn.createStatement();
//            ResultSet rs LIKE st.executeQuery("select CourseID from Courses where CourseName='" + Course + "'");
//            rs.next();
//            courseID = rs.getInt(1);
//            rs.close();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Issue on Getting Course ID ," + e.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
//        }
//        return courseID;
//    }

    public String formatString(String unsanitizedString) {
        return unsanitizedString.replace("'", "`");
    }

    public int getCourseID(String Course, String Level) {
        int courseID = 0;
        try {
            Connection cnn = Database.getConnection();
            Statement st = cnn.createStatement();
            String Query = "select CourseID from Courses where CourseName='" + Course + "' and Level='" + Level + "'";
           // System.out.println(Query);
            ResultSet rs = st.executeQuery(Query);
            rs.next();
            courseID = rs.getInt(1);
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Issue on Getting Course ID ," + e.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
        }
        return courseID;
    }

    public String getCoursePattern(String level, int yearOfStudy) {
        String coursePattern = "";
        //SHORT COURSE", "ARTISAN", "CRAFT ", "DIPLOMA", "HIGHER DIPLOMA"
        switch (yearOfStudy) {
            case 1: {
                switch (level) {
                    case "SHORT COURSE": {
                        coursePattern = "(cohorts.progress LIKE '1+IE')";
                        break;
                    }
                    case "ARTISAN": {
                        coursePattern = "(cohorts.progress LIKE '3+NE') OR (cohorts.progress LIKE '2+A+NE')";
                        break;
                    }
                    case "CRAFT": {
                        coursePattern = "(cohorts.progress LIKE '2+NE+A+2+NE') OR (cohorts.progress LIKE '3+NE+A+2+NE') OR (cohorts.progress LIKE'2+NE+2+NE+A') OR (cohorts.progress LIKE '3+NE+2+NE+A') OR (cohorts.progress LIKE '2+SE+A+2+NE') OR (cohorts.progress LIKE '3+SE+A+2+NE') OR (cohorts.progress LIKE '2+SE+2+NE+A' ) OR (cohorts.progress LIKE '3+SE+2+NE+A') ";
                        break;
                    }
                    case "DIPLOMA": {
                        coursePattern = "(cohorts.progress LIKE '2+NE+A+2+NE') OR (cohorts.progress LIKE '2+NE+3+NE+A+2+NE') OR (cohorts.progress LIKE '3+NE+A+2+NE') OR (cohorts.progress LIKE'3+NE+3+NE+A+2+NE') OR (cohorts.progress LIKE '2+NE+2+NE+A')  OR (cohorts.progress LIKE '3+SE+A+2+NE') OR  (cohorts.progress LIKE'3+SE+2+SE+A+2+NE') OR (cohorts.progress LIKE '3+2+SE+2+SE+A')";
                        break;
                    }
                    case "HIGHER DIPLOMA": {
                        coursePattern = "(cohorts.progress LIKE '2+P+NE') OR (cohorts.progress LIKE '3+NE+P')";
                        break;
                    }
                }
                break;
            }
            case 2: {
                switch (level) {
                    case "CRAFT": {
                        coursePattern = "(cohorts.progress LIKE '2+NE') OR (cohorts.progress LIKE '2+NE+A' )";
                        break;
                    }
                    case "DIPLOMA": {
                        coursePattern = "(cohorts.progress LIKE '2+NE') OR (cohorts.progress LIKE '2+NE+A+2+NE') OR (cohorts.progress LIKE '2+NE+2+NE+A') OR (cohorts.progress LIKE '2+SE+A+2+NE')";
                        break;
                    }
                }
                break;
            }
            case 3: {
                        coursePattern = "(cohorts.progress LIKE '2+NE') OR (cohorts.progress LIKE '2+NE+A')";
                break;
            }
        }

        return coursePattern;
    }

        public int getCohortEnrollment(String cohort) {
        int count = 0;
        try {
            Connection cnn = Database.getConnection();
            Statement st = cnn.createStatement();
            String Query = " select count(*) from CourseEnrollment where cohort='"+cohort+"' and currentActivity='ACTIVE'";
           // System.out.println(Query);
            ResultSet rs = st.executeQuery(Query);
            rs.next();
            count = rs.getInt(1);
            rs.close();
        } catch (SQLException e) {
            System.out.println("Issue on Getting Enrolled Students in "+ cohort+ " " + e.getMessage());
        }
        return count;
       
    }
        public String getCohortProgress(String cohort) {
        String Progress = "";
        try {
            Connection cnn = Database.getConnection();
            Statement st = cnn.createStatement();
            String Query = " select progress from Cohorts where cohortName='"+cohort+"'";
           // System.out.println(Query);
            ResultSet rs = st.executeQuery(Query);
            rs.next();
            Progress = rs.getString(1);
            rs.close();
        } catch (SQLException e) {
            System.out.println("Issue on Getting Enrolled Students in "+ cohort+ " " + e.getMessage());
        }
        return Progress;
       
    }

}
