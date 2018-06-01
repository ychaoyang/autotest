package com.autotest.test;

import com.autotest.testbase.web.WebTestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;

/**
 * Created by huairen on 2017/8/7.
 */
public class WebTest extends WebTestBase {

    @Test
    @DisplayName("测试百度搜索页面")
    void baiduTest() {
        open("http://www.baidu.com");
        $(By.id("kw")).setValue("junit");
        $(By.id("su")).click();
        print(title());
    }

}

