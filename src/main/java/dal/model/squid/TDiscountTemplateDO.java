package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_discount_template")
public class TDiscountTemplateDO implements Serializable {
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 折扣名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 额度
     */
    @Column(name = "QUOTA")
    private Long quota;

    /**
     * 数量
     */
    @Column(name = "QUANTITY")
    private Long quantity;

    /**
     * 折扣率
     */
    @Column(name = "DISCOUNT_RATE")
    private Double discountRate;

    /**
     * 行业ID
     */
    @Column(name = "INDUSTRY_ID")
    private String industryId;

    /**
     * 有效期（开始时间）
     */
    @Column(name = "VALIDITY_PERIOD_START")
    private Date validityPeriodStart;

    /**
     * 有效期（截止时间）
     */
    @Column(name = "VALIDITY_PERIOD_END")
    private Date validityPeriodEnd;

    /**
     * 状态（启用：Y，未关闭:N）
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 已生效数量
     */
    @Column(name = "USED_QUANTITY")
    private Long usedQuantity;

    /**
     * 是否有行业客户绑定（Y：是，N:否）
     */
    @Column(name = "HAVE_PERSON")
    private String havePerson;

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
     * 创建人
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 修改人
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 是否删除
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    /**
     * 版本号
     */
    @Column(name = "VERSION_ID")
    private Integer versionId;

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
     * 获取折扣名称
     *
     * @return NAME - 折扣名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置折扣名称
     *
     * @param name 折扣名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取额度
     *
     * @return QUOTA - 额度
     */
    public Long getQuota() {
        return quota;
    }

    /**
     * 设置额度
     *
     * @param quota 额度
     */
    public void setQuota(Long quota) {
        this.quota = quota;
    }

    /**
     * 获取数量
     *
     * @return QUANTITY - 数量
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * 设置数量
     *
     * @param quantity 数量
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取折扣率
     *
     * @return DISCOUNT_RATE - 折扣率
     */
    public Double getDiscountRate() {
        return discountRate;
    }

    /**
     * 设置折扣率
     *
     * @param discountRate 折扣率
     */
    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * 获取行业ID
     *
     * @return INDUSTRY_ID - 行业ID
     */
    public String getIndustryId() {
        return industryId;
    }

    /**
     * 设置行业ID
     *
     * @param industryId 行业ID
     */
    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    /**
     * 获取有效期（开始时间）
     *
     * @return VALIDITY_PERIOD_START - 有效期（开始时间）
     */
    public Date getValidityPeriodStart() {
        return validityPeriodStart;
    }

    /**
     * 设置有效期（开始时间）
     *
     * @param validityPeriodStart 有效期（开始时间）
     */
    public void setValidityPeriodStart(Date validityPeriodStart) {
        this.validityPeriodStart = validityPeriodStart;
    }

    /**
     * 获取有效期（截止时间）
     *
     * @return VALIDITY_PERIOD_END - 有效期（截止时间）
     */
    public Date getValidityPeriodEnd() {
        return validityPeriodEnd;
    }

    /**
     * 设置有效期（截止时间）
     *
     * @param validityPeriodEnd 有效期（截止时间）
     */
    public void setValidityPeriodEnd(Date validityPeriodEnd) {
        this.validityPeriodEnd = validityPeriodEnd;
    }

    /**
     * 获取状态（启用：Y，未关闭:N）
     *
     * @return STATUS - 状态（启用：Y，未关闭:N）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态（启用：Y，未关闭:N）
     *
     * @param status 状态（启用：Y，未关闭:N）
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取已生效数量
     *
     * @return USED_QUANTITY - 已生效数量
     */
    public Long getUsedQuantity() {
        return usedQuantity;
    }

    /**
     * 设置已生效数量
     *
     * @param usedQuantity 已生效数量
     */
    public void setUsedQuantity(Long usedQuantity) {
        this.usedQuantity = usedQuantity;
    }

    /**
     * 获取是否有行业客户绑定（Y：是，N:否）
     *
     * @return HAVE_PERSON - 是否有行业客户绑定（Y：是，N:否）
     */
    public String getHavePerson() {
        return havePerson;
    }

    /**
     * 设置是否有行业客户绑定（Y：是，N:否）
     *
     * @param havePerson 是否有行业客户绑定（Y：是，N:否）
     */
    public void setHavePerson(String havePerson) {
        this.havePerson = havePerson;
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
     * 获取创建人
     *
     * @return CREATED_USER - 创建人
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * 设置创建人
     *
     * @param createdUser 创建人
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * 获取修改人
     *
     * @return UPDATED_USER - 修改人
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * 设置修改人
     *
     * @param updatedUser 修改人
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * 获取是否删除
     *
     * @return MARK_DELETE - 是否删除
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置是否删除
     *
     * @param markDelete 是否删除
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete;
    }

    /**
     * 获取版本号
     *
     * @return VERSION_ID - 版本号
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * 设置版本号
     *
     * @param versionId 版本号
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", name=").append(name);
        sb.append(", quota=").append(quota);
        sb.append(", quantity=").append(quantity);
        sb.append(", discountRate=").append(discountRate);
        sb.append(", industryId=").append(industryId);
        sb.append(", validityPeriodStart=").append(validityPeriodStart);
        sb.append(", validityPeriodEnd=").append(validityPeriodEnd);
        sb.append(", status=").append(status);
        sb.append(", usedQuantity=").append(usedQuantity);
        sb.append(", havePerson=").append(havePerson);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", versionId=").append(versionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}