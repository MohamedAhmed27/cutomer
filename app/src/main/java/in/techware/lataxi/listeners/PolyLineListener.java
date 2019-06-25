package in.techware.lataxi.listeners;


import in.techware.lataxi.model.CarBean;
import in.techware.lataxi.model.PlaceBean;

public interface PolyLineListener {

    void onLoadFailed(String error);

    void onLoadCompleted(PlaceBean placeBean);
}
