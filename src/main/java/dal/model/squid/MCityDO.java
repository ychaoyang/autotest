package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_city")
public class MCityDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 城市名称
     */
    @Column(name = "CITY_NAME")
    private String cityName;

    /**
     * 城市名称拼音
     */
    @Column(name = "CITY_PINYIN")
    private String cityPinyin;

    /**
     * 城市名称首字母缩写
     */
    @Column(name = "CITY_CHAR")
    private String cityChar;

    /**
     * 省份ID
     */
    @Column(name = "PROVINCE_ID")
    private Long provinceId;

    /**
     * 城市标志
     */
    @Column(name = "CITY_FLAG")
    private String cityFlag;

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

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ENTITY_ID - 主键
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * 设置主键
     *
     * @param entityId 主键
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取城市名称
     *
     * @return CITY_NAME - 城市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置城市名称
     *
     * @param cityName 城市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取城市名称拼音
     *
     * @return CITY_PINYIN - 城市名称拼音
     */
    public String getCityPinyin() {
        return cityPinyin;
    }

    /**
     * 设置城市名称拼音
     *
     * @param cityPinyin 城市名称拼音
     */
    public void setCityPinyin(String cityPinyin) {
        this.cityPinyin = cityPinyin;
    }

    /**
     * 获取城市名称首字母缩写
     *
     * @return CITY_CHAR - 城市名称首字母缩写
     */
    public String getCityChar() {
        return cityChar;
    }

    /**
     * 设置城市名称首字母缩写
     *
     * @param cityChar 城市名称首字母缩写
     */
    public void setCityChar(String cityChar) {
        this.cityChar = cityChar;
    }

    /**
     * 获取省份ID
     *
     * @return PROVINCE_ID - 省份ID
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * 设置省份ID
     *
     * @param provinceId 省份ID
     */
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取城市标志
     *
     * @return CITY_FLAG - 城市标志
     */
    public String getCityFlag() {
        return cityFlag;
    }

    /**
     * 设置城市标志
     *
     * @param cityFlag 城市标志
     */
    public void setCityFlag(String cityFlag) {
        this.cityFlag = cityFlag;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", cityName=").append(cityName);
        sb.append(", cityPinyin=").append(cityPinyin);
        sb.append(", cityChar=").append(cityChar);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityFlag=").append(cityFlag);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}