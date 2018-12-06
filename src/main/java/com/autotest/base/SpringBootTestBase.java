package com.autotest.base;

import com.autotest.Main;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author huairen
 * Created on 18/3/8.
 */
@SpringBootTest(
        classes = Main.class,
		webEnvironment = SpringBootTest.WebEnvironment.NONE
)
@ExtendWith(SpringExtension.class)
public class SpringBootTestBase extends AutoTestBase {
}
