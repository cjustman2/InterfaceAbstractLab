package lab1;



/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Chris Justman
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingDegree {
        private double credits;
        private String prerequisites;

    public IntroToProgrammingCourse(String courseName, String courseNumber, String prerequisites, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
        this.setCredits(credits);
    }
    
    
        public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
           
                    System.out.println("Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
        
   
        
        
           public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            prerequisites = "Error: prerequisites cannot be null of empty string";
                    
            System.exit(0);
        }
  
        this.prerequisites = prerequisites;
    }
    
}
