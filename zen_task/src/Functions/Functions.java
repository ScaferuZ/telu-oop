package Functions;

public abstract class Functions {

    public static final int ADD_TASK = 1;
    public static final int EDIT_TASK = 2;
    public static final int DELETE_TASK = 3;
    public static final int MARK_TASK_AS_DONE = 4;
    public static final int LIST_TASKS = 5;
    public static final int EXIT = 6;

    public abstract void functionInformation();

    public abstract String readUserInput();

    public abstract void execute(String command);
}
