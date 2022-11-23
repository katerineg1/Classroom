package classroom;
import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    ArrayList<Students> student = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Adding a student to the classroom!");

        System.out.println("Please enter students name: ");
        String name = scanner.nextLine();

        System.out.println("Please add student grade: ");
        int grade = intScanner.nextInt();

        System.out.println("Please add student course: ");
        String course = scanner.nextLine();

        Students students = new Students(name, grade, course);
        student.add(students);

        System.out.println(name + " added successfully!");
    }
    public void listStudent() {
        System.out.println("Listing all students in the classroom! ");

        for (Students students : student) {
            System.out.println("Student: " + students.name + " Grade: " + students.grade + " Course: " + students.course);
        }
    }
        public void findStudent() {
            System.out.println("Please enter student student name: ");

            String name = scanner.nextLine();

            for(Students students: student) {
                if (students.name.equals(name)) {
                    System.out.println("Name: " + students.name + "Grade: " + students.grade + "Course: " + students.course);
                    return;
                }
            }
            }

        public void removeStudent() {
            System.out.println("Please enter student name of the classroom to remove: ");

            String name = scanner.nextLine();

            for(Students students: student) {
                if (students.name.equals(name)) {
                    int index = student.indexOf(students);
                    student.remove(index);

                    System.out.println("Student removed!");
                    return;
                }
            }
            }
            public void greaterThan() {
    for(Students students: student) {
        if(students.grade > 5) {
            System.out.println("Student name: " + students.name + " Grade: " + students.grade);
        }
    }
}
public void lessThan() {
    for(Students students: student) {
        if(students.grade < 5){
            System.out.println("Student name: " + students.name + " Grade: " + students.grade);
        }
    }
}
        }




