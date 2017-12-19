package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MStopwordsDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MStopwordsDOExample() {
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

        public Criteria andStopwordsIdIsNull() {
            addCriterion("STOPWORDS_ID is null");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdIsNotNull() {
            addCriterion("STOPWORDS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdEqualTo(Long value) {
            addCriterion("STOPWORDS_ID =", value, "stopwordsId");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdNotEqualTo(Long value) {
            addCriterion("STOPWORDS_ID <>", value, "stopwordsId");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdGreaterThan(Long value) {
            addCriterion("STOPWORDS_ID >", value, "stopwordsId");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STOPWORDS_ID >=", value, "stopwordsId");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdLessThan(Long value) {
            addCriterion("STOPWORDS_ID <", value, "stopwordsId");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdLessThanOrEqualTo(Long value) {
            addCriterion("STOPWORDS_ID <=", value, "stopwordsId");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdIn(List<Long> values) {
            addCriterion("STOPWORDS_ID in", values, "stopwordsId");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdNotIn(List<Long> values) {
            addCriterion("STOPWORDS_ID not in", values, "stopwordsId");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdBetween(Long value1, Long value2) {
            addCriterion("STOPWORDS_ID between", value1, value2, "stopwordsId");
            return (Criteria) this;
        }

        public Criteria andStopwordsIdNotBetween(Long value1, Long value2) {
            addCriterion("STOPWORDS_ID not between", value1, value2, "stopwordsId");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeIsNull() {
            addCriterion("STOPWORDS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeIsNotNull() {
            addCriterion("STOPWORDS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeEqualTo(String value) {
            addCriterion("STOPWORDS_TYPE =", value, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeNotEqualTo(String value) {
            addCriterion("STOPWORDS_TYPE <>", value, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeGreaterThan(String value) {
            addCriterion("STOPWORDS_TYPE >", value, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STOPWORDS_TYPE >=", value, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeLessThan(String value) {
            addCriterion("STOPWORDS_TYPE <", value, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeLessThanOrEqualTo(String value) {
            addCriterion("STOPWORDS_TYPE <=", value, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeLike(String value) {
            addCriterion("STOPWORDS_TYPE like", value, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeNotLike(String value) {
            addCriterion("STOPWORDS_TYPE not like", value, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeIn(List<String> values) {
            addCriterion("STOPWORDS_TYPE in", values, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeNotIn(List<String> values) {
            addCriterion("STOPWORDS_TYPE not in", values, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeBetween(String value1, String value2) {
            addCriterion("STOPWORDS_TYPE between", value1, value2, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsTypeNotBetween(String value1, String value2) {
            addCriterion("STOPWORDS_TYPE not between", value1, value2, "stopwordsType");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordIsNull() {
            addCriterion("STOPWORDS_WORD is null");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordIsNotNull() {
            addCriterion("STOPWORDS_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordEqualTo(String value) {
            addCriterion("STOPWORDS_WORD =", value, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordNotEqualTo(String value) {
            addCriterion("STOPWORDS_WORD <>", value, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordGreaterThan(String value) {
            addCriterion("STOPWORDS_WORD >", value, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordGreaterThanOrEqualTo(String value) {
            addCriterion("STOPWORDS_WORD >=", value, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordLessThan(String value) {
            addCriterion("STOPWORDS_WORD <", value, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordLessThanOrEqualTo(String value) {
            addCriterion("STOPWORDS_WORD <=", value, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordLike(String value) {
            addCriterion("STOPWORDS_WORD like", value, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordNotLike(String value) {
            addCriterion("STOPWORDS_WORD not like", value, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordIn(List<String> values) {
            addCriterion("STOPWORDS_WORD in", values, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordNotIn(List<String> values) {
            addCriterion("STOPWORDS_WORD not in", values, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordBetween(String value1, String value2) {
            addCriterion("STOPWORDS_WORD between", value1, value2, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsWordNotBetween(String value1, String value2) {
            addCriterion("STOPWORDS_WORD not between", value1, value2, "stopwordsWord");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagIsNull() {
            addCriterion("STOPWORDS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagIsNotNull() {
            addCriterion("STOPWORDS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagEqualTo(String value) {
            addCriterion("STOPWORDS_FLAG =", value, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagNotEqualTo(String value) {
            addCriterion("STOPWORDS_FLAG <>", value, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagGreaterThan(String value) {
            addCriterion("STOPWORDS_FLAG >", value, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagGreaterThanOrEqualTo(String value) {
            addCriterion("STOPWORDS_FLAG >=", value, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagLessThan(String value) {
            addCriterion("STOPWORDS_FLAG <", value, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagLessThanOrEqualTo(String value) {
            addCriterion("STOPWORDS_FLAG <=", value, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagLike(String value) {
            addCriterion("STOPWORDS_FLAG like", value, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagNotLike(String value) {
            addCriterion("STOPWORDS_FLAG not like", value, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagIn(List<String> values) {
            addCriterion("STOPWORDS_FLAG in", values, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagNotIn(List<String> values) {
            addCriterion("STOPWORDS_FLAG not in", values, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagBetween(String value1, String value2) {
            addCriterion("STOPWORDS_FLAG between", value1, value2, "stopwordsFlag");
            return (Criteria) this;
        }

        public Criteria andStopwordsFlagNotBetween(String value1, String value2) {
            addCriterion("STOPWORDS_FLAG not between", value1, value2, "stopwordsFlag");
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