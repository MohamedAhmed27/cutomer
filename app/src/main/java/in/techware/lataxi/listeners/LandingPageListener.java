package in.techware.lataxi.listeners;


import in.techware.lataxi.model.CarBean;
import in.techware.lataxi.model.LandingPageBean;

public interface LandingPageListener {

    void onLoadFailed(String error);

    void onLoadCompleted(LandingPageBean landingPageBean);

}
