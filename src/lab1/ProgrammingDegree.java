/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;



/**
 *
 * @author chris
 */
public abstract class ProgrammingDegree {
    private double credits;
    private String courseName;
    private String prerequisites;
    private String courseNumber;
    
    
   

  
             
             
   public abstract void setPrerequisites(String prerequisites);
   
   
              public abstract String getPrerequisites();
             
           public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
           
                    System.out.println("Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
        
                public double getCredits() {
        return credits;
    }

    
        public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
       
           public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
    
      public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
}
