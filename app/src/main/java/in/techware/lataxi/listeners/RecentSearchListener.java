package in.techware.lataxi.listeners;

import in.techware.lataxi.model.RecentSearchBean;

public interface RecentSearchListener {

    void onLoadCompleted(RecentSearchBean recentSearchBean);

    void onLoadFailed(String webErrorMsg);
}
