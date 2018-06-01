package com.autotest.mybatis;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/**
 * Created by huairen on 2017/8/2.
 */
public class ToStringPlugin extends PluginAdapter {
    private boolean useToStringFromRoot;

    public ToStringPlugin() {
    }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        this.useToStringFromRoot = StringUtility.isTrue(properties.getProperty("useToStringFromRoot"));
    }

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.generateToString(introspectedTable, topLevelClass);
        return true;
    }

    @Override
    public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.generateToString(introspectedTable, topLevelClass);
        return true;
    }

    @Override
    public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.generateToString(introspectedTable, topLevelClass);
        return true;
    }

    private void generateToString(IntrospectedTable introspectedTable, TopLevelClass topLevelClass) {
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(FullyQualifiedJavaType.getStringInstance());
        method.setName("toString");
        if(introspectedTable.isJava5Targeted()) {
            method.addAnnotation("@Override");
        }

        this.context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
        method.addBodyLine("StringBuilder sb = new StringBuilder();");
        method.addBodyLine("sb.append(getClass().getSimpleName());");
        method.addBodyLine("sb.append(\" [\");");
        StringBuilder sb = new StringBuilder();
        Iterator var5 = topLevelClass.getFields().iterator();

        while(var5.hasNext()) {
            Field field = (Field)var5.next();
            String property = field.getName();
            sb.setLength(0);
            sb.append("sb.append(\"").append(", ").append(property).append("=\")").append(".append(").append(property).append(");");
            method.addBodyLine(sb.toString());
        }

        method.addBodyLine("sb.append(\"]\");");

        method.addBodyLine("return sb.toString();");
        topLevelClass.addMethod(method);
    }
}

