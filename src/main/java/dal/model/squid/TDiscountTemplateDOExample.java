package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDiscountTemplateDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDiscountTemplateDOExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNull() {
            addCriterion("QUOTA is null");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNotNull() {
            addCriterion("QUOTA is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaEqualTo(Long value) {
            addCriterion("QUOTA =", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotEqualTo(Long value) {
            addCriterion("QUOTA <>", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThan(Long value) {
            addCriterion("QUOTA >", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThanOrEqualTo(Long value) {
            addCriterion("QUOTA >=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThan(Long value) {
            addCriterion("QUOTA <", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThanOrEqualTo(Long value) {
            addCriterion("QUOTA <=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaIn(List<Long> values) {
            addCriterion("QUOTA in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotIn(List<Long> values) {
            addCriterion("QUOTA not in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaBetween(Long value1, Long value2) {
            addCriterion("QUOTA between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotBetween(Long value1, Long value2) {
            addCriterion("QUOTA not between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Long value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Long value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Long value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Long value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Long value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Long> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Long> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Long value1, Long value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Long value1, Long value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("DISCOUNT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("DISCOUNT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(Double value) {
            addCriterion("DISCOUNT_RATE =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(Double value) {
            addCriterion("DISCOUNT_RATE <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(Double value) {
            addCriterion("DISCOUNT_RATE >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(Double value) {
            addCriterion("DISCOUNT_RATE >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(Double value) {
            addCriterion("DISCOUNT_RATE <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(Double value) {
            addCriterion("DISCOUNT_RATE <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<Double> values) {
            addCriterion("DISCOUNT_RATE in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<Double> values) {
            addCriterion("DISCOUNT_RATE not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(Double value1, Double value2) {
            addCriterion("DISCOUNT_RATE between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(Double value1, Double value2) {
            addCriterion("DISCOUNT_RATE not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("INDUSTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("INDUSTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(String value) {
            addCriterion("INDUSTRY_ID =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(String value) {
            addCriterion("INDUSTRY_ID <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(String value) {
            addCriterion("INDUSTRY_ID >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_ID >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(String value) {
            addCriterion("INDUSTRY_ID <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_ID <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLike(String value) {
            addCriterion("INDUSTRY_ID like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotLike(String value) {
            addCriterion("INDUSTRY_ID not like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<String> values) {
            addCriterion("INDUSTRY_ID in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<String> values) {
            addCriterion("INDUSTRY_ID not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(String value1, String value2) {
            addCriterion("INDUSTRY_ID between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY_ID not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartIsNull() {
            addCriterion("VALIDITY_PERIOD_START is null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartIsNotNull() {
            addCriterion("VALIDITY_PERIOD_START is not null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD_START =", value, "validityPeriodStart");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartNotEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD_START <>", value, "validityPeriodStart");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartGreaterThan(Date value) {
            addCriterion("VALIDITY_PERIOD_START >", value, "validityPeriodStart");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartGreaterThanOrEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD_START >=", value, "validityPeriodStart");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartLessThan(Date value) {
            addCriterion("VALIDITY_PERIOD_START <", value, "validityPeriodStart");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartLessThanOrEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD_START <=", value, "validityPeriodStart");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartIn(List<Date> values) {
            addCriterion("VALIDITY_PERIOD_START in", values, "validityPeriodStart");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartNotIn(List<Date> values) {
            addCriterion("VALIDITY_PERIOD_START not in", values, "validityPeriodStart");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartBetween(Date value1, Date value2) {
            addCriterion("VALIDITY_PERIOD_START between", value1, value2, "validityPeriodStart");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodStartNotBetween(Date value1, Date value2) {
            addCriterion("VALIDITY_PERIOD_START not between", value1, value2, "validityPeriodStart");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndIsNull() {
            addCriterion("VALIDITY_PERIOD_END is null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndIsNotNull() {
            addCriterion("VALIDITY_PERIOD_END is not null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD_END =", value, "validityPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndNotEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD_END <>", value, "validityPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndGreaterThan(Date value) {
            addCriterion("VALIDITY_PERIOD_END >", value, "validityPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndGreaterThanOrEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD_END >=", value, "validityPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndLessThan(Date value) {
            addCriterion("VALIDITY_PERIOD_END <", value, "validityPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndLessThanOrEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD_END <=", value, "validityPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndIn(List<Date> values) {
            addCriterion("VALIDITY_PERIOD_END in", values, "validityPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndNotIn(List<Date> values) {
            addCriterion("VALIDITY_PERIOD_END not in", values, "validityPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndBetween(Date value1, Date value2) {
            addCriterion("VALIDITY_PERIOD_END between", value1, value2, "validityPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEndNotBetween(Date value1, Date value2) {
            addCriterion("VALIDITY_PERIOD_END not between", value1, value2, "validityPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityIsNull() {
            addCriterion("USED_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityIsNotNull() {
            addCriterion("USED_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityEqualTo(Long value) {
            addCriterion("USED_QUANTITY =", value, "usedQuantity");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityNotEqualTo(Long value) {
            addCriterion("USED_QUANTITY <>", value, "usedQuantity");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityGreaterThan(Long value) {
            addCriterion("USED_QUANTITY >", value, "usedQuantity");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("USED_QUANTITY >=", value, "usedQuantity");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityLessThan(Long value) {
            addCriterion("USED_QUANTITY <", value, "usedQuantity");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityLessThanOrEqualTo(Long value) {
            addCriterion("USED_QUANTITY <=", value, "usedQuantity");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityIn(List<Long> values) {
            addCriterion("USED_QUANTITY in", values, "usedQuantity");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityNotIn(List<Long> values) {
            addCriterion("USED_QUANTITY not in", values, "usedQuantity");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityBetween(Long value1, Long value2) {
            addCriterion("USED_QUANTITY between", value1, value2, "usedQuantity");
            return (Criteria) this;
        }

        public Criteria andUsedQuantityNotBetween(Long value1, Long value2) {
            addCriterion("USED_QUANTITY not between", value1, value2, "usedQuantity");
            return (Criteria) this;
        }

        public Criteria andHavePersonIsNull() {
            addCriterion("HAVE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andHavePersonIsNotNull() {
            addCriterion("HAVE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andHavePersonEqualTo(String value) {
            addCriterion("HAVE_PERSON =", value, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonNotEqualTo(String value) {
            addCriterion("HAVE_PERSON <>", value, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonGreaterThan(String value) {
            addCriterion("HAVE_PERSON >", value, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonGreaterThanOrEqualTo(String value) {
            addCriterion("HAVE_PERSON >=", value, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonLessThan(String value) {
            addCriterion("HAVE_PERSON <", value, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonLessThanOrEqualTo(String value) {
            addCriterion("HAVE_PERSON <=", value, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonLike(String value) {
            addCriterion("HAVE_PERSON like", value, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonNotLike(String value) {
            addCriterion("HAVE_PERSON not like", value, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonIn(List<String> values) {
            addCriterion("HAVE_PERSON in", values, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonNotIn(List<String> values) {
            addCriterion("HAVE_PERSON not in", values, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonBetween(String value1, String value2) {
            addCriterion("HAVE_PERSON between", value1, value2, "havePerson");
            return (Criteria) this;
        }

        public Criteria andHavePersonNotBetween(String value1, String value2) {
            addCriterion("HAVE_PERSON not between", value1, value2, "havePerson");
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