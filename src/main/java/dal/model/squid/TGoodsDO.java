package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_goods")
public class TGoodsDO implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ENTITY_ID")
    private String entityId;

    /**
     * 商品编码
     */
    @Column(name = "GOODS_CODE")
    private String goodsCode;

    /**
     * 商品名称
     */
    @Column(name = "GOODS_NAME")
    private String goodsName;

    /**
     * 商品图片
     */
    @Column(name = "PICTURE")
    private String picture;

    /**
     * 销售价格
     */
    @Column(name = "SALE_PRICE")
    private Long salePrice;

    /**
     * 实际价值
     */
    @Column(name = "ACTUAL_VALUE")
    private Long actualValue;

    /**
     * 库存
     */
    @Column(name = "STOCK")
    private Long stock;

    /**
     * 销量
     */
    @Column(name = "SALES_VOLUME")
    private Long salesVolume;

    /**
     * 外链地址
     */
    @Column(name = "EXTERNAL_LINK")
    private String externalLink;

    /**
     * 商品开始时间
     */
    @Column(name = "START_TIME")
    private Date startTime;

    /**
     * 商品结束时间
     */
    @Column(name = "END_TIME")
    private Date endTime;

    /**
     * 状态
     */
    @Column(name = "GOODS_STATUS")
    private String goodsStatus;

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

    /**
     * 商品详情
     */
    @Column(name = "DETAIL")
    private String detail;

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
     * 获取商品编码
     *
     * @return GOODS_CODE - 商品编码
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 设置商品编码
     *
     * @param goodsCode 商品编码
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    /**
     * 获取商品名称
     *
     * @return GOODS_NAME - 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称
     *
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取商品图片
     *
     * @return PICTURE - 商品图片
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置商品图片
     *
     * @param picture 商品图片
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取销售价格
     *
     * @return SALE_PRICE - 销售价格
     */
    public Long getSalePrice() {
        return salePrice;
    }

    /**
     * 设置销售价格
     *
     * @param salePrice 销售价格
     */
    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 获取实际价值
     *
     * @return ACTUAL_VALUE - 实际价值
     */
    public Long getActualValue() {
        return actualValue;
    }

    /**
     * 设置实际价值
     *
     * @param actualValue 实际价值
     */
    public void setActualValue(Long actualValue) {
        this.actualValue = actualValue;
    }

    /**
     * 获取库存
     *
     * @return STOCK - 库存
     */
    public Long getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Long stock) {
        this.stock = stock;
    }

    /**
     * 获取销量
     *
     * @return SALES_VOLUME - 销量
     */
    public Long getSalesVolume() {
        return salesVolume;
    }

    /**
     * 设置销量
     *
     * @param salesVolume 销量
     */
    public void setSalesVolume(Long salesVolume) {
        this.salesVolume = salesVolume;
    }

    /**
     * 获取外链地址
     *
     * @return EXTERNAL_LINK - 外链地址
     */
    public String getExternalLink() {
        return externalLink;
    }

    /**
     * 设置外链地址
     *
     * @param externalLink 外链地址
     */
    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }

    /**
     * 获取商品开始时间
     *
     * @return START_TIME - 商品开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置商品开始时间
     *
     * @param startTime 商品开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取商品结束时间
     *
     * @return END_TIME - 商品结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置商品结束时间
     *
     * @param endTime 商品结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取状态
     *
     * @return GOODS_STATUS - 状态
     */
    public String getGoodsStatus() {
        return goodsStatus;
    }

    /**
     * 设置状态
     *
     * @param goodsStatus 状态
     */
    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
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

    /**
     * 获取商品详情
     *
     * @return DETAIL - 商品详情
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置商品详情
     *
     * @param detail 商品详情
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", picture=").append(picture);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", actualValue=").append(actualValue);
        sb.append(", stock=").append(stock);
        sb.append(", salesVolume=").append(salesVolume);
        sb.append(", externalLink=").append(externalLink);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", goodsStatus=").append(goodsStatus);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}