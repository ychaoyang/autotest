package com.autotest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@SpringBootApplication
@MapperScan(basePackages ="com.autotest.dao")
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
