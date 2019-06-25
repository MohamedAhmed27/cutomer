package in.techware.lataxi.listeners;


import in.techware.lataxi.model.PromoCodeBean;
import in.techware.lataxi.model.UserBean;

public interface PromoCodeListener {

    void onLoadCompleted(PromoCodeBean promoCodeBean);

    void onLoadFailed(String error);

}
