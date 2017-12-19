package dal.model.squid;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "qrtz_calendars")
public class QrtzCalendarsDO implements Serializable {
    @Id
    @Column(name = "SCHED_NAME")
    private String schedName;

    @Id
    @Column(name = "CALENDAR_NAME")
    private String calendarName;

    @Column(name = "CALENDAR")
    private byte[] calendar;

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
     * @return CALENDAR_NAME
     */
    public String getCalendarName() {
        return calendarName;
    }

    /**
     * @param calendarName
     */
    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    /**
     * @return CALENDAR
     */
    public byte[] getCalendar() {
        return calendar;
    }

    /**
     * @param calendar
     */
    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", schedName=").append(schedName);
        sb.append(", calendarName=").append(calendarName);
        sb.append(", calendar=").append(calendar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}