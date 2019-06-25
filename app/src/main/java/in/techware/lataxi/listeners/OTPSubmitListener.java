package in.techware.lataxi.listeners;

import in.techware.lataxi.model.OTPBean;
import in.techware.lataxi.model.PromoCodeBean;



public interface OTPSubmitListener {

    void onLoadCompleted(OTPBean otpBean);

    void onLoadFailed(String error);

}
