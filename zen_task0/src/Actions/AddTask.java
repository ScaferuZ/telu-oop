package Actions;

import Todo.*;
import java.util.Scanner;

public class AddTask extends Action {
  @Override
  public void showInformation() {
    System.out.println("=----------------=");
    System.out.println("= - Add New Task - =");
    System.out.println("= Please add your new task with the format below separated by | =");
    System.out.println("= ID | Name | Description | Status | Project =");
    System.out.println("= Type 0 to add new task =");
    System.out.println("=----------------=");
  }

  @Override
  public String userInput() {
    while (true) {
      System.out.println("=----------------=");
      System.out.println("= Please enter your new task =");
      Scanner in = new Scanner(System.in);
      String userInput = in.nextLine();

      if (!userInput.equals("0")) {
        String[] parts = userInput.split("\\|");
        if (parts.length == 5) {
          if (ZenTask.tasks.get(parts[0]) == null) {
            return userInput;
          } else {
            System.out.print("Taks with the ID entered is already exist!");
          }
        } else {
          System.out.print("Please make sure you entered the task correctly!");
        }
      } else {
        return userInput;
      }
    }
  }

  @Override
  public void execute(String command){
    String[] parts = command.split("\\|");
    Task task = Task.buildTask(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
    ZenTask.tasks.put(parts[0], task);
    System.out.println("Task successfully added!");
      
  }
}
