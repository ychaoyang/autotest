package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallLogDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMallLogDOExample() {
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

        public Criteria andMallLogIdIsNull() {
            addCriterion("MALL_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andMallLogIdIsNotNull() {
            addCriterion("MALL_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMallLogIdEqualTo(Long value) {
            addCriterion("MALL_LOG_ID =", value, "mallLogId");
            return (Criteria) this;
        }

        public Criteria andMallLogIdNotEqualTo(Long value) {
            addCriterion("MALL_LOG_ID <>", value, "mallLogId");
            return (Criteria) this;
        }

        public Criteria andMallLogIdGreaterThan(Long value) {
            addCriterion("MALL_LOG_ID >", value, "mallLogId");
            return (Criteria) this;
        }

        public Criteria andMallLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MALL_LOG_ID >=", value, "mallLogId");
            return (Criteria) this;
        }

        public Criteria andMallLogIdLessThan(Long value) {
            addCriterion("MALL_LOG_ID <", value, "mallLogId");
            return (Criteria) this;
        }

        public Criteria andMallLogIdLessThanOrEqualTo(Long value) {
            addCriterion("MALL_LOG_ID <=", value, "mallLogId");
            return (Criteria) this;
        }

        public Criteria andMallLogIdIn(List<Long> values) {
            addCriterion("MALL_LOG_ID in", values, "mallLogId");
            return (Criteria) this;
        }

        public Criteria andMallLogIdNotIn(List<Long> values) {
            addCriterion("MALL_LOG_ID not in", values, "mallLogId");
            return (Criteria) this;
        }

        public Criteria andMallLogIdBetween(Long value1, Long value2) {
            addCriterion("MALL_LOG_ID between", value1, value2, "mallLogId");
            return (Criteria) this;
        }

        public Criteria andMallLogIdNotBetween(Long value1, Long value2) {
            addCriterion("MALL_LOG_ID not between", value1, value2, "mallLogId");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdIsNull() {
            addCriterion("MALL_HEAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdIsNotNull() {
            addCriterion("MALL_HEAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdEqualTo(Long value) {
            addCriterion("MALL_HEAD_ID =", value, "mallHeadId");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdNotEqualTo(Long value) {
            addCriterion("MALL_HEAD_ID <>", value, "mallHeadId");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdGreaterThan(Long value) {
            addCriterion("MALL_HEAD_ID >", value, "mallHeadId");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MALL_HEAD_ID >=", value, "mallHeadId");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdLessThan(Long value) {
            addCriterion("MALL_HEAD_ID <", value, "mallHeadId");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdLessThanOrEqualTo(Long value) {
            addCriterion("MALL_HEAD_ID <=", value, "mallHeadId");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdIn(List<Long> values) {
            addCriterion("MALL_HEAD_ID in", values, "mallHeadId");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdNotIn(List<Long> values) {
            addCriterion("MALL_HEAD_ID not in", values, "mallHeadId");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdBetween(Long value1, Long value2) {
            addCriterion("MALL_HEAD_ID between", value1, value2, "mallHeadId");
            return (Criteria) this;
        }

        public Criteria andMallHeadIdNotBetween(Long value1, Long value2) {
            addCriterion("MALL_HEAD_ID not between", value1, value2, "mallHeadId");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdIsNull() {
            addCriterion("MALL_SUBUSER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdIsNotNull() {
            addCriterion("MALL_SUBUSER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdEqualTo(Long value) {
            addCriterion("MALL_SUBUSER_ID =", value, "mallSubuserId");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdNotEqualTo(Long value) {
            addCriterion("MALL_SUBUSER_ID <>", value, "mallSubuserId");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdGreaterThan(Long value) {
            addCriterion("MALL_SUBUSER_ID >", value, "mallSubuserId");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MALL_SUBUSER_ID >=", value, "mallSubuserId");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdLessThan(Long value) {
            addCriterion("MALL_SUBUSER_ID <", value, "mallSubuserId");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdLessThanOrEqualTo(Long value) {
            addCriterion("MALL_SUBUSER_ID <=", value, "mallSubuserId");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdIn(List<Long> values) {
            addCriterion("MALL_SUBUSER_ID in", values, "mallSubuserId");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdNotIn(List<Long> values) {
            addCriterion("MALL_SUBUSER_ID not in", values, "mallSubuserId");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdBetween(Long value1, Long value2) {
            addCriterion("MALL_SUBUSER_ID between", value1, value2, "mallSubuserId");
            return (Criteria) this;
        }

        public Criteria andMallSubuserIdNotBetween(Long value1, Long value2) {
            addCriterion("MALL_SUBUSER_ID not between", value1, value2, "mallSubuserId");
            return (Criteria) this;
        }

        public Criteria andMallLogDateIsNull() {
            addCriterion("MALL_LOG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMallLogDateIsNotNull() {
            addCriterion("MALL_LOG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMallLogDateEqualTo(Date value) {
            addCriterion("MALL_LOG_DATE =", value, "mallLogDate");
            return (Criteria) this;
        }

        public Criteria andMallLogDateNotEqualTo(Date value) {
            addCriterion("MALL_LOG_DATE <>", value, "mallLogDate");
            return (Criteria) this;
        }

        public Criteria andMallLogDateGreaterThan(Date value) {
            addCriterion("MALL_LOG_DATE >", value, "mallLogDate");
            return (Criteria) this;
        }

        public Criteria andMallLogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MALL_LOG_DATE >=", value, "mallLogDate");
            return (Criteria) this;
        }

        public Criteria andMallLogDateLessThan(Date value) {
            addCriterion("MALL_LOG_DATE <", value, "mallLogDate");
            return (Criteria) this;
        }

        public Criteria andMallLogDateLessThanOrEqualTo(Date value) {
            addCriterion("MALL_LOG_DATE <=", value, "mallLogDate");
            return (Criteria) this;
        }

        public Criteria andMallLogDateIn(List<Date> values) {
            addCriterion("MALL_LOG_DATE in", values, "mallLogDate");
            return (Criteria) this;
        }

        public Criteria andMallLogDateNotIn(List<Date> values) {
            addCriterion("MALL_LOG_DATE not in", values, "mallLogDate");
            return (Criteria) this;
        }

        public Criteria andMallLogDateBetween(Date value1, Date value2) {
            addCriterion("MALL_LOG_DATE between", value1, value2, "mallLogDate");
            return (Criteria) this;
        }

        public Criteria andMallLogDateNotBetween(Date value1, Date value2) {
            addCriterion("MALL_LOG_DATE not between", value1, value2, "mallLogDate");
            return (Criteria) this;
        }

        public Criteria andMallLogIpIsNull() {
            addCriterion("MALL_LOG_IP is null");
            return (Criteria) this;
        }

        public Criteria andMallLogIpIsNotNull() {
            addCriterion("MALL_LOG_IP is not null");
            return (Criteria) this;
        }

        public Criteria andMallLogIpEqualTo(String value) {
            addCriterion("MALL_LOG_IP =", value, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpNotEqualTo(String value) {
            addCriterion("MALL_LOG_IP <>", value, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpGreaterThan(String value) {
            addCriterion("MALL_LOG_IP >", value, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_LOG_IP >=", value, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpLessThan(String value) {
            addCriterion("MALL_LOG_IP <", value, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpLessThanOrEqualTo(String value) {
            addCriterion("MALL_LOG_IP <=", value, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpLike(String value) {
            addCriterion("MALL_LOG_IP like", value, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpNotLike(String value) {
            addCriterion("MALL_LOG_IP not like", value, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpIn(List<String> values) {
            addCriterion("MALL_LOG_IP in", values, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpNotIn(List<String> values) {
            addCriterion("MALL_LOG_IP not in", values, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpBetween(String value1, String value2) {
            addCriterion("MALL_LOG_IP between", value1, value2, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogIpNotBetween(String value1, String value2) {
            addCriterion("MALL_LOG_IP not between", value1, value2, "mallLogIp");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordIsNull() {
            addCriterion("MALL_LOG_RECORD is null");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordIsNotNull() {
            addCriterion("MALL_LOG_RECORD is not null");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordEqualTo(String value) {
            addCriterion("MALL_LOG_RECORD =", value, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordNotEqualTo(String value) {
            addCriterion("MALL_LOG_RECORD <>", value, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordGreaterThan(String value) {
            addCriterion("MALL_LOG_RECORD >", value, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_LOG_RECORD >=", value, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordLessThan(String value) {
            addCriterion("MALL_LOG_RECORD <", value, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordLessThanOrEqualTo(String value) {
            addCriterion("MALL_LOG_RECORD <=", value, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordLike(String value) {
            addCriterion("MALL_LOG_RECORD like", value, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordNotLike(String value) {
            addCriterion("MALL_LOG_RECORD not like", value, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordIn(List<String> values) {
            addCriterion("MALL_LOG_RECORD in", values, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordNotIn(List<String> values) {
            addCriterion("MALL_LOG_RECORD not in", values, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordBetween(String value1, String value2) {
            addCriterion("MALL_LOG_RECORD between", value1, value2, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogRecordNotBetween(String value1, String value2) {
            addCriterion("MALL_LOG_RECORD not between", value1, value2, "mallLogRecord");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoIsNull() {
            addCriterion("MALL_LOG_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoIsNotNull() {
            addCriterion("MALL_LOG_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoEqualTo(String value) {
            addCriterion("MALL_LOG_MEMO =", value, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoNotEqualTo(String value) {
            addCriterion("MALL_LOG_MEMO <>", value, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoGreaterThan(String value) {
            addCriterion("MALL_LOG_MEMO >", value, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_LOG_MEMO >=", value, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoLessThan(String value) {
            addCriterion("MALL_LOG_MEMO <", value, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoLessThanOrEqualTo(String value) {
            addCriterion("MALL_LOG_MEMO <=", value, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoLike(String value) {
            addCriterion("MALL_LOG_MEMO like", value, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoNotLike(String value) {
            addCriterion("MALL_LOG_MEMO not like", value, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoIn(List<String> values) {
            addCriterion("MALL_LOG_MEMO in", values, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoNotIn(List<String> values) {
            addCriterion("MALL_LOG_MEMO not in", values, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoBetween(String value1, String value2) {
            addCriterion("MALL_LOG_MEMO between", value1, value2, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogMemoNotBetween(String value1, String value2) {
            addCriterion("MALL_LOG_MEMO not between", value1, value2, "mallLogMemo");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagIsNull() {
            addCriterion("MALL_LOG_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagIsNotNull() {
            addCriterion("MALL_LOG_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagEqualTo(String value) {
            addCriterion("MALL_LOG_FLAG =", value, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagNotEqualTo(String value) {
            addCriterion("MALL_LOG_FLAG <>", value, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagGreaterThan(String value) {
            addCriterion("MALL_LOG_FLAG >", value, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_LOG_FLAG >=", value, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagLessThan(String value) {
            addCriterion("MALL_LOG_FLAG <", value, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagLessThanOrEqualTo(String value) {
            addCriterion("MALL_LOG_FLAG <=", value, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagLike(String value) {
            addCriterion("MALL_LOG_FLAG like", value, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagNotLike(String value) {
            addCriterion("MALL_LOG_FLAG not like", value, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagIn(List<String> values) {
            addCriterion("MALL_LOG_FLAG in", values, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagNotIn(List<String> values) {
            addCriterion("MALL_LOG_FLAG not in", values, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagBetween(String value1, String value2) {
            addCriterion("MALL_LOG_FLAG between", value1, value2, "mallLogFlag");
            return (Criteria) this;
        }

        public Criteria andMallLogFlagNotBetween(String value1, String value2) {
            addCriterion("MALL_LOG_FLAG not between", value1, value2, "mallLogFlag");
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

        public Criteria andVersionIdEqualTo(Long value) {
            addCriterion("VERSION_ID =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Long value) {
            addCriterion("VERSION_ID <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Long value) {
            addCriterion("VERSION_ID >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VERSION_ID >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Long value) {
            addCriterion("VERSION_ID <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Long value) {
            addCriterion("VERSION_ID <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(List<Long> values) {
            addCriterion("VERSION_ID in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(List<Long> values) {
            addCriterion("VERSION_ID not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Long value1, Long value2) {
            addCriterion("VERSION_ID between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Long value1, Long value2) {
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

        public Criteria andMallLogUsertypeIsNull() {
            addCriterion("MALL_LOG_USERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeIsNotNull() {
            addCriterion("MALL_LOG_USERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeEqualTo(String value) {
            addCriterion("MALL_LOG_USERTYPE =", value, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeNotEqualTo(String value) {
            addCriterion("MALL_LOG_USERTYPE <>", value, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeGreaterThan(String value) {
            addCriterion("MALL_LOG_USERTYPE >", value, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_LOG_USERTYPE >=", value, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeLessThan(String value) {
            addCriterion("MALL_LOG_USERTYPE <", value, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeLessThanOrEqualTo(String value) {
            addCriterion("MALL_LOG_USERTYPE <=", value, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeLike(String value) {
            addCriterion("MALL_LOG_USERTYPE like", value, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeNotLike(String value) {
            addCriterion("MALL_LOG_USERTYPE not like", value, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeIn(List<String> values) {
            addCriterion("MALL_LOG_USERTYPE in", values, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeNotIn(List<String> values) {
            addCriterion("MALL_LOG_USERTYPE not in", values, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeBetween(String value1, String value2) {
            addCriterion("MALL_LOG_USERTYPE between", value1, value2, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallLogUsertypeNotBetween(String value1, String value2) {
            addCriterion("MALL_LOG_USERTYPE not between", value1, value2, "mallLogUsertype");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoIsNull() {
            addCriterion("MALL_HEAD_LOGINNO is null");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoIsNotNull() {
            addCriterion("MALL_HEAD_LOGINNO is not null");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoEqualTo(String value) {
            addCriterion("MALL_HEAD_LOGINNO =", value, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoNotEqualTo(String value) {
            addCriterion("MALL_HEAD_LOGINNO <>", value, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoGreaterThan(String value) {
            addCriterion("MALL_HEAD_LOGINNO >", value, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_HEAD_LOGINNO >=", value, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoLessThan(String value) {
            addCriterion("MALL_HEAD_LOGINNO <", value, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoLessThanOrEqualTo(String value) {
            addCriterion("MALL_HEAD_LOGINNO <=", value, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoLike(String value) {
            addCriterion("MALL_HEAD_LOGINNO like", value, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoNotLike(String value) {
            addCriterion("MALL_HEAD_LOGINNO not like", value, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoIn(List<String> values) {
            addCriterion("MALL_HEAD_LOGINNO in", values, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoNotIn(List<String> values) {
            addCriterion("MALL_HEAD_LOGINNO not in", values, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoBetween(String value1, String value2) {
            addCriterion("MALL_HEAD_LOGINNO between", value1, value2, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallHeadLoginnoNotBetween(String value1, String value2) {
            addCriterion("MALL_HEAD_LOGINNO not between", value1, value2, "mallHeadLoginno");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoIsNull() {
            addCriterion("MALL_SUBUSER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoIsNotNull() {
            addCriterion("MALL_SUBUSER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoEqualTo(String value) {
            addCriterion("MALL_SUBUSER_NO =", value, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoNotEqualTo(String value) {
            addCriterion("MALL_SUBUSER_NO <>", value, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoGreaterThan(String value) {
            addCriterion("MALL_SUBUSER_NO >", value, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_SUBUSER_NO >=", value, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoLessThan(String value) {
            addCriterion("MALL_SUBUSER_NO <", value, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoLessThanOrEqualTo(String value) {
            addCriterion("MALL_SUBUSER_NO <=", value, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoLike(String value) {
            addCriterion("MALL_SUBUSER_NO like", value, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoNotLike(String value) {
            addCriterion("MALL_SUBUSER_NO not like", value, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoIn(List<String> values) {
            addCriterion("MALL_SUBUSER_NO in", values, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoNotIn(List<String> values) {
            addCriterion("MALL_SUBUSER_NO not in", values, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoBetween(String value1, String value2) {
            addCriterion("MALL_SUBUSER_NO between", value1, value2, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andMallSubuserNoNotBetween(String value1, String value2) {
            addCriterion("MALL_SUBUSER_NO not between", value1, value2, "mallSubuserNo");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountIsNull() {
            addCriterion("TAX_RATE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountIsNotNull() {
            addCriterion("TAX_RATE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountEqualTo(Long value) {
            addCriterion("TAX_RATE_AMOUNT =", value, "taxRateAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountNotEqualTo(Long value) {
            addCriterion("TAX_RATE_AMOUNT <>", value, "taxRateAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountGreaterThan(Long value) {
            addCriterion("TAX_RATE_AMOUNT >", value, "taxRateAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("TAX_RATE_AMOUNT >=", value, "taxRateAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountLessThan(Long value) {
            addCriterion("TAX_RATE_AMOUNT <", value, "taxRateAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountLessThanOrEqualTo(Long value) {
            addCriterion("TAX_RATE_AMOUNT <=", value, "taxRateAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountIn(List<Long> values) {
            addCriterion("TAX_RATE_AMOUNT in", values, "taxRateAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountNotIn(List<Long> values) {
            addCriterion("TAX_RATE_AMOUNT not in", values, "taxRateAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountBetween(Long value1, Long value2) {
            addCriterion("TAX_RATE_AMOUNT between", value1, value2, "taxRateAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateAmountNotBetween(Long value1, Long value2) {
            addCriterion("TAX_RATE_AMOUNT not between", value1, value2, "taxRateAmount");
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