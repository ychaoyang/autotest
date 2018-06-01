package com.autotest.mybatis;

import com.autotest.utils.StringUtils;
import org.mybatis.generator.config.*;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;

import java.util.*;

/**
 * mybatis代码生成工具
 * <p>
 * Created by huairen on 2017/8/2.
 */
public class Dalgen {

	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	public static void main(String[] args) {
		Dalgen dal = new Dalgen();
		dal.gen("rap");
	}

	public void gen(String projectName) {
		if (StringUtils.isBlank(projectName)) {
			return;
		}
		logger.info("开始执行mybatis代码生成工具");
		List<String> warnings = new ArrayList<>();
		/*覆盖原生成的代码*/
		boolean overwrite = true;
		try {
			YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
			yaml.setResources(new ClassPathResource("application.yml"));
			Properties prop = yaml.getObject();
			Context context = new Context(ModelType.FLAT);
			if (StringUtils.isBlank(prop.getProperty("ds." + projectName + ".url"))) {
				logger.info("ds." + projectName + ".url" + "未找到");
				return;
			}
			JDBCConnectionConfiguration jdbcConnectionConfiguration = new JDBCConnectionConfiguration();
			jdbcConnectionConfiguration.setDriverClass(prop.getProperty("ds." + projectName + ".driverClassName"));
			jdbcConnectionConfiguration.setConnectionURL(prop.getProperty("ds." + projectName + ".url"));
			jdbcConnectionConfiguration.setUserId(prop.getProperty("ds." + projectName + ".username"));
			jdbcConnectionConfiguration.setPassword(prop.getProperty("ds." + projectName + ".password"));
			//生成模型的位置
			JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
			String tarProject = Dalgen.class.getClassLoader().getResource(".").getFile()
					.replace("target/test-classes", "src/main/java")
					.replace("target/classes", "src/main/java");
			String name = tarProject.replace("apitest", "core").replace("webtest", "core");
			javaModelGeneratorConfiguration.setTargetProject(name);
			javaModelGeneratorConfiguration.setTargetPackage("dal.model." + projectName);
			javaModelGeneratorConfiguration.addProperty("enableSubPackages", "true");
			javaModelGeneratorConfiguration.addProperty("trimStrings", "true");
			//生成映射文件的位置
			String resourceName = Dalgen.class.getClassLoader().getResource(".").getFile()
					.replace("target/test-classes", "src/main/resources")
					.replace("target/classes", "src/main/resources");
			String nameResource = resourceName.replace("apitest", "core").replace("webtest", "core");
			SqlMapGeneratorConfiguration sqlMapGeneratorConfiguration = new SqlMapGeneratorConfiguration();
			sqlMapGeneratorConfiguration.setTargetProject(nameResource);
			sqlMapGeneratorConfiguration.setTargetPackage("dal.mapping." + projectName);
			sqlMapGeneratorConfiguration.addProperty("enableSubPackages", "true");
			//生成DAO的位置
			JavaClientGeneratorConfiguration javaClientGeneratorConfiguration = new JavaClientGeneratorConfiguration();
			javaClientGeneratorConfiguration.setTargetProject(name);
			javaClientGeneratorConfiguration.setTargetPackage("dal.dao." + projectName);
			javaClientGeneratorConfiguration.setConfigurationType("XMLMAPPER");
			javaClientGeneratorConfiguration.addProperty("enableSubPackages", "true");

			PluginConfiguration pluginConfiguration = new PluginConfiguration();
			pluginConfiguration.setConfigurationType("com.autotest.mybatis.ToStringPlugin");
			PluginConfiguration pluginConfiguration1 = new PluginConfiguration();
			pluginConfiguration1.setConfigurationType("org.mybatis.generator.plugins.EqualsHashCodePlugin");
			PluginConfiguration pluginConfiguration2 = new PluginConfiguration();
			pluginConfiguration2.setConfigurationType("org.mybatis.generator.plugins.SerializablePlugin");
			PluginConfiguration pluginConfiguration3 = new PluginConfiguration();
			pluginConfiguration3.setConfigurationType("com.autotest.mybatis.RenameExampleClassPlugin");
			PluginConfiguration pluginConfiguration4 = new PluginConfiguration();
			pluginConfiguration4.setConfigurationType("tk.mybatis.mapper.generator.MapperPlugin");
			pluginConfiguration4.addProperty("mappers", "com.autotest.annotation.MyMapper");

			context.addPluginConfiguration(pluginConfiguration);
			context.addPluginConfiguration(pluginConfiguration1);
			context.addPluginConfiguration(pluginConfiguration2);
			context.addPluginConfiguration(pluginConfiguration3);
			context.addPluginConfiguration(pluginConfiguration4);

			context.setId(projectName);
			context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);
			context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);
			context.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfiguration);
			context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);
			String table = prop.getProperty("ds." + projectName + ".tables");
			if (StringUtils.isNotBlank(table)) {
				String[] tables = table.split(",");
				GeneratedKey generatedKey = new GeneratedKey("id", "MYSQL", true, "");
				Set<String> tabs = new HashSet(Arrays.asList(tables));
				for (String str : tabs) {
					if (StringUtils.isBlank(str)) {
						continue;
					}
					TableConfiguration tableConfiguration = new TableConfiguration(context);
					tableConfiguration.setTableName(str.trim());
					tableConfiguration.setGeneratedKey(generatedKey);
					String column = prop.getProperty("ds." + projectName + ".columnOverride");
					addColumnOverride(tableConfiguration, column);
					tableConfiguration.setInsertStatementEnabled(true);
					context.addTableConfiguration(tableConfiguration);
				}
			} else {
				TableConfiguration tableConfiguration = new TableConfiguration(context);
				tableConfiguration.setTableName("%");
				String column = prop.getProperty("ds." + projectName + ".columnOverride");
				addColumnOverride(tableConfiguration, column);
				GeneratedKey generatedKey = new GeneratedKey("id", "MYSQL", true, "");
				tableConfiguration.setGeneratedKey(generatedKey);
				context.addTableConfiguration(tableConfiguration);
			}

			context.addProperty("beginningDelimiter", "`");
			context.addProperty("endingDelimiter", "`");
			context.addProperty("javaFileEncoding", "UTF-8");
			context.setTargetRuntime("MyBatis3");
			JavaTypeResolverConfiguration javaTypeResolverConfiguration = new JavaTypeResolverConfiguration();
			javaTypeResolverConfiguration.addProperty("forceBigDecimals", "false");
			context.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration);

			Configuration config = new Configuration();
			config.addContext(context);
			config.addClasspathEntry(this.getClass().getClassLoader()
					.getResource("lib/mysql-connector-java-5.1.30.jar").getFile());
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			AutoTestMyBatisGenerator myBatisGenerator = new AutoTestMyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null, projectName);
			if (warnings.size() != 0) {
				logger.info("请注意下面的警告");
			}
			for (String warning : warnings) {
				logger.info(warning);
			}
			logger.info("代码生成完成");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addColumnOverride(TableConfiguration tableConfiguration, String column) {
		if (StringUtils.isNotBlank(column)) {
			String[] columns = column.split(",");
			Set<String> cols = new HashSet(Arrays.asList(columns));
			for (String col : cols) {
				if (StringUtils.isBlank(col)) {
					continue;
				}
				ColumnOverride columnOverride = new ColumnOverride(col.trim());
				columnOverride.setJdbcType("VARCHAR");
				tableConfiguration.addColumnOverride(columnOverride);
			}
		}
	}

}
