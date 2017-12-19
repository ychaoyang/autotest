package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOperationLogDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOperationLogDOExample() {
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

        public Criteria andOperationPersonIsNull() {
            addCriterion("OPERATION_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andOperationPersonIsNotNull() {
            addCriterion("OPERATION_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andOperationPersonEqualTo(String value) {
            addCriterion("OPERATION_PERSON =", value, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonNotEqualTo(String value) {
            addCriterion("OPERATION_PERSON <>", value, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonGreaterThan(String value) {
            addCriterion("OPERATION_PERSON >", value, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_PERSON >=", value, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonLessThan(String value) {
            addCriterion("OPERATION_PERSON <", value, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_PERSON <=", value, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonLike(String value) {
            addCriterion("OPERATION_PERSON like", value, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonNotLike(String value) {
            addCriterion("OPERATION_PERSON not like", value, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonIn(List<String> values) {
            addCriterion("OPERATION_PERSON in", values, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonNotIn(List<String> values) {
            addCriterion("OPERATION_PERSON not in", values, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonBetween(String value1, String value2) {
            addCriterion("OPERATION_PERSON between", value1, value2, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonNotBetween(String value1, String value2) {
            addCriterion("OPERATION_PERSON not between", value1, value2, "operationPerson");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameIsNull() {
            addCriterion("OPERATION_PERSON_REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameIsNotNull() {
            addCriterion("OPERATION_PERSON_REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameEqualTo(String value) {
            addCriterion("OPERATION_PERSON_REAL_NAME =", value, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameNotEqualTo(String value) {
            addCriterion("OPERATION_PERSON_REAL_NAME <>", value, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameGreaterThan(String value) {
            addCriterion("OPERATION_PERSON_REAL_NAME >", value, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_PERSON_REAL_NAME >=", value, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameLessThan(String value) {
            addCriterion("OPERATION_PERSON_REAL_NAME <", value, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_PERSON_REAL_NAME <=", value, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameLike(String value) {
            addCriterion("OPERATION_PERSON_REAL_NAME like", value, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameNotLike(String value) {
            addCriterion("OPERATION_PERSON_REAL_NAME not like", value, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameIn(List<String> values) {
            addCriterion("OPERATION_PERSON_REAL_NAME in", values, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameNotIn(List<String> values) {
            addCriterion("OPERATION_PERSON_REAL_NAME not in", values, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameBetween(String value1, String value2) {
            addCriterion("OPERATION_PERSON_REAL_NAME between", value1, value2, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationPersonRealNameNotBetween(String value1, String value2) {
            addCriterion("OPERATION_PERSON_REAL_NAME not between", value1, value2, "operationPersonRealName");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNull() {
            addCriterion("OPERATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNotNull() {
            addCriterion("OPERATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeEqualTo(Date value) {
            addCriterion("OPERATION_TIME =", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotEqualTo(Date value) {
            addCriterion("OPERATION_TIME <>", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThan(Date value) {
            addCriterion("OPERATION_TIME >", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATION_TIME >=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThan(Date value) {
            addCriterion("OPERATION_TIME <", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATION_TIME <=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIn(List<Date> values) {
            addCriterion("OPERATION_TIME in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotIn(List<Date> values) {
            addCriterion("OPERATION_TIME not in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATION_TIME between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATION_TIME not between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationIpIsNull() {
            addCriterion("OPERATION_IP is null");
            return (Criteria) this;
        }

        public Criteria andOperationIpIsNotNull() {
            addCriterion("OPERATION_IP is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIpEqualTo(String value) {
            addCriterion("OPERATION_IP =", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotEqualTo(String value) {
            addCriterion("OPERATION_IP <>", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpGreaterThan(String value) {
            addCriterion("OPERATION_IP >", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_IP >=", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLessThan(String value) {
            addCriterion("OPERATION_IP <", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_IP <=", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLike(String value) {
            addCriterion("OPERATION_IP like", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotLike(String value) {
            addCriterion("OPERATION_IP not like", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpIn(List<String> values) {
            addCriterion("OPERATION_IP in", values, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotIn(List<String> values) {
            addCriterion("OPERATION_IP not in", values, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpBetween(String value1, String value2) {
            addCriterion("OPERATION_IP between", value1, value2, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotBetween(String value1, String value2) {
            addCriterion("OPERATION_IP not between", value1, value2, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationDisIsNull() {
            addCriterion("OPERATION_DIS is null");
            return (Criteria) this;
        }

        public Criteria andOperationDisIsNotNull() {
            addCriterion("OPERATION_DIS is not null");
            return (Criteria) this;
        }

        public Criteria andOperationDisEqualTo(String value) {
            addCriterion("OPERATION_DIS =", value, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisNotEqualTo(String value) {
            addCriterion("OPERATION_DIS <>", value, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisGreaterThan(String value) {
            addCriterion("OPERATION_DIS >", value, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_DIS >=", value, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisLessThan(String value) {
            addCriterion("OPERATION_DIS <", value, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_DIS <=", value, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisLike(String value) {
            addCriterion("OPERATION_DIS like", value, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisNotLike(String value) {
            addCriterion("OPERATION_DIS not like", value, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisIn(List<String> values) {
            addCriterion("OPERATION_DIS in", values, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisNotIn(List<String> values) {
            addCriterion("OPERATION_DIS not in", values, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisBetween(String value1, String value2) {
            addCriterion("OPERATION_DIS between", value1, value2, "operationDis");
            return (Criteria) this;
        }

        public Criteria andOperationDisNotBetween(String value1, String value2) {
            addCriterion("OPERATION_DIS not between", value1, value2, "operationDis");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("LOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("LOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("LOG_TYPE =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("LOG_TYPE <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("LOG_TYPE >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("LOG_TYPE <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("LOG_TYPE like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("LOG_TYPE not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("LOG_TYPE in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("LOG_TYPE not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("LOG_TYPE between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("LOG_TYPE not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andReqUrlIsNull() {
            addCriterion("REQ_URL is null");
            return (Criteria) this;
        }

        public Criteria andReqUrlIsNotNull() {
            addCriterion("REQ_URL is not null");
            return (Criteria) this;
        }

        public Criteria andReqUrlEqualTo(String value) {
            addCriterion("REQ_URL =", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlNotEqualTo(String value) {
            addCriterion("REQ_URL <>", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlGreaterThan(String value) {
            addCriterion("REQ_URL >", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_URL >=", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlLessThan(String value) {
            addCriterion("REQ_URL <", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlLessThanOrEqualTo(String value) {
            addCriterion("REQ_URL <=", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlLike(String value) {
            addCriterion("REQ_URL like", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlNotLike(String value) {
            addCriterion("REQ_URL not like", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlIn(List<String> values) {
            addCriterion("REQ_URL in", values, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlNotIn(List<String> values) {
            addCriterion("REQ_URL not in", values, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlBetween(String value1, String value2) {
            addCriterion("REQ_URL between", value1, value2, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlNotBetween(String value1, String value2) {
            addCriterion("REQ_URL not between", value1, value2, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqParamsIsNull() {
            addCriterion("REQ_PARAMS is null");
            return (Criteria) this;
        }

        public Criteria andReqParamsIsNotNull() {
            addCriterion("REQ_PARAMS is not null");
            return (Criteria) this;
        }

        public Criteria andReqParamsEqualTo(String value) {
            addCriterion("REQ_PARAMS =", value, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsNotEqualTo(String value) {
            addCriterion("REQ_PARAMS <>", value, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsGreaterThan(String value) {
            addCriterion("REQ_PARAMS >", value, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_PARAMS >=", value, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsLessThan(String value) {
            addCriterion("REQ_PARAMS <", value, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsLessThanOrEqualTo(String value) {
            addCriterion("REQ_PARAMS <=", value, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsLike(String value) {
            addCriterion("REQ_PARAMS like", value, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsNotLike(String value) {
            addCriterion("REQ_PARAMS not like", value, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsIn(List<String> values) {
            addCriterion("REQ_PARAMS in", values, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsNotIn(List<String> values) {
            addCriterion("REQ_PARAMS not in", values, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsBetween(String value1, String value2) {
            addCriterion("REQ_PARAMS between", value1, value2, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqParamsNotBetween(String value1, String value2) {
            addCriterion("REQ_PARAMS not between", value1, value2, "reqParams");
            return (Criteria) this;
        }

        public Criteria andReqMethodIsNull() {
            addCriterion("REQ_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andReqMethodIsNotNull() {
            addCriterion("REQ_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andReqMethodEqualTo(String value) {
            addCriterion("REQ_METHOD =", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotEqualTo(String value) {
            addCriterion("REQ_METHOD <>", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodGreaterThan(String value) {
            addCriterion("REQ_METHOD >", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_METHOD >=", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodLessThan(String value) {
            addCriterion("REQ_METHOD <", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodLessThanOrEqualTo(String value) {
            addCriterion("REQ_METHOD <=", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodLike(String value) {
            addCriterion("REQ_METHOD like", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotLike(String value) {
            addCriterion("REQ_METHOD not like", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodIn(List<String> values) {
            addCriterion("REQ_METHOD in", values, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotIn(List<String> values) {
            addCriterion("REQ_METHOD not in", values, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodBetween(String value1, String value2) {
            addCriterion("REQ_METHOD between", value1, value2, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotBetween(String value1, String value2) {
            addCriterion("REQ_METHOD not between", value1, value2, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqConsumeIsNull() {
            addCriterion("REQ_CONSUME is null");
            return (Criteria) this;
        }

        public Criteria andReqConsumeIsNotNull() {
            addCriterion("REQ_CONSUME is not null");
            return (Criteria) this;
        }

        public Criteria andReqConsumeEqualTo(Long value) {
            addCriterion("REQ_CONSUME =", value, "reqConsume");
            return (Criteria) this;
        }

        public Criteria andReqConsumeNotEqualTo(Long value) {
            addCriterion("REQ_CONSUME <>", value, "reqConsume");
            return (Criteria) this;
        }

        public Criteria andReqConsumeGreaterThan(Long value) {
            addCriterion("REQ_CONSUME >", value, "reqConsume");
            return (Criteria) this;
        }

        public Criteria andReqConsumeGreaterThanOrEqualTo(Long value) {
            addCriterion("REQ_CONSUME >=", value, "reqConsume");
            return (Criteria) this;
        }

        public Criteria andReqConsumeLessThan(Long value) {
            addCriterion("REQ_CONSUME <", value, "reqConsume");
            return (Criteria) this;
        }

        public Criteria andReqConsumeLessThanOrEqualTo(Long value) {
            addCriterion("REQ_CONSUME <=", value, "reqConsume");
            return (Criteria) this;
        }

        public Criteria andReqConsumeIn(List<Long> values) {
            addCriterion("REQ_CONSUME in", values, "reqConsume");
            return (Criteria) this;
        }

        public Criteria andReqConsumeNotIn(List<Long> values) {
            addCriterion("REQ_CONSUME not in", values, "reqConsume");
            return (Criteria) this;
        }

        public Criteria andReqConsumeBetween(Long value1, Long value2) {
            addCriterion("REQ_CONSUME between", value1, value2, "reqConsume");
            return (Criteria) this;
        }

        public Criteria andReqConsumeNotBetween(Long value1, Long value2) {
            addCriterion("REQ_CONSUME not between", value1, value2, "reqConsume");
            return (Criteria) this;
        }

        public Criteria andReqResultIsNull() {
            addCriterion("REQ_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andReqResultIsNotNull() {
            addCriterion("REQ_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andReqResultEqualTo(String value) {
            addCriterion("REQ_RESULT =", value, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultNotEqualTo(String value) {
            addCriterion("REQ_RESULT <>", value, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultGreaterThan(String value) {
            addCriterion("REQ_RESULT >", value, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_RESULT >=", value, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultLessThan(String value) {
            addCriterion("REQ_RESULT <", value, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultLessThanOrEqualTo(String value) {
            addCriterion("REQ_RESULT <=", value, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultLike(String value) {
            addCriterion("REQ_RESULT like", value, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultNotLike(String value) {
            addCriterion("REQ_RESULT not like", value, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultIn(List<String> values) {
            addCriterion("REQ_RESULT in", values, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultNotIn(List<String> values) {
            addCriterion("REQ_RESULT not in", values, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultBetween(String value1, String value2) {
            addCriterion("REQ_RESULT between", value1, value2, "reqResult");
            return (Criteria) this;
        }

        public Criteria andReqResultNotBetween(String value1, String value2) {
            addCriterion("REQ_RESULT not between", value1, value2, "reqResult");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNull() {
            addCriterion("SERVER_IP is null");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNotNull() {
            addCriterion("SERVER_IP is not null");
            return (Criteria) this;
        }

        public Criteria andServerIpEqualTo(String value) {
            addCriterion("SERVER_IP =", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotEqualTo(String value) {
            addCriterion("SERVER_IP <>", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThan(String value) {
            addCriterion("SERVER_IP >", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_IP >=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThan(String value) {
            addCriterion("SERVER_IP <", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThanOrEqualTo(String value) {
            addCriterion("SERVER_IP <=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLike(String value) {
            addCriterion("SERVER_IP like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotLike(String value) {
            addCriterion("SERVER_IP not like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpIn(List<String> values) {
            addCriterion("SERVER_IP in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotIn(List<String> values) {
            addCriterion("SERVER_IP not in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpBetween(String value1, String value2) {
            addCriterion("SERVER_IP between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotBetween(String value1, String value2) {
            addCriterion("SERVER_IP not between", value1, value2, "serverIp");
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