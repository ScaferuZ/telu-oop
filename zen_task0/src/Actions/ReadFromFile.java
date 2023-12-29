package Actions;

import Todo.Task;
import Todo.ZenTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile extends Action {
  @Override
  public void showInformation() {
    System.out.println("");
    System.out.println("Please enter path to read:");
    System.out.println("");
    System.out.println("Enter 0 to RETURN");
  }

  @Override
  public String userInput() {
    while (true) {
      System.out.println("");
      System.out.print("path:");

      Scanner in = new Scanner(System.in);
      String userInput = in.nextLine();

      return userInput;
    }
    in.close();
  }

  @Override
  public void execute(String path) {
    try {
      Scanner scanner = new Scanner(new File(path));
      while (scanner.hasNextLine()) {
        String file = scanner.nextLine();
        String[] parts = file.split(",");
        Task task = Task.buildTask(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
        if (ZenTask.tasks.get(parts[0]) != null) {
          ZenTask.tasks.replace(parts[0], task);
        } else {
          ZenTask.tasks.put(parts[0], task);
        }
      }
      scanner.close();
      System.out.println("Data are being used!");
    } catch (FileNotFoundException e) {
      System.out.println("Path or file do not exist...");
    }
  }
}
