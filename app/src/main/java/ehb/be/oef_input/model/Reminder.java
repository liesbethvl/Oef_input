package ehb.be.oef_input.model;

import java.io.Serializable;
import java.util.Calendar;

public class Reminder implements Serializable {

    private String title, description, importance;
    private Calendar date;

    public Reminder() {
    }

    public Reminder(String title, String description, String importance, Calendar date) {
        this.title = title;
        this.description = description;
        this.importance = importance;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
