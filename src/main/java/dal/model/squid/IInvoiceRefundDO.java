package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "i_invoice_refund")
public class IInvoiceRefundDO implements Serializable {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ENTITY_ID")
    private String entityId;

    /**
     * 发票
     */
    @Column(name = "INVOICE_NO")
    private String invoiceNo;

    /**
     * 发票支付单号
     */
    @Column(name = "INVOICE_PAY_NO")
    private String invoicePayNo;

    /**
     * 退款编号
     */
    @Column(name = "REFUND_NO")
    private String refundNo;

    /**
     * 退款状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 最后一次修改时间
     */
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    /**
     * 创建人
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 最后一次修改人
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 版本号
     */
    @Column(name = "VERSION_ID")
    private Integer versionId;

    /**
     * 删除标识 Y:已删除 N:未删除
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id
     *
     * @return ENTITY_ID - 主键id
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * 设置主键id
     *
     * @param entityId 主键id
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取发票
     *
     * @return INVOICE_NO - 发票
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * 设置发票
     *
     * @param invoiceNo 发票
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * 获取发票支付单号
     *
     * @return INVOICE_PAY_NO - 发票支付单号
     */
    public String getInvoicePayNo() {
        return invoicePayNo;
    }

    /**
     * 设置发票支付单号
     *
     * @param invoicePayNo 发票支付单号
     */
    public void setInvoicePayNo(String invoicePayNo) {
        this.invoicePayNo = invoicePayNo;
    }

    /**
     * 获取退款编号
     *
     * @return REFUND_NO - 退款编号
     */
    public String getRefundNo() {
        return refundNo;
    }

    /**
     * 设置退款编号
     *
     * @param refundNo 退款编号
     */
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    /**
     * 获取退款状态
     *
     * @return STATUS - 退款状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置退款状态
     *
     * @param status 退款状态
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
     * 获取最后一次修改时间
     *
     * @return MODIFIED_DATE - 最后一次修改时间
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 设置最后一次修改时间
     *
     * @param modifiedDate 最后一次修改时间
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
     * 获取最后一次修改人
     *
     * @return UPDATED_USER - 最后一次修改人
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * 设置最后一次修改人
     *
     * @param updatedUser 最后一次修改人
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
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

    /**
     * 获取删除标识 Y:已删除 N:未删除
     *
     * @return MARK_DELETE - 删除标识 Y:已删除 N:未删除
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置删除标识 Y:已删除 N:未删除
     *
     * @param markDelete 删除标识 Y:已删除 N:未删除
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
        sb.append(", invoiceNo=").append(invoiceNo);
        sb.append(", invoicePayNo=").append(invoicePayNo);
        sb.append(", refundNo=").append(refundNo);
        sb.append(", status=").append(status);
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