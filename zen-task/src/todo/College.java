package todo;

public class College extends Todo {
    private String course;
    private String dueDate;

    public College() {
        super();
        this.course = "";
        this.dueDate = "";
    }

    public College(String task) {
        super(task);
        this.course = "";
        this.dueDate = "";
    }

    public College(String task, String course, String dueDate) {
        super(task);
        this.course = course;
        this.dueDate = dueDate;
    }

    public String getCourse() {
        return this.course;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String toString() {
        String status = this.getIsDone() ? "[X]" : "[ ]";
        return "[C]" + status + " " + this.getTask() + " " + this.course + " " + this.dueDate;
    }
}