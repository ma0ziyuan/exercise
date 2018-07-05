package com.migu.csdexercise.legacycode.chapter25.r;

public class WindowsOffMarketTradeValidator extends OffMarketTradeValidator {
    public WindowsOffMarketTradeValidator(Trade trade) {
        super(trade);
    }

    void showMessage() {
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
    }
}
