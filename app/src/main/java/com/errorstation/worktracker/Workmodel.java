package com.errorstation.worktracker;

/**
 * Created by Rubayet on 20-Oct-16.
 */

public class Workmodel {
    String workTitle,workDetails,date;

    public String getWorkTitle() {
        return workTitle;
    }

    public Workmodel() {
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public String getWorkDetails() {
        return workDetails;
    }

    public void setWorkDetails(String workDetails) {
        this.workDetails = workDetails;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Workmodel(String workTitle, String workDetails, String date) {

        this.workTitle = workTitle;
        this.workDetails = workDetails;
        this.date = date;
    }
}
