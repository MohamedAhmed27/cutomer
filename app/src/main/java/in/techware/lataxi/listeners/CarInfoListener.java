package in.techware.lataxi.listeners;


import in.techware.lataxi.model.CarBean;
import in.techware.lataxi.model.UserBean;

public interface CarInfoListener {

    void onLoadFailed(String error);

    void onLoadCompleted(CarBean carBean);

}
