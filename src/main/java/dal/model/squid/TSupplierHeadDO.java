package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_supplier_head")
public class TSupplierHeadDO implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Integer entityId;

    /**
     * 商家名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 商户id
     */
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 创建人
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 修改时间
     */
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    /**
     * 修改人
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 版本ID
     */
    @Column(name = "VERSION_ID")
    private Integer versionId;

    /**
     * 逻辑删除
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    /**
     * 父主键
     */
    @Column(name = "PID")
    private Integer pid;

    /**
     * 手续费率
     */
    @Column(name = "FEE_RATE")
    private Double feeRate;

    /**
     * 抓取数据地址
     */
    @Column(name = "COPY_DATA_URL")
    private String copyDataUrl;

    /**
     * 商户私钥
     */
    @Column(name = "PRIVATE_KEY")
    private String privateKey;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return ENTITY_ID - id
     */
    public Integer getEntityId() {
        return entityId;
    }

    /**
     * 设置id
     *
     * @param entityId id
     */
    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取商家名称
     *
     * @return NAME - 商家名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商家名称
     *
     * @param name 商家名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商户id
     *
     * @return ACCOUNT_ID - 商户id
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置商户id
     *
     * @param accountId 商户id
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
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
     * 获取版本ID
     *
     * @return VERSION_ID - 版本ID
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * 设置版本ID
     *
     * @param versionId 版本ID
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * 获取逻辑删除
     *
     * @return MARK_DELETE - 逻辑删除
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置逻辑删除
     *
     * @param markDelete 逻辑删除
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete;
    }

    /**
     * 获取父主键
     *
     * @return PID - 父主键
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置父主键
     *
     * @param pid 父主键
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取手续费率
     *
     * @return FEE_RATE - 手续费率
     */
    public Double getFeeRate() {
        return feeRate;
    }

    /**
     * 设置手续费率
     *
     * @param feeRate 手续费率
     */
    public void setFeeRate(Double feeRate) {
        this.feeRate = feeRate;
    }

    /**
     * 获取抓取数据地址
     *
     * @return COPY_DATA_URL - 抓取数据地址
     */
    public String getCopyDataUrl() {
        return copyDataUrl;
    }

    /**
     * 设置抓取数据地址
     *
     * @param copyDataUrl 抓取数据地址
     */
    public void setCopyDataUrl(String copyDataUrl) {
        this.copyDataUrl = copyDataUrl;
    }

    /**
     * 获取商户私钥
     *
     * @return PRIVATE_KEY - 商户私钥
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * 设置商户私钥
     *
     * @param privateKey 商户私钥
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", name=").append(name);
        sb.append(", accountId=").append(accountId);
        sb.append(", status=").append(status);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", pid=").append(pid);
        sb.append(", feeRate=").append(feeRate);
        sb.append(", copyDataUrl=").append(copyDataUrl);
        sb.append(", privateKey=").append(privateKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}