package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_industry_customer")
public class TIndustryCustomerDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private String entityId;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 折扣模板ID
     */
    @Column(name = "DISCOUNT_TEMPLATE_ID")
    private Long discountTemplateId;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 电话
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 行业ID
     */
    @Column(name = "INDUSTRY_ID")
    private String industryId;

    /**
     * 终端用户ID
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 终端用户折扣账户ID
     */
    @Column(name = "CUSTOMER_ACCOUNT_ID")
    private String customerAccountId;

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
     * 获取主键
     *
     * @return ENTITY_ID - 主键
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * 设置主键
     *
     * @param entityId 主键
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取姓名
     *
     * @return NAME - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取折扣模板ID
     *
     * @return DISCOUNT_TEMPLATE_ID - 折扣模板ID
     */
    public Long getDiscountTemplateId() {
        return discountTemplateId;
    }

    /**
     * 设置折扣模板ID
     *
     * @param discountTemplateId 折扣模板ID
     */
    public void setDiscountTemplateId(Long discountTemplateId) {
        this.discountTemplateId = discountTemplateId;
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取电话
     *
     * @return PHONE - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * 获取终端用户ID
     *
     * @return CUSTOMER_ID - 终端用户ID
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置终端用户ID
     *
     * @param customerId 终端用户ID
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取终端用户折扣账户ID
     *
     * @return CUSTOMER_ACCOUNT_ID - 终端用户折扣账户ID
     */
    public String getCustomerAccountId() {
        return customerAccountId;
    }

    /**
     * 设置终端用户折扣账户ID
     *
     * @param customerAccountId 终端用户折扣账户ID
     */
    public void setCustomerAccountId(String customerAccountId) {
        this.customerAccountId = customerAccountId;
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
        sb.append(", discountTemplateId=").append(discountTemplateId);
        sb.append(", status=").append(status);
        sb.append(", phone=").append(phone);
        sb.append(", industryId=").append(industryId);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerAccountId=").append(customerAccountId);
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