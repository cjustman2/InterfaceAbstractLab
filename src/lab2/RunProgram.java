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
//    String courseName = "Intro To Programming";
//    String courseNumber = "104-1022";
//    double credits = 3;
//    String prerequisites = "none";
    
    
    
//    ProgrammingDegree course = new IntroToProgrammingCourse( courseName, courseNumber,credits,prerequisites);
//    
//    
//        System.out.println("Course Name: " + course.getCourseName() + "\n" +
//                "Course Number " + course.getCourseNumber() + "\n" + 
//                "Credits: " + course.getCredits() + "\n" +
//                "Prerequisites: " + course.getPrerequisites());
    
//    String courseName = "Intro To Java";
//    String courseNumber = "154-9876";
//    double credits = 4;
//    String prerequisites = "Intro to Programming";
        
//        
//        ProgrammingDegree course = new IntroJavaCourse(courseName, courseNumber,credits,prerequisites);
//    
//    
//        System.out.println("Course Name: " + course.getCourseName() + "\n" +
//                "Course Number " + course.getCourseNumber() + "\n" + 
//                "Credits: " + course.getCredits() + "\n" +
//                "Prerequisites: " + course.getPrerequisites());
        
        
                String courseName = "Advanced Java";
                String courseNumber = "155-1234";
                double credits = 4;
               String prerequisites = "Intro to Java";
        
             ProgrammingDegree course = new AdvancedJavaCourse(courseName, courseNumber,credits,prerequisites);
    
    
        System.out.println("Course Name: " + course.getCourseName() + "\n" +
                "Course Number " + course.getCourseNumber() + "\n" + 
                "Credits: " + course.getCredits() + "\n" +
                "Prerequisites: " + course.getPrerequisites());
    }
    }

