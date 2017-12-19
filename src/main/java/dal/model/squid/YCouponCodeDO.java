package dal.model.squid;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "y_coupon_code")
public class YCouponCodeDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 优惠券ID
     */
    @Column(name = "COUPON_HEAD_ID")
    private BigDecimal couponHeadId;

    /**
     * 渠道ID
     */
    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 优惠券编码
     */
    @Column(name = "COUPON_CODE")
    private String couponCode;

    /**
     * CODE状态
     */
    @Column(name = "CODE_STATE")
    private String codeState;

    /**
     * 锁定状态
     */
    @Column(name = "LOCK_STATE")
    private String lockState;

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
     * 获取优惠券ID
     *
     * @return COUPON_HEAD_ID - 优惠券ID
     */
    public BigDecimal getCouponHeadId() {
        return couponHeadId;
    }

    /**
     * 设置优惠券ID
     *
     * @param couponHeadId 优惠券ID
     */
    public void setCouponHeadId(BigDecimal couponHeadId) {
        this.couponHeadId = couponHeadId;
    }

    /**
     * 获取渠道ID
     *
     * @return CHANNEL_ID - 渠道ID
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 设置渠道ID
     *
     * @param channelId 渠道ID
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取优惠券编码
     *
     * @return COUPON_CODE - 优惠券编码
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * 设置优惠券编码
     *
     * @param couponCode 优惠券编码
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * 获取CODE状态
     *
     * @return CODE_STATE - CODE状态
     */
    public String getCodeState() {
        return codeState;
    }

    /**
     * 设置CODE状态
     *
     * @param codeState CODE状态
     */
    public void setCodeState(String codeState) {
        this.codeState = codeState;
    }

    /**
     * 获取锁定状态
     *
     * @return LOCK_STATE - 锁定状态
     */
    public String getLockState() {
        return lockState;
    }

    /**
     * 设置锁定状态
     *
     * @param lockState 锁定状态
     */
    public void setLockState(String lockState) {
        this.lockState = lockState;
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
        sb.append(", couponHeadId=").append(couponHeadId);
        sb.append(", channelId=").append(channelId);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", codeState=").append(codeState);
        sb.append(", lockState=").append(lockState);
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