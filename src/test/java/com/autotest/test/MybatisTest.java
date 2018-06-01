package com.autotest.test;

import com.autotest.annotation.AutoTest;
import com.autotest.base.SpringBootTestBase;
import com.autotest.testbase.SchoolTestBase;
import dal.model.school.StudentDO;
import org.springframework.beans.factory.annotation.Autowired;

public class MybatisTest extends SpringBootTestBase {

	@Autowired
	SchoolTestBase schoolTestBase;

	@AutoTest(file = "mybatisTest.csv")
	void mybatisTest(
			int testId,
			StudentDO studentDO
	) {
		//插入数据
		schoolTestBase.insertStudent(studentDO);
		//查询数据
		print(schoolTestBase.findStudentByName(studentDO.getName()));
		//清除数据
		schoolTestBase.cleanStudentByName(studentDO.getName());
	}
}
