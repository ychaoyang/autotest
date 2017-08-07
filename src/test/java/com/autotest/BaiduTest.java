package com.autotest;

import com.autotest.base.WebTestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

/**
 * Created by ychaoyang on 2017/8/7.
 */
public class BaiduTest extends WebTestBase {

    @Test
    @DisplayName("测试百度搜索页面")
    void baiduTest() {
        d.get("http://www.baidu.com");
        d.findElement(By.id("kw")).sendKeys("junit");
        d.findElement(By.id("su")).click();
        sleep(2);
    }

}

