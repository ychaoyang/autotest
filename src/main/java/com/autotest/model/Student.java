package com.autotest.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by yu on 17/11/15.
 */
@Getter
@Setter
@ToString
@Table(name = "student")
public class Student implements Serializable {

	private long id;

	private String name;

	private String age;

}
