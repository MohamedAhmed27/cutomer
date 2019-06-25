package in.techware.lataxi.net.WSAsyncTasks;


import android.os.AsyncTask;

import java.util.HashMap;

import in.techware.lataxi.model.SuccessBean;
import in.techware.lataxi.model.UserBean;
import in.techware.lataxi.net.invokers.SuccessDetailsInvoker;
import in.techware.lataxi.net.invokers.UserInfoInvoker;

public class SuccessDetailsTask extends AsyncTask<String, Integer, SuccessBean>{

    private SuccessDetailsTask.SuccessDetailsTaskListener successDetailsTaskListener;

    private HashMap<String, String> urlParams;

    public SuccessDetailsTask(HashMap<String, String> urlParams) {
        super();
        this.urlParams = urlParams;
    }

    @Override
    protected SuccessBean doInBackground(String... params) {
        System.out.println(">>>>>>>>>doInBackground");
        SuccessDetailsInvoker successDetailsInvoker = new SuccessDetailsInvoker(urlParams, null);
        return successDetailsInvoker.invokeSuccessDetailsWS();
    }

    @Override
    protected void onPostExecute(SuccessBean result) {
        if (result != null)
            successDetailsTaskListener.dataDownloadedSuccessfully(result);
        else
            successDetailsTaskListener.dataDownloadFailed();
    }

    public interface SuccessDetailsTaskListener {

        void dataDownloadedSuccessfully(SuccessBean successBean);

        void dataDownloadFailed();

    }

    public SuccessDetailsTaskListener getSuccessDetailsTaskListener() {
        return successDetailsTaskListener;
    }

    public void setSuccessDetailsTaskListener(SuccessDetailsTaskListener successDetailsTaskListener) {
        this.successDetailsTaskListener = successDetailsTaskListener;
    }
}
