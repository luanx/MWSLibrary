package com.wantdo.common.base;

import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersAsyncClient;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersClient;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersConfig;

/**
 * @ Date : 16/3/1
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */
public class AmazonClientFactory {

    private static final String accessKey = "AKIAJ4DXABFQUFPDRXMA";
    private static final String secretKey = "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";
    private static final String serviceURL = "https://mws.amazonservices.ca";

    private static final String appName = "BeringAmazonInfo";
    private static final String appVersion = "0.1";

    private static MarketplaceWebServiceOrdersAsyncClient client = null;

    public static synchronized MarketplaceWebServiceOrdersClient getOrderClient() {
        if (client == null) {
            MarketplaceWebServiceOrdersConfig config = new MarketplaceWebServiceOrdersConfig();
            config.setServiceURL(serviceURL);
            client = new MarketplaceWebServiceOrdersAsyncClient(accessKey, secretKey, appName, appVersion, config, null);
        }
        return client;
    }


}
