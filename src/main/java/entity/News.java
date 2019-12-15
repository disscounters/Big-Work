package entity;

import java.util.Date;



public class News {
    private String newTitle;
    private String newContext;
    private int newID;
    private Date newInsertTime;

    public News(int newID,String newTitle,String newContext,Date newInsertTime){
        this.newInsertTime=newInsertTime;
        this.newContext=newContext;
        this.newTitle=newTitle;
        this.newID=newID;
    }

    public int getNewID() {
        return newID;
    }

    public void setNewID(int newID) {
        this.newID = newID;
    }

    public Date getNewInsertTime() {
        return newInsertTime;
    }

    public void setNewInsertTime(Date newInsertTime) {
        this.newInsertTime = newInsertTime;
    }

    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle;
    }

    public String getContext() {
        return newContext;
    }

    public void setContext(String newContext) {
        this.newContext = newContext;
    }
}
