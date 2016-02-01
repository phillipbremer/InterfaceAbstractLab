package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Phillip Bremer
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingClass {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    @Override
    public void setCourseName(String courseName){
        if(courseName == null || courseName.isEmpty()){
            System.out.println("This cannot be blank");
        }else{
            this.courseName = courseName;
        }
    }
    
    @Override
    public void setCourseNumber(String courseNumber){
        if(courseNumber == null || courseNumber.isEmpty()){
            System.out.println("This cannot be empty");
        }else{
            this.courseNumber = courseNumber;
        }
    }
    
    @Override
    public void setCredits(double credits){
        this.credits = credits;
    }
    
    @Override
    public void setPrerequisites(String prerequisites){
        if(prerequisites == null || prerequisites.isEmpty()){
            System.out.println("This cannot be empty");
        }else{
            this.prerequisites = prerequisites;
        }
    }

    
}
