package in.techware.lataxi.listeners;


import in.techware.lataxi.model.LandingPageBean;
import in.techware.lataxi.model.TripListBean;

public interface LandingPageDetailsListener {

    void onLoadCompleted(LandingPageBean landingPageListBean);

    void onLoadFailed(String error);
}
