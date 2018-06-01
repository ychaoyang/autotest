package com.autotest.extension;

import java.lang.annotation.Annotation;

/**
 * Created by huairen on 2017/7/20.
 */
public class Parame
{

    /**
     * 参数名
     */
    private String name;

    /**
     * 参数类型
     */
    private Class type;

    /**
     * 参数对应annotation
     */
    private Annotation annotation;

    /**
     * 对象值
     */
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public Annotation getAnnotation() {
        return annotation;
    }

    public void setAnnotation(Annotation annotation) {
        this.annotation = annotation;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", annotation=" + annotation +
                ", value='" + value + '\'' +
                '}';
    }
}

