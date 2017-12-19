package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MProvinceDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MProvinceDOExample() {
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

        public Criteria andProvinceNameIsNull() {
            addCriterion("PROVINCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("PROVINCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("PROVINCE_NAME =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("PROVINCE_NAME <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("PROVINCE_NAME >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_NAME >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("PROVINCE_NAME <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_NAME <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("PROVINCE_NAME like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("PROVINCE_NAME not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("PROVINCE_NAME in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("PROVINCE_NAME not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("PROVINCE_NAME between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_NAME not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortIsNull() {
            addCriterion("PROVINCE_SHORT is null");
            return (Criteria) this;
        }

        public Criteria andProvinceShortIsNotNull() {
            addCriterion("PROVINCE_SHORT is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceShortEqualTo(String value) {
            addCriterion("PROVINCE_SHORT =", value, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNotEqualTo(String value) {
            addCriterion("PROVINCE_SHORT <>", value, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortGreaterThan(String value) {
            addCriterion("PROVINCE_SHORT >", value, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_SHORT >=", value, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortLessThan(String value) {
            addCriterion("PROVINCE_SHORT <", value, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_SHORT <=", value, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortLike(String value) {
            addCriterion("PROVINCE_SHORT like", value, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNotLike(String value) {
            addCriterion("PROVINCE_SHORT not like", value, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortIn(List<String> values) {
            addCriterion("PROVINCE_SHORT in", values, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNotIn(List<String> values) {
            addCriterion("PROVINCE_SHORT not in", values, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortBetween(String value1, String value2) {
            addCriterion("PROVINCE_SHORT between", value1, value2, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_SHORT not between", value1, value2, "provinceShort");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinIsNull() {
            addCriterion("PROVINCE_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinIsNotNull() {
            addCriterion("PROVINCE_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinEqualTo(String value) {
            addCriterion("PROVINCE_PINYIN =", value, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinNotEqualTo(String value) {
            addCriterion("PROVINCE_PINYIN <>", value, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinGreaterThan(String value) {
            addCriterion("PROVINCE_PINYIN >", value, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_PINYIN >=", value, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinLessThan(String value) {
            addCriterion("PROVINCE_PINYIN <", value, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_PINYIN <=", value, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinLike(String value) {
            addCriterion("PROVINCE_PINYIN like", value, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinNotLike(String value) {
            addCriterion("PROVINCE_PINYIN not like", value, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinIn(List<String> values) {
            addCriterion("PROVINCE_PINYIN in", values, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinNotIn(List<String> values) {
            addCriterion("PROVINCE_PINYIN not in", values, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinBetween(String value1, String value2) {
            addCriterion("PROVINCE_PINYIN between", value1, value2, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvincePinyinNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_PINYIN not between", value1, value2, "provincePinyin");
            return (Criteria) this;
        }

        public Criteria andProvinceCharIsNull() {
            addCriterion("PROVINCE_CHAR is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCharIsNotNull() {
            addCriterion("PROVINCE_CHAR is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCharEqualTo(String value) {
            addCriterion("PROVINCE_CHAR =", value, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharNotEqualTo(String value) {
            addCriterion("PROVINCE_CHAR <>", value, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharGreaterThan(String value) {
            addCriterion("PROVINCE_CHAR >", value, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CHAR >=", value, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharLessThan(String value) {
            addCriterion("PROVINCE_CHAR <", value, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CHAR <=", value, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharLike(String value) {
            addCriterion("PROVINCE_CHAR like", value, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharNotLike(String value) {
            addCriterion("PROVINCE_CHAR not like", value, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharIn(List<String> values) {
            addCriterion("PROVINCE_CHAR in", values, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharNotIn(List<String> values) {
            addCriterion("PROVINCE_CHAR not in", values, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharBetween(String value1, String value2) {
            addCriterion("PROVINCE_CHAR between", value1, value2, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andProvinceCharNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CHAR not between", value1, value2, "provinceChar");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("COUNTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("COUNTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Long value) {
            addCriterion("COUNTRY_ID =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Long value) {
            addCriterion("COUNTRY_ID <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Long value) {
            addCriterion("COUNTRY_ID >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNTRY_ID >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Long value) {
            addCriterion("COUNTRY_ID <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("COUNTRY_ID <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Long> values) {
            addCriterion("COUNTRY_ID in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Long> values) {
            addCriterion("COUNTRY_ID not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Long value1, Long value2) {
            addCriterion("COUNTRY_ID between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("COUNTRY_ID not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagIsNull() {
            addCriterion("PROVINCE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagIsNotNull() {
            addCriterion("PROVINCE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagEqualTo(String value) {
            addCriterion("PROVINCE_FLAG =", value, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagNotEqualTo(String value) {
            addCriterion("PROVINCE_FLAG <>", value, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagGreaterThan(String value) {
            addCriterion("PROVINCE_FLAG >", value, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_FLAG >=", value, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagLessThan(String value) {
            addCriterion("PROVINCE_FLAG <", value, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_FLAG <=", value, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagLike(String value) {
            addCriterion("PROVINCE_FLAG like", value, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagNotLike(String value) {
            addCriterion("PROVINCE_FLAG not like", value, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagIn(List<String> values) {
            addCriterion("PROVINCE_FLAG in", values, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagNotIn(List<String> values) {
            addCriterion("PROVINCE_FLAG not in", values, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagBetween(String value1, String value2) {
            addCriterion("PROVINCE_FLAG between", value1, value2, "provinceFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceFlagNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_FLAG not between", value1, value2, "provinceFlag");
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