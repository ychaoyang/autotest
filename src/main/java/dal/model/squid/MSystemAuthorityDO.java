package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_system_authority")
public class MSystemAuthorityDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 权限唯一表示
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 名称，不重复
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 菜单ID
     */
    @Column(name = "MENU_ID")
    private Long menuId;

    /**
     * 权限类型:Button
     */
    @Column(name = "AUTH_TYPE")
    private String authType;

    /**
     * 权限访问地址
     */
    @Column(name = "AUTH_URL")
    private String authUrl;

    /**
     * 权限动作Add,Update,find
     */
    @Column(name = "AUTH_ACT")
    private String authAct;

    /**
     * 描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 创建用户
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

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
     * 是否写操作日志，Y是，N否
     */
    @Column(name = "WRITE_LOG")
    private String writeLog;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ENTITY_ID - 主键
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * 设置主键
     *
     * @param entityId 主键
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取权限唯一表示
     *
     * @return CODE - 权限唯一表示
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置权限唯一表示
     *
     * @param code 权限唯一表示
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取名称，不重复
     *
     * @return NAME - 名称，不重复
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称，不重复
     *
     * @param name 名称，不重复
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取菜单ID
     *
     * @return MENU_ID - 菜单ID
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单ID
     *
     * @param menuId 菜单ID
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取权限类型:Button
     *
     * @return AUTH_TYPE - 权限类型:Button
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * 设置权限类型:Button
     *
     * @param authType 权限类型:Button
     */
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * 获取权限访问地址
     *
     * @return AUTH_URL - 权限访问地址
     */
    public String getAuthUrl() {
        return authUrl;
    }

    /**
     * 设置权限访问地址
     *
     * @param authUrl 权限访问地址
     */
    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    /**
     * 获取权限动作Add,Update,find
     *
     * @return AUTH_ACT - 权限动作Add,Update,find
     */
    public String getAuthAct() {
        return authAct;
    }

    /**
     * 设置权限动作Add,Update,find
     *
     * @param authAct 权限动作Add,Update,find
     */
    public void setAuthAct(String authAct) {
        this.authAct = authAct;
    }

    /**
     * 获取描述
     *
     * @return DESCRIPTION - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
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
     * 获取是否写操作日志，Y是，N否
     *
     * @return WRITE_LOG - 是否写操作日志，Y是，N否
     */
    public String getWriteLog() {
        return writeLog;
    }

    /**
     * 设置是否写操作日志，Y是，N否
     *
     * @param writeLog 是否写操作日志，Y是，N否
     */
    public void setWriteLog(String writeLog) {
        this.writeLog = writeLog;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", menuId=").append(menuId);
        sb.append(", authType=").append(authType);
        sb.append(", authUrl=").append(authUrl);
        sb.append(", authAct=").append(authAct);
        sb.append(", description=").append(description);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", writeLog=").append(writeLog);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}