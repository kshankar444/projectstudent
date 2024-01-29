import java.time.*;
import java.util.Scanner;
class Student
{
    public void stud_name()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name");
        String name = sc.nextLine();
        System.out.println("Student name = "+name);
    }
    public void stud_age(LocalDate dob)
    {
        LocalDate today=LocalDate.now();
        int year=Period.between(dob,today).getYears();
        System.out.println("Current date is "+today);
        System.out.println("Student birthdate is "+dob);
        System.out.println("Student age is = "+year);
    }
}
class student_details
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.stud_name();
        LocalDate dob = LocalDate.of(2003, 8, 10);
        s.stud_age(dob);
    }
}
