package com.autotest;

import com.autotest.annotation.AutoTest;
import com.autotest.dao.spring.UserDao;
import com.autotest.dao.student.StudentDao;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SpringbootTest {

	@Autowired
	StudentDao studentDao;

	@SuppressWarnings("all")
	@Autowired
	UserDao userDao;


	@AutoTest(file = "/csvTest.csv")
	void testDemo(int testId) {
		System.out.println(testId);
		System.out.println(studentDao.getAll().get(0).toString());
		System.out.println(userDao.getAll().get(0).toString());
	}

}
