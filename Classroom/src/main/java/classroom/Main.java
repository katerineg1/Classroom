package classroom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Students should have:
        //name
        //grade
        //course

        //Add students to classroom
        //View all students in classroom
        //View single student by name
        //remove student in the classroom
        //View students with grade greater than 5
        //View students with grade less than 5

  Classroom classroom = new Classroom();
  Scanner scanner = new Scanner(System.in);

  String input = "";

  do {
      System.out.println("""
              Please choose an activity:
              1.Add students to classroom
              2.View all students
              3.View students by name
              4.Remove students
              5.View students with grade greater than 5
              6.View students with grade less than 5""");

      input = scanner.nextLine();

      switch (input) {
          case "quit":
              System.out.println("Exiting application!");
              break;
          case "1":
              classroom.addStudent();
              break;
          case "2":
              classroom.listStudent();
              break;
          case "3":
              classroom.findStudent();
              break;
          case "4":
              classroom.removeStudent();
              break;
          case "5":
              classroom.greaterThan();
              break;
          case "6":
              classroom.lessThan();
              break;
      }
  }while(!input.equals("quit"));
    }

}
