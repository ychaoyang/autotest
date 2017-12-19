package dal.model.squid;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "m_system_dept_menu")
public class MSystemDeptMenuDO implements Serializable {
    @Column(name = "MENUID")
    private Long menuid;

    @Column(name = "DEPTID")
    private Long deptid;

    @Column(name = "MENU_NAME")
    private String menuName;

    private static final long serialVersionUID = 1L;

    /**
     * @return MENUID
     */
    public Long getMenuid() {
        return menuid;
    }

    /**
     * @param menuid
     */
    public void setMenuid(Long menuid) {
        this.menuid = menuid;
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

    /**
     * @return MENU_NAME
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", menuid=").append(menuid);
        sb.append(", deptid=").append(deptid);
        sb.append(", menuName=").append(menuName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}