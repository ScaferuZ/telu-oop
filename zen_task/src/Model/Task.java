package Model;

import java.time.LocalDate;

public class Task {

    private String id;
    private String title;
    private LocalDate dueDate;
    private boolean isDone;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean getStatus() {
        return isDone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(boolean isDone) {
        this.isDone = isDone;
    }

    public static Task create(String title, LocalDate dueDate, boolean isDone) {
        Task task = new Task();
        task.setTitle(title);
        task.setDueDate(dueDate);
        task.setStatus(isDone);

        return task;
    }

    @Override
    public String toString() {
        return isDone? "[x] " + title + " (" + dueDate + ")" : "[ ] " + title + " (" + dueDate + ")";
    }



}
