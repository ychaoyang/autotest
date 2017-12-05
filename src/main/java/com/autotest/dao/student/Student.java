package com.autotest.dao.student;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by yu on 17/11/15.
 */
@Getter
@Setter
@ToString
public class Student implements Serializable {

	private long id;

	private String name;

	private String age;

}
