package com.autotest.extension;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/**
 * Created by ychaoyang on 2017/7/20.
 */
public class Param {

    /**
     * 参数名
     */
    private String name;

    /**
     * 参数类型
     */
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
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

