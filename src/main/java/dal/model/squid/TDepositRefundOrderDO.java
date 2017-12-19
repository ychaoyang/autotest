package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_deposit_refund_order")
public class TDepositRefundOrderDO implements Serializable {
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
     * 退款订单号
     */
    @Column(name = "REFUND_ORDER_NO")
    private String refundOrderNo;

    /**
     * 充值订单号
     */
    @Column(name = "DEPOSIT_ORDER_NO")
    private String depositOrderNo;

    /**
     * 退款金额
     */
    @Column(name = "REFUND_AMOUNT")
    private Long refundAmount;

    /**
     * 退款时间
     */
    @Column(name = "REFUND_DATE")
    private Date refundDate;

    /**
     * 完成时间
     */
    @Column(name = "FINISH_DATE")
    private Date finishDate;

    /**
     * 退款状态
     */
    @Column(name = "REFUND_STATUS")
    private String refundStatus;

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
     * 获取退款订单号
     *
     * @return REFUND_ORDER_NO - 退款订单号
     */
    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    /**
     * 设置退款订单号
     *
     * @param refundOrderNo 退款订单号
     */
    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    /**
     * 获取充值订单号
     *
     * @return DEPOSIT_ORDER_NO - 充值订单号
     */
    public String getDepositOrderNo() {
        return depositOrderNo;
    }

    /**
     * 设置充值订单号
     *
     * @param depositOrderNo 充值订单号
     */
    public void setDepositOrderNo(String depositOrderNo) {
        this.depositOrderNo = depositOrderNo;
    }

    /**
     * 获取退款金额
     *
     * @return REFUND_AMOUNT - 退款金额
     */
    public Long getRefundAmount() {
        return refundAmount;
    }

    /**
     * 设置退款金额
     *
     * @param refundAmount 退款金额
     */
    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 获取退款时间
     *
     * @return REFUND_DATE - 退款时间
     */
    public Date getRefundDate() {
        return refundDate;
    }

    /**
     * 设置退款时间
     *
     * @param refundDate 退款时间
     */
    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
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
     * 获取退款状态
     *
     * @return REFUND_STATUS - 退款状态
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * 设置退款状态
     *
     * @param refundStatus 退款状态
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
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
        sb.append(", refundOrderNo=").append(refundOrderNo);
        sb.append(", depositOrderNo=").append(depositOrderNo);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", refundDate=").append(refundDate);
        sb.append(", finishDate=").append(finishDate);
        sb.append(", refundStatus=").append(refundStatus);
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