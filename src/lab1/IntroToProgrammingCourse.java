package lab1;



/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Chris Justman
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingDegree {
        
        private String prerequisites;

    public IntroToProgrammingCourse(String courseName, String courseNumber, String prerequisites, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
        this.setCredits(credits);
    }
    
    
 
        
        
           public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            prerequisites = "Error: prerequisites cannot be null of empty string";
                    
            System.exit(0);
        }
  
        this.prerequisites = prerequisites;
    }
           
                 public String getPrerequisites() {
        return prerequisites;
    }
    
}
