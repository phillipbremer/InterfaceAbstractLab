/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

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
        ProgrammingClass[] courses = {
            new AdvancedJavaCourse(), new IntroJavaCourse(), 
            new IntroToProgrammingCourse()};
        for(ProgrammingClass pc : courses){
            pc.setCourseName(null);
        }
        IntroToProgrammingCourse prog1 = new IntroToProgrammingCourse();
        IntroJavaCourse prog2 = new IntroJavaCourse();
        AdvancedJavaCourse prog3 = new AdvancedJavaCourse();
    }
}
