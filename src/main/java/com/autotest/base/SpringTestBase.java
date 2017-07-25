package com.autotest.base;

import org.springframework.test.context.ContextConfiguration;

/**
 * Created by ychaoyang on 2017/7/24.
 */
@ContextConfiguration({
        "/integration/dubbo.xml",
        "/integration/integration.xml",
})
public class SpringTestBase extends AutoTestBase {


}
