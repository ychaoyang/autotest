package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_feedback_communicate")
public class TFeedbackCommunicateDO implements Serializable {
    @Id
    private String id;

    /**
     * 反馈id
     */
    @Column(name = "fd_id")
    private String fdId;

    /**
     * 回复方式
     */
    @Column(name = "replay_way")
    private String replayWay;

    /**
     * 回复时间
     */
    @Column(name = "replay_time")
    private Date replayTime;

    /**
     * 发送人id
     */
    @Column(name = "send_user_id")
    private String sendUserId;

    /**
     * 发送人类型
     */
    @Column(name = "user_type")
    private String userType;

    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "UPDATED_USER")
    private String updatedUser;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "MARK_DELETE")
    private String markDelete;

    @Column(name = "VERSION_ID")
    private Integer versionId;

    /**
     * 回复内容
     */
    @Column(name = "replay_body")
    private String replayBody;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取反馈id
     *
     * @return fd_id - 反馈id
     */
    public String getFdId() {
        return fdId;
    }

    /**
     * 设置反馈id
     *
     * @param fdId 反馈id
     */
    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    /**
     * 获取回复方式
     *
     * @return replay_way - 回复方式
     */
    public String getReplayWay() {
        return replayWay;
    }

    /**
     * 设置回复方式
     *
     * @param replayWay 回复方式
     */
    public void setReplayWay(String replayWay) {
        this.replayWay = replayWay;
    }

    /**
     * 获取回复时间
     *
     * @return replay_time - 回复时间
     */
    public Date getReplayTime() {
        return replayTime;
    }

    /**
     * 设置回复时间
     *
     * @param replayTime 回复时间
     */
    public void setReplayTime(Date replayTime) {
        this.replayTime = replayTime;
    }

    /**
     * 获取发送人id
     *
     * @return send_user_id - 发送人id
     */
    public String getSendUserId() {
        return sendUserId;
    }

    /**
     * 设置发送人id
     *
     * @param sendUserId 发送人id
     */
    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * 获取发送人类型
     *
     * @return user_type - 发送人类型
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置发送人类型
     *
     * @param userType 发送人类型
     */
    public void setUserType(String userType) {
        this.userType = userType;
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

    /**
     * @return VERSION_ID
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * @param versionId
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * 获取回复内容
     *
     * @return replay_body - 回复内容
     */
    public String getReplayBody() {
        return replayBody;
    }

    /**
     * 设置回复内容
     *
     * @param replayBody 回复内容
     */
    public void setReplayBody(String replayBody) {
        this.replayBody = replayBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", fdId=").append(fdId);
        sb.append(", replayWay=").append(replayWay);
        sb.append(", replayTime=").append(replayTime);
        sb.append(", sendUserId=").append(sendUserId);
        sb.append(", userType=").append(userType);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", versionId=").append(versionId);
        sb.append(", replayBody=").append(replayBody);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}