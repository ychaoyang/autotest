package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "gas_station_addr")
public class GasStationAddrDO implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ENTITY_ID")
    private String entityId;

    /**
     * 油站标示ID（商家ID_主键ID/抓取的主键ID）
     */
    @Column(name = "STATION_ID")
    private String stationId;

    /**
     * 油站名称
     */
    @Column(name = "STATION_NAME")
    private String stationName;

    /**
     * 省份ID
     */
    @Column(name = "PROVINCE_ID")
    private Long provinceId;

    /**
     * 省份名称
     */
    @Column(name = "PROVINCE_NAME")
    private String provinceName;

    /**
     * 城市ID
     */
    @Column(name = "CITY_ID")
    private Long cityId;

    /**
     * 城市名称
     */
    @Column(name = "CITY_NAME")
    private String cityName;

    /**
     * 区县ID
     */
    @Column(name = "DISTRICT_ID")
    private Long districtId;

    /**
     * 区县名称
     */
    @Column(name = "DISTRICT_NAME")
    private String districtName;

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
     * 获取主键ID
     *
     * @return ENTITY_ID - 主键ID
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * 设置主键ID
     *
     * @param entityId 主键ID
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取油站标示ID（商家ID_主键ID/抓取的主键ID）
     *
     * @return STATION_ID - 油站标示ID（商家ID_主键ID/抓取的主键ID）
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * 设置油站标示ID（商家ID_主键ID/抓取的主键ID）
     *
     * @param stationId 油站标示ID（商家ID_主键ID/抓取的主键ID）
     */
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    /**
     * 获取油站名称
     *
     * @return STATION_NAME - 油站名称
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * 设置油站名称
     *
     * @param stationName 油站名称
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
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
     * 获取区县ID
     *
     * @return DISTRICT_ID - 区县ID
     */
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * 设置区县ID
     *
     * @param districtId 区县ID
     */
    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    /**
     * 获取区县名称
     *
     * @return DISTRICT_NAME - 区县名称
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * 设置区县名称
     *
     * @param districtName 区县名称
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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
        sb.append(", stationId=").append(stationId);
        sb.append(", stationName=").append(stationName);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", cityId=").append(cityId);
        sb.append(", cityName=").append(cityName);
        sb.append(", districtId=").append(districtId);
        sb.append(", districtName=").append(districtName);
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