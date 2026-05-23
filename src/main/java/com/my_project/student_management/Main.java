package com.my_project.student_management;

import com.my_project.student_management.dao.StudentDaoImplementation;
import com.my_project.student_management.model.Student;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner =
            new Scanner(System.in);

    public static void main(String[] args) {

        StudentDaoImplementation studentDaoImplementation =
                new StudentDaoImplementation();

        System.out.println("*************************Welcome************************");

        System.out.println("""
                1:Add Student
                2:Update Student
                3:Delete Student
                4:Students List
                """);

        System.out.print("Your Choice:");

        int option = scanner.nextInt();

        switch (option) {

            case 1: {

                System.out.println("Enter Details:");

                System.out.print("Id: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Marks: ");
                double marks = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("School: ");
                String school = scanner.nextLine();

                studentDaoImplementation.addStudent(
                        new Student(id, name, marks, school)
                );

                break;
            }

            case 2: {
                Student student = new Student();
                System.out.print("Enter Id: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                student.setId(id);

                System.out.print("Update Name? (y/n): ");
                String choice = scanner.nextLine();

                if(choice.equalsIgnoreCase("y")) {

                    System.out.print("Enter Name: ");
                    student.setName(scanner.nextLine());
                }

                System.out.print("Update Marks? (y/n): ");
                choice = scanner.nextLine();

                if(choice.equalsIgnoreCase("y")) {

                    System.out.print("Enter Marks: ");
                    student.setMarks(scanner.nextDouble());
                    scanner.nextLine();
                }

                System.out.print("Update School? (y/n): ");
                choice = scanner.nextLine();

                if(choice.equalsIgnoreCase("y")) {

                    System.out.print("Enter School: ");
                    student.setSchool(scanner.nextLine());
                }

                studentDaoImplementation.updateStudent(student);

                break;
            }

            case 3: {

                System.out.print("Enter Id: ");
                int id = scanner.nextInt();

                studentDaoImplementation.deleteStudent(id);

                break;
            }

            case 4: {
                System.out.println("************STUDENTS LIST*************************");
                List<Student> s = studentDaoImplementation.getStudents();
                Iterator it = s.iterator();
                while (it.hasNext()){
                    System.out.println(it.next());
                }
                break;
            }

            default:
                System.out.println("Invalid Input");
        }
    }
}