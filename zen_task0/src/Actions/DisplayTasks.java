package Actions;

import Todo.*;

public class DisplayTasks extends Action {
  @Override
  public void showInformation() {
    System.out.println("=----------------=");
    System.out.println("= - Display Tasks - =");
    System.out.println("=----------------=");
  }

  @Override 
  public String userInput() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void execute(String command) {
    ZenTask.tasks.forEach((key, value) -> {
      System.out.println("ID: " + key);
      System.out.println("Title: " + value.getTitle());
      System.out.println("Tags: " + value.getTags());
      System.out.println("Description: " + value.getDescription());
      System.out.println("Status: " + value.getStatus());
      System.out.println("Project: " + value.getProjectName());
      System.out.println("");
    });
  }
}
