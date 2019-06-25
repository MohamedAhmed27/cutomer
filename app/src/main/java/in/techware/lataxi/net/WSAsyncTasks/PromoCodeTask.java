package in.techware.lataxi.net.WSAsyncTasks;


import android.os.AsyncTask;

import java.util.HashMap;

import in.techware.lataxi.model.PromoCodeBean;
import in.techware.lataxi.model.UserBean;
import in.techware.lataxi.net.invokers.PromoCodeInvoker;
import in.techware.lataxi.net.invokers.UserInfoInvoker;

public class PromoCodeTask extends AsyncTask<String, Integer, PromoCodeBean> {

    private PromoCodeTask.PromoCodeTaskListener promoCodeTaskListener;

    private HashMap<String, String> urlParams;

    public PromoCodeTask(HashMap<String, String> urlParams) {
        super();
        this.urlParams = urlParams;
    }

    @Override
    protected PromoCodeBean doInBackground(String... params) {

        System.out.println(">>>>>>>>>doInBackground");
        PromoCodeInvoker promoCodeInvoker = new PromoCodeInvoker(urlParams, null);
        return promoCodeInvoker.invokePromoCodeWS();
    }

    @Override
    protected void onPostExecute(PromoCodeBean result) {
        if (result != null)
            promoCodeTaskListener.dataDownloadedSuccessfully(result);
        else
            promoCodeTaskListener.dataDownloadFailed();
    }

    public interface PromoCodeTaskListener {

        void dataDownloadedSuccessfully(PromoCodeBean promoCodeBean);

        void dataDownloadFailed();
    }

    public PromoCodeTaskListener getPromoCodeTaskListener() {
        return promoCodeTaskListener;
    }

    public void setPromoCodeTaskListener(PromoCodeTaskListener promoCodeTaskListener) {
        this.promoCodeTaskListener = promoCodeTaskListener;
    }
}
