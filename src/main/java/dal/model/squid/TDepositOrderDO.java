package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_deposit_order")
public class TDepositOrderDO implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ENTITY_ID")
    private String entityId;

    /**
     * 用户ID
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 账户ID
     */
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 订单号
     */
    @Column(name = "ORDER_NO")
    private String orderNo;

    /**
     * 支付单号
     */
    @Column(name = "PAY_NO")
    private String payNo;

    /**
     * 预支付单号(获取预支付信息时发给清结算的订单号)
     */
    @Column(name = "PREPAY_NO")
    private String prepayNo;

    /**
     * 充值金额
     */
    @Column(name = "AMOUNT")
    private Long amount;

    /**
     * 支付方式
     */
    @Column(name = "PAY_MODE")
    private String payMode;

    /**
     * 充值时间
     */
    @Column(name = "DEPOSIT_DATE")
    private Date depositDate;

    /**
     * 完成时间
     */
    @Column(name = "FINISH_DATE")
    private Date finishDate;

    /**
     * 油品标号
     */
    @Column(name = "OIL_NO")
    private String oilNo;

    /**
     * 订单状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 已开票金额
     */
    @Column(name = "INVOICED_AMOUNT")
    private Long invoicedAmount;

    /**
     * 手机号
     */
    @Column(name = "PHONE_NO")
    private String phoneNo;

    /**
     * 用户名称
     */
    @Column(name = "NICKNAME")
    private String nickname;

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
     * 获取订单号
     *
     * @return ORDER_NO - 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取支付单号
     *
     * @return PAY_NO - 支付单号
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * 设置支付单号
     *
     * @param payNo 支付单号
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    /**
     * 获取预支付单号(获取预支付信息时发给清结算的订单号)
     *
     * @return PREPAY_NO - 预支付单号(获取预支付信息时发给清结算的订单号)
     */
    public String getPrepayNo() {
        return prepayNo;
    }

    /**
     * 设置预支付单号(获取预支付信息时发给清结算的订单号)
     *
     * @param prepayNo 预支付单号(获取预支付信息时发给清结算的订单号)
     */
    public void setPrepayNo(String prepayNo) {
        this.prepayNo = prepayNo;
    }

    /**
     * 获取充值金额
     *
     * @return AMOUNT - 充值金额
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置充值金额
     *
     * @param amount 充值金额
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 获取支付方式
     *
     * @return PAY_MODE - 支付方式
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * 设置支付方式
     *
     * @param payMode 支付方式
     */
    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    /**
     * 获取充值时间
     *
     * @return DEPOSIT_DATE - 充值时间
     */
    public Date getDepositDate() {
        return depositDate;
    }

    /**
     * 设置充值时间
     *
     * @param depositDate 充值时间
     */
    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }

    /**
     * 获取完成时间
     *
     * @return FINISH_DATE - 完成时间
     */
    public Date getFinishDate() {
        return finishDate;
    }

    /**
     * 设置完成时间
     *
     * @param finishDate 完成时间
     */
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
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
     * 获取订单状态
     *
     * @return STATUS - 订单状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置订单状态
     *
     * @param status 订单状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取已开票金额
     *
     * @return INVOICED_AMOUNT - 已开票金额
     */
    public Long getInvoicedAmount() {
        return invoicedAmount;
    }

    /**
     * 设置已开票金额
     *
     * @param invoicedAmount 已开票金额
     */
    public void setInvoicedAmount(Long invoicedAmount) {
        this.invoicedAmount = invoicedAmount;
    }

    /**
     * 获取手机号
     *
     * @return PHONE_NO - 手机号
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设置手机号
     *
     * @param phoneNo 手机号
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * 获取用户名称
     *
     * @return NICKNAME - 用户名称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户名称
     *
     * @param nickname 用户名称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", customerId=").append(customerId);
        sb.append(", accountId=").append(accountId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", payNo=").append(payNo);
        sb.append(", prepayNo=").append(prepayNo);
        sb.append(", amount=").append(amount);
        sb.append(", payMode=").append(payMode);
        sb.append(", depositDate=").append(depositDate);
        sb.append(", finishDate=").append(finishDate);
        sb.append(", oilNo=").append(oilNo);
        sb.append(", status=").append(status);
        sb.append(", invoicedAmount=").append(invoicedAmount);
        sb.append(", phoneNo=").append(phoneNo);
        sb.append(", nickname=").append(nickname);
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