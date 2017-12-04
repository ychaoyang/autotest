package com.autotest.student;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yu on 17/11/15.
 */
@Mapper
public interface StudentDAO {

	@Select("SELECT * FROM student")
//	@Results({
//			@Result(property = "name", column = "name"),
//			@Result(property = "age", column = "age")
//	})
	List<StudentEntity> getAll();
}
