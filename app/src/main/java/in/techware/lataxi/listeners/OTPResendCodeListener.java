package in.techware.lataxi.listeners;

import in.techware.lataxi.model.AuthBean;
import in.techware.lataxi.model.BasicBean;

public interface OTPResendCodeListener {

    void onLoadCompleted(BasicBean basicBean);

    void onLoadFailed(String error);
}
