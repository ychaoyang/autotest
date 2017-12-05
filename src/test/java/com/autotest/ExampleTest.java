package com.autotest;

import com.autotest.annotation.AutoTest;
import com.autotest.base.AutoTestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by ychaoyang on 2017/7/21.
 */
public class ExampleTest extends AutoTestBase {

    @BeforeEach
    void init() {
    }

    @AutoTest(file = "simpleTest.csv")
    void simpleTest(int testId, String result) {
        System.out.println("这是第 " + testId + " 条测试用例");
        System.out.println(result);
    }

    @AutoTest(file = "csvTest.csv")
    @DisplayName("autotest读取csv数据")
    void autoTest(int testId, String result, String memo) {
        if (1001 == testId) {
            assertEquals("SUCCESS", result);
            print("memo：" + memo);
        }
        if (1002 == testId) {
            assertTrue("FAIL".equals(result));
            print("memo：" + memo);
        }

    }

    @AfterEach
    @Disabled
    void tearDown() {
    }

}
