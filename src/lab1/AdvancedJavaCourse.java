package lab1;



/**
 * Describe responsibilities here.
 *
 * @author      Chris Justman
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingClasses {
    private String courseName;
    private String courseNumber;

    public AdvancedJavaCourse(String courseName, String courseNumber, String prerequisites, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
        this.setCredits(credits);
    }

//    public String getCourseNumber() {
//        return courseNumber;
//    }
//
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }
    
}
