package in.techware.lataxi.listeners;


import in.techware.lataxi.model.RequestBean;

public interface RequestStatusListener {

    void onLoadCompleted(RequestBean requestBean);

    void onLoadFailed(String error);
}
