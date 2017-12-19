package dal.model.squid;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "m_system_user_role")
public class MSystemUserRoleDO implements Serializable {
    @Column(name = "USERID")
    private Long userid;

    @Column(name = "ROLEID")
    private Long roleid;

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
     * @return ROLEID
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", userid=").append(userid);
        sb.append(", roleid=").append(roleid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}