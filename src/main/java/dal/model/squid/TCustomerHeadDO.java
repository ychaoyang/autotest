package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_customer_head")
public class TCustomerHeadDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private String entityId;

    /**
     * 登录名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 用户名称
     */
    @Column(name = "NICK_NAME")
    private String nickName;

    /**
     * 手机号码
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 类型[Y:已注册,N:未注册]
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 注册时间
     */
    @Column(name = "REGISTRATION_TIME")
    private Date registrationTime;

    /**
     * 渠道(1:android 2:ios 后面渠道自行扩展)
     */
    @Column(name = "CHANNEL")
    private String channel;

    /**
     * 手机唯一标识
     */
    @Column(name = "IMEI")
    private String imei;

    /**
     * 头像
     */
    @Column(name = "HEAD_IMG_URL")
    private String headImgUrl;

    /**
     * 是否停用(Y:是，N:否)
     */
    @Column(name = "LOCKED")
    private String locked;

    /**
     * 用户app系统类型  Android   iOS
     */
    @Column(name = "SYSTEM_TYPE")
    private String systemType;

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
     * 创建人
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 修改人
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 是否删除
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
     * 获取主键
     *
     * @return ENTITY_ID - 主键
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * 设置主键
     *
     * @param entityId 主键
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取登录名
     *
     * @return USER_NAME - 登录名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置登录名
     *
     * @param userName 登录名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户名称
     *
     * @return NICK_NAME - 用户名称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置用户名称
     *
     * @param nickName 用户名称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取手机号码
     *
     * @return PHONE - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取类型[Y:已注册,N:未注册]
     *
     * @return TYPE - 类型[Y:已注册,N:未注册]
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型[Y:已注册,N:未注册]
     *
     * @param type 类型[Y:已注册,N:未注册]
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取注册时间
     *
     * @return REGISTRATION_TIME - 注册时间
     */
    public Date getRegistrationTime() {
        return registrationTime;
    }

    /**
     * 设置注册时间
     *
     * @param registrationTime 注册时间
     */
    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    /**
     * 获取渠道(1:android 2:ios 后面渠道自行扩展)
     *
     * @return CHANNEL - 渠道(1:android 2:ios 后面渠道自行扩展)
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置渠道(1:android 2:ios 后面渠道自行扩展)
     *
     * @param channel 渠道(1:android 2:ios 后面渠道自行扩展)
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 获取手机唯一标识
     *
     * @return IMEI - 手机唯一标识
     */
    public String getImei() {
        return imei;
    }

    /**
     * 设置手机唯一标识
     *
     * @param imei 手机唯一标识
     */
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * 获取头像
     *
     * @return HEAD_IMG_URL - 头像
     */
    public String getHeadImgUrl() {
        return headImgUrl;
    }

    /**
     * 设置头像
     *
     * @param headImgUrl 头像
     */
    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    /**
     * 获取是否停用(Y:是，N:否)
     *
     * @return LOCKED - 是否停用(Y:是，N:否)
     */
    public String getLocked() {
        return locked;
    }

    /**
     * 设置是否停用(Y:是，N:否)
     *
     * @param locked 是否停用(Y:是，N:否)
     */
    public void setLocked(String locked) {
        this.locked = locked;
    }

    /**
     * 获取用户app系统类型  Android   iOS
     *
     * @return SYSTEM_TYPE - 用户app系统类型  Android   iOS
     */
    public String getSystemType() {
        return systemType;
    }

    /**
     * 设置用户app系统类型  Android   iOS
     *
     * @param systemType 用户app系统类型  Android   iOS
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType;
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
     * 获取是否删除
     *
     * @return MARK_DELETE - 是否删除
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置是否删除
     *
     * @param markDelete 是否删除
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
        sb.append(", entityId=").append(entityId);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", nickName=").append(nickName);
        sb.append(", phone=").append(phone);
        sb.append(", type=").append(type);
        sb.append(", registrationTime=").append(registrationTime);
        sb.append(", channel=").append(channel);
        sb.append(", imei=").append(imei);
        sb.append(", headImgUrl=").append(headImgUrl);
        sb.append(", locked=").append(locked);
        sb.append(", systemType=").append(systemType);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", versionId=").append(versionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}