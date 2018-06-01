package com.autotest.example;

/**
 * @author huairen
 * Created on 18/6/2.
 */
public class UserResult {

	private String code;

	private Long id;

	private String name;

	private Integer age;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append(", id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", age=").append(age);
		sb.append("]");
		return sb.toString();
	}
}
