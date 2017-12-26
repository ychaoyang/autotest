package com.autotest.service;

import dal.dao.student.StudentDAO;
import dal.model.student.StudentDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by yu on 17/12/5.
 */
@Service
public class StudentService {

	@Autowired
	StudentDAO studentDAO;


	public StudentDAO getStudentDao(){
		return this.studentDAO;
	}

	public  void insertStudent(){
		StudentDO student = new StudentDO();
		student.setId(333L);
		student.setName("名啊");
		student.setAge(19);
		studentDAO.insert(student);
	}

	public List<StudentDO> findStudentById(String id){
		Example example = new Example(StudentDO.class);
		example.createCriteria().andEqualTo("id", id);
		return studentDAO.selectByExample(example);
	}

}
