package in.techware.lataxi.listeners;


import in.techware.lataxi.model.DriverBean;

public interface DriverDetailsListener {

    void onLoadCompleted(DriverBean driverBean);

    void onLoadFailed(String error);
}
