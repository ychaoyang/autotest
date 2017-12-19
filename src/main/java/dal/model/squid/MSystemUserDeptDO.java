package dal.model.squid;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "m_system_user_dept")
public class MSystemUserDeptDO implements Serializable {
    @Column(name = "USERID")
    private Long userid;

    @Column(name = "DEPTID")
    private Long deptid;

    private static final long serialVersionUID = 1L;

    /**
     * @return USERID
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * @return DEPTID
     */
    public Long getDeptid() {
        return deptid;
    }

    /**
     * @param deptid
     */
    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", userid=").append(userid);
        sb.append(", deptid=").append(deptid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}