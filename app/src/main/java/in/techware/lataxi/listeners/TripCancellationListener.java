package in.techware.lataxi.listeners;

import in.techware.lataxi.model.RequestBean;
import in.techware.lataxi.model.TripCancellationBean;

public interface TripCancellationListener {

    void onLoadCompleted(TripCancellationBean tripCancellationBean);

    void onLoadFailed(String error);
}
