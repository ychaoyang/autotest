package com.autotest.generate;

/**
 * Created by huairen on 2017/8/17.
 */
public class Param {


    /** 参数名*/
    private String				name;

    /** 参数名相同时第二参数名*/
    private String				secondName;

    /** 参数类型名称*/
    private String				typeName;

    /** 参数类型*/
    private String				type;

    /** 参数是基本类型*/
    private String				primitive;

    /** 参数值*/
    private String				value;

    /** 所属order*/
    private String				order;

    /** 子参数*/
    private String				children;

    /** 参数类名*/
    private String				childrenCLass;

    /** 父参数*/
    private String				father;

    /** 层级*/
    private int				    layer;

    /** 备注*/
    private String				comment;

    /** 参数对应注解*/
    private String			    annotation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrimitive() {
        return primitive;
    }

    public void setPrimitive(String primitive) {
        this.primitive = primitive;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getChildrenCLass() {
        return childrenCLass;
    }

    public void setChildrenCLass(String childrenCLass) {
        this.childrenCLass = childrenCLass;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString() {
        return "Param [name=" + name + ", secondName=" + secondName + ", typeName=" + typeName + ", type=" + type
                + ", primitive=" + primitive + ", value=" + value + ", order=" + order + ", children=" + children
                + ", childrenCLass=" + childrenCLass + ", father=" + father + ", layer=" + layer + ", comment="
                + comment + ", annotation=" + annotation + "]";
    }

}

