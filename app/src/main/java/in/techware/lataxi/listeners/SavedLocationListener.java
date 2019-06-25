package in.techware.lataxi.listeners;


import in.techware.lataxi.model.AuthBean;
import in.techware.lataxi.model.LocationBean;

public interface SavedLocationListener {

    void onLoadCompleted(LocationBean locationBean);

    void onLoadFailed(String error);

}
