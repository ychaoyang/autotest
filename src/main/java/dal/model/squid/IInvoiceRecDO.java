package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "i_invoice_rec")
public class IInvoiceRecDO implements Serializable {
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
     * 商品名称
     */
    @Column(name = "GOODS_NAME")
    private String goodsName;

    /**
     * 发票编号
     */
    @Column(name = "INVOICE_NO")
    private String invoiceNo;

    /**
     * 发票(开票)金额,单位:分
     */
    @Column(name = "INVOICE_AMOUNT")
    private Long invoiceAmount;

    /**
     * 发票类型,详见:InvoiceEnum
     */
    @Column(name = "INVOICE_TYPE")
    private String invoiceType;

    /**
     * 审核状态,详AuditEnum
     */
    @Column(name = "AUDIT_STATUS")
    private String auditStatus;

    /**
     * 发票邮费支付状态,,详见:PayEnum
     */
    @Column(name = "PAY_STATUS")
    private String payStatus;

    /**
     * 支付方式,详见:PayModel枚举
     */
    @Column(name = "PAY_TYPE")
    private String payType;

    /**
     * 审核不通过理由
     */
    @Column(name = "REASON")
    private String reason;

    /**
     * 收件人姓名
     */
    @Column(name = "TRAGET_NAME")
    private String tragetName;

    /**
     * 收件人联系方式
     */
    @Column(name = "TRAGET_PHONE")
    private String tragetPhone;

    /**
     * 收件人地址
     */
    @Column(name = "TRAGET_ADDRESS")
    private String tragetAddress;

    /**
     * 订单信息json数据,格式:{"orderNo":"123456","amount":100}
     */
    @Column(name = "ORDER_INFO")
    private String orderInfo;

    /**
     * 电子发票url地址
     */
    @Column(name = "IMG_URL")
    private String imgUrl;

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

    /**
     * 用户名称
     */
    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    /**
     * 邮件地址
     */
    @Column(name = "E_MAIL")
    private String eMail;

    /**
     * 税率(%)
     */
    @Column(name = "RATE")
    private Integer rate;

    /**
     * 税额:分
     */
    @Column(name = "RATE_AMOUNT")
    private Integer rateAmount;

    /**
     * 税价合计:分
     */
    @Column(name = "RATE_COUNT_AMOUNT")
    private Integer rateCountAmount;

    /**
     * 快递名称
     */
    @Column(name = "EXPRESS_NAME")
    private String expressName;

    /**
     *  快递单号
     */
    @Column(name = "EXPRESS_CODE")
    private String expressCode;

    /**
     * 快递费用
     */
    @Column(name = "EXPRESS_AMOUNT")
    private Integer expressAmount;

    /**
     * 多次支付时支付单号
     */
    @Column(name = "INVOICE_PAY_NO")
    private String invoicePayNo;

    /**
     * 商品类型
     */
    @Column(name = "GOODS_TYPE")
    private String goodsType;

    /**
     * 用户昵称
     */
    @Column(name = "customer_nick_name")
    private String customerNickName;

    /**
     * 发票代码
     */
    @Column(name = "INVOICE_CODE")
    private String invoiceCode;

    /**
     * 发票号码
     */
    @Column(name = "INVOICE_NUM")
    private String invoiceNum;

    /**
     * 发票URL地址
     */
    @Column(name = "INVOICE_URL")
    private String invoiceUrl;

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
     * 获取商品名称
     *
     * @return GOODS_NAME - 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称
     *
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取发票编号
     *
     * @return INVOICE_NO - 发票编号
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * 设置发票编号
     *
     * @param invoiceNo 发票编号
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * 获取发票(开票)金额,单位:分
     *
     * @return INVOICE_AMOUNT - 发票(开票)金额,单位:分
     */
    public Long getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * 设置发票(开票)金额,单位:分
     *
     * @param invoiceAmount 发票(开票)金额,单位:分
     */
    public void setInvoiceAmount(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * 获取发票类型,详见:InvoiceEnum
     *
     * @return INVOICE_TYPE - 发票类型,详见:InvoiceEnum
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置发票类型,详见:InvoiceEnum
     *
     * @param invoiceType 发票类型,详见:InvoiceEnum
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * 获取审核状态,详AuditEnum
     *
     * @return AUDIT_STATUS - 审核状态,详AuditEnum
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置审核状态,详AuditEnum
     *
     * @param auditStatus 审核状态,详AuditEnum
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取发票邮费支付状态,,详见:PayEnum
     *
     * @return PAY_STATUS - 发票邮费支付状态,,详见:PayEnum
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * 设置发票邮费支付状态,,详见:PayEnum
     *
     * @param payStatus 发票邮费支付状态,,详见:PayEnum
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取支付方式,详见:PayModel枚举
     *
     * @return PAY_TYPE - 支付方式,详见:PayModel枚举
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置支付方式,详见:PayModel枚举
     *
     * @param payType 支付方式,详见:PayModel枚举
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * 获取审核不通过理由
     *
     * @return REASON - 审核不通过理由
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置审核不通过理由
     *
     * @param reason 审核不通过理由
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取收件人姓名
     *
     * @return TRAGET_NAME - 收件人姓名
     */
    public String getTragetName() {
        return tragetName;
    }

    /**
     * 设置收件人姓名
     *
     * @param tragetName 收件人姓名
     */
    public void setTragetName(String tragetName) {
        this.tragetName = tragetName;
    }

    /**
     * 获取收件人联系方式
     *
     * @return TRAGET_PHONE - 收件人联系方式
     */
    public String getTragetPhone() {
        return tragetPhone;
    }

    /**
     * 设置收件人联系方式
     *
     * @param tragetPhone 收件人联系方式
     */
    public void setTragetPhone(String tragetPhone) {
        this.tragetPhone = tragetPhone;
    }

    /**
     * 获取收件人地址
     *
     * @return TRAGET_ADDRESS - 收件人地址
     */
    public String getTragetAddress() {
        return tragetAddress;
    }

    /**
     * 设置收件人地址
     *
     * @param tragetAddress 收件人地址
     */
    public void setTragetAddress(String tragetAddress) {
        this.tragetAddress = tragetAddress;
    }

    /**
     * 获取订单信息json数据,格式:{"orderNo":"123456","amount":100}
     *
     * @return ORDER_INFO - 订单信息json数据,格式:{"orderNo":"123456","amount":100}
     */
    public String getOrderInfo() {
        return orderInfo;
    }

    /**
     * 设置订单信息json数据,格式:{"orderNo":"123456","amount":100}
     *
     * @param orderInfo 订单信息json数据,格式:{"orderNo":"123456","amount":100}
     */
    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    /**
     * 获取电子发票url地址
     *
     * @return IMG_URL - 电子发票url地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置电子发票url地址
     *
     * @param imgUrl 电子发票url地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * @return OPEN_TYPE
     */
    public String getOpenType() {
        return openType;
    }

    /**
     * @param openType
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

    /**
     * 获取用户名称
     *
     * @return CUSTOMER_NAME - 用户名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置用户名称
     *
     * @param customerName 用户名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 获取邮件地址
     *
     * @return E_MAIL - 邮件地址
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * 设置邮件地址
     *
     * @param eMail 邮件地址
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * 获取税率(%)
     *
     * @return RATE - 税率(%)
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * 设置税率(%)
     *
     * @param rate 税率(%)
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * 获取税额:分
     *
     * @return RATE_AMOUNT - 税额:分
     */
    public Integer getRateAmount() {
        return rateAmount;
    }

    /**
     * 设置税额:分
     *
     * @param rateAmount 税额:分
     */
    public void setRateAmount(Integer rateAmount) {
        this.rateAmount = rateAmount;
    }

    /**
     * 获取税价合计:分
     *
     * @return RATE_COUNT_AMOUNT - 税价合计:分
     */
    public Integer getRateCountAmount() {
        return rateCountAmount;
    }

    /**
     * 设置税价合计:分
     *
     * @param rateCountAmount 税价合计:分
     */
    public void setRateCountAmount(Integer rateCountAmount) {
        this.rateCountAmount = rateCountAmount;
    }

    /**
     * 获取快递名称
     *
     * @return EXPRESS_NAME - 快递名称
     */
    public String getExpressName() {
        return expressName;
    }

    /**
     * 设置快递名称
     *
     * @param expressName 快递名称
     */
    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    /**
     * 获取 快递单号
     *
     * @return EXPRESS_CODE -  快递单号
     */
    public String getExpressCode() {
        return expressCode;
    }

    /**
     * 设置 快递单号
     *
     * @param expressCode  快递单号
     */
    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    /**
     * 获取快递费用
     *
     * @return EXPRESS_AMOUNT - 快递费用
     */
    public Integer getExpressAmount() {
        return expressAmount;
    }

    /**
     * 设置快递费用
     *
     * @param expressAmount 快递费用
     */
    public void setExpressAmount(Integer expressAmount) {
        this.expressAmount = expressAmount;
    }

    /**
     * 获取多次支付时支付单号
     *
     * @return INVOICE_PAY_NO - 多次支付时支付单号
     */
    public String getInvoicePayNo() {
        return invoicePayNo;
    }

    /**
     * 设置多次支付时支付单号
     *
     * @param invoicePayNo 多次支付时支付单号
     */
    public void setInvoicePayNo(String invoicePayNo) {
        this.invoicePayNo = invoicePayNo;
    }

    /**
     * 获取商品类型
     *
     * @return GOODS_TYPE - 商品类型
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * 设置商品类型
     *
     * @param goodsType 商品类型
     */
    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * 获取用户昵称
     *
     * @return customer_nick_name - 用户昵称
     */
    public String getCustomerNickName() {
        return customerNickName;
    }

    /**
     * 设置用户昵称
     *
     * @param customerNickName 用户昵称
     */
    public void setCustomerNickName(String customerNickName) {
        this.customerNickName = customerNickName;
    }

    /**
     * 获取发票代码
     *
     * @return INVOICE_CODE - 发票代码
     */
    public String getInvoiceCode() {
        return invoiceCode;
    }

    /**
     * 设置发票代码
     *
     * @param invoiceCode 发票代码
     */
    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    /**
     * 获取发票号码
     *
     * @return INVOICE_NUM - 发票号码
     */
    public String getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * 设置发票号码
     *
     * @param invoiceNum 发票号码
     */
    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    /**
     * 获取发票URL地址
     *
     * @return INVOICE_URL - 发票URL地址
     */
    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    /**
     * 设置发票URL地址
     *
     * @param invoiceUrl 发票URL地址
     */
    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", customerId=").append(customerId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", invoiceNo=").append(invoiceNo);
        sb.append(", invoiceAmount=").append(invoiceAmount);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", payType=").append(payType);
        sb.append(", reason=").append(reason);
        sb.append(", tragetName=").append(tragetName);
        sb.append(", tragetPhone=").append(tragetPhone);
        sb.append(", tragetAddress=").append(tragetAddress);
        sb.append(", orderInfo=").append(orderInfo);
        sb.append(", imgUrl=").append(imgUrl);
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
        sb.append(", customerName=").append(customerName);
        sb.append(", eMail=").append(eMail);
        sb.append(", rate=").append(rate);
        sb.append(", rateAmount=").append(rateAmount);
        sb.append(", rateCountAmount=").append(rateCountAmount);
        sb.append(", expressName=").append(expressName);
        sb.append(", expressCode=").append(expressCode);
        sb.append(", expressAmount=").append(expressAmount);
        sb.append(", invoicePayNo=").append(invoicePayNo);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", customerNickName=").append(customerNickName);
        sb.append(", invoiceCode=").append(invoiceCode);
        sb.append(", invoiceNum=").append(invoiceNum);
        sb.append(", invoiceUrl=").append(invoiceUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}