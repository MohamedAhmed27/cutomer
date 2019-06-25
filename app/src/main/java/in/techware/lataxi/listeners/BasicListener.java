package in.techware.lataxi.listeners;

import in.techware.lataxi.model.BaseBean;
import in.techware.lataxi.model.BasicBean;

public interface BasicListener {

    void onLoadCompleted(BasicBean basicBean);

    void onLoadFailed(String error);

}
