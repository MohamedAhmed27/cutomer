package in.techware.lataxi.listeners;


import in.techware.lataxi.model.FareBean;

public interface TotalFareListener {

    void onLoadCompleted(FareBean fareBean);

    void onLoadFailed(String error);
}
