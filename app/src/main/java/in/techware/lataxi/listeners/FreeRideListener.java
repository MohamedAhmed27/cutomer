package in.techware.lataxi.listeners;


import in.techware.lataxi.model.FreeRideBean;

public interface FreeRideListener {

    void onLoadCompleted(FreeRideBean freeRideBean);

    void onLoadFailed(String error);

}
