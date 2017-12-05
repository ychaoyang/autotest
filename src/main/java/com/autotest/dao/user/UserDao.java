package com.autotest.dao.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yu on 17/12/5.
 */
@Mapper
public interface UserDao {

	@Select("SELECT * FROM user")
	List<User> getAll();
}
