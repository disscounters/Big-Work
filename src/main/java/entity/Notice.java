package entity;

import java.util.Date;

public class Notice {
    private String noticeTitle;
    private String noticeContext;
    private int noticeID;
    private Date  noticeInsertTime;

    public Notice(int noticeID,String noticeTitle,String noticeContext,Date noticeInsertTime) {
        this.noticeID=noticeID;
        this.noticeTitle = noticeTitle;
        this.noticeContext=noticeContext;
        this.noticeInsertTime = noticeInsertTime;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContext() {
        return noticeContext;
    }

    public void setNoticeContext(String noticeContext) {
        this.noticeContext = noticeContext;
    }

    public int getNoticeID() {
        return noticeID;
    }

    public void setNoticeID(int noticeID) {
        this.noticeID = noticeID;
    }

    public Date getNoticeInsertTime() {
        return noticeInsertTime;
    }

    public void setNoticeInsertTime(Date noticeInsertTime) {
        this.noticeInsertTime = noticeInsertTime;
    }
}
