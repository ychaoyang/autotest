package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_sms_code")
public class TSmsCodeDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 号码
     */
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;

    /**
     * 验证码
     */
    @Column(name = "VERIFICATION_CODE")
    private String verificationCode;

    /**
     * 用途
     */
    @Column(name = "PURPOSE")
    private String purpose;

    /**
     * Y-有效 N-已失效
     */
    @Column(name = "VERIFIED")
    private String verified;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 更新时间
     */
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "UPDATED_USER")
    private String updatedUser;

    @Column(name = "VERSION_ID")
    private Integer versionId;

    /**
     * 删除标记
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

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
     * 获取号码
     *
     * @return SERIAL_NUMBER - 号码
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置号码
     *
     * @param serialNumber 号码
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * 获取验证码
     *
     * @return VERIFICATION_CODE - 验证码
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * 设置验证码
     *
     * @param verificationCode 验证码
     */
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    /**
     * 获取用途
     *
     * @return PURPOSE - 用途
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 设置用途
     *
     * @param purpose 用途
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * 获取Y-有效 N-已失效
     *
     * @return VERIFIED - Y-有效 N-已失效
     */
    public String getVerified() {
        return verified;
    }

    /**
     * 设置Y-有效 N-已失效
     *
     * @param verified Y-有效 N-已失效
     */
    public void setVerified(String verified) {
        this.verified = verified;
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
     * 获取更新时间
     *
     * @return MODIFIED_DATE - 更新时间
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 设置更新时间
     *
     * @param modifiedDate 更新时间
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
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", verificationCode=").append(verificationCode);
        sb.append(", purpose=").append(purpose);
        sb.append(", verified=").append(verified);
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