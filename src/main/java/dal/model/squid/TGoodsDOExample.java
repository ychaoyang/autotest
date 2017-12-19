package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TGoodsDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGoodsDOExample() {
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

        public Criteria andGoodsCodeIsNull() {
            addCriterion("GOODS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("GOODS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("GOODS_CODE =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("GOODS_CODE <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("GOODS_CODE >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_CODE >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("GOODS_CODE <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_CODE <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("GOODS_CODE like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("GOODS_CODE not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("GOODS_CODE in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("GOODS_CODE not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("GOODS_CODE between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("GOODS_CODE not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("PICTURE =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("PICTURE <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("PICTURE >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("PICTURE >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("PICTURE <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("PICTURE <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("PICTURE like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("PICTURE not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("PICTURE in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("PICTURE not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("PICTURE between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("PICTURE not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("SALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("SALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(Long value) {
            addCriterion("SALE_PRICE =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(Long value) {
            addCriterion("SALE_PRICE <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(Long value) {
            addCriterion("SALE_PRICE >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_PRICE >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(Long value) {
            addCriterion("SALE_PRICE <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(Long value) {
            addCriterion("SALE_PRICE <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<Long> values) {
            addCriterion("SALE_PRICE in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<Long> values) {
            addCriterion("SALE_PRICE not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(Long value1, Long value2) {
            addCriterion("SALE_PRICE between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(Long value1, Long value2) {
            addCriterion("SALE_PRICE not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andActualValueIsNull() {
            addCriterion("ACTUAL_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andActualValueIsNotNull() {
            addCriterion("ACTUAL_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andActualValueEqualTo(Long value) {
            addCriterion("ACTUAL_VALUE =", value, "actualValue");
            return (Criteria) this;
        }

        public Criteria andActualValueNotEqualTo(Long value) {
            addCriterion("ACTUAL_VALUE <>", value, "actualValue");
            return (Criteria) this;
        }

        public Criteria andActualValueGreaterThan(Long value) {
            addCriterion("ACTUAL_VALUE >", value, "actualValue");
            return (Criteria) this;
        }

        public Criteria andActualValueGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTUAL_VALUE >=", value, "actualValue");
            return (Criteria) this;
        }

        public Criteria andActualValueLessThan(Long value) {
            addCriterion("ACTUAL_VALUE <", value, "actualValue");
            return (Criteria) this;
        }

        public Criteria andActualValueLessThanOrEqualTo(Long value) {
            addCriterion("ACTUAL_VALUE <=", value, "actualValue");
            return (Criteria) this;
        }

        public Criteria andActualValueIn(List<Long> values) {
            addCriterion("ACTUAL_VALUE in", values, "actualValue");
            return (Criteria) this;
        }

        public Criteria andActualValueNotIn(List<Long> values) {
            addCriterion("ACTUAL_VALUE not in", values, "actualValue");
            return (Criteria) this;
        }

        public Criteria andActualValueBetween(Long value1, Long value2) {
            addCriterion("ACTUAL_VALUE between", value1, value2, "actualValue");
            return (Criteria) this;
        }

        public Criteria andActualValueNotBetween(Long value1, Long value2) {
            addCriterion("ACTUAL_VALUE not between", value1, value2, "actualValue");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("STOCK is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Long value) {
            addCriterion("STOCK =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Long value) {
            addCriterion("STOCK <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Long value) {
            addCriterion("STOCK >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Long value) {
            addCriterion("STOCK >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Long value) {
            addCriterion("STOCK <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Long value) {
            addCriterion("STOCK <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Long> values) {
            addCriterion("STOCK in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Long> values) {
            addCriterion("STOCK not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Long value1, Long value2) {
            addCriterion("STOCK between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Long value1, Long value2) {
            addCriterion("STOCK not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNull() {
            addCriterion("SALES_VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNotNull() {
            addCriterion("SALES_VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeEqualTo(Long value) {
            addCriterion("SALES_VOLUME =", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotEqualTo(Long value) {
            addCriterion("SALES_VOLUME <>", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThan(Long value) {
            addCriterion("SALES_VOLUME >", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("SALES_VOLUME >=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThan(Long value) {
            addCriterion("SALES_VOLUME <", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThanOrEqualTo(Long value) {
            addCriterion("SALES_VOLUME <=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIn(List<Long> values) {
            addCriterion("SALES_VOLUME in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotIn(List<Long> values) {
            addCriterion("SALES_VOLUME not in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeBetween(Long value1, Long value2) {
            addCriterion("SALES_VOLUME between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotBetween(Long value1, Long value2) {
            addCriterion("SALES_VOLUME not between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andExternalLinkIsNull() {
            addCriterion("EXTERNAL_LINK is null");
            return (Criteria) this;
        }

        public Criteria andExternalLinkIsNotNull() {
            addCriterion("EXTERNAL_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andExternalLinkEqualTo(String value) {
            addCriterion("EXTERNAL_LINK =", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotEqualTo(String value) {
            addCriterion("EXTERNAL_LINK <>", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkGreaterThan(String value) {
            addCriterion("EXTERNAL_LINK >", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkGreaterThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_LINK >=", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkLessThan(String value) {
            addCriterion("EXTERNAL_LINK <", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkLessThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_LINK <=", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkLike(String value) {
            addCriterion("EXTERNAL_LINK like", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotLike(String value) {
            addCriterion("EXTERNAL_LINK not like", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkIn(List<String> values) {
            addCriterion("EXTERNAL_LINK in", values, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotIn(List<String> values) {
            addCriterion("EXTERNAL_LINK not in", values, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkBetween(String value1, String value2) {
            addCriterion("EXTERNAL_LINK between", value1, value2, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotBetween(String value1, String value2) {
            addCriterion("EXTERNAL_LINK not between", value1, value2, "externalLink");
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

        public Criteria andGoodsStatusIsNull() {
            addCriterion("GOODS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("GOODS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(String value) {
            addCriterion("GOODS_STATUS =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(String value) {
            addCriterion("GOODS_STATUS <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(String value) {
            addCriterion("GOODS_STATUS >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_STATUS >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(String value) {
            addCriterion("GOODS_STATUS <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(String value) {
            addCriterion("GOODS_STATUS <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLike(String value) {
            addCriterion("GOODS_STATUS like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotLike(String value) {
            addCriterion("GOODS_STATUS not like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<String> values) {
            addCriterion("GOODS_STATUS in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<String> values) {
            addCriterion("GOODS_STATUS not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(String value1, String value2) {
            addCriterion("GOODS_STATUS between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(String value1, String value2) {
            addCriterion("GOODS_STATUS not between", value1, value2, "goodsStatus");
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