package dal.model.squid;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "qrtz_cron_triggers")
public class QrtzCronTriggersDO implements Serializable {
    @Id
    @Column(name = "SCHED_NAME")
    private String schedName;

    @Id
    @Column(name = "TRIGGER_NAME")
    private String triggerName;

    @Id
    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

    @Column(name = "CRON_EXPRESSION")
    private String cronExpression;

    @Column(name = "TIME_ZONE_ID")
    private String timeZoneId;

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
     * @return CRON_EXPRESSION
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * @param cronExpression
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * @return TIME_ZONE_ID
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * @param timeZoneId
     */
    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", schedName=").append(schedName);
        sb.append(", triggerName=").append(triggerName);
        sb.append(", triggerGroup=").append(triggerGroup);
        sb.append(", cronExpression=").append(cronExpression);
        sb.append(", timeZoneId=").append(timeZoneId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}