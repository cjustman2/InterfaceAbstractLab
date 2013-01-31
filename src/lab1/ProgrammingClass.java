/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;



/**
 *
 * @author chris
 */
public abstract class ProgrammingClass {
    private double credits;
    private String courseName;
    private String prerequisites;
    private String courseNumber;
    
    
        public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
           
                    System.out.println("Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
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

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            prerequisites = "Error: prerequisites cannot be null of empty string";
                    
            System.exit(0);
        }
        if(prerequisites == null || prerequisites.length() == 0){
            prerequisites = "Can not be null.";
    }
        if(prerequisites.equals("none")){
            prerequisites = "There are not prerequisites";
        }
        this.prerequisites = prerequisites;
    }
    
      public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
}
