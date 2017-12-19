package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "i_invoice_info")
public class IInvoiceInfoDO implements Serializable {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ENTITY_ID")
    private String entityId;

    /**
     * app用户id
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 开票类型 详情说明请看OpenEnum枚举
     */
    @Column(name = "OPEN_TYPE")
    private String openType;

    /**
     * 税号
     */
    @Column(name = "TAX_CODE")
    private String taxCode;

    /**
     * 公司名称
     */
    @Column(name = "COMPANY_NAME")
    private String companyName;

    /**
     * 公司(注册)地址
     */
    @Column(name = "COMPANY_ADDRESS")
    private String companyAddress;

    /**
     * 公司(注册)电话
     */
    @Column(name = "COMPANY_TELEPHONE")
    private String companyTelephone;

    /**
     * 银行名称
     */
    @Column(name = "BANK_NAME")
    private String bankName;

    /**
     * 开户行
     */
    @Column(name = "BANK_BRANCH")
    private String bankBranch;

    /**
     * 银行账号
     */
    @Column(name = "BANK_NO")
    private String bankNo;

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
     * 获取app用户id
     *
     * @return CUSTOMER_ID - app用户id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置app用户id
     *
     * @param customerId app用户id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取开票类型 详情说明请看OpenEnum枚举
     *
     * @return OPEN_TYPE - 开票类型 详情说明请看OpenEnum枚举
     */
    public String getOpenType() {
        return openType;
    }

    /**
     * 设置开票类型 详情说明请看OpenEnum枚举
     *
     * @param openType 开票类型 详情说明请看OpenEnum枚举
     */
    public void setOpenType(String openType) {
        this.openType = openType;
    }

    /**
     * 获取税号
     *
     * @return TAX_CODE - 税号
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * 设置税号
     *
     * @param taxCode 税号
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    /**
     * 获取公司名称
     *
     * @return COMPANY_NAME - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取公司(注册)地址
     *
     * @return COMPANY_ADDRESS - 公司(注册)地址
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * 设置公司(注册)地址
     *
     * @param companyAddress 公司(注册)地址
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * 获取公司(注册)电话
     *
     * @return COMPANY_TELEPHONE - 公司(注册)电话
     */
    public String getCompanyTelephone() {
        return companyTelephone;
    }

    /**
     * 设置公司(注册)电话
     *
     * @param companyTelephone 公司(注册)电话
     */
    public void setCompanyTelephone(String companyTelephone) {
        this.companyTelephone = companyTelephone;
    }

    /**
     * 获取银行名称
     *
     * @return BANK_NAME - 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名称
     *
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取开户行
     *
     * @return BANK_BRANCH - 开户行
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * 设置开户行
     *
     * @param bankBranch 开户行
     */
    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    /**
     * 获取银行账号
     *
     * @return BANK_NO - 银行账号
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * 设置银行账号
     *
     * @param bankNo 银行账号
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
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
        sb.append(", customerId=").append(customerId);
        sb.append(", openType=").append(openType);
        sb.append(", taxCode=").append(taxCode);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyAddress=").append(companyAddress);
        sb.append(", companyTelephone=").append(companyTelephone);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankBranch=").append(bankBranch);
        sb.append(", bankNo=").append(bankNo);
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