package com.autotest.testbase.web;

import com.autotest.base.SpringBootTestBase;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.close;

public class WebTestBase extends SpringBootTestBase {

	@BeforeAll
	static void init() {
		System.setProperty("webdriver.chrome.driver", Thread.currentThread().getContextClassLoader()
				.getResource("webdriver/" + "chromedriver.exe").getPath());
		System.setProperty("chromeoptions.args", "disable-infobars");
		Configuration.browser = "chrome";
		Configuration.browserSize = "1920x1080";
		Configuration.timeout = 6000;
		Configuration.screenshots = false;
	}

	@AfterEach
	void tearDown() {
		close();
	}
}
