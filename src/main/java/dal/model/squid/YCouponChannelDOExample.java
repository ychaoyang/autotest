package dal.model.squid;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YCouponChannelDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YCouponChannelDOExample() {
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

        public Criteria andCouponHeadIdIsNull() {
            addCriterion("COUPON_HEAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdIsNotNull() {
            addCriterion("COUPON_HEAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdEqualTo(BigDecimal value) {
            addCriterion("COUPON_HEAD_ID =", value, "couponHeadId");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdNotEqualTo(BigDecimal value) {
            addCriterion("COUPON_HEAD_ID <>", value, "couponHeadId");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdGreaterThan(BigDecimal value) {
            addCriterion("COUPON_HEAD_ID >", value, "couponHeadId");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_HEAD_ID >=", value, "couponHeadId");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdLessThan(BigDecimal value) {
            addCriterion("COUPON_HEAD_ID <", value, "couponHeadId");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_HEAD_ID <=", value, "couponHeadId");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdIn(List<BigDecimal> values) {
            addCriterion("COUPON_HEAD_ID in", values, "couponHeadId");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdNotIn(List<BigDecimal> values) {
            addCriterion("COUPON_HEAD_ID not in", values, "couponHeadId");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_HEAD_ID between", value1, value2, "couponHeadId");
            return (Criteria) this;
        }

        public Criteria andCouponHeadIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_HEAD_ID not between", value1, value2, "couponHeadId");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNull() {
            addCriterion("CHANNEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNotNull() {
            addCriterion("CHANNEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeEqualTo(String value) {
            addCriterion("CHANNEL_TYPE =", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotEqualTo(String value) {
            addCriterion("CHANNEL_TYPE <>", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThan(String value) {
            addCriterion("CHANNEL_TYPE >", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TYPE >=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThan(String value) {
            addCriterion("CHANNEL_TYPE <", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TYPE <=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLike(String value) {
            addCriterion("CHANNEL_TYPE like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotLike(String value) {
            addCriterion("CHANNEL_TYPE not like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIn(List<String> values) {
            addCriterion("CHANNEL_TYPE in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotIn(List<String> values) {
            addCriterion("CHANNEL_TYPE not in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeBetween(String value1, String value2) {
            addCriterion("CHANNEL_TYPE between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_TYPE not between", value1, value2, "channelType");
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

        public Criteria andNumsReceiveIsNull() {
            addCriterion("NUMS_RECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveIsNotNull() {
            addCriterion("NUMS_RECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveEqualTo(Integer value) {
            addCriterion("NUMS_RECEIVE =", value, "numsReceive");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveNotEqualTo(Integer value) {
            addCriterion("NUMS_RECEIVE <>", value, "numsReceive");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveGreaterThan(Integer value) {
            addCriterion("NUMS_RECEIVE >", value, "numsReceive");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUMS_RECEIVE >=", value, "numsReceive");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveLessThan(Integer value) {
            addCriterion("NUMS_RECEIVE <", value, "numsReceive");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveLessThanOrEqualTo(Integer value) {
            addCriterion("NUMS_RECEIVE <=", value, "numsReceive");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveIn(List<Integer> values) {
            addCriterion("NUMS_RECEIVE in", values, "numsReceive");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveNotIn(List<Integer> values) {
            addCriterion("NUMS_RECEIVE not in", values, "numsReceive");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveBetween(Integer value1, Integer value2) {
            addCriterion("NUMS_RECEIVE between", value1, value2, "numsReceive");
            return (Criteria) this;
        }

        public Criteria andNumsReceiveNotBetween(Integer value1, Integer value2) {
            addCriterion("NUMS_RECEIVE not between", value1, value2, "numsReceive");
            return (Criteria) this;
        }

        public Criteria andNumsUseIsNull() {
            addCriterion("NUMS_USE is null");
            return (Criteria) this;
        }

        public Criteria andNumsUseIsNotNull() {
            addCriterion("NUMS_USE is not null");
            return (Criteria) this;
        }

        public Criteria andNumsUseEqualTo(Integer value) {
            addCriterion("NUMS_USE =", value, "numsUse");
            return (Criteria) this;
        }

        public Criteria andNumsUseNotEqualTo(Integer value) {
            addCriterion("NUMS_USE <>", value, "numsUse");
            return (Criteria) this;
        }

        public Criteria andNumsUseGreaterThan(Integer value) {
            addCriterion("NUMS_USE >", value, "numsUse");
            return (Criteria) this;
        }

        public Criteria andNumsUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUMS_USE >=", value, "numsUse");
            return (Criteria) this;
        }

        public Criteria andNumsUseLessThan(Integer value) {
            addCriterion("NUMS_USE <", value, "numsUse");
            return (Criteria) this;
        }

        public Criteria andNumsUseLessThanOrEqualTo(Integer value) {
            addCriterion("NUMS_USE <=", value, "numsUse");
            return (Criteria) this;
        }

        public Criteria andNumsUseIn(List<Integer> values) {
            addCriterion("NUMS_USE in", values, "numsUse");
            return (Criteria) this;
        }

        public Criteria andNumsUseNotIn(List<Integer> values) {
            addCriterion("NUMS_USE not in", values, "numsUse");
            return (Criteria) this;
        }

        public Criteria andNumsUseBetween(Integer value1, Integer value2) {
            addCriterion("NUMS_USE between", value1, value2, "numsUse");
            return (Criteria) this;
        }

        public Criteria andNumsUseNotBetween(Integer value1, Integer value2) {
            addCriterion("NUMS_USE not between", value1, value2, "numsUse");
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