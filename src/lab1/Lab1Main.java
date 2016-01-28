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
public class Lab1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*I'm getting errors and have no idea what's wrong
        I would say what is good or bad about it, but to be honest while trying
        to understand this I'm still lost as [insert idiom here]*/
        IntroJavaCourse java1 = new IntroJavaCourse();
        java1.setCourseName('Intro to Java');
        java1.setCourseNumber('152-168');
        
        AdvancedJavaCourse java2 = new AdvancedJavaCourse();
        java2.setCourseName('Advanced Java');
        
        IntroToProgramming prog = new IntroToProgramming();
        prog.setCourseName('something');
        prog.setCourseNumber('something');
    }
    //The Lishkov substitution apparently won't work for me.
}
