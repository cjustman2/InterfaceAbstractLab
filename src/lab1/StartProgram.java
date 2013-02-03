/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author chris
 */
public class StartProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String courseNumber = "120";
        String courseName = "Java";
        double credits = 4;
        String prerequisites = "Intro to Programming";
        
        
         ProgrammingDegree course = new IntroJavaCourse(courseName, courseNumber, prerequisites, credits);
         
         System.out.println("courseNumber: " + course.getCourseNumber() + "\n" +
         "courseName: " + course.getCourseName() + "\n" + "Credits: " + course.getCredits() +
                 "\n" + "Prerequisites: " + course.getPrerequisites());
    }
}
