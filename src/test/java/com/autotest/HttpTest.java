package com.autotest;

import com.autotest.annotation.AutoTest;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yu on 17/12/26.
 */
public class HttpTest {

	protected RestTemplate restTemplate = new RestTemplate();

	/**
	 * 百度翻译接口
	 */
	@AutoTest(file = "csvTest.csv")
	void httpTest(int test) {
		String url = "http://fanyi.baidu.com/v2transapi";
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		//需要翻译的单词
		String word = "自行车";
		map.add("query", word);
		map.add("from", "auto");
		map.add("to", "auto");
		// 调用接口
		ResponseEntity<String> response = restTemplate.postForEntity(url, map, String.class);
		System.out.println(response.getBody());
	}
}
