package Todo;

import Actions.*;
import java.util.*;

public class ZenTask {
  public static Map<String, Task> tasks = new LinkedHashMap<>();
  public static boolean isRunning = true;

  public void showOptions() {
    System.out.println("= 1. Add Task =");
  }

  public int readInput() {
    List<Integer> validInputs = Arrays.asList(1, 2, 3, 4, 5);
    while (true) {
      try {
        System.out.print("Enter your choice: ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        if (validInputs.contains(option)) {
          // System.out.println("test");
          return option;
        } else {
          System.out.println("Please choose the correct option!");
        }

      } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Input mustb be a number!");
      }
    }
  }

  public void executeAction(int option) {
    switch (option) {
      case 1:
        AddTask addTask = new AddTask();
        addTask.showInformation();
        String taskName = addTask.userInput();
        if (!taskName.equals("0")) {
          addTask.execute(taskName);
        }
        break;
    }
  }

  public void start() {
    // TODO: Add welcome message
    while (isRunning) {
      showOptions();
      int option = readInput();
      executeAction(option);
    }
  }
}
