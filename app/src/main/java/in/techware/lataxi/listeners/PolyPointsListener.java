package in.techware.lataxi.listeners;


import in.techware.lataxi.model.PolyPointsBean;

public interface PolyPointsListener {

    void onLoadFailed(String error);

    void onLoadCompleted(PolyPointsBean polyPointsBean);
}
