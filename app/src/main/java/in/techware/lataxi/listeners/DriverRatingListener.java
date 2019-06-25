package in.techware.lataxi.listeners;


import in.techware.lataxi.model.DriverRatingBean;

public interface DriverRatingListener {

    void onLoadCompleted(DriverRatingBean driverRatingBean);

    void onLoadFailed(String error);
}


