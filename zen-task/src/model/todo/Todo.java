package model.todo;

public abstract class Todo {
    private String task;
    private int priority;
    private boolean isDone;

    public Todo() {
        // priority 0 is the lowest, 4 is the highest
        this.priority = 0;
        this.task = "";
        this.isDone = false;
    }

    public Todo (String task) {
        this.task = task;
        this.isDone = false;
        this.priority = 0;
    }

    public String getTask() {
        return this.task;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void markAsUndone() {
        this.isDone = false;
    }

    public String toString() {
        String status = this.isDone ? "[X]" : "[ ]";
        return status + " " + this.task;
    }
}