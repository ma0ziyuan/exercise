package com.migu.csdexercise.legacycode.chapter25.n;

public class MailChecker {
    private final MailReceiver receiver;
    private final int checkPeriodSeconds;

    public MailChecker(int checkPeriodSeconds) {
        this.receiver = new MailReceiver();
        this.checkPeriodSeconds = checkPeriodSeconds;
    }

    /*
    public MailChecker(int checkPeriodSeconds) {
        this(new MailReceiver(),checkPeriodSeconds);
    }

    public MailChecker(MailReceiver receiver,int checkPeriodSeconds) {
        this.receiver = new MailReceiver();
        this.checkPeriodSeconds = checkPeriodSeconds;
    }
    */
}
