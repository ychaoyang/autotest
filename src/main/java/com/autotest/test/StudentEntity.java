package com.autotest.test;



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
public class StudentEntity implements Serializable {

	public StudentEntity(){

	}

	private long id;

	private String name;

	private String age;

}
