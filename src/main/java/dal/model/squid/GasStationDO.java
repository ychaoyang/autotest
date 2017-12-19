package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "gas_station")
public class GasStationDO implements Serializable {
    /**
     * 主键
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
     * 商家Id
     */
    @Column(name = "SUPPLIER_ID")
    private Integer supplierId;

    /**
     * 油站名称
     */
    @Column(name = "STATION_NAME")
    private String stationName;

    /**
     * 油站代码
     */
    @Column(name = "STATION_NO")
    private String stationNo;

    /**
     * 油站状态（开启：Y，关闭：N）
     */
    @Column(name = "STATION_STATE")
    private String stationState;

    /**
     * 经度
     */
    @Column(name = "LATITUDE")
    private Double latitude;

    /**
     * 纬度
     */
    @Column(name = "LONGITUDE")
    private Double longitude;

    /**
     * 城市名称
     */
    @Column(name = "CITY_NAME")
    private String cityName;

    /**
     * 油站地址
     */
    @Column(name = "STATION_ADDR")
    private String stationAddr;

    /**
     * 联系人
     */
    @Column(name = "CONTACT_NAME")
    private String contactName;

    /**
     * 联系电话
     */
    @Column(name = "PHONE_NO")
    private String phoneNo;

    /**
     * 是否有便利店（有：Y，没有：N）
     */
    @Column(name = "HAS_STORE")
    private String hasStore;

    /**
     *  是否有厕所（有：Y，没有：N）
     */
    @Column(name = "HAS_TOILET")
    private String hasToilet;

    /**
     * 是否抓取（是：Y，否：N）
     */
    @Column(name = "COPY")
    private String copy;

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
    public String getEntityId() {
        return entityId;
    }

    /**
     * 设置主键
     *
     * @param entityId 主键
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
     * 获取商家Id
     *
     * @return SUPPLIER_ID - 商家Id
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 设置商家Id
     *
     * @param supplierId 商家Id
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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
     * 获取油站代码
     *
     * @return STATION_NO - 油站代码
     */
    public String getStationNo() {
        return stationNo;
    }

    /**
     * 设置油站代码
     *
     * @param stationNo 油站代码
     */
    public void setStationNo(String stationNo) {
        this.stationNo = stationNo;
    }

    /**
     * 获取油站状态（开启：Y，关闭：N）
     *
     * @return STATION_STATE - 油站状态（开启：Y，关闭：N）
     */
    public String getStationState() {
        return stationState;
    }

    /**
     * 设置油站状态（开启：Y，关闭：N）
     *
     * @param stationState 油站状态（开启：Y，关闭：N）
     */
    public void setStationState(String stationState) {
        this.stationState = stationState;
    }

    /**
     * 获取经度
     *
     * @return LATITUDE - 经度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置经度
     *
     * @param latitude 经度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取纬度
     *
     * @return LONGITUDE - 纬度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置纬度
     *
     * @param longitude 纬度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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
     * 获取油站地址
     *
     * @return STATION_ADDR - 油站地址
     */
    public String getStationAddr() {
        return stationAddr;
    }

    /**
     * 设置油站地址
     *
     * @param stationAddr 油站地址
     */
    public void setStationAddr(String stationAddr) {
        this.stationAddr = stationAddr;
    }

    /**
     * 获取联系人
     *
     * @return CONTACT_NAME - 联系人
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人
     *
     * @param contactName 联系人
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 获取联系电话
     *
     * @return PHONE_NO - 联系电话
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设置联系电话
     *
     * @param phoneNo 联系电话
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * 获取是否有便利店（有：Y，没有：N）
     *
     * @return HAS_STORE - 是否有便利店（有：Y，没有：N）
     */
    public String getHasStore() {
        return hasStore;
    }

    /**
     * 设置是否有便利店（有：Y，没有：N）
     *
     * @param hasStore 是否有便利店（有：Y，没有：N）
     */
    public void setHasStore(String hasStore) {
        this.hasStore = hasStore;
    }

    /**
     * 获取 是否有厕所（有：Y，没有：N）
     *
     * @return HAS_TOILET -  是否有厕所（有：Y，没有：N）
     */
    public String getHasToilet() {
        return hasToilet;
    }

    /**
     * 设置 是否有厕所（有：Y，没有：N）
     *
     * @param hasToilet  是否有厕所（有：Y，没有：N）
     */
    public void setHasToilet(String hasToilet) {
        this.hasToilet = hasToilet;
    }

    /**
     * 获取是否抓取（是：Y，否：N）
     *
     * @return COPY - 是否抓取（是：Y，否：N）
     */
    public String getCopy() {
        return copy;
    }

    /**
     * 设置是否抓取（是：Y，否：N）
     *
     * @param copy 是否抓取（是：Y，否：N）
     */
    public void setCopy(String copy) {
        this.copy = copy;
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
        sb.append(", supplierId=").append(supplierId);
        sb.append(", stationName=").append(stationName);
        sb.append(", stationNo=").append(stationNo);
        sb.append(", stationState=").append(stationState);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", cityName=").append(cityName);
        sb.append(", stationAddr=").append(stationAddr);
        sb.append(", contactName=").append(contactName);
        sb.append(", phoneNo=").append(phoneNo);
        sb.append(", hasStore=").append(hasStore);
        sb.append(", hasToilet=").append(hasToilet);
        sb.append(", copy=").append(copy);
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