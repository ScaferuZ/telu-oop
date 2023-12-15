package todo;

public class Life extends Todo{
    private String dueDate;

    public Life() {
        super();
        this.dueDate = "";
    }

    public Life(String task) {
        super(task);
        this.dueDate = "";
    }

    public Life(String task, String dueDate) {
        super(task);
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String toString() {
        String status = this.getIsDone() ? "[X]" : "[ ]";
        return "[L]" + status + " " + this.getTask() + " " + this.dueDate;
    }
}