package com.autotest.service;

import com.autotest.dao.user.UserDao;
import com.autotest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yu on 17/12/6.
 */
@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

}
