package com.autotest.test;

import com.autotest.base.SpringBootTestBase;
import com.autotest.annotation.AutoTest;
import org.junit.jupiter.api.DisplayName;
import com.alibaba.dubbo.config.annotation.Reference;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.autotest.example.UserResult;
import com.autotest.example.QueryUserFacade;
import com.autotest.example.QueryOrder;



/**
 * @author huairen
 * Created on 2018年06月02日.
 */
public class QueryUserFacadeQueryUserByIdTest extends SpringBootTestBase{

	@Reference(version = "1.0")
    QueryUserFacade queryUserFacade;

	@AutoTest(file = "test/queryUserFacadeQueryUserByIdTestSuccess.csv")
	public void queryUserFacadeQueryUserByIdTestSuccess(
			// 基本参数
			int testId,
			// 业务参数
			QueryOrder order
	) {
		// 清除数据
		// 准备数据
		// 测试过程
		// 调用接口
		UserResult result = queryUserFacade.queryUserById(order);
		// 结果验证
		// 数据验证
	}
}
