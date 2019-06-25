package in.techware.lataxi.net.WSAsyncTasks;


import android.os.AsyncTask;

import java.util.HashMap;

import in.techware.lataxi.model.FareBean;
import in.techware.lataxi.net.invokers.TotalFareInvoker;

public class TotalFareTask extends AsyncTask<String, Integer, FareBean> {

    private TotalFareTask.TotalFareTaskListener totalFareTaskListener;

    private HashMap<String, String> urlParams;

    public TotalFareTask(HashMap<String, String> urlParams) {
        super();
        this.urlParams = urlParams;
    }

    @Override
    protected FareBean doInBackground(String... params) {

        System.out.println(">>>>>>>>>doInBackground");
        TotalFareInvoker totalFareInvoker = new TotalFareInvoker(urlParams, null);
        return totalFareInvoker.invokeTotalFareWS();

    }

    @Override
    protected void onPostExecute(FareBean result) {
        if (result != null)
            totalFareTaskListener.dataDownloadedSuccessfully(result);
        else
            totalFareTaskListener.dataDownloadFailed();
    }

    public interface TotalFareTaskListener {

        void dataDownloadedSuccessfully(FareBean fareBean);

        void dataDownloadFailed();

    }

    public TotalFareTaskListener getTotalFareTaskListener() {
        return totalFareTaskListener;
    }

    public void setTotalFareTaskListener(TotalFareTaskListener totalFareTaskListener) {
        this.totalFareTaskListener = totalFareTaskListener;
    }
}
