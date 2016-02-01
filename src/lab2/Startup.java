/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Phillip Bremer
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntroToProgrammingCourse prog = new IntroToProgrammingCourse();
        prog.setCourseName(courseName);
        prog.setCourseNumber(courseNumber);
        
        IntroJavaCourse java1 = new IntroJavaCourse();
        java1.setCourseName(courseName);
        java1.setCourseNumber(courseNumber);
        
        AdvancedJavaCourse java2 = new AdvancedJavaCourse();
        java2.setCourseName(courseName);
        java2.setCourseNumber(courseNumber);
        
        /*I honestly don't know if it is good or bad since I can't get my code
        to work at all. As for the Liskov substitution, it won't work for me.*/
    }
    
}
