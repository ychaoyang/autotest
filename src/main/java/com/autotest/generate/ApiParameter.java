package com.autotest.generate;

import com.alibaba.fastjson.JSONArray;

/**
 * Created by huairen on 2017/8/16.
 */
public class ApiParameter {
    /**
     * 字段名
     */
    private String itemCode;
    /**
     * 二级字段名
     */
    private String secondCode;

    /**
     * 字段中文名
     */
    private String itemTitle;

    /**
     * 参数请求类型
     */
    private String paramType;

    /**
     * 参数所属service
     */
    private String serviceId;

    /**
     * 必填
     */
    private String fullStatus;

    /**
     * 参数长度
     */
    private String sizeScope;

    /**
     * 子参数
     */
    private JSONArray children;

    /**
     * 父参数
     */
    private String father;

    /**
     * 层级
     */
    private int layer;

    /**
     * 字段类型
     */
    private String valType;

    /**
     * 版本号
     */
    private String version;

    /**
     * 可用
     */
    private boolean visible;

    /**
     * 示例
     */

    private String demo;

    /**
     * 说明
     */
    private String descn;

    /**
     * 新参数
     */
    private boolean newest ;

    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getSecondCode() {
        return secondCode;
    }
    public void setSecondCode(String secondCode) {
        this.secondCode = secondCode;
    }
    public String getItemTitle() {
        return itemTitle;
    }
    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }
    public String getParamType() {
        return paramType;
    }
    public void setParamType(String paramType) {
        this.paramType = paramType;
    }
    public String getServiceId() {
        return serviceId;
    }
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    public String getFullStatus() {
        return fullStatus;
    }
    public void setFullStatus(String fullStatus) {
        this.fullStatus = fullStatus;
    }
    public String getSizeScope() {
        return sizeScope;
    }
    public void setSizeScope(String sizeScope) {
        this.sizeScope = sizeScope;
    }
    public JSONArray getChildren() {
        return children;
    }
    public void setChildren(JSONArray children) {
        this.children = children;
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
    public String getValType() {
        return valType;
    }
    public void setValType(String valType) {
        this.valType = valType;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isVisible() {
        return visible;
    }
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getDemo() {
        return demo;
    }
    public void setDemo(String demo) {
        this.demo = demo;
    }
    public String getDescn() {
        return descn;
    }
    public void setDescn(String descn) {
        this.descn = descn;
    }
    public boolean isNewest() {
        return newest;
    }
    public void setNewest(boolean newest) {
        this.newest = newest;
    }
    @Override
    public String toString() {
        return "ApiParameter [itemCode=" + itemCode + ", secondCode=" + secondCode + ", itemTitle=" + itemTitle
                + ", paramType=" + paramType + ", serviceId=" + serviceId + ", fullStatus=" + fullStatus
                + ", sizeScope=" + sizeScope + ", children=" + children + ", father=" + father + ", layer=" + layer
                + ", valType=" + valType + ", version=" + version + ", visible=" + visible + ", demo=" + demo
                + ", descn=" + descn + ", newest=" + newest + "]";
    }

}
