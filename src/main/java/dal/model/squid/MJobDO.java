package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_job")
public class MJobDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "JOB_ID")
    private Long jobId;

    /**
     * JOB名称
     */
    @Column(name = "JOB_NAME")
    private String jobName;

    /**
     * JOB对应的class
     */
    @Column(name = "JOB_CLASS")
    private String jobClass;

    /**
     * JOB执行时间
     */
    @Column(name = "JOB_TIME")
    private String jobTime;

    /**
     * JOB是否被禁用
     */
    @Column(name = "JOB_STATUS")
    private String jobStatus;

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

    @Column(name = "REMARK")
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return JOB_ID - 主键
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * 设置主键
     *
     * @param jobId 主键
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * 获取JOB名称
     *
     * @return JOB_NAME - JOB名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 设置JOB名称
     *
     * @param jobName JOB名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 获取JOB对应的class
     *
     * @return JOB_CLASS - JOB对应的class
     */
    public String getJobClass() {
        return jobClass;
    }

    /**
     * 设置JOB对应的class
     *
     * @param jobClass JOB对应的class
     */
    public void setJobClass(String jobClass) {
        this.jobClass = jobClass;
    }

    /**
     * 获取JOB执行时间
     *
     * @return JOB_TIME - JOB执行时间
     */
    public String getJobTime() {
        return jobTime;
    }

    /**
     * 设置JOB执行时间
     *
     * @param jobTime JOB执行时间
     */
    public void setJobTime(String jobTime) {
        this.jobTime = jobTime;
    }

    /**
     * 获取JOB是否被禁用
     *
     * @return JOB_STATUS - JOB是否被禁用
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * 设置JOB是否被禁用
     *
     * @param jobStatus JOB是否被禁用
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
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
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", jobId=").append(jobId);
        sb.append(", jobName=").append(jobName);
        sb.append(", jobClass=").append(jobClass);
        sb.append(", jobTime=").append(jobTime);
        sb.append(", jobStatus=").append(jobStatus);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}