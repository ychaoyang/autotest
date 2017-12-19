package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_message_info")
public class TMessageInfoDO implements Serializable {
    /**
     * ENTITY_ID
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 消息类型  1：优惠促销消息  2：通知消息 3：系统消息
     */
    @Column(name = "MESSAGE_TYPE")
    private Integer messageType;

    /**
     * 消息来源  1：平台创建      2：系统生成
     */
    @Column(name = "MESSAGE_SOURCE")
    private Integer messageSource;

    /**
     * 推送方式 1：系统推送 2：极光推送
     */
    @Column(name = "SEND_TYPE")
    private Integer sendType;

    /**
     * 消息标题
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 标题图片  当消息类型为1时必填
     */
    @Column(name = "TITLE_IMAGE_URL")
    private String titleImageUrl;

    /**
     * 消息详情链接 当消息类型为1时必填
     */
    @Column(name = "DETAIL_URL")
    private String detailUrl;

    /**
     * 删除标记
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    /**
     * 推送用户类型   1：全部推送   2：部分推送
     */
    @Column(name = "SEND_USER_TYPE")
    private Integer sendUserType;

    /**
     * 发送给用户，当推送类型为1时候 该字段为空，多个用户已，分割
     */
    @Column(name = "SEND_USER")
    private String sendUser;

    /**
     * 消息内容
     */
    @Column(name = "MESSAGE_CONTENT")
    private String messageContent;

    /**
     * 状态0：未发布 1：已发布
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 消息创建人ID   如果为平台生成ID为0
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 修改时间
     */
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 修改用户
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 版本号
     */
    @Column(name = "VERSION_ID")
    private Long versionId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取ENTITY_ID
     *
     * @return ENTITY_ID - ENTITY_ID
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * 设置ENTITY_ID
     *
     * @param entityId ENTITY_ID
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取消息类型  1：优惠促销消息  2：通知消息 3：系统消息
     *
     * @return MESSAGE_TYPE - 消息类型  1：优惠促销消息  2：通知消息 3：系统消息
     */
    public Integer getMessageType() {
        return messageType;
    }

    /**
     * 设置消息类型  1：优惠促销消息  2：通知消息 3：系统消息
     *
     * @param messageType 消息类型  1：优惠促销消息  2：通知消息 3：系统消息
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /**
     * 获取消息来源  1：平台创建      2：系统生成
     *
     * @return MESSAGE_SOURCE - 消息来源  1：平台创建      2：系统生成
     */
    public Integer getMessageSource() {
        return messageSource;
    }

    /**
     * 设置消息来源  1：平台创建      2：系统生成
     *
     * @param messageSource 消息来源  1：平台创建      2：系统生成
     */
    public void setMessageSource(Integer messageSource) {
        this.messageSource = messageSource;
    }

    /**
     * 获取推送方式 1：系统推送 2：极光推送
     *
     * @return SEND_TYPE - 推送方式 1：系统推送 2：极光推送
     */
    public Integer getSendType() {
        return sendType;
    }

    /**
     * 设置推送方式 1：系统推送 2：极光推送
     *
     * @param sendType 推送方式 1：系统推送 2：极光推送
     */
    public void setSendType(Integer sendType) {
        this.sendType = sendType;
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
     * 获取标题图片  当消息类型为1时必填
     *
     * @return TITLE_IMAGE_URL - 标题图片  当消息类型为1时必填
     */
    public String getTitleImageUrl() {
        return titleImageUrl;
    }

    /**
     * 设置标题图片  当消息类型为1时必填
     *
     * @param titleImageUrl 标题图片  当消息类型为1时必填
     */
    public void setTitleImageUrl(String titleImageUrl) {
        this.titleImageUrl = titleImageUrl;
    }

    /**
     * 获取消息详情链接 当消息类型为1时必填
     *
     * @return DETAIL_URL - 消息详情链接 当消息类型为1时必填
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    /**
     * 设置消息详情链接 当消息类型为1时必填
     *
     * @param detailUrl 消息详情链接 当消息类型为1时必填
     */
    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
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
     * 获取推送用户类型   1：全部推送   2：部分推送
     *
     * @return SEND_USER_TYPE - 推送用户类型   1：全部推送   2：部分推送
     */
    public Integer getSendUserType() {
        return sendUserType;
    }

    /**
     * 设置推送用户类型   1：全部推送   2：部分推送
     *
     * @param sendUserType 推送用户类型   1：全部推送   2：部分推送
     */
    public void setSendUserType(Integer sendUserType) {
        this.sendUserType = sendUserType;
    }

    /**
     * 获取发送给用户，当推送类型为1时候 该字段为空，多个用户已，分割
     *
     * @return SEND_USER - 发送给用户，当推送类型为1时候 该字段为空，多个用户已，分割
     */
    public String getSendUser() {
        return sendUser;
    }

    /**
     * 设置发送给用户，当推送类型为1时候 该字段为空，多个用户已，分割
     *
     * @param sendUser 发送给用户，当推送类型为1时候 该字段为空，多个用户已，分割
     */
    public void setSendUser(String sendUser) {
        this.sendUser = sendUser;
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
     * 获取状态0：未发布 1：已发布
     *
     * @return STATUS - 状态0：未发布 1：已发布
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态0：未发布 1：已发布
     *
     * @param status 状态0：未发布 1：已发布
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取消息创建人ID   如果为平台生成ID为0
     *
     * @return CREATED_USER - 消息创建人ID   如果为平台生成ID为0
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * 设置消息创建人ID   如果为平台生成ID为0
     *
     * @param createdUser 消息创建人ID   如果为平台生成ID为0
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
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 设置版本号
     *
     * @param versionId 版本号
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", messageType=").append(messageType);
        sb.append(", messageSource=").append(messageSource);
        sb.append(", sendType=").append(sendType);
        sb.append(", title=").append(title);
        sb.append(", titleImageUrl=").append(titleImageUrl);
        sb.append(", detailUrl=").append(detailUrl);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", sendUserType=").append(sendUserType);
        sb.append(", sendUser=").append(sendUser);
        sb.append(", messageContent=").append(messageContent);
        sb.append(", status=").append(status);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}