package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "p_pay_order")
public class PPayOrderDO implements Serializable {
    /**
     * 订单id
     */
    @Id
    private String id;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 支付单号
     */
    @Column(name = "pay_no")
    private String payNo;

    /**
     * 商户订单号
     */
    @Column(name = "out_trade_no")
    private String outTradeNo;

    /**
     * 用户id
     */
    private String openid;

    /**
     * 账户ID
     */
    @Column(name = "account_id")
    private String accountId;

    /**
     * 支付授权码
     */
    @Column(name = "auth_code")
    private String authCode;

    /**
     * 商户id
     */
    @Column(name = "mch_id")
    private Integer mchId;

    /**
     * 订单金额
     */
    @Column(name = "order_fee")
    private Integer orderFee;

    /**
     * 燃油标号
     */
    private String oil;

    /**
     * 商户订单附加信息
     */
    private String attach;

    /**
     * 油站名称
     */
    @Column(name = "oil_station")
    private String oilStation;

    /**
     * 加油升数
     */
    private Double volume;

    /**
     * 油站经度
     */
    @Column(name = "station_lon")
    private Double stationLon;

    /**
     * 油站纬度
     */
    @Column(name = "station_lat")
    private Double stationLat;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 手续费费率
     */
    @Column(name = "profit_rate")
    private Double profitRate;

    /**
     * 手续费金额
     */
    @Column(name = "profit_fee")
    private Integer profitFee;

    /**
     * 折扣账号id
     */
    @Column(name = "dis_account_id")
    private String disAccountId;

    /**
     * 折扣金额
     */
    @Column(name = "dis_fee")
    private Integer disFee;

    /**
     * 优惠券id
     */
    @Column(name = "coupon_id")
    private String couponId;

    /**
     * 优惠金额
     */
    @Column(name = "coupon_fee")
    private Integer couponFee;

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
     * 删除标识
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    /**
     * 版本号
     */
    @Column(name = "VERSION_ID")
    private Integer versionId;

    /**
     * 异步通知地址
     */
    @Column(name = "notify_url")
    private String notifyUrl;

    /**
     * 商品名称
     */
    private String body;

    /**
     * 订单超时时间
     */
    @Column(name = "time_expire")
    private Date timeExpire;

    /**
     * 用户实际支付金额
     */
    @Column(name = "pay_fee")
    private Integer payFee;

    @Column(name = "order_day")
    private String orderDay;

    private static final long serialVersionUID = 1L;

    /**
     * 获取订单id
     *
     * @return id - 订单id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置订单id
     *
     * @param id 订单id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取订单编号
     *
     * @return order_no - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取支付单号
     *
     * @return pay_no - 支付单号
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * 设置支付单号
     *
     * @param payNo 支付单号
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    /**
     * 获取商户订单号
     *
     * @return out_trade_no - 商户订单号
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * 设置商户订单号
     *
     * @param outTradeNo 商户订单号
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * 获取用户id
     *
     * @return openid - 用户id
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置用户id
     *
     * @param openid 用户id
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取账户ID
     *
     * @return account_id - 账户ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置账户ID
     *
     * @param accountId 账户ID
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取支付授权码
     *
     * @return auth_code - 支付授权码
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * 设置支付授权码
     *
     * @param authCode 支付授权码
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * 获取商户id
     *
     * @return mch_id - 商户id
     */
    public Integer getMchId() {
        return mchId;
    }

    /**
     * 设置商户id
     *
     * @param mchId 商户id
     */
    public void setMchId(Integer mchId) {
        this.mchId = mchId;
    }

    /**
     * 获取订单金额
     *
     * @return order_fee - 订单金额
     */
    public Integer getOrderFee() {
        return orderFee;
    }

    /**
     * 设置订单金额
     *
     * @param orderFee 订单金额
     */
    public void setOrderFee(Integer orderFee) {
        this.orderFee = orderFee;
    }

    /**
     * 获取燃油标号
     *
     * @return oil - 燃油标号
     */
    public String getOil() {
        return oil;
    }

    /**
     * 设置燃油标号
     *
     * @param oil 燃油标号
     */
    public void setOil(String oil) {
        this.oil = oil;
    }

    /**
     * 获取商户订单附加信息
     *
     * @return attach - 商户订单附加信息
     */
    public String getAttach() {
        return attach;
    }

    /**
     * 设置商户订单附加信息
     *
     * @param attach 商户订单附加信息
     */
    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * 获取油站名称
     *
     * @return oil_station - 油站名称
     */
    public String getOilStation() {
        return oilStation;
    }

    /**
     * 设置油站名称
     *
     * @param oilStation 油站名称
     */
    public void setOilStation(String oilStation) {
        this.oilStation = oilStation;
    }

    /**
     * 获取加油升数
     *
     * @return volume - 加油升数
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * 设置加油升数
     *
     * @param volume 加油升数
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    /**
     * 获取油站经度
     *
     * @return station_lon - 油站经度
     */
    public Double getStationLon() {
        return stationLon;
    }

    /**
     * 设置油站经度
     *
     * @param stationLon 油站经度
     */
    public void setStationLon(Double stationLon) {
        this.stationLon = stationLon;
    }

    /**
     * 获取油站纬度
     *
     * @return station_lat - 油站纬度
     */
    public Double getStationLat() {
        return stationLat;
    }

    /**
     * 设置油站纬度
     *
     * @param stationLat 油站纬度
     */
    public void setStationLat(Double stationLat) {
        this.stationLat = stationLat;
    }

    /**
     * 获取订单状态
     *
     * @return status - 订单状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置订单状态
     *
     * @param status 订单状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取手续费费率
     *
     * @return profit_rate - 手续费费率
     */
    public Double getProfitRate() {
        return profitRate;
    }

    /**
     * 设置手续费费率
     *
     * @param profitRate 手续费费率
     */
    public void setProfitRate(Double profitRate) {
        this.profitRate = profitRate;
    }

    /**
     * 获取手续费金额
     *
     * @return profit_fee - 手续费金额
     */
    public Integer getProfitFee() {
        return profitFee;
    }

    /**
     * 设置手续费金额
     *
     * @param profitFee 手续费金额
     */
    public void setProfitFee(Integer profitFee) {
        this.profitFee = profitFee;
    }

    /**
     * 获取折扣账号id
     *
     * @return dis_account_id - 折扣账号id
     */
    public String getDisAccountId() {
        return disAccountId;
    }

    /**
     * 设置折扣账号id
     *
     * @param disAccountId 折扣账号id
     */
    public void setDisAccountId(String disAccountId) {
        this.disAccountId = disAccountId;
    }

    /**
     * 获取折扣金额
     *
     * @return dis_fee - 折扣金额
     */
    public Integer getDisFee() {
        return disFee;
    }

    /**
     * 设置折扣金额
     *
     * @param disFee 折扣金额
     */
    public void setDisFee(Integer disFee) {
        this.disFee = disFee;
    }

    /**
     * 获取优惠券id
     *
     * @return coupon_id - 优惠券id
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 设置优惠券id
     *
     * @param couponId 优惠券id
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取优惠金额
     *
     * @return coupon_fee - 优惠金额
     */
    public Integer getCouponFee() {
        return couponFee;
    }

    /**
     * 设置优惠金额
     *
     * @param couponFee 优惠金额
     */
    public void setCouponFee(Integer couponFee) {
        this.couponFee = couponFee;
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
     * 获取删除标识
     *
     * @return MARK_DELETE - 删除标识
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置删除标识
     *
     * @param markDelete 删除标识
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
     * 获取异步通知地址
     *
     * @return notify_url - 异步通知地址
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * 设置异步通知地址
     *
     * @param notifyUrl 异步通知地址
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * 获取商品名称
     *
     * @return body - 商品名称
     */
    public String getBody() {
        return body;
    }

    /**
     * 设置商品名称
     *
     * @param body 商品名称
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 获取订单超时时间
     *
     * @return time_expire - 订单超时时间
     */
    public Date getTimeExpire() {
        return timeExpire;
    }

    /**
     * 设置订单超时时间
     *
     * @param timeExpire 订单超时时间
     */
    public void setTimeExpire(Date timeExpire) {
        this.timeExpire = timeExpire;
    }

    /**
     * 获取用户实际支付金额
     *
     * @return pay_fee - 用户实际支付金额
     */
    public Integer getPayFee() {
        return payFee;
    }

    /**
     * 设置用户实际支付金额
     *
     * @param payFee 用户实际支付金额
     */
    public void setPayFee(Integer payFee) {
        this.payFee = payFee;
    }

    /**
     * @return order_day
     */
    public String getOrderDay() {
        return orderDay;
    }

    /**
     * @param orderDay
     */
    public void setOrderDay(String orderDay) {
        this.orderDay = orderDay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", payNo=").append(payNo);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", openid=").append(openid);
        sb.append(", accountId=").append(accountId);
        sb.append(", authCode=").append(authCode);
        sb.append(", mchId=").append(mchId);
        sb.append(", orderFee=").append(orderFee);
        sb.append(", oil=").append(oil);
        sb.append(", attach=").append(attach);
        sb.append(", oilStation=").append(oilStation);
        sb.append(", volume=").append(volume);
        sb.append(", stationLon=").append(stationLon);
        sb.append(", stationLat=").append(stationLat);
        sb.append(", status=").append(status);
        sb.append(", payTime=").append(payTime);
        sb.append(", profitRate=").append(profitRate);
        sb.append(", profitFee=").append(profitFee);
        sb.append(", disAccountId=").append(disAccountId);
        sb.append(", disFee=").append(disFee);
        sb.append(", couponId=").append(couponId);
        sb.append(", couponFee=").append(couponFee);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", versionId=").append(versionId);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", body=").append(body);
        sb.append(", timeExpire=").append(timeExpire);
        sb.append(", payFee=").append(payFee);
        sb.append(", orderDay=").append(orderDay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}