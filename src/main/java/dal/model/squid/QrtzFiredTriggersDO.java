package dal.model.squid;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "qrtz_fired_triggers")
public class QrtzFiredTriggersDO implements Serializable {
    @Id
    @Column(name = "SCHED_NAME")
    private String schedName;

    @Id
    @Column(name = "ENTRY_ID")
    private String entryId;

    @Column(name = "TRIGGER_NAME")
    private String triggerName;

    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

    @Column(name = "INSTANCE_NAME")
    private String instanceName;

    @Column(name = "FIRED_TIME")
    private Long firedTime;

    @Column(name = "SCHED_TIME")
    private Long schedTime;

    @Column(name = "PRIORITY")
    private Integer priority;

    @Column(name = "STATE")
    private String state;

    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "JOB_GROUP")
    private String jobGroup;

    @Column(name = "IS_NONCONCURRENT")
    private String isNonconcurrent;

    @Column(name = "REQUESTS_RECOVERY")
    private String requestsRecovery;

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
     * @return ENTRY_ID
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * @param entryId
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * @return TRIGGER_NAME
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * @param triggerName
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * @return TRIGGER_GROUP
     */
    public String getTriggerGroup() {
        return triggerGroup;
    }

    /**
     * @param triggerGroup
     */
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    /**
     * @return INSTANCE_NAME
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * @return FIRED_TIME
     */
    public Long getFiredTime() {
        return firedTime;
    }

    /**
     * @param firedTime
     */
    public void setFiredTime(Long firedTime) {
        this.firedTime = firedTime;
    }

    /**
     * @return SCHED_TIME
     */
    public Long getSchedTime() {
        return schedTime;
    }

    /**
     * @param schedTime
     */
    public void setSchedTime(Long schedTime) {
        this.schedTime = schedTime;
    }

    /**
     * @return PRIORITY
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", schedName=").append(schedName);
        sb.append(", entryId=").append(entryId);
        sb.append(", triggerName=").append(triggerName);
        sb.append(", triggerGroup=").append(triggerGroup);
        sb.append(", instanceName=").append(instanceName);
        sb.append(", firedTime=").append(firedTime);
        sb.append(", schedTime=").append(schedTime);
        sb.append(", priority=").append(priority);
        sb.append(", state=").append(state);
        sb.append(", jobName=").append(jobName);
        sb.append(", jobGroup=").append(jobGroup);
        sb.append(", isNonconcurrent=").append(isNonconcurrent);
        sb.append(", requestsRecovery=").append(requestsRecovery);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}