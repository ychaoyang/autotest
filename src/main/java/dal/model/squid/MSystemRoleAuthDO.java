package dal.model.squid;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "m_system_role_auth")
public class MSystemRoleAuthDO implements Serializable {
    @Column(name = "ROLEID")
    private Long roleid;

    @Column(name = "AUTHID")
    private Long authid;

    private static final long serialVersionUID = 1L;

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

    /**
     * @return AUTHID
     */
    public Long getAuthid() {
        return authid;
    }

    /**
     * @param authid
     */
    public void setAuthid(Long authid) {
        this.authid = authid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", roleid=").append(roleid);
        sb.append(", authid=").append(authid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}