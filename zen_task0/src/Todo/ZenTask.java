package Todo;

import Actions.*;
import java.util.*;

public class ZenTask {
  public static Map<String, Task> tasks = new LinkedHashMap<>();
  public static boolean isRunning = true;

  public void showOptions() {
    System.out.println("= 1. Add Task =");
    System.out.println("= 2. Display Tasks =");
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
        System.out.println("Input must be a number!");
      }
    }
  }

  public void executeAction(int option) {
    switch (option) {
      case 1:
        AddTask addTask = new AddTask();
        addTask.showInformation();
        String command= addTask.userInput();
        if (!command.equals("0")) {
          addTask.execute(command);
        }
        break;
      case 2:
        if (tasks.size() > 0) {
          DisplayTasks displayTasks = new DisplayTasks();
          displayTasks.showInformation();
          displayTasks.execute(null);
        } else {
          System.out.println("No task found! Please enter a task!");
        }
    }
  }

  public void start() {
    // TODO: Add welcome message
    while (isRunning) {
      System.out.println("=----------------=");
      System.out.println("= Welcome to ZenTask =");
      System.out.println("");
      showOptions();
      int option = readInput();
      executeAction(option);
    }
  }
}
