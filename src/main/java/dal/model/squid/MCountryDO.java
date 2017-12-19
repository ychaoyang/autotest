package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_country")
public class MCountryDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 国家名称
     */
    @Column(name = "COUNTRY_NAME")
    private String countryName;

    /**
     * 国旗
     */
    @Column(name = "NATIONAL_FLAG")
    private String nationalFlag;

    /**
     * 国家名称拼音
     */
    @Column(name = "COUNTRY_PINYIN")
    private String countryPinyin;

    /**
     * 国家名称首字母缩写
     */
    @Column(name = "COUNTRY_CHAR")
    private String countryChar;

    /**
     * 国家编号
     */
    @Column(name = "COUNTRY_CODE")
    private Integer countryCode;

    /**
     * 国家标志
     */
    @Column(name = "COUNTRY_FLAG")
    private String countryFlag;

    /**
     * 国家英文
     */
    @Column(name = "COUNTRY_ENAME")
    private String countryEname;

    /**
     * 国家简称
     */
    @Column(name = "COUNTRY_SHORT")
    private String countryShort;

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
     * 获取国家名称
     *
     * @return COUNTRY_NAME - 国家名称
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置国家名称
     *
     * @param countryName 国家名称
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 获取国旗
     *
     * @return NATIONAL_FLAG - 国旗
     */
    public String getNationalFlag() {
        return nationalFlag;
    }

    /**
     * 设置国旗
     *
     * @param nationalFlag 国旗
     */
    public void setNationalFlag(String nationalFlag) {
        this.nationalFlag = nationalFlag;
    }

    /**
     * 获取国家名称拼音
     *
     * @return COUNTRY_PINYIN - 国家名称拼音
     */
    public String getCountryPinyin() {
        return countryPinyin;
    }

    /**
     * 设置国家名称拼音
     *
     * @param countryPinyin 国家名称拼音
     */
    public void setCountryPinyin(String countryPinyin) {
        this.countryPinyin = countryPinyin;
    }

    /**
     * 获取国家名称首字母缩写
     *
     * @return COUNTRY_CHAR - 国家名称首字母缩写
     */
    public String getCountryChar() {
        return countryChar;
    }

    /**
     * 设置国家名称首字母缩写
     *
     * @param countryChar 国家名称首字母缩写
     */
    public void setCountryChar(String countryChar) {
        this.countryChar = countryChar;
    }

    /**
     * 获取国家编号
     *
     * @return COUNTRY_CODE - 国家编号
     */
    public Integer getCountryCode() {
        return countryCode;
    }

    /**
     * 设置国家编号
     *
     * @param countryCode 国家编号
     */
    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 获取国家标志
     *
     * @return COUNTRY_FLAG - 国家标志
     */
    public String getCountryFlag() {
        return countryFlag;
    }

    /**
     * 设置国家标志
     *
     * @param countryFlag 国家标志
     */
    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    /**
     * 获取国家英文
     *
     * @return COUNTRY_ENAME - 国家英文
     */
    public String getCountryEname() {
        return countryEname;
    }

    /**
     * 设置国家英文
     *
     * @param countryEname 国家英文
     */
    public void setCountryEname(String countryEname) {
        this.countryEname = countryEname;
    }

    /**
     * 获取国家简称
     *
     * @return COUNTRY_SHORT - 国家简称
     */
    public String getCountryShort() {
        return countryShort;
    }

    /**
     * 设置国家简称
     *
     * @param countryShort 国家简称
     */
    public void setCountryShort(String countryShort) {
        this.countryShort = countryShort;
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
        sb.append(", countryName=").append(countryName);
        sb.append(", nationalFlag=").append(nationalFlag);
        sb.append(", countryPinyin=").append(countryPinyin);
        sb.append(", countryChar=").append(countryChar);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", countryFlag=").append(countryFlag);
        sb.append(", countryEname=").append(countryEname);
        sb.append(", countryShort=").append(countryShort);
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