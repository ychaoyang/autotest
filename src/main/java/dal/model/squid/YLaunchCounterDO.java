package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "y_launch_counter")
public class YLaunchCounterDO implements Serializable {
    /**
     * 主键id
     */
    @Id
    @Column(name = "entity_id")
    private String entityId;

    /**
     * 投放id
     */
    @Id
    @Column(name = "launch_id")
    private String launchId;

    /**
     * 投放主体id
     */
    @Column(name = "launch_biz_id")
    private String launchBizId;

    /**
     * OPERATOR : 加油员
     */
    @Column(name = "launch_biz_type")
    private String launchBizType;

    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "UPDATED_USER")
    private String updatedUser;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "MARK_DELETE")
    private String markDelete;

    @Column(name = "VERSION_ID")
    private Integer versionId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id
     *
     * @return entity_id - 主键id
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * 设置主键id
     *
     * @param entityId 主键id
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取投放id
     *
     * @return launch_id - 投放id
     */
    public String getLaunchId() {
        return launchId;
    }

    /**
     * 设置投放id
     *
     * @param launchId 投放id
     */
    public void setLaunchId(String launchId) {
        this.launchId = launchId;
    }

    /**
     * 获取投放主体id
     *
     * @return launch_biz_id - 投放主体id
     */
    public String getLaunchBizId() {
        return launchBizId;
    }

    /**
     * 设置投放主体id
     *
     * @param launchBizId 投放主体id
     */
    public void setLaunchBizId(String launchBizId) {
        this.launchBizId = launchBizId;
    }

    /**
     * 获取OPERATOR : 加油员
     *
     * @return launch_biz_type - OPERATOR : 加油员
     */
    public String getLaunchBizType() {
        return launchBizType;
    }

    /**
     * 设置OPERATOR : 加油员
     *
     * @param launchBizType OPERATOR : 加油员
     */
    public void setLaunchBizType(String launchBizType) {
        this.launchBizType = launchBizType;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", launchId=").append(launchId);
        sb.append(", launchBizId=").append(launchBizId);
        sb.append(", launchBizType=").append(launchBizType);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", versionId=").append(versionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}