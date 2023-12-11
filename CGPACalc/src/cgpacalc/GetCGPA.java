/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cgpacalc;

import java.util.List;
import cgpacalc.GetCourseDetails;
import cgpacalc.GetCourseDetails.Course;

/**
 *
 * @author PC
 */
public class GetCGPA {
    
    public static void getCgpa(List<GetCourseDetails.Course> courses) {
        double qualityPoint = 0;
        double totalQualityPoint = 0;
        int totalGradeUnit = 0;
        double calculatedCgpa = 0;
        
        for (int i = 0; i < courses.size(); i++) {
        Course course = courses.get(i);
        
        qualityPoint = course.unit * course.gradeUnit;
        
        totalQualityPoint = totalQualityPoint + qualityPoint;
        totalGradeUnit = totalGradeUnit + course.gradeUnit;
        
                     
        }
        calculatedCgpa = totalQualityPoint / totalGradeUnit;  
//        System.out.println(calculatedCgpa);
        System.out.printf("\nYour GPA is: %.2f\n", calculatedCgpa);
    }
}
