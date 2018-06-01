package com.autotest.testbase;

import java.util.List;
import java.util.Date;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import dal.dao.school.*;
import dal.model.school.*;

/**
 * @author autotest
 * Created on 2018/06/02.
 */
@Service
public class SchoolTestBase {

	@Autowired
	StudentDAO studentDAO;

    /**
	 * 插入student表数据
	 */
	public void insertStudent(StudentDO studentDO) {
		studentDAO.insert(studentDO);
	}

    /**
	 * 插入student表数据
	 */
	public void insertStudent(
			long id, 
			String name, 
			Integer age
	) {
		StudentDO studentDO = new StudentDO();
		studentDO.setId(id);
		studentDO.setName(name);
		studentDO.setAge(age);
		studentDAO.insert(studentDO);
	}
	

	/**
	 * 根据id删除student表数据
	 */
	public void cleanStudentById(long id) {
		StudentDOExample exam = new StudentDOExample();
		exam.createCriteria().andIdEqualTo(id);
		studentDAO.deleteByExample(exam);
	}

	/**
	* 根据name删除student表数据
	*/
	public void cleanStudentByName(String name) {
		if (StringUtils.isBlank(name)){
			name = "test_name";
		}
		StudentDOExample exam = new StudentDOExample();
		exam.createCriteria().andNameEqualTo(name);
		studentDAO.deleteByExample(exam);
	}


    /**
	 * 根据id查询student表数据
	 */
	public List<StudentDO> findStudentById(long id) {
		StudentDOExample exam = new StudentDOExample();
		exam.createCriteria().andIdEqualTo(id);
		return studentDAO.selectByExample(exam);
	}

	/**
	* 根据name查询student表数据
	*/
	public List<StudentDO> findStudentByName(String name) {
		if (StringUtils.isBlank(name)){
			name = "test_name";
		}
		StudentDOExample exam = new StudentDOExample();
		exam.createCriteria().andNameEqualTo(name);
		return studentDAO.selectByExample(exam);
	}

    /**
	 * 根据id更新student表数据
	 */
	public void updateStudentById(long id,StudentDO studentDO) {
		StudentDOExample exam = new StudentDOExample();
		exam.createCriteria().andIdEqualTo(id);
		studentDAO.updateByExampleSelective(studentDO, exam);
	}

	/**
	* 根据name更新student表数据
	*/
	public void updateStudentByName(String name,StudentDO studentDO) {
		if (StringUtils.isBlank(name)){
			name = "test_name";
		}
		StudentDOExample exam = new StudentDOExample();
		exam.createCriteria().andNameEqualTo(name);
		studentDAO.updateByExampleSelective(studentDO, exam);
	}

}
