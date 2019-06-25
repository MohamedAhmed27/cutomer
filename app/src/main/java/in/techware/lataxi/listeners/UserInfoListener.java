package in.techware.lataxi.listeners;


import in.techware.lataxi.model.AuthBean;
import in.techware.lataxi.model.UserBean;

public interface UserInfoListener {

    void onLoadCompleted(UserBean userBean);

    void onLoadFailed(String error);

}
