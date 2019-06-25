package in.techware.lataxi.listeners;


import in.techware.lataxi.model.FreeRideBean;
import in.techware.lataxi.model.RequestBean;

public interface RequestRideListener {

    void onLoadCompleted(RequestBean requestBean);

    void onLoadFailed(String error);
}
