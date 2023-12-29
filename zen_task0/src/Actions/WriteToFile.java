package Actions;

import Todo.ZenTask;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WriteToFile extends Action {
  @Override
  public void showInformation() {
    System.out.println("");
    System.out.println("Please enter path to file:");

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
  }

  @Override
  public void execute(String path) {
    try {
      PrintWriter pw = new PrintWriter(new FileOutputStream(path));

      List<String> lines =
          ZenTask.tasks.entrySet().stream()
              .map(entry -> entry.getValue().toString())
              .collect(Collectors.toList());

      lines.forEach(
          (line) -> {
            pw.println(line);
          });
      pw.close();
      System.out.println("task succesfully saved into file: " + path);
    } catch (FileNotFoundException e) {
      System.out.println("Path or file do not exist...");
    }
  }
}
