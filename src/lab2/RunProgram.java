/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author chris
 */
public class RunProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String courseName = "Intro To Programming";
    String courseNumber = "104-1022";
    double credits = 4;
    String prerequisites = "none";
    
    
    
    ProgrammingDegree course = new IntroToProgrammingCourse( courseName, courseNumber,credits,prerequisites);
    
    
        System.out.println("Course Name: " + course.getCourseName() + "\n" +
                "Course Number " + course.getCourseNumber() + "\n" + 
                "Credits: " + course.getCredits() + "\n" +
                "Prerequisites: " + course.getPrerequisites());
    }
    }

