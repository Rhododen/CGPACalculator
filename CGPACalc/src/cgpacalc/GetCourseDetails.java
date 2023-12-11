/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cgpacalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 *
 * @author PC
 */
public class GetCourseDetails {
    
    public static class Course {
        String name;
        int unit;
        int code;
        float score;
        char grade;
        int gradeUnit;
      
        // Constructor for the Course class
        public Course(String name, int code, int unit, float score) {
            this.name =  name;
            this.code =  code;
            this.score = score;
            this.unit = unit;
            this.grade = CalculateGrade.getGrade(score);
            this.gradeUnit = CalculateGrade.getGradeUnit(this.grade);
        }
    }
        public List<Course> getCourses() {
            
        
            List<Course> courses = new ArrayList<>();
            Scanner courseDetails = new Scanner(System.in);
            int numberOfCourses;
            int courseCode;
            String courseName;
            int courseUnit = 0;
            float score;
            
            
            System.out.println("Welcome User!");
            
            System.out.println("How many courses did you sit for this semester?");
            while (true) {
            try {
                numberOfCourses = courseDetails.nextInt();

                if (numberOfCourses >= 1 && numberOfCourses <= 12) {
                    break;
                } else {
                    System.out.println("Invalid number of courses. Please enter between 1 and 12 courses.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter numbers only.");
                courseDetails.next(); 
            } 
        }
            
            
            
            

        for (int i = 1; i <= numberOfCourses; i++) {

            System.out.println("Enter the course name for course" + i);
//            courseName = courseDetails.next();
              while (true) {
                  
              courseName = courseDetails.next();

                if (courseName.matches("[A-Za-z]+") && courseName.length() <= 3) {
                    break;
                } else {
                    System.out.println("Please enter a valid course name with only alphabets and length not more than 3.");
                }
            }
            
            System.out.println("Enter the course code for course" + i);
               while (true) {
                try {
                    courseCode = courseDetails.nextInt();

                    if (Integer.toString(courseCode).length() <= 3) {
                        break;
                    } else {
                        System.out.println("Please enter a valid course code with length not more than 3");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid course code that consists of numbers.");
                    courseDetails.next();
                } finally {
                    courseDetails.nextLine(); 
                }
            }
            
              System.out.println("Course Unit please? ");

                while (true) {
                    try {
                        courseUnit = courseDetails.nextInt();
                        if (courseUnit >= 1 && courseUnit <= 5) {
                            break; 
                        } else {
                            System.out.println("Please enter a course unit between 1 and 5.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("That's not valid! Please enter a number for the course unit.");
                        courseDetails.next(); 
                    }finally {
                        courseDetails.nextLine();  
                    }
                }
//                    courseDetails.nextLine(); 
              
                System.out.println("Enter your score for course " + courseName + " " + courseCode);
//            score = courseDetails.nextFloat();
            
                while (true) {
                    try {
                        score = courseDetails.nextFloat();

                        
                        if (score >= 0 && score <= 100) {
                            break; 
                        } else {
                            System.out.println("That can't be right. Please enter a score between 0 and 100.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid value for the score.");
                        courseDetails.next(); 
                    }
                }
                courseDetails.nextLine();
            
            Course course = new Course(courseName, courseCode,courseUnit, score);
            courses.add(course);
            
            if (i < numberOfCourses) {
            System.out.println("Thank you for your response. Now let's move on to the next course ");
            }
        }
        
        
        GetResult.printResult(courses);
        GetCGPA.getCgpa(courses);
        return courses;
    }
        
}
