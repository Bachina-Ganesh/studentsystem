package com.ganesh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.ganesh.dto.*;
import com.ganesh.filehandlers.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        String outputFilePath = "./src/main/java/resources/student_data.json";

        Address address1 = new Address("padamati", "panguluru", "bapatla", "ap", 523261);
        Address address2 = new Address("lakshmipuram", "guntur", "guntur", "ap", 52908);

        Course course1 = new Course(1, "Java", 4.5, 1000);
        Course course2 = new Course(2, "Python", 4, 500);
        Course course3 = new Course(3, "Sql", 4.9, 200);

        Student student1 = new Student(100, "Ganesh", address1, new ArrayList<>(Arrays.asList(course1, course3)));

        Student student2 = new Student(101, "Suresh", address2, new ArrayList<>(Arrays.asList(course2, course3)));

        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2));

        WriteFile.writeFile(students, outputFilePath);

        String inputFilePath = "./src/main/java/resources/student_input.json";

        List<Student> readStudents = ReadFile.readStudentData(inputFilePath);
        displayDetails(readStudents);
    }

    public static void displayDetails(List<Student> students) {
        for(Student student: students) {
            System.out.println("Student Details");
            System.out.println("---------------------------");
            System.out.println(student);
            System.out.println("Address Details");
            System.out.println("-----------------------------");
            System.out.println(student.getAddress());
            System.out.println("Course Details");
            System.out.println("-------------------------------");
            for(Course course: student.getCourses())
                System.out.println(course);
            System.out.println("==============================================");
        }
    }
}
