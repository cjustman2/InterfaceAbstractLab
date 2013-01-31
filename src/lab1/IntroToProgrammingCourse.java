package lab1;



/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Chris Justman
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingClasses {

   

    public IntroToProgrammingCourse(String courseName, String courseNumber, String prerequisites, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
        this.setCredits(credits);
    }
    
}
