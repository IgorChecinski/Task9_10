package weatherApp;

import java.util.Date;

public class Report {
    private String title;
    private String bugDescription;
    private Date date;


    public Report(String title, String bugDescription, Date date) {
        this.title = title;
        this.bugDescription = bugDescription;
        this.date = date;
    }

    public void reportBug() {
        // Implementation for reporting a bug
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        this.bugDescription = bugDescription;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}