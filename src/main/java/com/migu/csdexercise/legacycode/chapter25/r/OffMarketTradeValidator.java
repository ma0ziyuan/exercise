package com.migu.csdexercise.legacycode.chapter25.r;

import java.util.Date;

public abstract class OffMarketTradeValidator extends TradeValidator {
    protected static final String  MB_ABORTRETRYIGNORE = "";
    protected static final int IDRETRY = 1;
    protected static final int IDABORT = 2;
    protected Trade trade;
    protected boolean flag;

    public OffMarketTradeValidator(Trade trade) {
        this.trade = trade;
        this.flag = false;
    }

    abstract void showMessage();
    /*void showMessage() {
        int status = AfxMessageBox(makeMessage(), MB_ABORTRETRYIGNORE);
        if (status == IDRETRY) {
            SubmitDialog dlg = new SubmitDialog(this, "Press okey if this is a valid trade");
            dlg.DoModal();
            if (dlg.wasSubmitted()) {
                //g_dispatcher.undoLastSubmission();
                flag = true;
            }
        } else if (status == IDABORT) {
            flag = false;
        }
    }*/

    boolean isValid() {
        if (inRange(trade.getDate()) && validDestination(trade.destination) && inHours(trade)) {
            flag = true;
        }
        showMessage();
        return flag;

    }

    protected int AfxMessageBox(String message, String buttons) {
        return 1;
    }

    protected String makeMessage() {
        return "";
    }

    private boolean inHours(Trade trade) {
        return true;
    }

    private boolean validDestination(String destination) {
        return true;
    }

    private boolean inRange(Date date) {
        return true;
    }
}
