package in.techware.lataxi.listeners;


import in.techware.lataxi.model.CarBean;
import in.techware.lataxi.model.DriverBean;

public interface AppStatusListener {

    void onLoadFailed(String error);

    void onLoadCompleted(DriverBean driverBean);

}
