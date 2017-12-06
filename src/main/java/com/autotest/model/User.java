package com.autotest.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by yu on 17/12/5.
 */
@Getter
@Setter
@ToString
public class User implements Serializable {

	@Id
	private String id;

	private String uname;

	private String password;
}
