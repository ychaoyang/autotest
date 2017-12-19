package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_customer_account")
public class TCustomerAccountDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private String entityId;

    /**
     * 账户ID
     */
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 油品标号
     */
    @Column(name = "OIL_NO")
    private String oilNo;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 用户ID
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 总金额
     */
    @Column(name = "AMOUNT")
    private Long amount;

    /**
     * 类型[余额balance、折扣discount]
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 折扣率
     */
    @Column(name = "DISCOUNT_RATE")
    private Double discountRate;

    /**
     * 余额
     */
    @Column(name = "BALANCE")
    private Long balance;

    /**
     * 状态（已启用：Y，已禁用:N）
     */
    @Column(name = "STATUS")
    private String status;

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
     * 获取账户ID
     *
     * @return ACCOUNT_ID - 账户ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置账户ID
     *
     * @param accountId 账户ID
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取油品标号
     *
     * @return OIL_NO - 油品标号
     */
    public String getOilNo() {
        return oilNo;
    }

    /**
     * 设置油品标号
     *
     * @param oilNo 油品标号
     */
    public void setOilNo(String oilNo) {
        this.oilNo = oilNo;
    }

    /**
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户ID
     *
     * @return CUSTOMER_ID - 用户ID
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置用户ID
     *
     * @param customerId 用户ID
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取总金额
     *
     * @return AMOUNT - 总金额
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置总金额
     *
     * @param amount 总金额
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 获取类型[余额balance、折扣discount]
     *
     * @return TYPE - 类型[余额balance、折扣discount]
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型[余额balance、折扣discount]
     *
     * @param type 类型[余额balance、折扣discount]
     */
    public void setType(String type) {
        this.type = type;
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
     * 获取余额
     *
     * @return BALANCE - 余额
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * 获取状态（已启用：Y，已禁用:N）
     *
     * @return STATUS - 状态（已启用：Y，已禁用:N）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态（已启用：Y，已禁用:N）
     *
     * @param status 状态（已启用：Y，已禁用:N）
     */
    public void setStatus(String status) {
        this.status = status;
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
        sb.append(", accountId=").append(accountId);
        sb.append(", oilNo=").append(oilNo);
        sb.append(", name=").append(name);
        sb.append(", customerId=").append(customerId);
        sb.append(", amount=").append(amount);
        sb.append(", type=").append(type);
        sb.append(", discountRate=").append(discountRate);
        sb.append(", balance=").append(balance);
        sb.append(", status=").append(status);
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