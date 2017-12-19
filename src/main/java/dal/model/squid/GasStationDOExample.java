package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GasStationDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GasStationDOExample() {
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

        public Criteria andEntityIdEqualTo(String value) {
            addCriterion("ENTITY_ID =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(String value) {
            addCriterion("ENTITY_ID <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(String value) {
            addCriterion("ENTITY_ID >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_ID >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(String value) {
            addCriterion("ENTITY_ID <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_ID <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLike(String value) {
            addCriterion("ENTITY_ID like", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotLike(String value) {
            addCriterion("ENTITY_ID not like", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<String> values) {
            addCriterion("ENTITY_ID in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<String> values) {
            addCriterion("ENTITY_ID not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(String value1, String value2) {
            addCriterion("ENTITY_ID between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(String value1, String value2) {
            addCriterion("ENTITY_ID not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNull() {
            addCriterion("STATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("STATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(String value) {
            addCriterion("STATION_ID =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(String value) {
            addCriterion("STATION_ID <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(String value) {
            addCriterion("STATION_ID >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(String value) {
            addCriterion("STATION_ID >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(String value) {
            addCriterion("STATION_ID <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(String value) {
            addCriterion("STATION_ID <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLike(String value) {
            addCriterion("STATION_ID like", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotLike(String value) {
            addCriterion("STATION_ID not like", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<String> values) {
            addCriterion("STATION_ID in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<String> values) {
            addCriterion("STATION_ID not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(String value1, String value2) {
            addCriterion("STATION_ID between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(String value1, String value2) {
            addCriterion("STATION_ID not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("SUPPLIER_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("SUPPLIER_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("SUPPLIER_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUPPLIER_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("SUPPLIER_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUPPLIER_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("SUPPLIER_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("SUPPLIER_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("SUPPLIER_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUPPLIER_ID not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNull() {
            addCriterion("STATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("STATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("STATION_NAME =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("STATION_NAME <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("STATION_NAME >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("STATION_NAME >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("STATION_NAME <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("STATION_NAME <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("STATION_NAME like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("STATION_NAME not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("STATION_NAME in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("STATION_NAME not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("STATION_NAME between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("STATION_NAME not between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNoIsNull() {
            addCriterion("STATION_NO is null");
            return (Criteria) this;
        }

        public Criteria andStationNoIsNotNull() {
            addCriterion("STATION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStationNoEqualTo(String value) {
            addCriterion("STATION_NO =", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotEqualTo(String value) {
            addCriterion("STATION_NO <>", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThan(String value) {
            addCriterion("STATION_NO >", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThanOrEqualTo(String value) {
            addCriterion("STATION_NO >=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThan(String value) {
            addCriterion("STATION_NO <", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThanOrEqualTo(String value) {
            addCriterion("STATION_NO <=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLike(String value) {
            addCriterion("STATION_NO like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotLike(String value) {
            addCriterion("STATION_NO not like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoIn(List<String> values) {
            addCriterion("STATION_NO in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotIn(List<String> values) {
            addCriterion("STATION_NO not in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoBetween(String value1, String value2) {
            addCriterion("STATION_NO between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotBetween(String value1, String value2) {
            addCriterion("STATION_NO not between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationStateIsNull() {
            addCriterion("STATION_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStationStateIsNotNull() {
            addCriterion("STATION_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStationStateEqualTo(String value) {
            addCriterion("STATION_STATE =", value, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateNotEqualTo(String value) {
            addCriterion("STATION_STATE <>", value, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateGreaterThan(String value) {
            addCriterion("STATION_STATE >", value, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATION_STATE >=", value, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateLessThan(String value) {
            addCriterion("STATION_STATE <", value, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateLessThanOrEqualTo(String value) {
            addCriterion("STATION_STATE <=", value, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateLike(String value) {
            addCriterion("STATION_STATE like", value, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateNotLike(String value) {
            addCriterion("STATION_STATE not like", value, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateIn(List<String> values) {
            addCriterion("STATION_STATE in", values, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateNotIn(List<String> values) {
            addCriterion("STATION_STATE not in", values, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateBetween(String value1, String value2) {
            addCriterion("STATION_STATE between", value1, value2, "stationState");
            return (Criteria) this;
        }

        public Criteria andStationStateNotBetween(String value1, String value2) {
            addCriterion("STATION_STATE not between", value1, value2, "stationState");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andStationAddrIsNull() {
            addCriterion("STATION_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andStationAddrIsNotNull() {
            addCriterion("STATION_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andStationAddrEqualTo(String value) {
            addCriterion("STATION_ADDR =", value, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrNotEqualTo(String value) {
            addCriterion("STATION_ADDR <>", value, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrGreaterThan(String value) {
            addCriterion("STATION_ADDR >", value, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrGreaterThanOrEqualTo(String value) {
            addCriterion("STATION_ADDR >=", value, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrLessThan(String value) {
            addCriterion("STATION_ADDR <", value, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrLessThanOrEqualTo(String value) {
            addCriterion("STATION_ADDR <=", value, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrLike(String value) {
            addCriterion("STATION_ADDR like", value, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrNotLike(String value) {
            addCriterion("STATION_ADDR not like", value, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrIn(List<String> values) {
            addCriterion("STATION_ADDR in", values, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrNotIn(List<String> values) {
            addCriterion("STATION_ADDR not in", values, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrBetween(String value1, String value2) {
            addCriterion("STATION_ADDR between", value1, value2, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andStationAddrNotBetween(String value1, String value2) {
            addCriterion("STATION_ADDR not between", value1, value2, "stationAddr");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("CONTACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("CONTACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("CONTACT_NAME =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("CONTACT_NAME <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("CONTACT_NAME >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_NAME >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("CONTACT_NAME <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_NAME <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("CONTACT_NAME like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("CONTACT_NAME not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("CONTACT_NAME in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("CONTACT_NAME not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("CONTACT_NAME between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("CONTACT_NAME not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNull() {
            addCriterion("PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(String value) {
            addCriterion("PHONE_NO =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(String value) {
            addCriterion("PHONE_NO <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(String value) {
            addCriterion("PHONE_NO >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NO >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(String value) {
            addCriterion("PHONE_NO <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NO <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLike(String value) {
            addCriterion("PHONE_NO like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotLike(String value) {
            addCriterion("PHONE_NO not like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<String> values) {
            addCriterion("PHONE_NO in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<String> values) {
            addCriterion("PHONE_NO not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(String value1, String value2) {
            addCriterion("PHONE_NO between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(String value1, String value2) {
            addCriterion("PHONE_NO not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andHasStoreIsNull() {
            addCriterion("HAS_STORE is null");
            return (Criteria) this;
        }

        public Criteria andHasStoreIsNotNull() {
            addCriterion("HAS_STORE is not null");
            return (Criteria) this;
        }

        public Criteria andHasStoreEqualTo(String value) {
            addCriterion("HAS_STORE =", value, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreNotEqualTo(String value) {
            addCriterion("HAS_STORE <>", value, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreGreaterThan(String value) {
            addCriterion("HAS_STORE >", value, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_STORE >=", value, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreLessThan(String value) {
            addCriterion("HAS_STORE <", value, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreLessThanOrEqualTo(String value) {
            addCriterion("HAS_STORE <=", value, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreLike(String value) {
            addCriterion("HAS_STORE like", value, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreNotLike(String value) {
            addCriterion("HAS_STORE not like", value, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreIn(List<String> values) {
            addCriterion("HAS_STORE in", values, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreNotIn(List<String> values) {
            addCriterion("HAS_STORE not in", values, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreBetween(String value1, String value2) {
            addCriterion("HAS_STORE between", value1, value2, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasStoreNotBetween(String value1, String value2) {
            addCriterion("HAS_STORE not between", value1, value2, "hasStore");
            return (Criteria) this;
        }

        public Criteria andHasToiletIsNull() {
            addCriterion("HAS_TOILET is null");
            return (Criteria) this;
        }

        public Criteria andHasToiletIsNotNull() {
            addCriterion("HAS_TOILET is not null");
            return (Criteria) this;
        }

        public Criteria andHasToiletEqualTo(String value) {
            addCriterion("HAS_TOILET =", value, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletNotEqualTo(String value) {
            addCriterion("HAS_TOILET <>", value, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletGreaterThan(String value) {
            addCriterion("HAS_TOILET >", value, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_TOILET >=", value, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletLessThan(String value) {
            addCriterion("HAS_TOILET <", value, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletLessThanOrEqualTo(String value) {
            addCriterion("HAS_TOILET <=", value, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletLike(String value) {
            addCriterion("HAS_TOILET like", value, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletNotLike(String value) {
            addCriterion("HAS_TOILET not like", value, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletIn(List<String> values) {
            addCriterion("HAS_TOILET in", values, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletNotIn(List<String> values) {
            addCriterion("HAS_TOILET not in", values, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletBetween(String value1, String value2) {
            addCriterion("HAS_TOILET between", value1, value2, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andHasToiletNotBetween(String value1, String value2) {
            addCriterion("HAS_TOILET not between", value1, value2, "hasToilet");
            return (Criteria) this;
        }

        public Criteria andCopyIsNull() {
            addCriterion("COPY is null");
            return (Criteria) this;
        }

        public Criteria andCopyIsNotNull() {
            addCriterion("COPY is not null");
            return (Criteria) this;
        }

        public Criteria andCopyEqualTo(String value) {
            addCriterion("COPY =", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyNotEqualTo(String value) {
            addCriterion("COPY <>", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyGreaterThan(String value) {
            addCriterion("COPY >", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyGreaterThanOrEqualTo(String value) {
            addCriterion("COPY >=", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyLessThan(String value) {
            addCriterion("COPY <", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyLessThanOrEqualTo(String value) {
            addCriterion("COPY <=", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyLike(String value) {
            addCriterion("COPY like", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyNotLike(String value) {
            addCriterion("COPY not like", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyIn(List<String> values) {
            addCriterion("COPY in", values, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyNotIn(List<String> values) {
            addCriterion("COPY not in", values, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyBetween(String value1, String value2) {
            addCriterion("COPY between", value1, value2, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyNotBetween(String value1, String value2) {
            addCriterion("COPY not between", value1, value2, "copy");
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