package in.techware.lataxi.net.WSAsyncTasks;


import android.os.AsyncTask;

import org.json.JSONObject;

import in.techware.lataxi.model.AuthBean;
import in.techware.lataxi.model.BasicBean;
import in.techware.lataxi.net.invokers.OTPResendCodeInvoker;
import in.techware.lataxi.net.invokers.RegistrationInvoker;

public class OTPResendCodeTask extends AsyncTask<String, Integer, BasicBean> {

    private OTPResendTaskListener otpResendTaskListener;
    private JSONObject postData;

    public OTPResendCodeTask(JSONObject postData) {
        super();
        this.postData = postData;
    }

    @Override
    protected BasicBean doInBackground(String... params) {
        System.out.println(">>>>>>>>>doInBackground");
        OTPResendCodeInvoker otpResendCodeInvoker = new OTPResendCodeInvoker(null, postData);
        return otpResendCodeInvoker.invokeRegistrationWS();
    }

    @Override
    protected void onPostExecute(BasicBean result) {
        super.onPostExecute(result);
        if (result != null)
            otpResendTaskListener.dataDownloadedSuccessfully(result);
        else
            otpResendTaskListener.dataDownloadFailed();
    }

    public static interface OTPResendTaskListener {
        void dataDownloadedSuccessfully(BasicBean basicBean);

        void dataDownloadFailed();
    }

    public OTPResendCodeTask.OTPResendTaskListener getOtpResendTaskListener() {
        return otpResendTaskListener;
    }

    public void setOtpResendTaskListener(OTPResendCodeTask.OTPResendTaskListener otpResendTaskListener) {
        this.otpResendTaskListener = otpResendTaskListener;
    }
}
