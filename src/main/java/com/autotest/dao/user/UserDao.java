package com.autotest.dao.user;

import com.autotest.service.MyMapper;
import com.autotest.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yu on 17/12/5.
 */
@Mapper
public interface UserDao extends MyMapper<User> {

	@Select("SELECT * FROM user where id = #{id}")
	List<User> getUserById(String id);

}
