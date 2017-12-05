package com.autotest.dao.student;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yu on 17/11/15.
 */
@Mapper
public interface StudentDao {

	@Select("SELECT * FROM student")
//	@Results({
//			@Result(property = "name", column = "name"),
//			@Result(property = "age", column = "age")
//	})
	List<Student> getAll();
}
