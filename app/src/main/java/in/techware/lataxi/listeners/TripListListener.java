package in.techware.lataxi.listeners;


import in.techware.lataxi.model.TripBean;
import in.techware.lataxi.model.TripListBean;

public abstract interface TripListListener {

    void onLoadCompleted(TripListBean tripListBean);

    void onLoadFailed(String error);

}
