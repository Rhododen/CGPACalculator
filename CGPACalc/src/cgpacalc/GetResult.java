/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cgpacalc;

import java.util.List;
import cgpacalc.CGPACalc;
import cgpacalc.GetCourseDetails.Course;

/**
 *
 * @author PC
 */
public class GetResult {
    
    public static void printResult(List<Course> courses) {
        
        System.out.println("\nPlease see your result below\n");
        
        System.out.println("----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE             | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|---------------------------|-----------------------|------------|---------------------|");

        for (int i = 0; i < courses.size(); i++) {
            
        Course course = courses.get(i);
        
        System.out.printf("| %-26s | %-21d | %-10s | %-19d |\n", 
                    course.name + " " + course.code, course.unit, course.grade, course.gradeUnit);
//            System.out.println("Course: " + course.name);
//            System.out.println("Score: " + course.score);
//            System.out.println("Grade: " + course.grade);
//            System.out.println("Grade Unit: " + course.gradeUnit);
//            System.out.println("--------------");
        }
        System.out.println("|---------------------------------------------------------------------------------------|");
    }
}
