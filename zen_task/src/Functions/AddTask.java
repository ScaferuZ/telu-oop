package Functions;

import Model.Task;

import java.util.Scanner;

public class AddTask extends Functions {

    @Override
    public void functionInformation() {
        System.out.println("--------------------");
        System.out.println("Add a new task");
        System.out.println("--------------------");
        System.out.println("Enter 0 to cancel");
    }

    @Override 
        public String readUserInput(){
            while (true) {
                System.out.println("--------------------");
                System.out.println("Enter task detail (id, title, dueDate, isDone?):");
                Scanner scanner = new Scanner(System.in);
                String detail = scanner.nextLine();

                if (!detail.equals("0")) {
                    String[] parts = detail.split(",");
                    if (parts.length == 4 ) {
                        if (TodoList) {
                            return detail;
                        } else {
                            System.out.println("Task with id " + parts[0] + " already exists");
                        }
                    }
                }
            }

        }


}