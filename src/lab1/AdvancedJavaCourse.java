package lab1;



/**
 * Describe responsibilities here.
 *
 * @author      Chris Justman
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingDegree {
       
        private String prerequisites;
        
        
    public AdvancedJavaCourse(String courseName, String courseNumber, String prerequisites, double credits) {
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
