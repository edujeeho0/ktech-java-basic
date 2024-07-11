package project;

import java.time.LocalDate;

public class Todo {
    private String title;
    private LocalDate dueDate;
    private boolean completed;

    public Todo(String title, LocalDate dueDate) {
        this(title, dueDate, false);
    }

    public Todo(String title, LocalDate dueDate, boolean completed) {
        this.title = title;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", dueDate=" + dueDate +
                ", completed=" + completed +
                '}';
    }

    public String toCsvRow() {
        return String.format("%s,%s,%s", title, dueDate, completed);
    }
}
