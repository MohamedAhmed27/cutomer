package in.techware.lataxi.listeners;


import in.techware.lataxi.model.AuthBean;

public interface LoginListener {

    void onLoadCompleted(AuthBean authBean);

    void onLoadFailed(String error);
}
