package com.autotest.test;

import com.alibaba.fastjson.JSON;
import com.autotest.annotation.AutoTest;
import com.autotest.base.AutoTestBase;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yu on 17/12/26.
 */
public class HttpTest extends AutoTestBase {

    protected RestTemplate restTemplate = new RestTemplate();

    /**
     * 有道翻译接口
     */
    @AutoTest(file = "httpTest.csv")
    void httpTest(int testId) {
        String url = "http://fanyi.youdao.com/translate";
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        //需要翻译的单词
        String word = "today";
        map.add("i", word);
        map.add("type", "auto");
        map.add("doctype", "json");
        map.add("xmlVersion", "1.8");
        // 调用接口
        ResponseEntity<String> response = restTemplate.postForEntity(url, map, String.class);
        print("原单词：" + word);
        print("翻译后：" + JSON.parseObject(response.getBody()).getJSONArray("translateResult").getJSONArray(0).get(0));
    }
}
