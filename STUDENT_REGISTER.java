
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.println("Welcome to the Student Register!");

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Add Student");
            System.out.println("2. View Student List");
            System.out.println("3. Delete Student by Name");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");

            int choice = input.nextInt();
            input.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter student name:");
                    String name = input.nextLine();

                    System.out.println("Enter student ID:");
                    String id = input.nextLine();

                    System.out.println("Enter student major:");
                    String major = input.nextLine();

                    Student student = new Student(name, id, major);
                    studentList.add(student);

                    System.out.println("Student added successfully.");
                    System.out.println(" ");
                    break; 



