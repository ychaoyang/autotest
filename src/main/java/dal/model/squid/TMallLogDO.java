package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_mall_log")
public class TMallLogDO implements Serializable {
    /**
     * 商城用户操作日志ID
     */
    @Id
    @Column(name = "MALL_LOG_ID")
    private Long mallLogId;

    /**
     * 商城用户ID
     */
    @Column(name = "MALL_HEAD_ID")
    private Long mallHeadId;

    /**
     * 商城子用户ID
     */
    @Column(name = "MALL_SUBUSER_ID")
    private Long mallSubuserId;

    /**
     * 商城用户登录时间
     */
    @Column(name = "MALL_LOG_DATE")
    private Date mallLogDate;

    /**
     * 商城用户登录IP
     */
    @Column(name = "MALL_LOG_IP")
    private String mallLogIp;

    /**
     * 商城用户操作类型
     */
    @Column(name = "MALL_LOG_RECORD")
    private String mallLogRecord;

    /**
     * 商城用户操作详细记录
     */
    @Column(name = "MALL_LOG_MEMO")
    private String mallLogMemo;

    /**
     * 商城用户操作标志
     */
    @Column(name = "MALL_LOG_FLAG")
    private String mallLogFlag;

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

    /**
     * 商城用户类型
     */
    @Column(name = "MALL_LOG_USERTYPE")
    private String mallLogUsertype;

    /**
     * 商城登录号
     */
    @Column(name = "MALL_HEAD_LOGINNO")
    private String mallHeadLoginno;

    /**
     * 商城子用户登录号
     */
    @Column(name = "MALL_SUBUSER_NO")
    private String mallSubuserNo;

    /**
     * 纳税税率金额
     */
    @Column(name = "TAX_RATE_AMOUNT")
    private Long taxRateAmount;

    private static final long serialVersionUID = 1L;

    /**
     * 获取商城用户操作日志ID
     *
     * @return MALL_LOG_ID - 商城用户操作日志ID
     */
    public Long getMallLogId() {
        return mallLogId;
    }

    /**
     * 设置商城用户操作日志ID
     *
     * @param mallLogId 商城用户操作日志ID
     */
    public void setMallLogId(Long mallLogId) {
        this.mallLogId = mallLogId;
    }

    /**
     * 获取商城用户ID
     *
     * @return MALL_HEAD_ID - 商城用户ID
     */
    public Long getMallHeadId() {
        return mallHeadId;
    }

    /**
     * 设置商城用户ID
     *
     * @param mallHeadId 商城用户ID
     */
    public void setMallHeadId(Long mallHeadId) {
        this.mallHeadId = mallHeadId;
    }

    /**
     * 获取商城子用户ID
     *
     * @return MALL_SUBUSER_ID - 商城子用户ID
     */
    public Long getMallSubuserId() {
        return mallSubuserId;
    }

    /**
     * 设置商城子用户ID
     *
     * @param mallSubuserId 商城子用户ID
     */
    public void setMallSubuserId(Long mallSubuserId) {
        this.mallSubuserId = mallSubuserId;
    }

    /**
     * 获取商城用户登录时间
     *
     * @return MALL_LOG_DATE - 商城用户登录时间
     */
    public Date getMallLogDate() {
        return mallLogDate;
    }

    /**
     * 设置商城用户登录时间
     *
     * @param mallLogDate 商城用户登录时间
     */
    public void setMallLogDate(Date mallLogDate) {
        this.mallLogDate = mallLogDate;
    }

    /**
     * 获取商城用户登录IP
     *
     * @return MALL_LOG_IP - 商城用户登录IP
     */
    public String getMallLogIp() {
        return mallLogIp;
    }

    /**
     * 设置商城用户登录IP
     *
     * @param mallLogIp 商城用户登录IP
     */
    public void setMallLogIp(String mallLogIp) {
        this.mallLogIp = mallLogIp;
    }

    /**
     * 获取商城用户操作类型
     *
     * @return MALL_LOG_RECORD - 商城用户操作类型
     */
    public String getMallLogRecord() {
        return mallLogRecord;
    }

    /**
     * 设置商城用户操作类型
     *
     * @param mallLogRecord 商城用户操作类型
     */
    public void setMallLogRecord(String mallLogRecord) {
        this.mallLogRecord = mallLogRecord;
    }

    /**
     * 获取商城用户操作详细记录
     *
     * @return MALL_LOG_MEMO - 商城用户操作详细记录
     */
    public String getMallLogMemo() {
        return mallLogMemo;
    }

    /**
     * 设置商城用户操作详细记录
     *
     * @param mallLogMemo 商城用户操作详细记录
     */
    public void setMallLogMemo(String mallLogMemo) {
        this.mallLogMemo = mallLogMemo;
    }

    /**
     * 获取商城用户操作标志
     *
     * @return MALL_LOG_FLAG - 商城用户操作标志
     */
    public String getMallLogFlag() {
        return mallLogFlag;
    }

    /**
     * 设置商城用户操作标志
     *
     * @param mallLogFlag 商城用户操作标志
     */
    public void setMallLogFlag(String mallLogFlag) {
        this.mallLogFlag = mallLogFlag;
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

    /**
     * 获取商城用户类型
     *
     * @return MALL_LOG_USERTYPE - 商城用户类型
     */
    public String getMallLogUsertype() {
        return mallLogUsertype;
    }

    /**
     * 设置商城用户类型
     *
     * @param mallLogUsertype 商城用户类型
     */
    public void setMallLogUsertype(String mallLogUsertype) {
        this.mallLogUsertype = mallLogUsertype;
    }

    /**
     * 获取商城登录号
     *
     * @return MALL_HEAD_LOGINNO - 商城登录号
     */
    public String getMallHeadLoginno() {
        return mallHeadLoginno;
    }

    /**
     * 设置商城登录号
     *
     * @param mallHeadLoginno 商城登录号
     */
    public void setMallHeadLoginno(String mallHeadLoginno) {
        this.mallHeadLoginno = mallHeadLoginno;
    }

    /**
     * 获取商城子用户登录号
     *
     * @return MALL_SUBUSER_NO - 商城子用户登录号
     */
    public String getMallSubuserNo() {
        return mallSubuserNo;
    }

    /**
     * 设置商城子用户登录号
     *
     * @param mallSubuserNo 商城子用户登录号
     */
    public void setMallSubuserNo(String mallSubuserNo) {
        this.mallSubuserNo = mallSubuserNo;
    }

    /**
     * 获取纳税税率金额
     *
     * @return TAX_RATE_AMOUNT - 纳税税率金额
     */
    public Long getTaxRateAmount() {
        return taxRateAmount;
    }

    /**
     * 设置纳税税率金额
     *
     * @param taxRateAmount 纳税税率金额
     */
    public void setTaxRateAmount(Long taxRateAmount) {
        this.taxRateAmount = taxRateAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", mallLogId=").append(mallLogId);
        sb.append(", mallHeadId=").append(mallHeadId);
        sb.append(", mallSubuserId=").append(mallSubuserId);
        sb.append(", mallLogDate=").append(mallLogDate);
        sb.append(", mallLogIp=").append(mallLogIp);
        sb.append(", mallLogRecord=").append(mallLogRecord);
        sb.append(", mallLogMemo=").append(mallLogMemo);
        sb.append(", mallLogFlag=").append(mallLogFlag);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", mallLogUsertype=").append(mallLogUsertype);
        sb.append(", mallHeadLoginno=").append(mallHeadLoginno);
        sb.append(", mallSubuserNo=").append(mallSubuserNo);
        sb.append(", taxRateAmount=").append(taxRateAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}