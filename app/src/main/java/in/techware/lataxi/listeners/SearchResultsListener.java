package in.techware.lataxi.listeners;


import in.techware.lataxi.model.SearchResultsBean;

public interface SearchResultsListener {

    void onLoadCompleted(SearchResultsBean searchResultsBean);

    void onLoadFailed(String webErrorMsg);
}
