package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_app_manager")
public class TAppManagerDO implements Serializable {
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 版本名
     */
    @Column(name = "NAME")
    private String name;

    @Column(name = "TYPE")
    private Integer type;

    @Column(name = "SERIAL_NUMBER")
    private Integer serialNumber;

    @Column(name = "APP_VERSION")
    private String appVersion;

    @Column(name = "URL")
    private String url;

    @Column(name = "LOG")
    private String log;

    /**
     * 强制升级 是否强制更新 0:不强制升级 1:强制升级
     */
    @Column(name = "MUST_UPDATE")
    private Integer mustUpdate;

    /**
     * 状态 0：未发布 1：已发布
     */
    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "UPDATED_USER")
    private String updatedUser;

    @Column(name = "VERSION_ID")
    private Integer versionId;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "MARK_DELETE")
    private String markDelete;

    private static final long serialVersionUID = 1L;

    /**
     * @return ENTITY_ID
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * @param entityId
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取版本名
     *
     * @return NAME - 版本名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置版本名
     *
     * @param name 版本名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return TYPE
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return SERIAL_NUMBER
     */
    public Integer getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber
     */
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return APP_VERSION
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * @param appVersion
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * @return URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return LOG
     */
    public String getLog() {
        return log;
    }

    /**
     * @param log
     */
    public void setLog(String log) {
        this.log = log;
    }

    /**
     * 获取强制升级 是否强制更新 0:不强制升级 1:强制升级
     *
     * @return MUST_UPDATE - 强制升级 是否强制更新 0:不强制升级 1:强制升级
     */
    public Integer getMustUpdate() {
        return mustUpdate;
    }

    /**
     * 设置强制升级 是否强制更新 0:不强制升级 1:强制升级
     *
     * @param mustUpdate 强制升级 是否强制更新 0:不强制升级 1:强制升级
     */
    public void setMustUpdate(Integer mustUpdate) {
        this.mustUpdate = mustUpdate;
    }

    /**
     * 获取状态 0：未发布 1：已发布
     *
     * @return STATUS - 状态 0：未发布 1：已发布
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0：未发布 1：已发布
     *
     * @param status 状态 0：未发布 1：已发布
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * @param modifiedDate
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * @return CREATED_USER
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * @param createdUser
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * @return UPDATED_USER
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * @param updatedUser
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * @return VERSION_ID
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * @param versionId
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * @return CREATED_DATE
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return MARK_DELETE
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * @param markDelete
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", appVersion=").append(appVersion);
        sb.append(", url=").append(url);
        sb.append(", log=").append(log);
        sb.append(", mustUpdate=").append(mustUpdate);
        sb.append(", status=").append(status);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}