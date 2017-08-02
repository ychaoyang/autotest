package com.autotest;

import com.autotest.annotation.AutoTest;
import com.autotest.base.WebTestBase;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by ychaoyang on 2017/7/24.
 */
public class JDQuan extends WebTestBase {

    WebDriver d;

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

    @AutoTest(file = "autotest/jd.csv")
    @DisplayName("登录京东，获取优惠券")
    void getQuan(String testId, String userName, String passWord) {
        d.get("http://passport.jd.com/new/login.aspx?ReturnUrl=https%3A%2F%2Fwww.jd.com%2F");
        d.findElement(By.linkText("账户登录")).click();
        d.findElement(By.id("loginname")).sendKeys(userName);
        d.findElement(By.id("nloginpwd")).sendKeys(passWord);
        d.findElement(By.linkText("登    录")).click();
        d.findElement(By.cssSelector("li.fore2>a")).click();
        switchToNewWindow(d);
        for (int n = 1; n <= 3; n++) {
            String xpath = "//*[@id=\"quanlist\"]/div[" + n + "]/div[1]/div[4]/div[1]/a/span";
            try {
                WebElement webElement = d.findElement(By.xpath(xpath));
                webElement.click();
                d.findElement(By.xpath("/html/body/div[12]/div[1]/div/div[2]/a[2]")).click();
            } catch (Exception e) {
                logger.error("找不到Element:{}", xpath);
            }

        }
        sleep(2);
    }


    @AfterEach
    void tearDown() {
        //关闭浏览器
        d.quit();
    }


}
