/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cgpacalc;

import java.util.Scanner;
import java.util.List;
import cgpacalc.GetCourseDetails;
/**
 *
 * @author PC
 */
public class CGPACalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GetCourseDetails courseDetails = new GetCourseDetails();
        List<GetCourseDetails.Course> courses = courseDetails.getCourses();
        


    }
    
}
