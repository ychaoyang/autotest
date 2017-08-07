package com.autotest.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by ychaoyang on 2017/7/24.
 */
public class WebTestBase extends AutoTestBase {
    protected WebDriver d;

    @BeforeEach
    void init() {
        //打开chrome浏览器
        System.setProperty("webdriver.chrome.driver", Thread.currentThread().getContextClassLoader()
                .getResource("autotest/" + "chromedriver.exe").getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        d = new ChromeDriver(options);
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterEach
    void tearDown() {
        //关闭浏览器
        d.quit();
    }

    /**
     * 切换到新窗口
     *
     * @param driver
     */
    public void switchToNewWindow(WebDriver driver) {
        String[] handles = new String[driver.getWindowHandles().size()];
        driver.getWindowHandles().toArray(handles);// 把list转换成数组
        int i = handles.length;
        driver.switchTo().window(handles[i - 1]);// 切换窗口
    }

    /**
     * 判断元素是否存在
     *
     * @param webElement
     * @return
     */
    public boolean isElementExist(WebElement webElement) {
        try {
            webElement.isEnabled();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
