package com.autotest.base;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by ychaoyang on 2017/7/20.
 */

public class AutoTestBase {

    protected final Logger logger = LoggerFactory.getLogger(getClass().getName());


    protected void sleep(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送get请求，返回内容字符串
     */
    public CloseableHttpResponse httpGet(String url) {
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpGet);
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    protected void print(Object object) {
        String str = "";
        if (object instanceof List) {
            logger.info("========================================");
            List list = (List) object;
            logger.info("List size:" + list.size());
            for (int i = 0; i < list.size(); i++) {

                str = list.get(i).toString();
                logger.info(str + "\n");
            }
            logger.info("========================================");
            return;
        } else if (object == null) {

            str = "null";
        } else {
            str = object.toString();
        }

        logger.info("========================================");
        logger.info(str);
        logger.info("========================================");
    }
}
