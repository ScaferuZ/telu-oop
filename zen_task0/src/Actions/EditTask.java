package Actions;

import Todo.*;
import java.util.Scanner;

public class EditTask extends Action {
  @Override
  public void showInformation() {
    System.out.println("=----------------=");
    System.out.println("= - Edit Task - =");
    System.out.println("= Edit the task you wanted by entering the new value =");
    System.out.println("= If you dont want to edit a specific value, please type - =");
    System.out.println(
        "= ID (of soon to be edited task)|Title|Tags|Description|Status|Project =");
    System.out.println("= Type 0 to return =");
    System.out.println("=----------------=");
  }

  @Override
  public String userInput() {
    while (true) {
      System.out.println("");
      System.out.println("= Please enter correctly based on the prompt above =");
      Scanner in = new Scanner(System.in);
      String userInput = in.nextLine();
      userInput = userInput.strip();

      if (!userInput.equals("0")) {
        String[] parts = userInput.split("\\|");
        if (parts.length == 6) {
          if (ZenTask.tasks.get(parts[0]) != null) {
            return userInput;
          } else {
            System.out.println("ID does not exist!");
          }
        } else {
          System.out.println("Please make sure you entered the task correctly!");
        }
      } else {
        return userInput;
      }
    }
  }

  @Override
  public void execute(String command) {
    String[] parts = command.split("\\|");
    boolean isEdited = false;
    if (!parts[1].equals("-")) {
      ZenTask.tasks.get(parts[0]).setTitle(parts[1]);
      isEdited = true;
    }

    if (!parts[2].equals("-")) {
      ZenTask.tasks.get(parts[0]).setTags(parts[2]);
      isEdited = true;
    }

    if (!parts[3].equals("-")) {
      ZenTask.tasks.get(parts[0]).setDescription(parts[3]);
      isEdited = true;
    }

    if (!parts[4].equals("-")) {
      ZenTask.tasks.get(parts[0]).setStatus(parts[4]);
      isEdited = true;
    }

    if (!parts[5].equals("-")) {
      ZenTask.tasks.get(parts[0]).setProjectName(parts[5]);
      isEdited = true;
    }

    if (isEdited) {
      System.out.println("Task has been edited!");
    } else {
      System.out.println("No changes has been made!");
    }
  }
}
