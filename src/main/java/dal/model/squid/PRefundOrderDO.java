package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "p_refund_order")
public class PRefundOrderDO implements Serializable {
    @Id
    private String id;

    @Column(name = "refund_no")
    private String refundNo;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "out_refund_no")
    private String outRefundNo;

    @Column(name = "mch_id")
    private Integer mchId;

    @Column(name = "out_trade_no")
    private String outTradeNo;

    private String status;

    @Column(name = "refund_reason")
    private String refundReason;

    @Column(name = "refund_operator")
    private String refundOperator;

    private String remark;

    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "UPDATED_USER")
    private String updatedUser;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "MARK_DELETE")
    private String markDelete;

    @Column(name = "VERSION_ID")
    private Integer versionId;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return refund_no
     */
    public String getRefundNo() {
        return refundNo;
    }

    /**
     * @param refundNo
     */
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    /**
     * @return order_no
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return out_refund_no
     */
    public String getOutRefundNo() {
        return outRefundNo;
    }

    /**
     * @param outRefundNo
     */
    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    /**
     * @return mch_id
     */
    public Integer getMchId() {
        return mchId;
    }

    /**
     * @param mchId
     */
    public void setMchId(Integer mchId) {
        this.mchId = mchId;
    }

    /**
     * @return out_trade_no
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * @param outTradeNo
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return refund_reason
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * @param refundReason
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    /**
     * @return refund_operator
     */
    public String getRefundOperator() {
        return refundOperator;
    }

    /**
     * @param refundOperator
     */
    public void setRefundOperator(String refundOperator) {
        this.refundOperator = refundOperator;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return CREATED_USER
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * @param createdUser
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * @return CREATED_DATE
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return UPDATED_USER
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * @param updatedUser
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * @return MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * @param modifiedDate
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * @return MARK_DELETE
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * @param markDelete
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", refundNo=").append(refundNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", outRefundNo=").append(outRefundNo);
        sb.append(", mchId=").append(mchId);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", status=").append(status);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", refundOperator=").append(refundOperator);
        sb.append(", remark=").append(remark);
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