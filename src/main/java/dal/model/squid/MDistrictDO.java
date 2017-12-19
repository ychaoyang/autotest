package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_district")
public class MDistrictDO implements Serializable {
    /**
     * 县区ID
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 县区名称
     */
    @Column(name = "DISTRICT_NAME")
    private String districtName;

    /**
     * 县区名称拼音
     */
    @Column(name = "DISTRICT_PINYIN")
    private String districtPinyin;

    /**
     * 县区名称首字母缩写
     */
    @Column(name = "DISTRICT_CHAR")
    private String districtChar;

    /**
     * 城市ID
     */
    @Column(name = "CITY_ID")
    private Long cityId;

    /**
     * 县区标志
     */
    @Column(name = "DISTRICT_FLAG")
    private String districtFlag;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 修改时间
     */
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    /**
     * 创建用户
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 修改用户
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 版本ID
     */
    @Column(name = "VERSION_ID")
    private Long versionId;

    /**
     * 删除标记
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    @Column(name = "DISTRICT_TYPE")
    private String districtType;

    private static final long serialVersionUID = 1L;

    /**
     * 获取县区ID
     *
     * @return ENTITY_ID - 县区ID
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * 设置县区ID
     *
     * @param entityId 县区ID
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取县区名称
     *
     * @return DISTRICT_NAME - 县区名称
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * 设置县区名称
     *
     * @param districtName 县区名称
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    /**
     * 获取县区名称拼音
     *
     * @return DISTRICT_PINYIN - 县区名称拼音
     */
    public String getDistrictPinyin() {
        return districtPinyin;
    }

    /**
     * 设置县区名称拼音
     *
     * @param districtPinyin 县区名称拼音
     */
    public void setDistrictPinyin(String districtPinyin) {
        this.districtPinyin = districtPinyin;
    }

    /**
     * 获取县区名称首字母缩写
     *
     * @return DISTRICT_CHAR - 县区名称首字母缩写
     */
    public String getDistrictChar() {
        return districtChar;
    }

    /**
     * 设置县区名称首字母缩写
     *
     * @param districtChar 县区名称首字母缩写
     */
    public void setDistrictChar(String districtChar) {
        this.districtChar = districtChar;
    }

    /**
     * 获取城市ID
     *
     * @return CITY_ID - 城市ID
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * 设置城市ID
     *
     * @param cityId 城市ID
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取县区标志
     *
     * @return DISTRICT_FLAG - 县区标志
     */
    public String getDistrictFlag() {
        return districtFlag;
    }

    /**
     * 设置县区标志
     *
     * @param districtFlag 县区标志
     */
    public void setDistrictFlag(String districtFlag) {
        this.districtFlag = districtFlag;
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
     * 获取创建用户
     *
     * @return CREATED_USER - 创建用户
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * 设置创建用户
     *
     * @param createdUser 创建用户
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * 获取修改用户
     *
     * @return UPDATED_USER - 修改用户
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * 设置修改用户
     *
     * @param updatedUser 修改用户
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * 获取版本ID
     *
     * @return VERSION_ID - 版本ID
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 设置版本ID
     *
     * @param versionId 版本ID
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
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
     * @return DISTRICT_TYPE
     */
    public String getDistrictType() {
        return districtType;
    }

    /**
     * @param districtType
     */
    public void setDistrictType(String districtType) {
        this.districtType = districtType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", districtName=").append(districtName);
        sb.append(", districtPinyin=").append(districtPinyin);
        sb.append(", districtChar=").append(districtChar);
        sb.append(", cityId=").append(cityId);
        sb.append(", districtFlag=").append(districtFlag);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", districtType=").append(districtType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}