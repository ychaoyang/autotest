package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_province")
public class MProvinceDO implements Serializable {
    /**
     * 省份ID
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 省份名称
     */
    @Column(name = "PROVINCE_NAME")
    private String provinceName;

    /**
     * 省份简称
     */
    @Column(name = "PROVINCE_SHORT")
    private String provinceShort;

    /**
     * 省份名称拼音
     */
    @Column(name = "PROVINCE_PINYIN")
    private String provincePinyin;

    /**
     * 省份名称首字母缩写
     */
    @Column(name = "PROVINCE_CHAR")
    private String provinceChar;

    /**
     * 国家名称
     */
    @Column(name = "COUNTRY_ID")
    private Long countryId;

    /**
     * 省份标志
     */
    @Column(name = "PROVINCE_FLAG")
    private String provinceFlag;

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
     * 获取省份ID
     *
     * @return ENTITY_ID - 省份ID
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * 设置省份ID
     *
     * @param entityId 省份ID
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取省份名称
     *
     * @return PROVINCE_NAME - 省份名称
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 设置省份名称
     *
     * @param provinceName 省份名称
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 获取省份简称
     *
     * @return PROVINCE_SHORT - 省份简称
     */
    public String getProvinceShort() {
        return provinceShort;
    }

    /**
     * 设置省份简称
     *
     * @param provinceShort 省份简称
     */
    public void setProvinceShort(String provinceShort) {
        this.provinceShort = provinceShort;
    }

    /**
     * 获取省份名称拼音
     *
     * @return PROVINCE_PINYIN - 省份名称拼音
     */
    public String getProvincePinyin() {
        return provincePinyin;
    }

    /**
     * 设置省份名称拼音
     *
     * @param provincePinyin 省份名称拼音
     */
    public void setProvincePinyin(String provincePinyin) {
        this.provincePinyin = provincePinyin;
    }

    /**
     * 获取省份名称首字母缩写
     *
     * @return PROVINCE_CHAR - 省份名称首字母缩写
     */
    public String getProvinceChar() {
        return provinceChar;
    }

    /**
     * 设置省份名称首字母缩写
     *
     * @param provinceChar 省份名称首字母缩写
     */
    public void setProvinceChar(String provinceChar) {
        this.provinceChar = provinceChar;
    }

    /**
     * 获取国家名称
     *
     * @return COUNTRY_ID - 国家名称
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * 设置国家名称
     *
     * @param countryId 国家名称
     */
    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    /**
     * 获取省份标志
     *
     * @return PROVINCE_FLAG - 省份标志
     */
    public String getProvinceFlag() {
        return provinceFlag;
    }

    /**
     * 设置省份标志
     *
     * @param provinceFlag 省份标志
     */
    public void setProvinceFlag(String provinceFlag) {
        this.provinceFlag = provinceFlag;
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
        sb.append(", provinceName=").append(provinceName);
        sb.append(", provinceShort=").append(provinceShort);
        sb.append(", provincePinyin=").append(provincePinyin);
        sb.append(", provinceChar=").append(provinceChar);
        sb.append(", countryId=").append(countryId);
        sb.append(", provinceFlag=").append(provinceFlag);
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