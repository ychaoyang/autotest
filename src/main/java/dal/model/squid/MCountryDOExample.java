package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MCountryDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MCountryDOExample() {
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

        public Criteria andCountryNameIsNull() {
            addCriterion("COUNTRY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("COUNTRY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("COUNTRY_NAME =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("COUNTRY_NAME <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("COUNTRY_NAME >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_NAME >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("COUNTRY_NAME <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_NAME <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("COUNTRY_NAME like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("COUNTRY_NAME not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("COUNTRY_NAME in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("COUNTRY_NAME not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("COUNTRY_NAME between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_NAME not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andNationalFlagIsNull() {
            addCriterion("NATIONAL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andNationalFlagIsNotNull() {
            addCriterion("NATIONAL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNationalFlagEqualTo(String value) {
            addCriterion("NATIONAL_FLAG =", value, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagNotEqualTo(String value) {
            addCriterion("NATIONAL_FLAG <>", value, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagGreaterThan(String value) {
            addCriterion("NATIONAL_FLAG >", value, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONAL_FLAG >=", value, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagLessThan(String value) {
            addCriterion("NATIONAL_FLAG <", value, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagLessThanOrEqualTo(String value) {
            addCriterion("NATIONAL_FLAG <=", value, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagLike(String value) {
            addCriterion("NATIONAL_FLAG like", value, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagNotLike(String value) {
            addCriterion("NATIONAL_FLAG not like", value, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagIn(List<String> values) {
            addCriterion("NATIONAL_FLAG in", values, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagNotIn(List<String> values) {
            addCriterion("NATIONAL_FLAG not in", values, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagBetween(String value1, String value2) {
            addCriterion("NATIONAL_FLAG between", value1, value2, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andNationalFlagNotBetween(String value1, String value2) {
            addCriterion("NATIONAL_FLAG not between", value1, value2, "nationalFlag");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinIsNull() {
            addCriterion("COUNTRY_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinIsNotNull() {
            addCriterion("COUNTRY_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinEqualTo(String value) {
            addCriterion("COUNTRY_PINYIN =", value, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinNotEqualTo(String value) {
            addCriterion("COUNTRY_PINYIN <>", value, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinGreaterThan(String value) {
            addCriterion("COUNTRY_PINYIN >", value, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_PINYIN >=", value, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinLessThan(String value) {
            addCriterion("COUNTRY_PINYIN <", value, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_PINYIN <=", value, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinLike(String value) {
            addCriterion("COUNTRY_PINYIN like", value, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinNotLike(String value) {
            addCriterion("COUNTRY_PINYIN not like", value, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinIn(List<String> values) {
            addCriterion("COUNTRY_PINYIN in", values, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinNotIn(List<String> values) {
            addCriterion("COUNTRY_PINYIN not in", values, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinBetween(String value1, String value2) {
            addCriterion("COUNTRY_PINYIN between", value1, value2, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryPinyinNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_PINYIN not between", value1, value2, "countryPinyin");
            return (Criteria) this;
        }

        public Criteria andCountryCharIsNull() {
            addCriterion("COUNTRY_CHAR is null");
            return (Criteria) this;
        }

        public Criteria andCountryCharIsNotNull() {
            addCriterion("COUNTRY_CHAR is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCharEqualTo(String value) {
            addCriterion("COUNTRY_CHAR =", value, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharNotEqualTo(String value) {
            addCriterion("COUNTRY_CHAR <>", value, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharGreaterThan(String value) {
            addCriterion("COUNTRY_CHAR >", value, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_CHAR >=", value, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharLessThan(String value) {
            addCriterion("COUNTRY_CHAR <", value, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_CHAR <=", value, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharLike(String value) {
            addCriterion("COUNTRY_CHAR like", value, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharNotLike(String value) {
            addCriterion("COUNTRY_CHAR not like", value, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharIn(List<String> values) {
            addCriterion("COUNTRY_CHAR in", values, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharNotIn(List<String> values) {
            addCriterion("COUNTRY_CHAR not in", values, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharBetween(String value1, String value2) {
            addCriterion("COUNTRY_CHAR between", value1, value2, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCharNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_CHAR not between", value1, value2, "countryChar");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("COUNTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("COUNTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(Integer value) {
            addCriterion("COUNTRY_CODE =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(Integer value) {
            addCriterion("COUNTRY_CODE <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(Integer value) {
            addCriterion("COUNTRY_CODE >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNTRY_CODE >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(Integer value) {
            addCriterion("COUNTRY_CODE <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(Integer value) {
            addCriterion("COUNTRY_CODE <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<Integer> values) {
            addCriterion("COUNTRY_CODE in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<Integer> values) {
            addCriterion("COUNTRY_CODE not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(Integer value1, Integer value2) {
            addCriterion("COUNTRY_CODE between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNTRY_CODE not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryFlagIsNull() {
            addCriterion("COUNTRY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCountryFlagIsNotNull() {
            addCriterion("COUNTRY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCountryFlagEqualTo(String value) {
            addCriterion("COUNTRY_FLAG =", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagNotEqualTo(String value) {
            addCriterion("COUNTRY_FLAG <>", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagGreaterThan(String value) {
            addCriterion("COUNTRY_FLAG >", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_FLAG >=", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagLessThan(String value) {
            addCriterion("COUNTRY_FLAG <", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_FLAG <=", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagLike(String value) {
            addCriterion("COUNTRY_FLAG like", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagNotLike(String value) {
            addCriterion("COUNTRY_FLAG not like", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagIn(List<String> values) {
            addCriterion("COUNTRY_FLAG in", values, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagNotIn(List<String> values) {
            addCriterion("COUNTRY_FLAG not in", values, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagBetween(String value1, String value2) {
            addCriterion("COUNTRY_FLAG between", value1, value2, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_FLAG not between", value1, value2, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryEnameIsNull() {
            addCriterion("COUNTRY_ENAME is null");
            return (Criteria) this;
        }

        public Criteria andCountryEnameIsNotNull() {
            addCriterion("COUNTRY_ENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEnameEqualTo(String value) {
            addCriterion("COUNTRY_ENAME =", value, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameNotEqualTo(String value) {
            addCriterion("COUNTRY_ENAME <>", value, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameGreaterThan(String value) {
            addCriterion("COUNTRY_ENAME >", value, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_ENAME >=", value, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameLessThan(String value) {
            addCriterion("COUNTRY_ENAME <", value, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_ENAME <=", value, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameLike(String value) {
            addCriterion("COUNTRY_ENAME like", value, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameNotLike(String value) {
            addCriterion("COUNTRY_ENAME not like", value, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameIn(List<String> values) {
            addCriterion("COUNTRY_ENAME in", values, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameNotIn(List<String> values) {
            addCriterion("COUNTRY_ENAME not in", values, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameBetween(String value1, String value2) {
            addCriterion("COUNTRY_ENAME between", value1, value2, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryEnameNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_ENAME not between", value1, value2, "countryEname");
            return (Criteria) this;
        }

        public Criteria andCountryShortIsNull() {
            addCriterion("COUNTRY_SHORT is null");
            return (Criteria) this;
        }

        public Criteria andCountryShortIsNotNull() {
            addCriterion("COUNTRY_SHORT is not null");
            return (Criteria) this;
        }

        public Criteria andCountryShortEqualTo(String value) {
            addCriterion("COUNTRY_SHORT =", value, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortNotEqualTo(String value) {
            addCriterion("COUNTRY_SHORT <>", value, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortGreaterThan(String value) {
            addCriterion("COUNTRY_SHORT >", value, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_SHORT >=", value, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortLessThan(String value) {
            addCriterion("COUNTRY_SHORT <", value, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_SHORT <=", value, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortLike(String value) {
            addCriterion("COUNTRY_SHORT like", value, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortNotLike(String value) {
            addCriterion("COUNTRY_SHORT not like", value, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortIn(List<String> values) {
            addCriterion("COUNTRY_SHORT in", values, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortNotIn(List<String> values) {
            addCriterion("COUNTRY_SHORT not in", values, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortBetween(String value1, String value2) {
            addCriterion("COUNTRY_SHORT between", value1, value2, "countryShort");
            return (Criteria) this;
        }

        public Criteria andCountryShortNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_SHORT not between", value1, value2, "countryShort");
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