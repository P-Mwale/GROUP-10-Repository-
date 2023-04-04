
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
                case 2:
                    System.out.println("Student List:");

                    for (Student s : studentList) {
                        System.out.println("Name: " + s.getName() + ", ID: " + s.getId() + ", Major: " + s.getMajor());
                    }
                    break;
                case 3:
                    System.out.println("Enter student name to delete:");
                    String nameToDelete = input.nextLine();
                    if (deleteStudentByName(studentList, nameToDelete)) {
                        System.out.println("Student " + nameToDelete + " deleted successfully.");
                    } else {
                        System.out.println("Student " + nameToDelete + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter student ID to delete:");
                    String idToDelete = input.nextLine();
                    if (deleteStudentById(studentList, idToDelete)) {
                        System.out.println("Student with ID " + idToDelete + " deleted successfully.");
                    } else {
                        System.out.println("Student with ID " + idToDelete + " not found.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Student Register!");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
                }
        }
 }
     public static boolean deleteStudentByName(ArrayList<Student> studentList, String name) {
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                studentList.remove(s);
                return true;
            }
        }
        return false;
    }

    public static boolean deleteStudentById(ArrayList<Student> studentList, String id) {
        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                studentList.remove(s);
                return true;
            }
        }
        return false;
    }



