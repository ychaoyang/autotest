package dal.model.squid;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "y_coupon_head")
public class YCouponHeadDO implements Serializable {
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
     * 优惠券名称
     */
    @Column(name = "COUPON_NAME")
    private String couponName;

    /**
     * 优惠券类型
     */
    @Column(name = "COUPON_TYPE")
    private String couponType;

    /**
     * 类型,union:合作优惠券，wx微信券,default 默认
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 优惠券面额
     */
    @Column(name = "COUPON_PRICE")
    private Long couponPrice;

    /**
     * 获取方式
     */
    @Column(name = "GAIN_WAY")
    private String gainWay;

    /**
     * 有效期开始时间
     */
    @Column(name = "START_TIME")
    private Date startTime;

    /**
     * 有效期结束时间
     */
    @Column(name = "END_TIME")
    private Date endTime;

    /**
     * 是否需要领取
     */
    @Column(name = "COUPON_IS_GET")
    private String couponIsGet;

    /**
     * 每人限领取张数
     */
    @Column(name = "MAX_USER_GET")
    private Short maxUserGet;

    /**
     * 每人限使用次数
     */
    @Column(name = "MAX_USER_USE")
    private Short maxUserUse;

    /**
     * 最大叠加使用张数
     */
    @Column(name = "MAX_SUPERPOSITION")
    private Short maxSuperposition;

    /**
     * 单笔最高减免金额
     */
    @Column(name = "MAX_RELIEF_AMOUNT")
    private BigDecimal maxReliefAmount;

    /**
     * 优惠券发放数量
     */
    @Column(name = "NUMS_COUPON")
    private Integer numsCoupon;

    /**
     * 是否叠加使用
     */
    @Column(name = "USE_TOGETHER")
    private String useTogether;

    /**
     * 优惠总金额
     */
    @Column(name = "TOTAL_AMOUNT")
    private Long totalAmount;

    /**
     * 优惠状态
     */
    @Column(name = "COUPON_STATUS")
    private String couponStatus;

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

    /**
     * 使用条件
     */
    @Column(name = "COUPON_CONDITION")
    private String couponCondition;

    /**
     * 优惠券图片
     */
    @Column(name = "COUPON_PICTURE")
    private String couponPicture;

    /**
     * 优惠详情
     */
    @Column(name = "COUPON_DETAIL")
    private String couponDetail;

    /**
     * 使用详情
     */
    @Column(name = "USE_DETAIL")
    private String useDetail;

    /**
     * 领取条件
     */
    @Column(name = "GET_CONDITION")
    private String getCondition;

    /**
     * 满减/扣条件
     */
    @Column(name = "PRICE_CONDITION")
    private String priceCondition;

    /**
     * 备注
     */
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
     * 获取优惠券名称
     *
     * @return COUPON_NAME - 优惠券名称
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * 设置优惠券名称
     *
     * @param couponName 优惠券名称
     */
    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    /**
     * 获取优惠券类型
     *
     * @return COUPON_TYPE - 优惠券类型
     */
    public String getCouponType() {
        return couponType;
    }

    /**
     * 设置优惠券类型
     *
     * @param couponType 优惠券类型
     */
    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    /**
     * 获取类型,union:合作优惠券，wx微信券,default 默认
     *
     * @return TYPE - 类型,union:合作优惠券，wx微信券,default 默认
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型,union:合作优惠券，wx微信券,default 默认
     *
     * @param type 类型,union:合作优惠券，wx微信券,default 默认
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取优惠券面额
     *
     * @return COUPON_PRICE - 优惠券面额
     */
    public Long getCouponPrice() {
        return couponPrice;
    }

    /**
     * 设置优惠券面额
     *
     * @param couponPrice 优惠券面额
     */
    public void setCouponPrice(Long couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * 获取获取方式
     *
     * @return GAIN_WAY - 获取方式
     */
    public String getGainWay() {
        return gainWay;
    }

    /**
     * 设置获取方式
     *
     * @param gainWay 获取方式
     */
    public void setGainWay(String gainWay) {
        this.gainWay = gainWay;
    }

    /**
     * 获取有效期开始时间
     *
     * @return START_TIME - 有效期开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置有效期开始时间
     *
     * @param startTime 有效期开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取有效期结束时间
     *
     * @return END_TIME - 有效期结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置有效期结束时间
     *
     * @param endTime 有效期结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取是否需要领取
     *
     * @return COUPON_IS_GET - 是否需要领取
     */
    public String getCouponIsGet() {
        return couponIsGet;
    }

    /**
     * 设置是否需要领取
     *
     * @param couponIsGet 是否需要领取
     */
    public void setCouponIsGet(String couponIsGet) {
        this.couponIsGet = couponIsGet;
    }

    /**
     * 获取每人限领取张数
     *
     * @return MAX_USER_GET - 每人限领取张数
     */
    public Short getMaxUserGet() {
        return maxUserGet;
    }

    /**
     * 设置每人限领取张数
     *
     * @param maxUserGet 每人限领取张数
     */
    public void setMaxUserGet(Short maxUserGet) {
        this.maxUserGet = maxUserGet;
    }

    /**
     * 获取每人限使用次数
     *
     * @return MAX_USER_USE - 每人限使用次数
     */
    public Short getMaxUserUse() {
        return maxUserUse;
    }

    /**
     * 设置每人限使用次数
     *
     * @param maxUserUse 每人限使用次数
     */
    public void setMaxUserUse(Short maxUserUse) {
        this.maxUserUse = maxUserUse;
    }

    /**
     * 获取最大叠加使用张数
     *
     * @return MAX_SUPERPOSITION - 最大叠加使用张数
     */
    public Short getMaxSuperposition() {
        return maxSuperposition;
    }

    /**
     * 设置最大叠加使用张数
     *
     * @param maxSuperposition 最大叠加使用张数
     */
    public void setMaxSuperposition(Short maxSuperposition) {
        this.maxSuperposition = maxSuperposition;
    }

    /**
     * 获取单笔最高减免金额
     *
     * @return MAX_RELIEF_AMOUNT - 单笔最高减免金额
     */
    public BigDecimal getMaxReliefAmount() {
        return maxReliefAmount;
    }

    /**
     * 设置单笔最高减免金额
     *
     * @param maxReliefAmount 单笔最高减免金额
     */
    public void setMaxReliefAmount(BigDecimal maxReliefAmount) {
        this.maxReliefAmount = maxReliefAmount;
    }

    /**
     * 获取优惠券发放数量
     *
     * @return NUMS_COUPON - 优惠券发放数量
     */
    public Integer getNumsCoupon() {
        return numsCoupon;
    }

    /**
     * 设置优惠券发放数量
     *
     * @param numsCoupon 优惠券发放数量
     */
    public void setNumsCoupon(Integer numsCoupon) {
        this.numsCoupon = numsCoupon;
    }

    /**
     * 获取是否叠加使用
     *
     * @return USE_TOGETHER - 是否叠加使用
     */
    public String getUseTogether() {
        return useTogether;
    }

    /**
     * 设置是否叠加使用
     *
     * @param useTogether 是否叠加使用
     */
    public void setUseTogether(String useTogether) {
        this.useTogether = useTogether;
    }

    /**
     * 获取优惠总金额
     *
     * @return TOTAL_AMOUNT - 优惠总金额
     */
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置优惠总金额
     *
     * @param totalAmount 优惠总金额
     */
    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取优惠状态
     *
     * @return COUPON_STATUS - 优惠状态
     */
    public String getCouponStatus() {
        return couponStatus;
    }

    /**
     * 设置优惠状态
     *
     * @param couponStatus 优惠状态
     */
    public void setCouponStatus(String couponStatus) {
        this.couponStatus = couponStatus;
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

    /**
     * 获取使用条件
     *
     * @return COUPON_CONDITION - 使用条件
     */
    public String getCouponCondition() {
        return couponCondition;
    }

    /**
     * 设置使用条件
     *
     * @param couponCondition 使用条件
     */
    public void setCouponCondition(String couponCondition) {
        this.couponCondition = couponCondition;
    }

    /**
     * 获取优惠券图片
     *
     * @return COUPON_PICTURE - 优惠券图片
     */
    public String getCouponPicture() {
        return couponPicture;
    }

    /**
     * 设置优惠券图片
     *
     * @param couponPicture 优惠券图片
     */
    public void setCouponPicture(String couponPicture) {
        this.couponPicture = couponPicture;
    }

    /**
     * 获取优惠详情
     *
     * @return COUPON_DETAIL - 优惠详情
     */
    public String getCouponDetail() {
        return couponDetail;
    }

    /**
     * 设置优惠详情
     *
     * @param couponDetail 优惠详情
     */
    public void setCouponDetail(String couponDetail) {
        this.couponDetail = couponDetail;
    }

    /**
     * 获取使用详情
     *
     * @return USE_DETAIL - 使用详情
     */
    public String getUseDetail() {
        return useDetail;
    }

    /**
     * 设置使用详情
     *
     * @param useDetail 使用详情
     */
    public void setUseDetail(String useDetail) {
        this.useDetail = useDetail;
    }

    /**
     * 获取领取条件
     *
     * @return GET_CONDITION - 领取条件
     */
    public String getGetCondition() {
        return getCondition;
    }

    /**
     * 设置领取条件
     *
     * @param getCondition 领取条件
     */
    public void setGetCondition(String getCondition) {
        this.getCondition = getCondition;
    }

    /**
     * 获取满减/扣条件
     *
     * @return PRICE_CONDITION - 满减/扣条件
     */
    public String getPriceCondition() {
        return priceCondition;
    }

    /**
     * 设置满减/扣条件
     *
     * @param priceCondition 满减/扣条件
     */
    public void setPriceCondition(String priceCondition) {
        this.priceCondition = priceCondition;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
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
        sb.append(", platformId=").append(platformId);
        sb.append(", supplierHeadId=").append(supplierHeadId);
        sb.append(", shopHeadId=").append(shopHeadId);
        sb.append(", couponName=").append(couponName);
        sb.append(", couponType=").append(couponType);
        sb.append(", type=").append(type);
        sb.append(", couponPrice=").append(couponPrice);
        sb.append(", gainWay=").append(gainWay);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", couponIsGet=").append(couponIsGet);
        sb.append(", maxUserGet=").append(maxUserGet);
        sb.append(", maxUserUse=").append(maxUserUse);
        sb.append(", maxSuperposition=").append(maxSuperposition);
        sb.append(", maxReliefAmount=").append(maxReliefAmount);
        sb.append(", numsCoupon=").append(numsCoupon);
        sb.append(", useTogether=").append(useTogether);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", couponStatus=").append(couponStatus);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", couponCondition=").append(couponCondition);
        sb.append(", couponPicture=").append(couponPicture);
        sb.append(", couponDetail=").append(couponDetail);
        sb.append(", useDetail=").append(useDetail);
        sb.append(", getCondition=").append(getCondition);
        sb.append(", priceCondition=").append(priceCondition);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}