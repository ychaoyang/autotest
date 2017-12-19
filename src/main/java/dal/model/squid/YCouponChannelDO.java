package dal.model.squid;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "y_coupon_channel")
public class YCouponChannelDO implements Serializable {
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
     * 渠道类型
     */
    @Column(name = "CHANNEL_TYPE")
    private String channelType;

    /**
     * 发放数量
     */
    @Column(name = "NUMS_COUPON")
    private Integer numsCoupon;

    /**
     * 领取量
     */
    @Column(name = "NUMS_RECEIVE")
    private Integer numsReceive;

    /**
     * 使用量
     */
    @Column(name = "NUMS_USE")
    private Integer numsUse;

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
     * 获取渠道类型
     *
     * @return CHANNEL_TYPE - 渠道类型
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * 设置渠道类型
     *
     * @param channelType 渠道类型
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * 获取发放数量
     *
     * @return NUMS_COUPON - 发放数量
     */
    public Integer getNumsCoupon() {
        return numsCoupon;
    }

    /**
     * 设置发放数量
     *
     * @param numsCoupon 发放数量
     */
    public void setNumsCoupon(Integer numsCoupon) {
        this.numsCoupon = numsCoupon;
    }

    /**
     * 获取领取量
     *
     * @return NUMS_RECEIVE - 领取量
     */
    public Integer getNumsReceive() {
        return numsReceive;
    }

    /**
     * 设置领取量
     *
     * @param numsReceive 领取量
     */
    public void setNumsReceive(Integer numsReceive) {
        this.numsReceive = numsReceive;
    }

    /**
     * 获取使用量
     *
     * @return NUMS_USE - 使用量
     */
    public Integer getNumsUse() {
        return numsUse;
    }

    /**
     * 设置使用量
     *
     * @param numsUse 使用量
     */
    public void setNumsUse(Integer numsUse) {
        this.numsUse = numsUse;
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
        sb.append(", channelType=").append(channelType);
        sb.append(", numsCoupon=").append(numsCoupon);
        sb.append(", numsReceive=").append(numsReceive);
        sb.append(", numsUse=").append(numsUse);
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