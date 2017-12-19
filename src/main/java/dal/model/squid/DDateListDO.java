package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "d_date_list")
public class DDateListDO implements Serializable {
    /**
     * 主键 不重复
     */
    private String id;

    /**
     * 时间 不重复
     */
    private Date days;

    /**
     * 是否工作日 Y AND N
     */
    private String workingdays;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键 不重复
     *
     * @return id - 主键 不重复
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键 不重复
     *
     * @param id 主键 不重复
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取时间 不重复
     *
     * @return days - 时间 不重复
     */
    public Date getDays() {
        return days;
    }

    /**
     * 设置时间 不重复
     *
     * @param days 时间 不重复
     */
    public void setDays(Date days) {
        this.days = days;
    }

    /**
     * 获取是否工作日 Y AND N
     *
     * @return workingdays - 是否工作日 Y AND N
     */
    public String getWorkingdays() {
        return workingdays;
    }

    /**
     * 设置是否工作日 Y AND N
     *
     * @param workingdays 是否工作日 Y AND N
     */
    public void setWorkingdays(String workingdays) {
        this.workingdays = workingdays;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", days=").append(days);
        sb.append(", workingdays=").append(workingdays);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}