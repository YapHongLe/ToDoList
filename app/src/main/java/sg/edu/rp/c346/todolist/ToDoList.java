package sg.edu.rp.c346.todolist;

import java.util.Calendar;

public class ToDoList {

    private String title;
    private String date;

    public ToDoList(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
