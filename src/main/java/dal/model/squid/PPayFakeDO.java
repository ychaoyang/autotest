package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "p_pay_fake")
public class PPayFakeDO implements Serializable {
    /**
     * 订单id
     */
    @Id
    private String id;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 充值账户类型
     */
    private String type;

    /**
     * 充值账户id
     */
    @Column(name = "account_id")
    private String accountId;

    /**
     * 充值金额
     */
    private Integer amount;

    /**
     * 充值状态
     */
    private String status;

    /**
     * 充值后余额
     */
    private Integer balance;

    /**
     * 充值时间
     */
    @Column(name = "deposit_date")
    private Date depositDate;

    /**
     * 创建人
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 修改人
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 修改时间
     */
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    /**
     * 删除标识
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
     * 获取订单id
     *
     * @return id - 订单id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置订单id
     *
     * @param id 订单id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取订单编号
     *
     * @return order_no - 订单编号
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
     * 获取充值账户类型
     *
     * @return type - 充值账户类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置充值账户类型
     *
     * @param type 充值账户类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取充值账户id
     *
     * @return account_id - 充值账户id
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置充值账户id
     *
     * @param accountId 充值账户id
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取充值金额
     *
     * @return amount - 充值金额
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置充值金额
     *
     * @param amount 充值金额
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取充值状态
     *
     * @return status - 充值状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置充值状态
     *
     * @param status 充值状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取充值后余额
     *
     * @return balance - 充值后余额
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * 设置充值后余额
     *
     * @param balance 充值后余额
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * 获取充值时间
     *
     * @return deposit_date - 充值时间
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
     * 获取删除标识
     *
     * @return MARK_DELETE - 删除标识
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置删除标识
     *
     * @param markDelete 删除标识
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
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", type=").append(type);
        sb.append(", accountId=").append(accountId);
        sb.append(", amount=").append(amount);
        sb.append(", status=").append(status);
        sb.append(", balance=").append(balance);
        sb.append(", depositDate=").append(depositDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", versionId=").append(versionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}