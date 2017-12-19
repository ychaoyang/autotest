package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_feedback")
public class TFeedbackDO implements Serializable {
    @Id
    private String id;

    /**
     * 客户id
     */
    @Column(name = "customer_id")
    private String customerId;

    /**
     * 客户类型
     */
    @Column(name = "customer_type")
    private String customerType;

    private String phone;

    /**
     * 反馈类型
     */
    @Column(name = "fb_type")
    private String fbType;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 意见内容
     */
    private String comment;

    /**
     * 处理状态
     */
    private String status;

    /**
     * 处理人
     */
    private String replyer;

    /**
     * 处理人id
     */
    @Column(name = "replyer_id")
    private Integer replyerId;

    /**
     * 处理方式
     */
    @Column(name = "replay_way")
    private String replayWay;

    /**
     * 处理了时间
     */
    @Column(name = "replay_time")
    private Date replayTime;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "UPDATED_USER")
    private String updatedUser;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "MARK_DELETE")
    private String markDelete;

    @Column(name = "VERSION_ID")
    private Integer versionId;

    /**
     * md5
     */
    private String md5;

    /**
     * 建议编号
     */
    @Column(name = "feedback_no")
    private String feedbackNo;

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
     * 获取客户id
     *
     * @return customer_id - 客户id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置客户id
     *
     * @param customerId 客户id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取客户类型
     *
     * @return customer_type - 客户类型
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * 设置客户类型
     *
     * @param customerType 客户类型
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取反馈类型
     *
     * @return fb_type - 反馈类型
     */
    public String getFbType() {
        return fbType;
    }

    /**
     * 设置反馈类型
     *
     * @param fbType 反馈类型
     */
    public void setFbType(String fbType) {
        this.fbType = fbType;
    }

    /**
     * 获取联系方式
     *
     * @return contact - 联系方式
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系方式
     *
     * @param contact 联系方式
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 获取意见内容
     *
     * @return comment - 意见内容
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置意见内容
     *
     * @param comment 意见内容
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取处理状态
     *
     * @return status - 处理状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置处理状态
     *
     * @param status 处理状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取处理人
     *
     * @return replyer - 处理人
     */
    public String getReplyer() {
        return replyer;
    }

    /**
     * 设置处理人
     *
     * @param replyer 处理人
     */
    public void setReplyer(String replyer) {
        this.replyer = replyer;
    }

    /**
     * 获取处理人id
     *
     * @return replyer_id - 处理人id
     */
    public Integer getReplyerId() {
        return replyerId;
    }

    /**
     * 设置处理人id
     *
     * @param replyerId 处理人id
     */
    public void setReplyerId(Integer replyerId) {
        this.replyerId = replyerId;
    }

    /**
     * 获取处理方式
     *
     * @return replay_way - 处理方式
     */
    public String getReplayWay() {
        return replayWay;
    }

    /**
     * 设置处理方式
     *
     * @param replayWay 处理方式
     */
    public void setReplayWay(String replayWay) {
        this.replayWay = replayWay;
    }

    /**
     * 获取处理了时间
     *
     * @return replay_time - 处理了时间
     */
    public Date getReplayTime() {
        return replayTime;
    }

    /**
     * 设置处理了时间
     *
     * @param replayTime 处理了时间
     */
    public void setReplayTime(Date replayTime) {
        this.replayTime = replayTime;
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
     * 获取md5
     *
     * @return md5 - md5
     */
    public String getMd5() {
        return md5;
    }

    /**
     * 设置md5
     *
     * @param md5 md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * 获取建议编号
     *
     * @return feedback_no - 建议编号
     */
    public String getFeedbackNo() {
        return feedbackNo;
    }

    /**
     * 设置建议编号
     *
     * @param feedbackNo 建议编号
     */
    public void setFeedbackNo(String feedbackNo) {
        this.feedbackNo = feedbackNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerType=").append(customerType);
        sb.append(", phone=").append(phone);
        sb.append(", fbType=").append(fbType);
        sb.append(", contact=").append(contact);
        sb.append(", comment=").append(comment);
        sb.append(", status=").append(status);
        sb.append(", replyer=").append(replyer);
        sb.append(", replyerId=").append(replyerId);
        sb.append(", replayWay=").append(replayWay);
        sb.append(", replayTime=").append(replayTime);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", versionId=").append(versionId);
        sb.append(", md5=").append(md5);
        sb.append(", feedbackNo=").append(feedbackNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}