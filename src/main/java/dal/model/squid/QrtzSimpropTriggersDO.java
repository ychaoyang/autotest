package dal.model.squid;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "qrtz_simprop_triggers")
public class QrtzSimpropTriggersDO implements Serializable {
    @Id
    @Column(name = "SCHED_NAME")
    private String schedName;

    @Id
    @Column(name = "TRIGGER_NAME")
    private String triggerName;

    @Id
    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

    @Column(name = "STR_PROP_1")
    private String strProp1;

    @Column(name = "STR_PROP_2")
    private String strProp2;

    @Column(name = "STR_PROP_3")
    private String strProp3;

    @Column(name = "INT_PROP_1")
    private Integer intProp1;

    @Column(name = "INT_PROP_2")
    private Integer intProp2;

    @Column(name = "LONG_PROP_1")
    private Long longProp1;

    @Column(name = "LONG_PROP_2")
    private Long longProp2;

    @Column(name = "DEC_PROP_1")
    private BigDecimal decProp1;

    @Column(name = "DEC_PROP_2")
    private BigDecimal decProp2;

    @Column(name = "BOOL_PROP_1")
    private String boolProp1;

    @Column(name = "BOOL_PROP_2")
    private String boolProp2;

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
     * @return STR_PROP_1
     */
    public String getStrProp1() {
        return strProp1;
    }

    /**
     * @param strProp1
     */
    public void setStrProp1(String strProp1) {
        this.strProp1 = strProp1;
    }

    /**
     * @return STR_PROP_2
     */
    public String getStrProp2() {
        return strProp2;
    }

    /**
     * @param strProp2
     */
    public void setStrProp2(String strProp2) {
        this.strProp2 = strProp2;
    }

    /**
     * @return STR_PROP_3
     */
    public String getStrProp3() {
        return strProp3;
    }

    /**
     * @param strProp3
     */
    public void setStrProp3(String strProp3) {
        this.strProp3 = strProp3;
    }

    /**
     * @return INT_PROP_1
     */
    public Integer getIntProp1() {
        return intProp1;
    }

    /**
     * @param intProp1
     */
    public void setIntProp1(Integer intProp1) {
        this.intProp1 = intProp1;
    }

    /**
     * @return INT_PROP_2
     */
    public Integer getIntProp2() {
        return intProp2;
    }

    /**
     * @param intProp2
     */
    public void setIntProp2(Integer intProp2) {
        this.intProp2 = intProp2;
    }

    /**
     * @return LONG_PROP_1
     */
    public Long getLongProp1() {
        return longProp1;
    }

    /**
     * @param longProp1
     */
    public void setLongProp1(Long longProp1) {
        this.longProp1 = longProp1;
    }

    /**
     * @return LONG_PROP_2
     */
    public Long getLongProp2() {
        return longProp2;
    }

    /**
     * @param longProp2
     */
    public void setLongProp2(Long longProp2) {
        this.longProp2 = longProp2;
    }

    /**
     * @return DEC_PROP_1
     */
    public BigDecimal getDecProp1() {
        return decProp1;
    }

    /**
     * @param decProp1
     */
    public void setDecProp1(BigDecimal decProp1) {
        this.decProp1 = decProp1;
    }

    /**
     * @return DEC_PROP_2
     */
    public BigDecimal getDecProp2() {
        return decProp2;
    }

    /**
     * @param decProp2
     */
    public void setDecProp2(BigDecimal decProp2) {
        this.decProp2 = decProp2;
    }

    /**
     * @return BOOL_PROP_1
     */
    public String getBoolProp1() {
        return boolProp1;
    }

    /**
     * @param boolProp1
     */
    public void setBoolProp1(String boolProp1) {
        this.boolProp1 = boolProp1;
    }

    /**
     * @return BOOL_PROP_2
     */
    public String getBoolProp2() {
        return boolProp2;
    }

    /**
     * @param boolProp2
     */
    public void setBoolProp2(String boolProp2) {
        this.boolProp2 = boolProp2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", schedName=").append(schedName);
        sb.append(", triggerName=").append(triggerName);
        sb.append(", triggerGroup=").append(triggerGroup);
        sb.append(", strProp1=").append(strProp1);
        sb.append(", strProp2=").append(strProp2);
        sb.append(", strProp3=").append(strProp3);
        sb.append(", intProp1=").append(intProp1);
        sb.append(", intProp2=").append(intProp2);
        sb.append(", longProp1=").append(longProp1);
        sb.append(", longProp2=").append(longProp2);
        sb.append(", decProp1=").append(decProp1);
        sb.append(", decProp2=").append(decProp2);
        sb.append(", boolProp1=").append(boolProp1);
        sb.append(", boolProp2=").append(boolProp2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}