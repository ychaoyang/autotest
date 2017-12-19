package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_payment")
public class MPaymentDO implements Serializable {
    /**
     * 支付方式ID
     */
    @Id
    @Column(name = "PAYMENT_ID")
    private Long paymentId;

    /**
     * 支付方式名称
     */
    @Column(name = "PAYMENT_NAME")
    private String paymentName;

    /**
     * 支付方式详细信息如：邮局汇款的汇款地址、公司转帐的帐户信息等
     */
    @Column(name = "PAYMENT_INFO")
    private String paymentInfo;

    /**
     * 支付方式备注
     */
    @Column(name = "PAYMENT_MARK")
    private String paymentMark;

    /**
     * 支付方式标志
     */
    @Column(name = "PAYMENT_FLAG")
    private String paymentFlag;

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

    /**
     * 版本ID
     */
    @Column(name = "VERSION_ID")
    private Long versionId;

    /**
     * 删除标记
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    private static final long serialVersionUID = 1L;

    /**
     * 获取支付方式ID
     *
     * @return PAYMENT_ID - 支付方式ID
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * 设置支付方式ID
     *
     * @param paymentId 支付方式ID
     */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * 获取支付方式名称
     *
     * @return PAYMENT_NAME - 支付方式名称
     */
    public String getPaymentName() {
        return paymentName;
    }

    /**
     * 设置支付方式名称
     *
     * @param paymentName 支付方式名称
     */
    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    /**
     * 获取支付方式详细信息如：邮局汇款的汇款地址、公司转帐的帐户信息等
     *
     * @return PAYMENT_INFO - 支付方式详细信息如：邮局汇款的汇款地址、公司转帐的帐户信息等
     */
    public String getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * 设置支付方式详细信息如：邮局汇款的汇款地址、公司转帐的帐户信息等
     *
     * @param paymentInfo 支付方式详细信息如：邮局汇款的汇款地址、公司转帐的帐户信息等
     */
    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    /**
     * 获取支付方式备注
     *
     * @return PAYMENT_MARK - 支付方式备注
     */
    public String getPaymentMark() {
        return paymentMark;
    }

    /**
     * 设置支付方式备注
     *
     * @param paymentMark 支付方式备注
     */
    public void setPaymentMark(String paymentMark) {
        this.paymentMark = paymentMark;
    }

    /**
     * 获取支付方式标志
     *
     * @return PAYMENT_FLAG - 支付方式标志
     */
    public String getPaymentFlag() {
        return paymentFlag;
    }

    /**
     * 设置支付方式标志
     *
     * @param paymentFlag 支付方式标志
     */
    public void setPaymentFlag(String paymentFlag) {
        this.paymentFlag = paymentFlag;
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
     * 获取版本ID
     *
     * @return VERSION_ID - 版本ID
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 设置版本ID
     *
     * @param versionId 版本ID
     */
    public void setVersionId(Long versionId) {
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
        sb.append(", paymentId=").append(paymentId);
        sb.append(", paymentName=").append(paymentName);
        sb.append(", paymentInfo=").append(paymentInfo);
        sb.append(", paymentMark=").append(paymentMark);
        sb.append(", paymentFlag=").append(paymentFlag);
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