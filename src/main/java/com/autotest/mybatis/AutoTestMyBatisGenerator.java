package com.autotest.mybatis;

import com.autotest.generate.GenerateBase;
import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.ShellCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.exception.InvalidConfigurationException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

/**
 * Created by yu on 17/12/22.
 */
public class AutoTestMyBatisGenerator extends MyBatisGenerator {

	public AutoTestMyBatisGenerator(Configuration configuration, ShellCallback shellCallback, List<String> warnings)
			throws InvalidConfigurationException {
		super(configuration, shellCallback, warnings);
	}

	public void generate(ProgressCallback callback, String projectName) throws SQLException, IOException,
			InterruptedException {
		super.generate(callback, null, null, true);
		List<GeneratedJavaFile> generatedJavaFiles = getGeneratedJavaFiles();
		new GenerateBase().generateBase(projectName, generatedJavaFiles, true);
	}


}
