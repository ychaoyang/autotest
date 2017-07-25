package com.autotest;

import com.autotest.annotation.AutoTest;
import com.autotest.base.AutoTestBase;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by ychaoyang on 2017/7/21.
 */
public class ExampleTest extends AutoTestBase {


    @AutoTest(file = "/autotest/csvTest.csv")
    @DisplayName("autotest测试读取csv")
    void autoTest(int testId, String result, String memo) {
        if (1001 == testId) {
            assertEquals("SUCCESS",result);
            print("memo：" + memo);
        }
        if (1002 == testId) {
            assertTrue("FAIL".equals(result));
            print("memo：" + memo);
        }

    }

}
