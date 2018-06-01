package com.autotest;

import com.autotest.generate.GenerateFacadeCase;
import com.autotest.example.QueryUserFacade;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

public class Generator {

	@Test
	public void genFacadeCase() {
		String author = "huairen";
		String methodName = "queryUserById";
		String packag = "test";
		new GenerateFacadeCase().generate(QueryUserFacade.class, methodName, packag, author, Generator.class);
	}


}