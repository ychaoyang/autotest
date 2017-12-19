package dal.model.squid;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "y_coupon_weixin")
public class YCouponWeixinDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 优惠券id
     */
    @Column(name = "COUPON_HEAD_ID")
    private BigDecimal couponHeadId;

    /**
     * 微信卡券Id
     */
    @Column(name = "CARD_ID")
    private String cardId;

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
     * 卡券json结构
     */
    @Column(name = "CARD_JSON")
    private String cardJson;

    /**
     * 图文内图片链接
     */
    @Column(name = "IMAGE_URL")
    private String imageUrl;

    /**
     * 图文内文字
     */
    @Column(name = "TEXT")
    private String text;

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
     * 获取优惠券id
     *
     * @return COUPON_HEAD_ID - 优惠券id
     */
    public BigDecimal getCouponHeadId() {
        return couponHeadId;
    }

    /**
     * 设置优惠券id
     *
     * @param couponHeadId 优惠券id
     */
    public void setCouponHeadId(BigDecimal couponHeadId) {
        this.couponHeadId = couponHeadId;
    }

    /**
     * 获取微信卡券Id
     *
     * @return CARD_ID - 微信卡券Id
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置微信卡券Id
     *
     * @param cardId 微信卡券Id
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
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
     * 获取卡券json结构
     *
     * @return CARD_JSON - 卡券json结构
     */
    public String getCardJson() {
        return cardJson;
    }

    /**
     * 设置卡券json结构
     *
     * @param cardJson 卡券json结构
     */
    public void setCardJson(String cardJson) {
        this.cardJson = cardJson;
    }

    /**
     * 获取图文内图片链接
     *
     * @return IMAGE_URL - 图文内图片链接
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置图文内图片链接
     *
     * @param imageUrl 图文内图片链接
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 获取图文内文字
     *
     * @return TEXT - 图文内文字
     */
    public String getText() {
        return text;
    }

    /**
     * 设置图文内文字
     *
     * @param text 图文内文字
     */
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", couponHeadId=").append(couponHeadId);
        sb.append(", cardId=").append(cardId);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", cardJson=").append(cardJson);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", text=").append(text);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}