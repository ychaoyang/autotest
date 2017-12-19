package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_customer_password")
public class TCustomerPasswordDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private String entityId;

    /**
     * 用户ID
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 锁定时间
     */
    @Column(name = "LOCK_TIME")
    private Date lockTime;

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
     * 是否删除
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    /**
     * 版本号
     */
    @Column(name = "VERSION_ID")
    private Integer versionId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ENTITY_ID - 主键
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * 设置主键
     *
     * @param entityId 主键
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取用户ID
     *
     * @return CUSTOMER_ID - 用户ID
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置用户ID
     *
     * @param customerId 用户ID
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取锁定时间
     *
     * @return LOCK_TIME - 锁定时间
     */
    public Date getLockTime() {
        return lockTime;
    }

    /**
     * 设置锁定时间
     *
     * @param lockTime 锁定时间
     */
    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
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
     * 获取是否删除
     *
     * @return MARK_DELETE - 是否删除
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置是否删除
     *
     * @param markDelete 是否删除
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", customerId=").append(customerId);
        sb.append(", password=").append(password);
        sb.append(", lockTime=").append(lockTime);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", versionId=").append(versionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}