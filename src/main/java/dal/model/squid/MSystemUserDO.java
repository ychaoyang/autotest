package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_system_user")
public class MSystemUserDO implements Serializable {
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    @Column(name = "USRE_NAME")
    private String usreName;

    /**
     * 用户类型（商家 管理）
     */
    @Column(name = "USRE_TYPE")
    private String usreType;

    /**
     * 商家ID（管理用户为NULL）
     */
    @Column(name = "SUPPLIER_ID")
    private Integer supplierId;

    @Column(name = "PASSWORD")
    private String password;

    /**
     * 姓名
     */
    @Column(name = "REAL_NAME")
    private String realName;

    /**
     * 电话
     */
    @Column(name = "USER_TELE")
    private String userTele;

    /**
     * 电子邮件
     */
    @Column(name = "USER_EMAIL")
    private String userEmail;

    /**
     * 地址
     */
    @Column(name = "USER_ADDRESS")
    private String userAddress;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 用户登录次数
     */
    @Column(name = "LOGIN_COUNT")
    private Integer loginCount;

    /**
     * LAST IP
     */
    @Column(name = "LAST_IP")
    private String lastIp;

    /**
     * 最后一次登录时间
     */
    @Column(name = "LAST_TIME")
    private Date lastTime;

    /**
     * 是否被锁定 是 Y 不是 N
     */
    @Column(name = "IS_LOCKED")
    private String isLocked;

    /**
     * QQ号码
     */
    @Column(name = "USER_QQ_NO")
    private String userQqNo;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "UPDATED_USER")
    private String updatedUser;

    @Column(name = "VERSION_ID")
    private Long versionId;

    @Column(name = "MARK_DELETE")
    private String markDelete;

    private static final long serialVersionUID = 1L;

    /**
     * @return ENTITY_ID
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * @param entityId
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * @return USRE_NAME
     */
    public String getUsreName() {
        return usreName;
    }

    /**
     * @param usreName
     */
    public void setUsreName(String usreName) {
        this.usreName = usreName;
    }

    /**
     * 获取用户类型（商家 管理）
     *
     * @return USRE_TYPE - 用户类型（商家 管理）
     */
    public String getUsreType() {
        return usreType;
    }

    /**
     * 设置用户类型（商家 管理）
     *
     * @param usreType 用户类型（商家 管理）
     */
    public void setUsreType(String usreType) {
        this.usreType = usreType;
    }

    /**
     * 获取商家ID（管理用户为NULL）
     *
     * @return SUPPLIER_ID - 商家ID（管理用户为NULL）
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 设置商家ID（管理用户为NULL）
     *
     * @param supplierId 商家ID（管理用户为NULL）
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取姓名
     *
     * @return REAL_NAME - 姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置姓名
     *
     * @param realName 姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取电话
     *
     * @return USER_TELE - 电话
     */
    public String getUserTele() {
        return userTele;
    }

    /**
     * 设置电话
     *
     * @param userTele 电话
     */
    public void setUserTele(String userTele) {
        this.userTele = userTele;
    }

    /**
     * 获取电子邮件
     *
     * @return USER_EMAIL - 电子邮件
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置电子邮件
     *
     * @param userEmail 电子邮件
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取地址
     *
     * @return USER_ADDRESS - 地址
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 设置地址
     *
     * @param userAddress 地址
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取用户登录次数
     *
     * @return LOGIN_COUNT - 用户登录次数
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * 设置用户登录次数
     *
     * @param loginCount 用户登录次数
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * 获取LAST IP
     *
     * @return LAST_IP - LAST IP
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * 设置LAST IP
     *
     * @param lastIp LAST IP
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    /**
     * 获取最后一次登录时间
     *
     * @return LAST_TIME - 最后一次登录时间
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * 设置最后一次登录时间
     *
     * @param lastTime 最后一次登录时间
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * 获取是否被锁定 是 Y 不是 N
     *
     * @return IS_LOCKED - 是否被锁定 是 Y 不是 N
     */
    public String getIsLocked() {
        return isLocked;
    }

    /**
     * 设置是否被锁定 是 Y 不是 N
     *
     * @param isLocked 是否被锁定 是 Y 不是 N
     */
    public void setIsLocked(String isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * 获取QQ号码
     *
     * @return USER_QQ_NO - QQ号码
     */
    public String getUserQqNo() {
        return userQqNo;
    }

    /**
     * 设置QQ号码
     *
     * @param userQqNo QQ号码
     */
    public void setUserQqNo(String userQqNo) {
        this.userQqNo = userQqNo;
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
     * @return VERSION_ID
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * @param versionId
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", usreName=").append(usreName);
        sb.append(", usreType=").append(usreType);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", password=").append(password);
        sb.append(", realName=").append(realName);
        sb.append(", userTele=").append(userTele);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", remark=").append(remark);
        sb.append(", loginCount=").append(loginCount);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isLocked=").append(isLocked);
        sb.append(", userQqNo=").append(userQqNo);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}