package dal.model.squid;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YCouponHeadDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YCouponHeadDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEntityIdIsNull() {
            addCriterion("ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(Long value) {
            addCriterion("ENTITY_ID =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(Long value) {
            addCriterion("ENTITY_ID <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(Long value) {
            addCriterion("ENTITY_ID >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ENTITY_ID >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(Long value) {
            addCriterion("ENTITY_ID <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("ENTITY_ID <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<Long> values) {
            addCriterion("ENTITY_ID in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<Long> values) {
            addCriterion("ENTITY_ID not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(Long value1, Long value2) {
            addCriterion("ENTITY_ID between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("ENTITY_ID not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("PLATFORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("PLATFORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(BigDecimal value) {
            addCriterion("PLATFORM_ID =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(BigDecimal value) {
            addCriterion("PLATFORM_ID <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(BigDecimal value) {
            addCriterion("PLATFORM_ID >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLATFORM_ID >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(BigDecimal value) {
            addCriterion("PLATFORM_ID <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLATFORM_ID <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<BigDecimal> values) {
            addCriterion("PLATFORM_ID in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<BigDecimal> values) {
            addCriterion("PLATFORM_ID not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLATFORM_ID between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLATFORM_ID not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdIsNull() {
            addCriterion("SUPPLIER_HEAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdIsNotNull() {
            addCriterion("SUPPLIER_HEAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdEqualTo(BigDecimal value) {
            addCriterion("SUPPLIER_HEAD_ID =", value, "supplierHeadId");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdNotEqualTo(BigDecimal value) {
            addCriterion("SUPPLIER_HEAD_ID <>", value, "supplierHeadId");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdGreaterThan(BigDecimal value) {
            addCriterion("SUPPLIER_HEAD_ID >", value, "supplierHeadId");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUPPLIER_HEAD_ID >=", value, "supplierHeadId");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdLessThan(BigDecimal value) {
            addCriterion("SUPPLIER_HEAD_ID <", value, "supplierHeadId");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUPPLIER_HEAD_ID <=", value, "supplierHeadId");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdIn(List<BigDecimal> values) {
            addCriterion("SUPPLIER_HEAD_ID in", values, "supplierHeadId");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdNotIn(List<BigDecimal> values) {
            addCriterion("SUPPLIER_HEAD_ID not in", values, "supplierHeadId");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUPPLIER_HEAD_ID between", value1, value2, "supplierHeadId");
            return (Criteria) this;
        }

        public Criteria andSupplierHeadIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUPPLIER_HEAD_ID not between", value1, value2, "supplierHeadId");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdIsNull() {
            addCriterion("SHOP_HEAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdIsNotNull() {
            addCriterion("SHOP_HEAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdEqualTo(BigDecimal value) {
            addCriterion("SHOP_HEAD_ID =", value, "shopHeadId");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdNotEqualTo(BigDecimal value) {
            addCriterion("SHOP_HEAD_ID <>", value, "shopHeadId");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdGreaterThan(BigDecimal value) {
            addCriterion("SHOP_HEAD_ID >", value, "shopHeadId");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOP_HEAD_ID >=", value, "shopHeadId");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdLessThan(BigDecimal value) {
            addCriterion("SHOP_HEAD_ID <", value, "shopHeadId");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOP_HEAD_ID <=", value, "shopHeadId");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdIn(List<BigDecimal> values) {
            addCriterion("SHOP_HEAD_ID in", values, "shopHeadId");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdNotIn(List<BigDecimal> values) {
            addCriterion("SHOP_HEAD_ID not in", values, "shopHeadId");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOP_HEAD_ID between", value1, value2, "shopHeadId");
            return (Criteria) this;
        }

        public Criteria andShopHeadIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOP_HEAD_ID not between", value1, value2, "shopHeadId");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("COUPON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("COUPON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("COUPON_NAME =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("COUPON_NAME <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("COUPON_NAME >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_NAME >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("COUPON_NAME <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("COUPON_NAME <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("COUPON_NAME like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("COUPON_NAME not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("COUPON_NAME in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("COUPON_NAME not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("COUPON_NAME between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("COUPON_NAME not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("COUPON_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("COUPON_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(String value) {
            addCriterion("COUPON_TYPE =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(String value) {
            addCriterion("COUPON_TYPE <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(String value) {
            addCriterion("COUPON_TYPE >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_TYPE >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(String value) {
            addCriterion("COUPON_TYPE <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(String value) {
            addCriterion("COUPON_TYPE <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLike(String value) {
            addCriterion("COUPON_TYPE like", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotLike(String value) {
            addCriterion("COUPON_TYPE not like", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<String> values) {
            addCriterion("COUPON_TYPE in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<String> values) {
            addCriterion("COUPON_TYPE not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(String value1, String value2) {
            addCriterion("COUPON_TYPE between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(String value1, String value2) {
            addCriterion("COUPON_TYPE not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNull() {
            addCriterion("COUPON_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNotNull() {
            addCriterion("COUPON_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualTo(Long value) {
            addCriterion("COUPON_PRICE =", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualTo(Long value) {
            addCriterion("COUPON_PRICE <>", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThan(Long value) {
            addCriterion("COUPON_PRICE >", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("COUPON_PRICE >=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThan(Long value) {
            addCriterion("COUPON_PRICE <", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualTo(Long value) {
            addCriterion("COUPON_PRICE <=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIn(List<Long> values) {
            addCriterion("COUPON_PRICE in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotIn(List<Long> values) {
            addCriterion("COUPON_PRICE not in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBetween(Long value1, Long value2) {
            addCriterion("COUPON_PRICE between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotBetween(Long value1, Long value2) {
            addCriterion("COUPON_PRICE not between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andGainWayIsNull() {
            addCriterion("GAIN_WAY is null");
            return (Criteria) this;
        }

        public Criteria andGainWayIsNotNull() {
            addCriterion("GAIN_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andGainWayEqualTo(String value) {
            addCriterion("GAIN_WAY =", value, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayNotEqualTo(String value) {
            addCriterion("GAIN_WAY <>", value, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayGreaterThan(String value) {
            addCriterion("GAIN_WAY >", value, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayGreaterThanOrEqualTo(String value) {
            addCriterion("GAIN_WAY >=", value, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayLessThan(String value) {
            addCriterion("GAIN_WAY <", value, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayLessThanOrEqualTo(String value) {
            addCriterion("GAIN_WAY <=", value, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayLike(String value) {
            addCriterion("GAIN_WAY like", value, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayNotLike(String value) {
            addCriterion("GAIN_WAY not like", value, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayIn(List<String> values) {
            addCriterion("GAIN_WAY in", values, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayNotIn(List<String> values) {
            addCriterion("GAIN_WAY not in", values, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayBetween(String value1, String value2) {
            addCriterion("GAIN_WAY between", value1, value2, "gainWay");
            return (Criteria) this;
        }

        public Criteria andGainWayNotBetween(String value1, String value2) {
            addCriterion("GAIN_WAY not between", value1, value2, "gainWay");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetIsNull() {
            addCriterion("COUPON_IS_GET is null");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetIsNotNull() {
            addCriterion("COUPON_IS_GET is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetEqualTo(String value) {
            addCriterion("COUPON_IS_GET =", value, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetNotEqualTo(String value) {
            addCriterion("COUPON_IS_GET <>", value, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetGreaterThan(String value) {
            addCriterion("COUPON_IS_GET >", value, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_IS_GET >=", value, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetLessThan(String value) {
            addCriterion("COUPON_IS_GET <", value, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetLessThanOrEqualTo(String value) {
            addCriterion("COUPON_IS_GET <=", value, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetLike(String value) {
            addCriterion("COUPON_IS_GET like", value, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetNotLike(String value) {
            addCriterion("COUPON_IS_GET not like", value, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetIn(List<String> values) {
            addCriterion("COUPON_IS_GET in", values, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetNotIn(List<String> values) {
            addCriterion("COUPON_IS_GET not in", values, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetBetween(String value1, String value2) {
            addCriterion("COUPON_IS_GET between", value1, value2, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andCouponIsGetNotBetween(String value1, String value2) {
            addCriterion("COUPON_IS_GET not between", value1, value2, "couponIsGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetIsNull() {
            addCriterion("MAX_USER_GET is null");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetIsNotNull() {
            addCriterion("MAX_USER_GET is not null");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetEqualTo(Short value) {
            addCriterion("MAX_USER_GET =", value, "maxUserGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetNotEqualTo(Short value) {
            addCriterion("MAX_USER_GET <>", value, "maxUserGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetGreaterThan(Short value) {
            addCriterion("MAX_USER_GET >", value, "maxUserGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetGreaterThanOrEqualTo(Short value) {
            addCriterion("MAX_USER_GET >=", value, "maxUserGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetLessThan(Short value) {
            addCriterion("MAX_USER_GET <", value, "maxUserGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetLessThanOrEqualTo(Short value) {
            addCriterion("MAX_USER_GET <=", value, "maxUserGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetIn(List<Short> values) {
            addCriterion("MAX_USER_GET in", values, "maxUserGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetNotIn(List<Short> values) {
            addCriterion("MAX_USER_GET not in", values, "maxUserGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetBetween(Short value1, Short value2) {
            addCriterion("MAX_USER_GET between", value1, value2, "maxUserGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserGetNotBetween(Short value1, Short value2) {
            addCriterion("MAX_USER_GET not between", value1, value2, "maxUserGet");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseIsNull() {
            addCriterion("MAX_USER_USE is null");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseIsNotNull() {
            addCriterion("MAX_USER_USE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseEqualTo(Short value) {
            addCriterion("MAX_USER_USE =", value, "maxUserUse");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseNotEqualTo(Short value) {
            addCriterion("MAX_USER_USE <>", value, "maxUserUse");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseGreaterThan(Short value) {
            addCriterion("MAX_USER_USE >", value, "maxUserUse");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseGreaterThanOrEqualTo(Short value) {
            addCriterion("MAX_USER_USE >=", value, "maxUserUse");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseLessThan(Short value) {
            addCriterion("MAX_USER_USE <", value, "maxUserUse");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseLessThanOrEqualTo(Short value) {
            addCriterion("MAX_USER_USE <=", value, "maxUserUse");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseIn(List<Short> values) {
            addCriterion("MAX_USER_USE in", values, "maxUserUse");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseNotIn(List<Short> values) {
            addCriterion("MAX_USER_USE not in", values, "maxUserUse");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseBetween(Short value1, Short value2) {
            addCriterion("MAX_USER_USE between", value1, value2, "maxUserUse");
            return (Criteria) this;
        }

        public Criteria andMaxUserUseNotBetween(Short value1, Short value2) {
            addCriterion("MAX_USER_USE not between", value1, value2, "maxUserUse");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionIsNull() {
            addCriterion("MAX_SUPERPOSITION is null");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionIsNotNull() {
            addCriterion("MAX_SUPERPOSITION is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionEqualTo(Short value) {
            addCriterion("MAX_SUPERPOSITION =", value, "maxSuperposition");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionNotEqualTo(Short value) {
            addCriterion("MAX_SUPERPOSITION <>", value, "maxSuperposition");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionGreaterThan(Short value) {
            addCriterion("MAX_SUPERPOSITION >", value, "maxSuperposition");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionGreaterThanOrEqualTo(Short value) {
            addCriterion("MAX_SUPERPOSITION >=", value, "maxSuperposition");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionLessThan(Short value) {
            addCriterion("MAX_SUPERPOSITION <", value, "maxSuperposition");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionLessThanOrEqualTo(Short value) {
            addCriterion("MAX_SUPERPOSITION <=", value, "maxSuperposition");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionIn(List<Short> values) {
            addCriterion("MAX_SUPERPOSITION in", values, "maxSuperposition");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionNotIn(List<Short> values) {
            addCriterion("MAX_SUPERPOSITION not in", values, "maxSuperposition");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionBetween(Short value1, Short value2) {
            addCriterion("MAX_SUPERPOSITION between", value1, value2, "maxSuperposition");
            return (Criteria) this;
        }

        public Criteria andMaxSuperpositionNotBetween(Short value1, Short value2) {
            addCriterion("MAX_SUPERPOSITION not between", value1, value2, "maxSuperposition");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountIsNull() {
            addCriterion("MAX_RELIEF_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountIsNotNull() {
            addCriterion("MAX_RELIEF_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountEqualTo(BigDecimal value) {
            addCriterion("MAX_RELIEF_AMOUNT =", value, "maxReliefAmount");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountNotEqualTo(BigDecimal value) {
            addCriterion("MAX_RELIEF_AMOUNT <>", value, "maxReliefAmount");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountGreaterThan(BigDecimal value) {
            addCriterion("MAX_RELIEF_AMOUNT >", value, "maxReliefAmount");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_RELIEF_AMOUNT >=", value, "maxReliefAmount");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountLessThan(BigDecimal value) {
            addCriterion("MAX_RELIEF_AMOUNT <", value, "maxReliefAmount");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_RELIEF_AMOUNT <=", value, "maxReliefAmount");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountIn(List<BigDecimal> values) {
            addCriterion("MAX_RELIEF_AMOUNT in", values, "maxReliefAmount");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountNotIn(List<BigDecimal> values) {
            addCriterion("MAX_RELIEF_AMOUNT not in", values, "maxReliefAmount");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_RELIEF_AMOUNT between", value1, value2, "maxReliefAmount");
            return (Criteria) this;
        }

        public Criteria andMaxReliefAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_RELIEF_AMOUNT not between", value1, value2, "maxReliefAmount");
            return (Criteria) this;
        }

        public Criteria andNumsCouponIsNull() {
            addCriterion("NUMS_COUPON is null");
            return (Criteria) this;
        }

        public Criteria andNumsCouponIsNotNull() {
            addCriterion("NUMS_COUPON is not null");
            return (Criteria) this;
        }

        public Criteria andNumsCouponEqualTo(Integer value) {
            addCriterion("NUMS_COUPON =", value, "numsCoupon");
            return (Criteria) this;
        }

        public Criteria andNumsCouponNotEqualTo(Integer value) {
            addCriterion("NUMS_COUPON <>", value, "numsCoupon");
            return (Criteria) this;
        }

        public Criteria andNumsCouponGreaterThan(Integer value) {
            addCriterion("NUMS_COUPON >", value, "numsCoupon");
            return (Criteria) this;
        }

        public Criteria andNumsCouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUMS_COUPON >=", value, "numsCoupon");
            return (Criteria) this;
        }

        public Criteria andNumsCouponLessThan(Integer value) {
            addCriterion("NUMS_COUPON <", value, "numsCoupon");
            return (Criteria) this;
        }

        public Criteria andNumsCouponLessThanOrEqualTo(Integer value) {
            addCriterion("NUMS_COUPON <=", value, "numsCoupon");
            return (Criteria) this;
        }

        public Criteria andNumsCouponIn(List<Integer> values) {
            addCriterion("NUMS_COUPON in", values, "numsCoupon");
            return (Criteria) this;
        }

        public Criteria andNumsCouponNotIn(List<Integer> values) {
            addCriterion("NUMS_COUPON not in", values, "numsCoupon");
            return (Criteria) this;
        }

        public Criteria andNumsCouponBetween(Integer value1, Integer value2) {
            addCriterion("NUMS_COUPON between", value1, value2, "numsCoupon");
            return (Criteria) this;
        }

        public Criteria andNumsCouponNotBetween(Integer value1, Integer value2) {
            addCriterion("NUMS_COUPON not between", value1, value2, "numsCoupon");
            return (Criteria) this;
        }

        public Criteria andUseTogetherIsNull() {
            addCriterion("USE_TOGETHER is null");
            return (Criteria) this;
        }

        public Criteria andUseTogetherIsNotNull() {
            addCriterion("USE_TOGETHER is not null");
            return (Criteria) this;
        }

        public Criteria andUseTogetherEqualTo(String value) {
            addCriterion("USE_TOGETHER =", value, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherNotEqualTo(String value) {
            addCriterion("USE_TOGETHER <>", value, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherGreaterThan(String value) {
            addCriterion("USE_TOGETHER >", value, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherGreaterThanOrEqualTo(String value) {
            addCriterion("USE_TOGETHER >=", value, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherLessThan(String value) {
            addCriterion("USE_TOGETHER <", value, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherLessThanOrEqualTo(String value) {
            addCriterion("USE_TOGETHER <=", value, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherLike(String value) {
            addCriterion("USE_TOGETHER like", value, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherNotLike(String value) {
            addCriterion("USE_TOGETHER not like", value, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherIn(List<String> values) {
            addCriterion("USE_TOGETHER in", values, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherNotIn(List<String> values) {
            addCriterion("USE_TOGETHER not in", values, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherBetween(String value1, String value2) {
            addCriterion("USE_TOGETHER between", value1, value2, "useTogether");
            return (Criteria) this;
        }

        public Criteria andUseTogetherNotBetween(String value1, String value2) {
            addCriterion("USE_TOGETHER not between", value1, value2, "useTogether");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("TOTAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("TOTAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Long value) {
            addCriterion("TOTAL_AMOUNT =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Long value) {
            addCriterion("TOTAL_AMOUNT <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Long value) {
            addCriterion("TOTAL_AMOUNT >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_AMOUNT >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Long value) {
            addCriterion("TOTAL_AMOUNT <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_AMOUNT <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Long> values) {
            addCriterion("TOTAL_AMOUNT in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Long> values) {
            addCriterion("TOTAL_AMOUNT not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Long value1, Long value2) {
            addCriterion("TOTAL_AMOUNT between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_AMOUNT not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNull() {
            addCriterion("COUPON_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNotNull() {
            addCriterion("COUPON_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusEqualTo(String value) {
            addCriterion("COUPON_STATUS =", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotEqualTo(String value) {
            addCriterion("COUPON_STATUS <>", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThan(String value) {
            addCriterion("COUPON_STATUS >", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_STATUS >=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThan(String value) {
            addCriterion("COUPON_STATUS <", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThanOrEqualTo(String value) {
            addCriterion("COUPON_STATUS <=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLike(String value) {
            addCriterion("COUPON_STATUS like", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotLike(String value) {
            addCriterion("COUPON_STATUS not like", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIn(List<String> values) {
            addCriterion("COUPON_STATUS in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotIn(List<String> values) {
            addCriterion("COUPON_STATUS not in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusBetween(String value1, String value2) {
            addCriterion("COUPON_STATUS between", value1, value2, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotBetween(String value1, String value2) {
            addCriterion("COUPON_STATUS not between", value1, value2, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNull() {
            addCriterion("MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNotNull() {
            addCriterion("MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateEqualTo(Date value) {
            addCriterion("MODIFIED_DATE =", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotEqualTo(Date value) {
            addCriterion("MODIFIED_DATE <>", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThan(Date value) {
            addCriterion("MODIFIED_DATE >", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_DATE >=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThan(Date value) {
            addCriterion("MODIFIED_DATE <", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_DATE <=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIn(List<Date> values) {
            addCriterion("MODIFIED_DATE in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotIn(List<Date> values) {
            addCriterion("MODIFIED_DATE not in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_DATE between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_DATE not between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNull() {
            addCriterion("CREATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNotNull() {
            addCriterion("CREATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserEqualTo(String value) {
            addCriterion("CREATED_USER =", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotEqualTo(String value) {
            addCriterion("CREATED_USER <>", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThan(String value) {
            addCriterion("CREATED_USER >", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER >=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThan(String value) {
            addCriterion("CREATED_USER <", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER <=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLike(String value) {
            addCriterion("CREATED_USER like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotLike(String value) {
            addCriterion("CREATED_USER not like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIn(List<String> values) {
            addCriterion("CREATED_USER in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotIn(List<String> values) {
            addCriterion("CREATED_USER not in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserBetween(String value1, String value2) {
            addCriterion("CREATED_USER between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER not between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIsNull() {
            addCriterion("UPDATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIsNotNull() {
            addCriterion("UPDATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserEqualTo(String value) {
            addCriterion("UPDATED_USER =", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotEqualTo(String value) {
            addCriterion("UPDATED_USER <>", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserGreaterThan(String value) {
            addCriterion("UPDATED_USER >", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_USER >=", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserLessThan(String value) {
            addCriterion("UPDATED_USER <", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_USER <=", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserLike(String value) {
            addCriterion("UPDATED_USER like", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotLike(String value) {
            addCriterion("UPDATED_USER not like", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIn(List<String> values) {
            addCriterion("UPDATED_USER in", values, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotIn(List<String> values) {
            addCriterion("UPDATED_USER not in", values, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserBetween(String value1, String value2) {
            addCriterion("UPDATED_USER between", value1, value2, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotBetween(String value1, String value2) {
            addCriterion("UPDATED_USER not between", value1, value2, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNull() {
            addCriterion("VERSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNotNull() {
            addCriterion("VERSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVersionIdEqualTo(Integer value) {
            addCriterion("VERSION_ID =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Integer value) {
            addCriterion("VERSION_ID <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Integer value) {
            addCriterion("VERSION_ID >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION_ID >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Integer value) {
            addCriterion("VERSION_ID <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION_ID <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(List<Integer> values) {
            addCriterion("VERSION_ID in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(List<Integer> values) {
            addCriterion("VERSION_ID not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_ID between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_ID not between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteIsNull() {
            addCriterion("MARK_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteIsNotNull() {
            addCriterion("MARK_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteEqualTo(String value) {
            addCriterion("MARK_DELETE =", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteNotEqualTo(String value) {
            addCriterion("MARK_DELETE <>", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteGreaterThan(String value) {
            addCriterion("MARK_DELETE >", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("MARK_DELETE >=", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteLessThan(String value) {
            addCriterion("MARK_DELETE <", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteLessThanOrEqualTo(String value) {
            addCriterion("MARK_DELETE <=", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteLike(String value) {
            addCriterion("MARK_DELETE like", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteNotLike(String value) {
            addCriterion("MARK_DELETE not like", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteIn(List<String> values) {
            addCriterion("MARK_DELETE in", values, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteNotIn(List<String> values) {
            addCriterion("MARK_DELETE not in", values, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteBetween(String value1, String value2) {
            addCriterion("MARK_DELETE between", value1, value2, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteNotBetween(String value1, String value2) {
            addCriterion("MARK_DELETE not between", value1, value2, "markDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}