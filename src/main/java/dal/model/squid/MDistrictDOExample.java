package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MDistrictDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MDistrictDOExample() {
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

        public Criteria andDistrictNameIsNull() {
            addCriterion("DISTRICT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNotNull() {
            addCriterion("DISTRICT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameEqualTo(String value) {
            addCriterion("DISTRICT_NAME =", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotEqualTo(String value) {
            addCriterion("DISTRICT_NAME <>", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThan(String value) {
            addCriterion("DISTRICT_NAME >", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT_NAME >=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThan(String value) {
            addCriterion("DISTRICT_NAME <", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT_NAME <=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLike(String value) {
            addCriterion("DISTRICT_NAME like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotLike(String value) {
            addCriterion("DISTRICT_NAME not like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIn(List<String> values) {
            addCriterion("DISTRICT_NAME in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotIn(List<String> values) {
            addCriterion("DISTRICT_NAME not in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameBetween(String value1, String value2) {
            addCriterion("DISTRICT_NAME between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotBetween(String value1, String value2) {
            addCriterion("DISTRICT_NAME not between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinIsNull() {
            addCriterion("DISTRICT_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinIsNotNull() {
            addCriterion("DISTRICT_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinEqualTo(String value) {
            addCriterion("DISTRICT_PINYIN =", value, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinNotEqualTo(String value) {
            addCriterion("DISTRICT_PINYIN <>", value, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinGreaterThan(String value) {
            addCriterion("DISTRICT_PINYIN >", value, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT_PINYIN >=", value, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinLessThan(String value) {
            addCriterion("DISTRICT_PINYIN <", value, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT_PINYIN <=", value, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinLike(String value) {
            addCriterion("DISTRICT_PINYIN like", value, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinNotLike(String value) {
            addCriterion("DISTRICT_PINYIN not like", value, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinIn(List<String> values) {
            addCriterion("DISTRICT_PINYIN in", values, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinNotIn(List<String> values) {
            addCriterion("DISTRICT_PINYIN not in", values, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinBetween(String value1, String value2) {
            addCriterion("DISTRICT_PINYIN between", value1, value2, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictPinyinNotBetween(String value1, String value2) {
            addCriterion("DISTRICT_PINYIN not between", value1, value2, "districtPinyin");
            return (Criteria) this;
        }

        public Criteria andDistrictCharIsNull() {
            addCriterion("DISTRICT_CHAR is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCharIsNotNull() {
            addCriterion("DISTRICT_CHAR is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCharEqualTo(String value) {
            addCriterion("DISTRICT_CHAR =", value, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharNotEqualTo(String value) {
            addCriterion("DISTRICT_CHAR <>", value, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharGreaterThan(String value) {
            addCriterion("DISTRICT_CHAR >", value, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT_CHAR >=", value, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharLessThan(String value) {
            addCriterion("DISTRICT_CHAR <", value, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT_CHAR <=", value, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharLike(String value) {
            addCriterion("DISTRICT_CHAR like", value, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharNotLike(String value) {
            addCriterion("DISTRICT_CHAR not like", value, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharIn(List<String> values) {
            addCriterion("DISTRICT_CHAR in", values, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharNotIn(List<String> values) {
            addCriterion("DISTRICT_CHAR not in", values, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharBetween(String value1, String value2) {
            addCriterion("DISTRICT_CHAR between", value1, value2, "districtChar");
            return (Criteria) this;
        }

        public Criteria andDistrictCharNotBetween(String value1, String value2) {
            addCriterion("DISTRICT_CHAR not between", value1, value2, "districtChar");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("CITY_ID =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("CITY_ID <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("CITY_ID >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CITY_ID >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("CITY_ID <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("CITY_ID <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("CITY_ID in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("CITY_ID not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("CITY_ID between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("CITY_ID not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagIsNull() {
            addCriterion("DISTRICT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagIsNotNull() {
            addCriterion("DISTRICT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagEqualTo(String value) {
            addCriterion("DISTRICT_FLAG =", value, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagNotEqualTo(String value) {
            addCriterion("DISTRICT_FLAG <>", value, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagGreaterThan(String value) {
            addCriterion("DISTRICT_FLAG >", value, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT_FLAG >=", value, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagLessThan(String value) {
            addCriterion("DISTRICT_FLAG <", value, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT_FLAG <=", value, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagLike(String value) {
            addCriterion("DISTRICT_FLAG like", value, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagNotLike(String value) {
            addCriterion("DISTRICT_FLAG not like", value, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagIn(List<String> values) {
            addCriterion("DISTRICT_FLAG in", values, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagNotIn(List<String> values) {
            addCriterion("DISTRICT_FLAG not in", values, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagBetween(String value1, String value2) {
            addCriterion("DISTRICT_FLAG between", value1, value2, "districtFlag");
            return (Criteria) this;
        }

        public Criteria andDistrictFlagNotBetween(String value1, String value2) {
            addCriterion("DISTRICT_FLAG not between", value1, value2, "districtFlag");
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

        public Criteria andDistrictTypeIsNull() {
            addCriterion("DISTRICT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeIsNotNull() {
            addCriterion("DISTRICT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeEqualTo(String value) {
            addCriterion("DISTRICT_TYPE =", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeNotEqualTo(String value) {
            addCriterion("DISTRICT_TYPE <>", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeGreaterThan(String value) {
            addCriterion("DISTRICT_TYPE >", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT_TYPE >=", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeLessThan(String value) {
            addCriterion("DISTRICT_TYPE <", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT_TYPE <=", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeLike(String value) {
            addCriterion("DISTRICT_TYPE like", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeNotLike(String value) {
            addCriterion("DISTRICT_TYPE not like", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeIn(List<String> values) {
            addCriterion("DISTRICT_TYPE in", values, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeNotIn(List<String> values) {
            addCriterion("DISTRICT_TYPE not in", values, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeBetween(String value1, String value2) {
            addCriterion("DISTRICT_TYPE between", value1, value2, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeNotBetween(String value1, String value2) {
            addCriterion("DISTRICT_TYPE not between", value1, value2, "districtType");
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