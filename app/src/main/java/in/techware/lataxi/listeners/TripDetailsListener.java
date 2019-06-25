package in.techware.lataxi.listeners;


import in.techware.lataxi.model.TripDetailsBean;

public interface TripDetailsListener {

    void onLoadCompleted(TripDetailsBean tripDetailsBean);

    void onLoadFailed(String error);
}
