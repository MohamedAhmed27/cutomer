package in.techware.lataxi.net.invokers;


import org.json.JSONObject;

import java.util.HashMap;

import in.techware.lataxi.model.LandingPageBean;
import in.techware.lataxi.net.ServiceNames;
import in.techware.lataxi.net.WebConnector;
import in.techware.lataxi.net.parsers.LandingPageDetailsParser;
import in.techware.lataxi.net.utils.WSConstants;

public class LandingPageDetailsInvoker extends BaseInvoker {

    public LandingPageDetailsInvoker(HashMap<String, String> urlParams,
                                     JSONObject postData) {
        super(urlParams, postData);
    }

    public LandingPageBean invokeLandingPageDetailsWS() {

        WebConnector webConnector;

        webConnector = new WebConnector(new StringBuilder(ServiceNames.CAR_TYPES), WSConstants.PROTOCOL_HTTP, urlParams, null);

        //webConnector= new WebConnector(new StringBuilder(ServiceNames.MODELS), WSConstants. PROTOCOL_HTTP, null);
//    String wsResponseString=webConnector.connectToPOST_service();
        String wsResponseString = webConnector.connectToGET_service(true);
        System.out.println(">>>>>>>>>>> response: " + wsResponseString);
        LandingPageBean landingPageBean = null;
        if (wsResponseString.equals("")) {
            return landingPageBean = null;
        } else {
            landingPageBean = new LandingPageBean();
            LandingPageDetailsParser landingPageDetailsParser = new LandingPageDetailsParser();
            landingPageBean = landingPageDetailsParser.parseLandingPageDetailsResponse(wsResponseString);
            return landingPageBean;
        }
    }
}
