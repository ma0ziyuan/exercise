package com.migu.csdexercise.legacycode.chapter25.u;

import java.util.Date;

public class Message {
    public enum RecipientType {TO,BCC};
    private Date sentDate;
    private String subject;

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
