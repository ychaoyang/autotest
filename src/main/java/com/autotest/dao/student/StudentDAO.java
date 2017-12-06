package com.autotest.dao.student;

import com.autotest.service.MyMapper;
import com.autotest.model.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yu on 17/11/15.
 */
public interface StudentDao extends MyMapper<Student> {

//	@Select("SELECT * FROM student")
//	List<Student> getAll();



}
