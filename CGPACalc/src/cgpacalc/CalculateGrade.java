/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cgpacalc;

/**
 *
 * @author PC
 */
public class CalculateGrade {
    
    public static char getGrade( float score) {
        char grade;
        
        
        if (score >= 70 && score <= 100) {
                return 'A';
            }
            else if (score >= 60 && score <= 69) {
                grade = 'B';
            }
            else if (score >= 50 && score <= 59) {
                grade = 'C';
            }
            else if (score >= 45 && score <= 49) {
                grade = 'D';
            }
            else if (score >= 40 && score <= 44) {
                grade = 'E';
            }
            else {
                grade = 'F';
            }
        
        return grade;
    }
        
    public static int getGradeUnit(char grade) {
        int gradeUnit = 0;
        
        if (grade == 'A') {
            gradeUnit = 5;
        }
        else if (grade == 'B') {
            gradeUnit = 4;
        }
        else if (grade == 'C') {
            gradeUnit = 3;
        }
        else if (grade == 'D') {
            gradeUnit = 2;
        }
        else if (grade == 'E') {
            gradeUnit = 1;
        }
        if (grade == 'F') {
            gradeUnit = 0;
        }
        
        return gradeUnit;
        
    }
    
}
