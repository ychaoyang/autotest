package com.autotest.dao.spring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by yu on 17/12/5.
 */
@Getter
@Setter
@ToString
public class User implements Serializable {

	private String id;

	private String uname;

	private String password;
}
