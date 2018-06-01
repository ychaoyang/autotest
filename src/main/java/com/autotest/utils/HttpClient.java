package com.autotest.utils;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by huairen on 2017/8/21.
 */
public class HttpClient {

    /**
     * 发送get请求，返回内容字符串
     */
    public  static String doGet(String url) {
        String result = null;
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            CloseableHttpResponse response = httpclient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() == 200) {
                result = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 发送get请求，返回response
     */
    public static CloseableHttpResponse httpGet(String url) {
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

    public static CloseableHttpResponse httpPost(String data,String url) {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity(data,"UTF-8"));
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpPost);
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
