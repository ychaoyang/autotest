package dal.model.squid;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_advertise_head")
public class TAdvertiseHeadDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 广告配置ID
     */
    @Column(name = "CONFIG_ID")
    private BigDecimal configId;

    /**
     * 广告名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 图片排序编号
     */
    @Column(name = "PIC_NUMBER")
    private BigDecimal picNumber;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 修改时间
     */
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    /**
     * 创建人
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 修改人
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 版本号
     */
    @Column(name = "VERSION_ID")
    private Integer versionId;

    /**
     * 删除标记
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    /**
     * 广告文字介绍
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 广告图片路径
     */
    @Column(name = "PIC_PATH")
    private String picPath;

    /**
     * 广告链接地址
     */
    @Column(name = "URL_PATH")
    private String urlPath;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ENTITY_ID - 主键
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * 设置主键
     *
     * @param entityId 主键
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取广告配置ID
     *
     * @return CONFIG_ID - 广告配置ID
     */
    public BigDecimal getConfigId() {
        return configId;
    }

    /**
     * 设置广告配置ID
     *
     * @param configId 广告配置ID
     */
    public void setConfigId(BigDecimal configId) {
        this.configId = configId;
    }

    /**
     * 获取广告名称
     *
     * @return NAME - 广告名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置广告名称
     *
     * @param name 广告名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取类型
     *
     * @return TYPE - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取图片排序编号
     *
     * @return PIC_NUMBER - 图片排序编号
     */
    public BigDecimal getPicNumber() {
        return picNumber;
    }

    /**
     * 设置图片排序编号
     *
     * @param picNumber 图片排序编号
     */
    public void setPicNumber(BigDecimal picNumber) {
        this.picNumber = picNumber;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED_DATE - 创建时间
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置创建时间
     *
     * @param createdDate 创建时间
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 获取修改时间
     *
     * @return MODIFIED_DATE - 修改时间
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 设置修改时间
     *
     * @param modifiedDate 修改时间
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * 获取创建人
     *
     * @return CREATED_USER - 创建人
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * 设置创建人
     *
     * @param createdUser 创建人
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * 获取修改人
     *
     * @return UPDATED_USER - 修改人
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * 设置修改人
     *
     * @param updatedUser 修改人
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * 获取版本号
     *
     * @return VERSION_ID - 版本号
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * 设置版本号
     *
     * @param versionId 版本号
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * 获取删除标记
     *
     * @return MARK_DELETE - 删除标记
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置删除标记
     *
     * @param markDelete 删除标记
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete;
    }

    /**
     * 获取广告文字介绍
     *
     * @return CONTENT - 广告文字介绍
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置广告文字介绍
     *
     * @param content 广告文字介绍
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取广告图片路径
     *
     * @return PIC_PATH - 广告图片路径
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 设置广告图片路径
     *
     * @param picPath 广告图片路径
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    /**
     * 获取广告链接地址
     *
     * @return URL_PATH - 广告链接地址
     */
    public String getUrlPath() {
        return urlPath;
    }

    /**
     * 设置广告链接地址
     *
     * @param urlPath 广告链接地址
     */
    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", configId=").append(configId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", picNumber=").append(picNumber);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", content=").append(content);
        sb.append(", picPath=").append(picPath);
        sb.append(", urlPath=").append(urlPath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}