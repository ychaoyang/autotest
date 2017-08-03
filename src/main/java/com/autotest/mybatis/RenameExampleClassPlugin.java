package com.autotest.mybatis;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.internal.util.StringUtility;
import org.mybatis.generator.internal.util.messages.Messages;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ychaoyang on 2017/8/2.
 */
public class RenameExampleClassPlugin extends PluginAdapter {
    private String searchString;
    private String replaceString;
    private Pattern pattern;
    private boolean valid;


    public RenameExampleClassPlugin() {
    }

    public boolean validate(List<String> warnings) {
        this.searchString = this.properties.getProperty("searchString");
        this.replaceString = this.properties.getProperty("replaceString");
        valid = StringUtility.stringHasValue(this.searchString) && StringUtility.stringHasValue(this.replaceString);
        if(valid) {
            this.pattern = Pattern.compile(this.searchString);
        } else {
//            if(!StringUtility.stringHasValue(this.searchString)) {
//                warnings.add(Messages.getString("ValidationError.18", "RenameExampleClassPlugin", "searchString"));
//            }
//
//            if(!StringUtility.stringHasValue(this.replaceString)) {
//                warnings.add(Messages.getString("ValidationError.18", "RenameExampleClassPlugin", "replaceString"));
//            }
        }

        return true;
    }
    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        if(valid) {
            String oldType = introspectedTable.getExampleType();
            Matcher matcher = this.pattern.matcher(oldType);
            oldType = matcher.replaceAll(this.replaceString);
            introspectedTable.setExampleType(oldType);
        }else {
            String oldType = introspectedTable.getBaseRecordType();
            String newType = oldType + "DO";
            introspectedTable.setBaseRecordType(newType);
            introspectedTable.setExampleType(newType + "Example");
            String oldMapper = introspectedTable.getMyBatis3JavaMapperType();
            String newMapper = oldMapper.replaceAll("Mapper$", "DAO");
            introspectedTable.setMyBatis3JavaMapperType(newMapper);
        }
    }
}
