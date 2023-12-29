package Actions;

import Todo.*;
import java.util.Scanner;

public class MarkDone extends Action {
  @Override
  public void showInformation() {
    System.out.println("=----------------=");
    System.out.println("= - Mark Done - =");
    System.out.println("= Mark a task as done by entering the ID =");
    System.out.println("= Type 0 to return =");
    System.out.println("=----------------=");
  }

  @Override
  public String userInput() {
    while (true) {
      System.out.println("");
      System.out.print("= Please enter correctly based on the prompt above = ");
      Scanner in = new Scanner(System.in);
      try {
        String userInput = in.nextLine();
        int id = Integer.parseInt(userInput);
        if (id != 0) {
          Task task = ZenTask.tasks.get(userInput);
          if (task != null) {
            return userInput;
          } else {
            System.out.println("ID does not exist!");
          }
        } else {
          return userInput;
        }
      } catch (Exception e) {
        System.out.print("Enter a valid ID!");
      }
    }
  }

  @Override
  public void execute(String command) {
    ZenTask.tasks.get(command).setStatus("Done");
    System.out.println("Task with the id " + command + " has been marked as done!");
  }
}
