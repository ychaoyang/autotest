package com.autotest;

import com.autotest.annotation.AutoTest;
import com.autotest.service.StudentService;
import com.autotest.service.UserService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SpringbootTest {

	@Autowired
	StudentService studentService;

	@Autowired
	UserService userService;


	@AutoTest(file = "csvTest.csv")
	void testDemo(int testId) {
		System.out.println(testId);
		System.out.println(studentService.getStudentDao().selectAll());
//		System.out.println(userService.getUserDao().getAll().get(0).toString());
		System.out.println(userService.getUserDao().getUserById("1"));
	}

	@AutoTest(file = "csvTest.csv")
	void testDemo2(int testId) {
		System.out.println(testId);
		System.out.println(studentService.getStudentDao().selectAll());
		studentService.insertStudent();
	}

}
