package dal.model.squid;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "y_launch")
public class YLaunchDO implements Serializable {
    /**
     * 主键id
     */
    @Id
    @Column(name = "entity_id")
    private String entityId;

    /**
     * 商家id
     */
    @Column(name = "supplier_id")
    private BigDecimal supplierId;

    /**
     * 名称
     */
    private String name;

    /**
     * 投放开始时间
     */
    @Column(name = "begin_date")
    private Date beginDate;

    /**
     * 投放结束时间
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 标题
     */
    private String title;

    /**
     * 图片地址
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 投放地址
     */
    @Column(name = "put_url")
    private String putUrl;

    /**
     * 投放类型
     */
    @Column(name = "launch_type")
    private String launchType;

    /**
     * 绑定优惠id
     */
    @Column(name = "coupon_id")
    private Long couponId;

    /**
     * 状态
     */
    private String state;

    /**
     * 创建人
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 修改人
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 修改时间
     */
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    /**
     * 删除标记
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    /**
     * 版本号
     */
    @Column(name = "VERSION_ID")
    private Integer versionId;

    @Column(name = "case_name")
    private String caseName;

    @Column(name = "launch_type_group")
    private String launchTypeGroup;

    /**
     * 是否指定用户（Y 是 N 否） 
     */
    @Column(name = "assignUsers")
    private String assignusers;

    /**
     * 用户分组ID
     */
    @Column(name = "userGroupId")
    private Long usergroupid;

    @Column(name = "launch_condition")
    private String launchCondition;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id
     *
     * @return entity_id - 主键id
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * 设置主键id
     *
     * @param entityId 主键id
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取商家id
     *
     * @return supplier_id - 商家id
     */
    public BigDecimal getSupplierId() {
        return supplierId;
    }

    /**
     * 设置商家id
     *
     * @param supplierId 商家id
     */
    public void setSupplierId(BigDecimal supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取投放开始时间
     *
     * @return begin_date - 投放开始时间
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置投放开始时间
     *
     * @param beginDate 投放开始时间
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取投放结束时间
     *
     * @return end_date - 投放结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置投放结束时间
     *
     * @param endDate 投放结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取图片地址
     *
     * @return img_url - 图片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置图片地址
     *
     * @param imgUrl 图片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取投放地址
     *
     * @return put_url - 投放地址
     */
    public String getPutUrl() {
        return putUrl;
    }

    /**
     * 设置投放地址
     *
     * @param putUrl 投放地址
     */
    public void setPutUrl(String putUrl) {
        this.putUrl = putUrl;
    }

    /**
     * 获取投放类型
     *
     * @return launch_type - 投放类型
     */
    public String getLaunchType() {
        return launchType;
    }

    /**
     * 设置投放类型
     *
     * @param launchType 投放类型
     */
    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * 获取绑定优惠id
     *
     * @return coupon_id - 绑定优惠id
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 设置绑定优惠id
     *
     * @param couponId 绑定优惠id
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取创建人
     *
     * @return CREATED_USER - 创建人
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * 设置创建人
     *
     * @param createdUser 创建人
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED_DATE - 创建时间
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置创建时间
     *
     * @param createdDate 创建时间
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 获取修改人
     *
     * @return UPDATED_USER - 修改人
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * 设置修改人
     *
     * @param updatedUser 修改人
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * 获取修改时间
     *
     * @return MODIFIED_DATE - 修改时间
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 设置修改时间
     *
     * @param modifiedDate 修改时间
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * 获取删除标记
     *
     * @return MARK_DELETE - 删除标记
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置删除标记
     *
     * @param markDelete 删除标记
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete;
    }

    /**
     * 获取版本号
     *
     * @return VERSION_ID - 版本号
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * 设置版本号
     *
     * @param versionId 版本号
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * @return case_name
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * @param caseName
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    /**
     * @return launch_type_group
     */
    public String getLaunchTypeGroup() {
        return launchTypeGroup;
    }

    /**
     * @param launchTypeGroup
     */
    public void setLaunchTypeGroup(String launchTypeGroup) {
        this.launchTypeGroup = launchTypeGroup;
    }

    /**
     * 获取是否指定用户（Y 是 N 否） 
     *
     * @return assignUsers - 是否指定用户（Y 是 N 否） 
     */
    public String getAssignusers() {
        return assignusers;
    }

    /**
     * 设置是否指定用户（Y 是 N 否） 
     *
     * @param assignusers 是否指定用户（Y 是 N 否） 
     */
    public void setAssignusers(String assignusers) {
        this.assignusers = assignusers;
    }

    /**
     * 获取用户分组ID
     *
     * @return userGroupId - 用户分组ID
     */
    public Long getUsergroupid() {
        return usergroupid;
    }

    /**
     * 设置用户分组ID
     *
     * @param usergroupid 用户分组ID
     */
    public void setUsergroupid(Long usergroupid) {
        this.usergroupid = usergroupid;
    }

    /**
     * @return launch_condition
     */
    public String getLaunchCondition() {
        return launchCondition;
    }

    /**
     * @param launchCondition
     */
    public void setLaunchCondition(String launchCondition) {
        this.launchCondition = launchCondition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", name=").append(name);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", title=").append(title);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", putUrl=").append(putUrl);
        sb.append(", launchType=").append(launchType);
        sb.append(", couponId=").append(couponId);
        sb.append(", state=").append(state);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", versionId=").append(versionId);
        sb.append(", caseName=").append(caseName);
        sb.append(", launchTypeGroup=").append(launchTypeGroup);
        sb.append(", assignusers=").append(assignusers);
        sb.append(", usergroupid=").append(usergroupid);
        sb.append(", launchCondition=").append(launchCondition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}