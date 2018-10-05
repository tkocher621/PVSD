package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Student winston = new Student("Winston", 7.44);
        Student sean = new Student("Sean", 3.43);
        Student jake = new Student("Jake", 4.45);
        Student felipe = new Student("Felipe", 3.22);
        Student brian = new Student("Brian", 3.85);

        Vector<Student> Students = new Vector<>();
        Students.add(winston);
        Students.add(sean);
        Students.add(jake);
        Students.add(felipe);
        Students.add(brian);

        Vector<Student> TopStudents = new Vector<>();

        for (int i = 0; i < 3; i++)
        {
            double highestGPA = 0.0;
            Student highestStudent = null;

            for (int a = 0; a < Students.size(); a++)
            {
                if (Students.get(a).GPA > highestGPA)
                {
                    highestGPA = Students.get(a).GPA;
                    highestStudent = Students.get(a);
                }
            }

            TopStudents.add(highestStudent);
            Students.remove(highestStudent);
        }

        for (Student hs : TopStudents)
        {
            System.out.println(hs.name + " | " + hs.GPA);
        }

    }
}
