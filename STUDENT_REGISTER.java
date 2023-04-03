

// Student.java
public class Student {
  private String name;
  private String dob;
  private String address;
  private String gender;

  // Constructor
  public Student(String name, String dob, String address, String gender) {
    this.name = name;
    this.dob = dob;
    this.address = address;
    this.gender = gender;
  }

  // Getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

}

// StudentRegister.java
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegister {

  // A list of students
  private ArrayList<Student> students;

  // A scanner for user input
  private Scanner scanner;

  // Constructor
  public StudentRegister() {
    students = new ArrayList<>();
    scanner = new Scanner(System.in);
  }

  // A method to add a student to the list
  public void addStudent() {
    System.out.println("Enter the name of the student:");
    String name = scanner.nextLine();
    System.out.println("Enter the date of birth of the student (dd/mm/yyyy):");
    String dob = scanner.nextLine();
    System.out.println("Enter the address of the student:");
    String address = scanner.nextLine();
    System.out.println("Enter the gender of the student (M/F):");
    String gender = scanner.nextLine();
    
    // Create a new student object with the given details
    Student student = new Student(name, dob, address, gender);

    // Add the student to the list
    students.add(student);

    // Print a confirmation message
    System.out.println("Student added successfully!");
    
  

// A method to delete a student from the list by name
public void deleteStudent() {
  
   System.out.println("Enter the name of the student to delete:");
   String name = scanner.nextLine();

   // Find the index of the student with the given name in the list
   int index = -1; // -1 means not found
   for (int i = 0; i < students.size(); i++) {
     if (students.get(i).getName().equals(name)) {
       index = i; // found the student at position i
       break; // exit the loop
     }
   }

   // If the index is not -1, remove the student from the list and print a confirmation message
   if (index != -1) {
     students.remove(index);
     System.out.println("Student deleted successfully!");
   } else { // Otherwise, print an error message
     System.out.println("Student not found!");
   }
}

// A method to search for a student by name and print their details
public void searchStudent() {

   System.out.println("Enter the name of the student to search:");
   String name = scanner.nextLine();

   // Find the student with the given name in the list and print their details if found
   boolean found = false; // flag to indicate if the student is found or not
   for (Student s : students) { // loop through each student in the list
     if (s.getName().equals(name)) { // if the names match, print their details and set found to true
       System.out.println("Name: " + s.getName());
       System.out.println("Date of birth: " + s.getDob());
       System.out.println("Address: " + s

Source: Conversation with Bing, 22/03/2023(1) Java Enrollment register - Stack Overflow. https://stackoverflow.com/questions/29724079/java-enrollment-register Accessed 22/03/2023.
(2) student-registration · GitHub Topics · GitHub. https://github.com/topics/student-registration Accessed 22/03/2023.
(3) Implementing Student Record Java program - Code Review Stack Exchange. https://codereview.stackexchange.com/questions/63543/implementing-student-record-java-program Accessed 22/03/2023.