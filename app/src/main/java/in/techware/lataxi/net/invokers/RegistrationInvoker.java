package in.techware.lataxi.net.invokers;

import org.json.JSONObject;

import java.util.HashMap;

import in.techware.lataxi.model.AuthBean;
import in.techware.lataxi.net.ServiceNames;
import in.techware.lataxi.net.WebConnector;
import in.techware.lataxi.net.parsers.RegistrationParser;
import in.techware.lataxi.net.utils.WSConstants;

public class RegistrationInvoker extends BaseInvoker {

    public RegistrationInvoker() {
        super();
    }

    public RegistrationInvoker(HashMap<String, String> urlParams,
                               JSONObject postData) {
        super(urlParams, postData);
    }

    public AuthBean invokeRegistrationWS() {

        System.out.println("POSTDATA>>>>>>>" + postData);

        WebConnector webConnector;

        webConnector = new WebConnector(new StringBuilder(ServiceNames.USER_REGISTRATION), WSConstants.PROTOCOL_HTTP, null, postData);

        String wsResponseString = webConnector.connectToPOST_service();

        System.out.println(">>>>>>>>>>> response: " + wsResponseString);
        AuthBean authBean = null;
        if (wsResponseString.equals("")) {

            return authBean = null;
        } else {
            authBean = new AuthBean();
            RegistrationParser registrationParser = new RegistrationParser();
            authBean = registrationParser.parseRegistrationResponse(wsResponseString);
            return authBean;
        }
    }
}
