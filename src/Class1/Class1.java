package Class1;

import java.util.Scanner;

class Student
{
    String name; // default value always null
    int totalMarks; // default value 0
    int  rollNo;    // default value 0
    boolean pwd; // default false
    double percentage; // default 0.0
}


public class Class1 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Default values ");
        System.out.println(student.name);
        System.out.println(student.totalMarks);
        System.out.println(student.rollNo);
        System.out.println(student.pwd);
        System.out.println(student.percentage);
       // int aniket; // local variables are not set by default
        // System.out.println(aniket); // Error


        System.out.println("Let's set the values ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        student.name = name;

        int rollNo = scanner.nextInt();
        student.rollNo  = rollNo;

        int totalMarks = scanner.nextInt();

        student.totalMarks = totalMarks;

        boolean pwd = scanner.nextBoolean();
        student.pwd = pwd;

        double percentage = scanner.nextDouble();
        student.percentage = percentage;


        System.out.println(student.name);
        System.out.println(student.totalMarks);
        System.out.println(student.rollNo);
        System.out.println(student.pwd);
        System.out.println(student.percentage);


    }
}
