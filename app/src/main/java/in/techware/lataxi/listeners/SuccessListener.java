package in.techware.lataxi.listeners;


import in.techware.lataxi.model.SuccessBean;

public interface SuccessListener {

    void onLoadCompleted(SuccessBean successBean);

    void onLoadFailed(String error);
}
