package dal.model.squid;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "qrtz_paused_trigger_grps")
public class QrtzPausedTriggerGrpsDO implements Serializable {
    @Id
    @Column(name = "SCHED_NAME")
    private String schedName;

    @Id
    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", schedName=").append(schedName);
        sb.append(", triggerGroup=").append(triggerGroup);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}