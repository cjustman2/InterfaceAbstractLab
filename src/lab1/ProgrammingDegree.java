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
    
    
   

   public abstract void setCredits(double credits);
   
   
             public double getCredits() {
        return credits;
    }
    
       public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
        public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
        public String getPrerequisites() {
        return prerequisites;
    }

    public abstract void setPrerequisites(String prerequisites);
    
      public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
}
