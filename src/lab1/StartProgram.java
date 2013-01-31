/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
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
        double credits = 2;
        String prerequisites;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter which class you want to take \n" +
        "Enter 1 for Intro To Programming\n" + "Enter 2 for Intro To Java\n" + 
                "Enter 3 for Advanced Java");
        prerequisites = keyboard.nextLine();
        
         ProgrammingClasses course = new IntroJavaCourse(courseName, courseNumber, prerequisites, credits);
         
         System.out.println("courseNumber: " + course.getCourseNumber() + "\n" +
         "courseName: " + course.getCourseName() + "\n" + "Credits: " + course.getCredits() +
                 "\n" + "Prerequisites: " + course.getPrerequisites());
    }
}
