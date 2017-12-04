package com.autotest;

import com.autotest.annotation.AutoTest;
import com.autotest.student.StudentDAO;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SpringbootTest {

	@SuppressWarnings("all")
	@Autowired
	StudentDAO studentDAO;


	@AutoTest(file = "/csvTest.csv")
	void testDemo(int testId) {
		System.out.println(testId);
		System.out.println(studentDAO.getAll().get(0).toString());
	}

}
