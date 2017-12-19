package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_pay_mode")
public class TPayModeDO implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ENTITY_ID")
    private String entityId;

    /**
     * 支付方式
     */
    @Column(name = "PAY_MODE")
    private String payMode;

    /**
     * 显示名称
     */
    @Column(name = "DISPLAY_NAME")
    private String displayName;

    /**
     * 是否启用(Y:启用,N:不启用)
     */
    @Column(name = "ENABLED")
    private String enabled;

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
     * 创建者
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 修改者
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 版本
     */
    @Column(name = "VERSION_ID")
    private Integer versionId;

    /**
     * 删除标记
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键ID
     *
     * @return ENTITY_ID - 主键ID
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * 设置主键ID
     *
     * @param entityId 主键ID
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取支付方式
     *
     * @return PAY_MODE - 支付方式
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * 设置支付方式
     *
     * @param payMode 支付方式
     */
    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    /**
     * 获取显示名称
     *
     * @return DISPLAY_NAME - 显示名称
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 设置显示名称
     *
     * @param displayName 显示名称
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 获取是否启用(Y:启用,N:不启用)
     *
     * @return ENABLED - 是否启用(Y:启用,N:不启用)
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * 设置是否启用(Y:启用,N:不启用)
     *
     * @param enabled 是否启用(Y:启用,N:不启用)
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
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
     * 获取创建者
     *
     * @return CREATED_USER - 创建者
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * 设置创建者
     *
     * @param createdUser 创建者
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * 获取修改者
     *
     * @return UPDATED_USER - 修改者
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * 设置修改者
     *
     * @param updatedUser 修改者
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * 获取版本
     *
     * @return VERSION_ID - 版本
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * 设置版本
     *
     * @param versionId 版本
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", payMode=").append(payMode);
        sb.append(", displayName=").append(displayName);
        sb.append(", enabled=").append(enabled);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}