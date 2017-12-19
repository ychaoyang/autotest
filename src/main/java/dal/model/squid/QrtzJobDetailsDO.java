package dal.model.squid;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "qrtz_job_details")
public class QrtzJobDetailsDO implements Serializable {
    @Id
    @Column(name = "SCHED_NAME")
    private String schedName;

    @Id
    @Column(name = "JOB_NAME")
    private String jobName;

    @Id
    @Column(name = "JOB_GROUP")
    private String jobGroup;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "JOB_CLASS_NAME")
    private String jobClassName;

    @Column(name = "IS_DURABLE")
    private String isDurable;

    @Column(name = "IS_NONCONCURRENT")
    private String isNonconcurrent;

    @Column(name = "IS_UPDATE_DATA")
    private String isUpdateData;

    @Column(name = "REQUESTS_RECOVERY")
    private String requestsRecovery;

    @Column(name = "JOB_DATA")
    private byte[] jobData;

    private static final long serialVersionUID = 1L;

    /**
     * @return SCHED_NAME
     */
    public String getSchedName() {
        return schedName;
    }

    /**
     * @param schedName
     */
    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    /**
     * @return JOB_NAME
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * @return JOB_GROUP
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * @param jobGroup
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return JOB_CLASS_NAME
     */
    public String getJobClassName() {
        return jobClassName;
    }

    /**
     * @param jobClassName
     */
    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    /**
     * @return IS_DURABLE
     */
    public String getIsDurable() {
        return isDurable;
    }

    /**
     * @param isDurable
     */
    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable;
    }

    /**
     * @return IS_NONCONCURRENT
     */
    public String getIsNonconcurrent() {
        return isNonconcurrent;
    }

    /**
     * @param isNonconcurrent
     */
    public void setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    /**
     * @return IS_UPDATE_DATA
     */
    public String getIsUpdateData() {
        return isUpdateData;
    }

    /**
     * @param isUpdateData
     */
    public void setIsUpdateData(String isUpdateData) {
        this.isUpdateData = isUpdateData;
    }

    /**
     * @return REQUESTS_RECOVERY
     */
    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    /**
     * @param requestsRecovery
     */
    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    /**
     * @return JOB_DATA
     */
    public byte[] getJobData() {
        return jobData;
    }

    /**
     * @param jobData
     */
    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", schedName=").append(schedName);
        sb.append(", jobName=").append(jobName);
        sb.append(", jobGroup=").append(jobGroup);
        sb.append(", description=").append(description);
        sb.append(", jobClassName=").append(jobClassName);
        sb.append(", isDurable=").append(isDurable);
        sb.append(", isNonconcurrent=").append(isNonconcurrent);
        sb.append(", isUpdateData=").append(isUpdateData);
        sb.append(", requestsRecovery=").append(requestsRecovery);
        sb.append(", jobData=").append(jobData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}