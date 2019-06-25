package in.techware.lataxi.listeners;


import in.techware.lataxi.model.LocationBean;

public interface LocationSaveListener {

    void onLoadCompleted(LocationBean locationBean);

    void onLoadFailed(String error);
}


