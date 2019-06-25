package in.techware.lataxi.listeners;

import in.techware.lataxi.model.CarBean;
import in.techware.lataxi.model.TripFeedbackBean;

/**
 * Created by SIB-QC4 on 4/12/2017.
 */

public interface TripFeedbackListener {

    void onLoadFailed(String error);

    void onLoadCompleted(TripFeedbackBean tripFeedbackBean);
}
