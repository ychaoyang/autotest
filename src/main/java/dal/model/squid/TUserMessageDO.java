package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_message")
public class TUserMessageDO implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 消息信息表中id
     */
    @Column(name = "MESSAGE_ID")
    private Long messageId;

    /**
     * 消息类型  1：优惠促销消息  2：通知消息 3：系统消息'
     */
    @Column(name = "MESSAGE_TYPE")
    private Integer messageType;

    /**
     * 用户ID(关联用户信息表ID)
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 消息标题
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 图片url
     */
    @Column(name = "TITLE_IMAGE_URL")
    private String titleImageUrl;

    /**
     * 消息内容
     */
    @Column(name = "MESSAGE_CONTENT")
    private String messageContent;

    /**
     * 详情
     */
    @Column(name = "DETAIL_URL")
    private String detailUrl;

    /**
     * 状态 0:未读  1：已读
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 删除标记 N 未删除 Y 删除
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    /**
     * 修改时间（查看时间）
     */
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

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
     * 版本号
     */
    @Column(name = "VERSION_ID")
    private Integer versionId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return ENTITY_ID - id
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * 设置id
     *
     * @param entityId id
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取消息信息表中id
     *
     * @return MESSAGE_ID - 消息信息表中id
     */
    public Long getMessageId() {
        return messageId;
    }

    /**
     * 设置消息信息表中id
     *
     * @param messageId 消息信息表中id
     */
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    /**
     * 获取消息类型  1：优惠促销消息  2：通知消息 3：系统消息'
     *
     * @return MESSAGE_TYPE - 消息类型  1：优惠促销消息  2：通知消息 3：系统消息'
     */
    public Integer getMessageType() {
        return messageType;
    }

    /**
     * 设置消息类型  1：优惠促销消息  2：通知消息 3：系统消息'
     *
     * @param messageType 消息类型  1：优惠促销消息  2：通知消息 3：系统消息'
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /**
     * 获取用户ID(关联用户信息表ID)
     *
     * @return USER_ID - 用户ID(关联用户信息表ID)
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID(关联用户信息表ID)
     *
     * @param userId 用户ID(关联用户信息表ID)
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取消息标题
     *
     * @return TITLE - 消息标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置消息标题
     *
     * @param title 消息标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取图片url
     *
     * @return TITLE_IMAGE_URL - 图片url
     */
    public String getTitleImageUrl() {
        return titleImageUrl;
    }

    /**
     * 设置图片url
     *
     * @param titleImageUrl 图片url
     */
    public void setTitleImageUrl(String titleImageUrl) {
        this.titleImageUrl = titleImageUrl;
    }

    /**
     * 获取消息内容
     *
     * @return MESSAGE_CONTENT - 消息内容
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * 设置消息内容
     *
     * @param messageContent 消息内容
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    /**
     * 获取详情
     *
     * @return DETAIL_URL - 详情
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    /**
     * 设置详情
     *
     * @param detailUrl 详情
     */
    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    /**
     * 获取状态 0:未读  1：已读
     *
     * @return STATUS - 状态 0:未读  1：已读
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0:未读  1：已读
     *
     * @param status 状态 0:未读  1：已读
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取删除标记 N 未删除 Y 删除
     *
     * @return MARK_DELETE - 删除标记 N 未删除 Y 删除
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置删除标记 N 未删除 Y 删除
     *
     * @param markDelete 删除标记 N 未删除 Y 删除
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete;
    }

    /**
     * 获取修改时间（查看时间）
     *
     * @return MODIFIED_DATE - 修改时间（查看时间）
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 设置修改时间（查看时间）
     *
     * @param modifiedDate 修改时间（查看时间）
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
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
        sb.append(", messageId=").append(messageId);
        sb.append(", messageType=").append(messageType);
        sb.append(", userId=").append(userId);
        sb.append(", title=").append(title);
        sb.append(", titleImageUrl=").append(titleImageUrl);
        sb.append(", messageContent=").append(messageContent);
        sb.append(", detailUrl=").append(detailUrl);
        sb.append(", status=").append(status);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}