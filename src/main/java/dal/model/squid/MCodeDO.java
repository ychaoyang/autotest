package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_code")
public class MCodeDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * CODE分组名称
     */
    @Column(name = "CODE_NAME")
    private String codeName;

    /**
     * CODE KEY
     */
    @Column(name = "CODE_KEY")
    private String codeKey;

    /**
     * CODE VALUE
     */
    @Column(name = "CODE_VALUE")
    private String codeValue;

    /**
     * 同组显示顺序
     */
    @Column(name = "ORDER_BY")
    private Long orderBy;

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
     * 创建用户
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 修改用户
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 版本ID
     */
    @Column(name = "VERSION_ID")
    private Long versionId;

    /**
     * 删除标记
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    @Column(name = "REMARK")
    private String remark;

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
     * 获取CODE分组名称
     *
     * @return CODE_NAME - CODE分组名称
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * 设置CODE分组名称
     *
     * @param codeName CODE分组名称
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    /**
     * 获取CODE KEY
     *
     * @return CODE_KEY - CODE KEY
     */
    public String getCodeKey() {
        return codeKey;
    }

    /**
     * 设置CODE KEY
     *
     * @param codeKey CODE KEY
     */
    public void setCodeKey(String codeKey) {
        this.codeKey = codeKey;
    }

    /**
     * 获取CODE VALUE
     *
     * @return CODE_VALUE - CODE VALUE
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * 设置CODE VALUE
     *
     * @param codeValue CODE VALUE
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    /**
     * 获取同组显示顺序
     *
     * @return ORDER_BY - 同组显示顺序
     */
    public Long getOrderBy() {
        return orderBy;
    }

    /**
     * 设置同组显示顺序
     *
     * @param orderBy 同组显示顺序
     */
    public void setOrderBy(Long orderBy) {
        this.orderBy = orderBy;
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
     * 获取创建用户
     *
     * @return CREATED_USER - 创建用户
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * 设置创建用户
     *
     * @param createdUser 创建用户
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * 获取修改用户
     *
     * @return UPDATED_USER - 修改用户
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * 设置修改用户
     *
     * @param updatedUser 修改用户
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * 获取版本ID
     *
     * @return VERSION_ID - 版本ID
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 设置版本ID
     *
     * @param versionId 版本ID
     */
    public void setVersionId(Long versionId) {
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
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", codeName=").append(codeName);
        sb.append(", codeKey=").append(codeKey);
        sb.append(", codeValue=").append(codeValue);
        sb.append(", orderBy=").append(orderBy);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}