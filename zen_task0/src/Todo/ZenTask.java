package Todo;

import Actions.*;
import java.util.*;

public class ZenTask {
  public static Map<String, Task> tasks = new LinkedHashMap<>();
  public static boolean isRunning = true;

  public void showOptions() {
    System.out.println("= 1. Add Task =");
    System.out.println("= 2. Display Tasks =");
    System.out.println("= 3. Edit Task =");
    System.out.println("= 4. Mark Task as Done =");
    System.out.println("= 5. Remove =");
    System.out.println("= 6. Save =");
    System.out.println("= 7. Read =");
    System.out.println("= 8. Exit =");
  }

  public int readInput() {
    List<Integer> validInputs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
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
        String command = addTask.userInput();
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
        break;
      case 3:
        if (tasks.size() > 0) {
          EditTask editTask = new EditTask();
          editTask.showInformation();
          String edit = editTask.userInput();
          if (!edit.equals("0")) {
            editTask.execute(edit);
          }
        } else {
          System.out.println("No task found! Please enter a task!");
        }
        break;
      case 4:
        if (tasks.size() > 0) {
          MarkDone markDone = new MarkDone();
          markDone.showInformation();
          String mark = markDone.userInput();
          if (!mark.equals("0")) {
            markDone.execute(mark);
          }
        } else {
          System.out.println("No task found! Please enter a task!");
        }
        break;
      case 5:
        if (tasks.size() > 0) {
          RemoveTask removeTask = new RemoveTask();
          removeTask.showInformation();
          String remove = removeTask.userInput();
          if (!remove.equals("0")) {
            removeTask.execute(remove);
          }
        } else {
          System.out.println("No task found! Please enter a task!");
        }
        break;
      case 6:
        if (tasks.size() > 0) {
          WriteToFile saveTask = new WriteToFile();
          saveTask.showInformation();
          String save = saveTask.userInput();
          if (!save.equals("0")) {
            saveTask.execute(save);
          }
        } else {
          System.out.println("No task found! Please enter a task!");
        }
        break;
      case 7:
        if (tasks.size() > 0) {
          ReadFromFile readTask = new ReadFromFile();
          readTask.showInformation();
          String read = readTask.userInput();
          if (!read.equals("0")) {
            readTask.execute(read);
          }
        } else {
          System.out.println("No task found! Please enter a task!");
        }
        break;
      case 8:
        isRunning = false;
        break;
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
    System.out.println("=----------------=");
    System.out.println("= Thank you for using ZenTask =");
  }
}
