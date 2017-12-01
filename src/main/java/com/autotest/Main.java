package com.autotest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.autotest.test")
public class Main {

	public static void main(String[] args) {

		SpringApplication.run(Main.class, args);
	}
}
