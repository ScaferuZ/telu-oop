package Model;

import Functions.Functions;
import java.util.*;

public class TodoList {
  // HashMap is used to store the tasks, same as dictionary
  public static Map<String, Task> tasks = new LinkedHashMap();
  public static boolean isRunning = true;

  public void start() {
    while (TodoList.isRunning) {}
  }

  public void executeAction(int actionNumber) {
    Functions function;
    switch (actionNumber) {
      case function.ADD_TASK:
        function = new Functions();
        function.functionInformation();
        String command = function.readUserInput();
        if (!comand.equals("0")) {
          function.execute(command);
        }
        break;
    }
  }
}
