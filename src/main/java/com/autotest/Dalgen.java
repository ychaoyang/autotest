package com.autotest;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * mybatis代码生成工具
 * <p>
 * Created by ychaoyang on 2017/8/2.
 */
public class Dalgen {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    String propertiesLocation = "dalgen/student_generatorConfig.xml";
    Configuration config = null;

    public static void main(String[] args) {
        Dalgen dal = new Dalgen();
        dal.gen();
    }

    public void gen() {
        logger.info("开始执行mybatis代码生成工具");
        List<String> warnings = new ArrayList<>();
        /*覆盖原生成的代码*/
        boolean overwrite = true;
        try {
            ConfigurationParser cp = new ConfigurationParser(warnings);
            config = cp.parseConfiguration(Dalgen.class.getClassLoader().getResourceAsStream(
                    propertiesLocation));
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
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

}
