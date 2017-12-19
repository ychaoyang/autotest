package dal.model.squid;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "y_coupon_record")
public class YCouponRecordDO implements Serializable {
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 卡券Id
     */
    @Column(name = "COUPON_HEAD_ID")
    private BigDecimal couponHeadId;

    /**
     * 使用实体id
     */
    @Column(name = "ENTITY_USE_ID")
    private String entityUseId;

    /**
     * 优惠券code
     */
    @Column(name = "COUPON_CODE")
    private String couponCode;

    /**
     * 使用时间
     */
    @Column(name = "USE_TIME")
    private Date useTime;

    /**
     * 减免金额
     */
    @Column(name = "REDUCE_AMOUNT")
    private Long reduceAmount;

    /**
     * 订单编号
     */
    @Column(name = "ORDER_NO")
    private String orderNo;

    /**
     * 核销人
     */
    @Column(name = "CONSUMED_ENTITY_ID")
    private BigDecimal consumedEntityId;

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
    private Integer versionId;

    /**
     * 删除标记
     */
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
     * 获取卡券Id
     *
     * @return COUPON_HEAD_ID - 卡券Id
     */
    public BigDecimal getCouponHeadId() {
        return couponHeadId;
    }

    /**
     * 设置卡券Id
     *
     * @param couponHeadId 卡券Id
     */
    public void setCouponHeadId(BigDecimal couponHeadId) {
        this.couponHeadId = couponHeadId;
    }

    /**
     * 获取使用实体id
     *
     * @return ENTITY_USE_ID - 使用实体id
     */
    public String getEntityUseId() {
        return entityUseId;
    }

    /**
     * 设置使用实体id
     *
     * @param entityUseId 使用实体id
     */
    public void setEntityUseId(String entityUseId) {
        this.entityUseId = entityUseId;
    }

    /**
     * 获取优惠券code
     *
     * @return COUPON_CODE - 优惠券code
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * 设置优惠券code
     *
     * @param couponCode 优惠券code
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * 获取使用时间
     *
     * @return USE_TIME - 使用时间
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * 设置使用时间
     *
     * @param useTime 使用时间
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * 获取减免金额
     *
     * @return REDUCE_AMOUNT - 减免金额
     */
    public Long getReduceAmount() {
        return reduceAmount;
    }

    /**
     * 设置减免金额
     *
     * @param reduceAmount 减免金额
     */
    public void setReduceAmount(Long reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    /**
     * 获取订单编号
     *
     * @return ORDER_NO - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取核销人
     *
     * @return CONSUMED_ENTITY_ID - 核销人
     */
    public BigDecimal getConsumedEntityId() {
        return consumedEntityId;
    }

    /**
     * 设置核销人
     *
     * @param consumedEntityId 核销人
     */
    public void setConsumedEntityId(BigDecimal consumedEntityId) {
        this.consumedEntityId = consumedEntityId;
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
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * 设置版本ID
     *
     * @param versionId 版本ID
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
        sb.append(", entityUseId=").append(entityUseId);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", useTime=").append(useTime);
        sb.append(", reduceAmount=").append(reduceAmount);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", consumedEntityId=").append(consumedEntityId);
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