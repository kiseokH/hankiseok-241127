package com.human.notice.vo;

import java.util.Date;

public class NoticeVO {
    private int nIdx;
    private String nCategory;
    private String nTitle;
    private String nContent;
    private Date nRegdate;
    private Date nUpdate;
    private String nStatus;

    // 기본 생성자
    public NoticeVO() {
    }

    // 생성자
    public NoticeVO(int nIdx, String nCategory, String nTitle, String nContent, Date nRegdate, Date nUpdate, String nStatus) {
        this.nIdx = nIdx;
        this.nCategory = nCategory;
        this.nTitle = nTitle;
        this.nContent = nContent;
        this.nRegdate = nRegdate;
        this.nUpdate = nUpdate;
        this.nStatus = nStatus;
    }
    public int getNIdx() {
        return nIdx;
    }

    public void setNIdx(int nIdx) {
        this.nIdx = nIdx;
    }

    public String getNCategory() {
        return nCategory;
    }

    public void setNCategory(String nCategory) {
        this.nCategory = nCategory;
    }

    public String getNTitle() {
        return nTitle;
    }

    public void setNTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public String getNContent() {
        return nContent;
    }

    public void setNContent(String nContent) {
        this.nContent = nContent;
    }

    public Date getNRegdate() {
        return nRegdate;
    }

    public void setNRegdate(Date nRegdate) {
        this.nRegdate = nRegdate;
    }

    public Date getNUpdate() {
        return nUpdate;
    }

    public void setNUpdate(Date nUpdate) {
        this.nUpdate = nUpdate;
    }

    public String getNStatus() {
        return nStatus;
    }

    public void setNStatus(String nStatus) {
        this.nStatus = nStatus;
    }


    @Override
    public String toString() {
        return "NoticeVO{" +
                "nIdx=" + nIdx +
                ", nCategory='" + nCategory + '\'' +
                ", nTitle='" + nTitle + '\'' +
                ", nContent='" + nContent + '\'' +
                ", nRegdate=" + nRegdate +
                ", nUpdate=" + nUpdate +
                ", nStatus='" + nStatus + '\'' +
                '}';
    }
}
