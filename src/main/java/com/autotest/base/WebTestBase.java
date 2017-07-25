package com.autotest.base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by ychaoyang on 2017/7/24.
 */
public class WebTestBase extends AutoTestBase {


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
