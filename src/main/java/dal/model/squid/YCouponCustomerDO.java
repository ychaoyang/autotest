package dal.model.squid;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "y_coupon_customer")
public class YCouponCustomerDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 平台id
     */
    @Column(name = "PLATFORM_ID")
    private BigDecimal platformId;

    /**
     * 商家ID
     */
    @Column(name = "SUPPLIER_HEAD_ID")
    private BigDecimal supplierHeadId;

    /**
     * 门店ID
     */
    @Column(name = "SHOP_HEAD_ID")
    private BigDecimal shopHeadId;

    /**
     * 使用实体类型
     */
    @Column(name = "ENTITY_TYPE")
    private String entityType;

    /**
     * 使用实体ID
     */
    @Column(name = "ENTITY_USE_ID")
    private String entityUseId;

    /**
     * 优惠券ID
     */
    @Column(name = "COUPON_HEAD_ID")
    private BigDecimal couponHeadId;

    /**
     * 优惠券编码
     */
    @Column(name = "COUPON_CODE")
    private String couponCode;

    /**
     * 投放渠道id
     */
    @Column(name = "LAUNCH_ID")
    private String launchId;

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
     * 获取平台id
     *
     * @return PLATFORM_ID - 平台id
     */
    public BigDecimal getPlatformId() {
        return platformId;
    }

    /**
     * 设置平台id
     *
     * @param platformId 平台id
     */
    public void setPlatformId(BigDecimal platformId) {
        this.platformId = platformId;
    }

    /**
     * 获取商家ID
     *
     * @return SUPPLIER_HEAD_ID - 商家ID
     */
    public BigDecimal getSupplierHeadId() {
        return supplierHeadId;
    }

    /**
     * 设置商家ID
     *
     * @param supplierHeadId 商家ID
     */
    public void setSupplierHeadId(BigDecimal supplierHeadId) {
        this.supplierHeadId = supplierHeadId;
    }

    /**
     * 获取门店ID
     *
     * @return SHOP_HEAD_ID - 门店ID
     */
    public BigDecimal getShopHeadId() {
        return shopHeadId;
    }

    /**
     * 设置门店ID
     *
     * @param shopHeadId 门店ID
     */
    public void setShopHeadId(BigDecimal shopHeadId) {
        this.shopHeadId = shopHeadId;
    }

    /**
     * 获取使用实体类型
     *
     * @return ENTITY_TYPE - 使用实体类型
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * 设置使用实体类型
     *
     * @param entityType 使用实体类型
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * 获取使用实体ID
     *
     * @return ENTITY_USE_ID - 使用实体ID
     */
    public String getEntityUseId() {
        return entityUseId;
    }

    /**
     * 设置使用实体ID
     *
     * @param entityUseId 使用实体ID
     */
    public void setEntityUseId(String entityUseId) {
        this.entityUseId = entityUseId;
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
     * 获取投放渠道id
     *
     * @return LAUNCH_ID - 投放渠道id
     */
    public String getLaunchId() {
        return launchId;
    }

    /**
     * 设置投放渠道id
     *
     * @param launchId 投放渠道id
     */
    public void setLaunchId(String launchId) {
        this.launchId = launchId;
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
        sb.append(", platformId=").append(platformId);
        sb.append(", supplierHeadId=").append(supplierHeadId);
        sb.append(", shopHeadId=").append(shopHeadId);
        sb.append(", entityType=").append(entityType);
        sb.append(", entityUseId=").append(entityUseId);
        sb.append(", couponHeadId=").append(couponHeadId);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", launchId=").append(launchId);
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