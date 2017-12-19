package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PPayOrderDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PPayOrderDOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNull() {
            addCriterion("pay_no is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("pay_no =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("pay_no <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("pay_no >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("pay_no >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("pay_no <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("pay_no <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("pay_no like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("pay_no not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("pay_no in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("pay_no not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("pay_no between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("pay_no not between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAuthCodeIsNull() {
            addCriterion("auth_code is null");
            return (Criteria) this;
        }

        public Criteria andAuthCodeIsNotNull() {
            addCriterion("auth_code is not null");
            return (Criteria) this;
        }

        public Criteria andAuthCodeEqualTo(String value) {
            addCriterion("auth_code =", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeNotEqualTo(String value) {
            addCriterion("auth_code <>", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeGreaterThan(String value) {
            addCriterion("auth_code >", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("auth_code >=", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeLessThan(String value) {
            addCriterion("auth_code <", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeLessThanOrEqualTo(String value) {
            addCriterion("auth_code <=", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeLike(String value) {
            addCriterion("auth_code like", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeNotLike(String value) {
            addCriterion("auth_code not like", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeIn(List<String> values) {
            addCriterion("auth_code in", values, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeNotIn(List<String> values) {
            addCriterion("auth_code not in", values, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeBetween(String value1, String value2) {
            addCriterion("auth_code between", value1, value2, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeNotBetween(String value1, String value2) {
            addCriterion("auth_code not between", value1, value2, "authCode");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNull() {
            addCriterion("mch_id is null");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNotNull() {
            addCriterion("mch_id is not null");
            return (Criteria) this;
        }

        public Criteria andMchIdEqualTo(Integer value) {
            addCriterion("mch_id =", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotEqualTo(Integer value) {
            addCriterion("mch_id <>", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThan(Integer value) {
            addCriterion("mch_id >", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mch_id >=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThan(Integer value) {
            addCriterion("mch_id <", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThanOrEqualTo(Integer value) {
            addCriterion("mch_id <=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdIn(List<Integer> values) {
            addCriterion("mch_id in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotIn(List<Integer> values) {
            addCriterion("mch_id not in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdBetween(Integer value1, Integer value2) {
            addCriterion("mch_id between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mch_id not between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andOrderFeeIsNull() {
            addCriterion("order_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderFeeIsNotNull() {
            addCriterion("order_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFeeEqualTo(Integer value) {
            addCriterion("order_fee =", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeNotEqualTo(Integer value) {
            addCriterion("order_fee <>", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeGreaterThan(Integer value) {
            addCriterion("order_fee >", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_fee >=", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeLessThan(Integer value) {
            addCriterion("order_fee <", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeLessThanOrEqualTo(Integer value) {
            addCriterion("order_fee <=", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeIn(List<Integer> values) {
            addCriterion("order_fee in", values, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeNotIn(List<Integer> values) {
            addCriterion("order_fee not in", values, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeBetween(Integer value1, Integer value2) {
            addCriterion("order_fee between", value1, value2, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_fee not between", value1, value2, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOilIsNull() {
            addCriterion("oil is null");
            return (Criteria) this;
        }

        public Criteria andOilIsNotNull() {
            addCriterion("oil is not null");
            return (Criteria) this;
        }

        public Criteria andOilEqualTo(String value) {
            addCriterion("oil =", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotEqualTo(String value) {
            addCriterion("oil <>", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilGreaterThan(String value) {
            addCriterion("oil >", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilGreaterThanOrEqualTo(String value) {
            addCriterion("oil >=", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilLessThan(String value) {
            addCriterion("oil <", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilLessThanOrEqualTo(String value) {
            addCriterion("oil <=", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilLike(String value) {
            addCriterion("oil like", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotLike(String value) {
            addCriterion("oil not like", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilIn(List<String> values) {
            addCriterion("oil in", values, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotIn(List<String> values) {
            addCriterion("oil not in", values, "oil");
            return (Criteria) this;
        }

        public Criteria andOilBetween(String value1, String value2) {
            addCriterion("oil between", value1, value2, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotBetween(String value1, String value2) {
            addCriterion("oil not between", value1, value2, "oil");
            return (Criteria) this;
        }

        public Criteria andAttachIsNull() {
            addCriterion("attach is null");
            return (Criteria) this;
        }

        public Criteria andAttachIsNotNull() {
            addCriterion("attach is not null");
            return (Criteria) this;
        }

        public Criteria andAttachEqualTo(String value) {
            addCriterion("attach =", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotEqualTo(String value) {
            addCriterion("attach <>", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThan(String value) {
            addCriterion("attach >", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThanOrEqualTo(String value) {
            addCriterion("attach >=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThan(String value) {
            addCriterion("attach <", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThanOrEqualTo(String value) {
            addCriterion("attach <=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLike(String value) {
            addCriterion("attach like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotLike(String value) {
            addCriterion("attach not like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachIn(List<String> values) {
            addCriterion("attach in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotIn(List<String> values) {
            addCriterion("attach not in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachBetween(String value1, String value2) {
            addCriterion("attach between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotBetween(String value1, String value2) {
            addCriterion("attach not between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andOilStationIsNull() {
            addCriterion("oil_station is null");
            return (Criteria) this;
        }

        public Criteria andOilStationIsNotNull() {
            addCriterion("oil_station is not null");
            return (Criteria) this;
        }

        public Criteria andOilStationEqualTo(String value) {
            addCriterion("oil_station =", value, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationNotEqualTo(String value) {
            addCriterion("oil_station <>", value, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationGreaterThan(String value) {
            addCriterion("oil_station >", value, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationGreaterThanOrEqualTo(String value) {
            addCriterion("oil_station >=", value, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationLessThan(String value) {
            addCriterion("oil_station <", value, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationLessThanOrEqualTo(String value) {
            addCriterion("oil_station <=", value, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationLike(String value) {
            addCriterion("oil_station like", value, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationNotLike(String value) {
            addCriterion("oil_station not like", value, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationIn(List<String> values) {
            addCriterion("oil_station in", values, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationNotIn(List<String> values) {
            addCriterion("oil_station not in", values, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationBetween(String value1, String value2) {
            addCriterion("oil_station between", value1, value2, "oilStation");
            return (Criteria) this;
        }

        public Criteria andOilStationNotBetween(String value1, String value2) {
            addCriterion("oil_station not between", value1, value2, "oilStation");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Double value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Double value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Double value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Double value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Double value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Double> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Double> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Double value1, Double value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Double value1, Double value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andStationLonIsNull() {
            addCriterion("station_lon is null");
            return (Criteria) this;
        }

        public Criteria andStationLonIsNotNull() {
            addCriterion("station_lon is not null");
            return (Criteria) this;
        }

        public Criteria andStationLonEqualTo(Double value) {
            addCriterion("station_lon =", value, "stationLon");
            return (Criteria) this;
        }

        public Criteria andStationLonNotEqualTo(Double value) {
            addCriterion("station_lon <>", value, "stationLon");
            return (Criteria) this;
        }

        public Criteria andStationLonGreaterThan(Double value) {
            addCriterion("station_lon >", value, "stationLon");
            return (Criteria) this;
        }

        public Criteria andStationLonGreaterThanOrEqualTo(Double value) {
            addCriterion("station_lon >=", value, "stationLon");
            return (Criteria) this;
        }

        public Criteria andStationLonLessThan(Double value) {
            addCriterion("station_lon <", value, "stationLon");
            return (Criteria) this;
        }

        public Criteria andStationLonLessThanOrEqualTo(Double value) {
            addCriterion("station_lon <=", value, "stationLon");
            return (Criteria) this;
        }

        public Criteria andStationLonIn(List<Double> values) {
            addCriterion("station_lon in", values, "stationLon");
            return (Criteria) this;
        }

        public Criteria andStationLonNotIn(List<Double> values) {
            addCriterion("station_lon not in", values, "stationLon");
            return (Criteria) this;
        }

        public Criteria andStationLonBetween(Double value1, Double value2) {
            addCriterion("station_lon between", value1, value2, "stationLon");
            return (Criteria) this;
        }

        public Criteria andStationLonNotBetween(Double value1, Double value2) {
            addCriterion("station_lon not between", value1, value2, "stationLon");
            return (Criteria) this;
        }

        public Criteria andStationLatIsNull() {
            addCriterion("station_lat is null");
            return (Criteria) this;
        }

        public Criteria andStationLatIsNotNull() {
            addCriterion("station_lat is not null");
            return (Criteria) this;
        }

        public Criteria andStationLatEqualTo(Double value) {
            addCriterion("station_lat =", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatNotEqualTo(Double value) {
            addCriterion("station_lat <>", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatGreaterThan(Double value) {
            addCriterion("station_lat >", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatGreaterThanOrEqualTo(Double value) {
            addCriterion("station_lat >=", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatLessThan(Double value) {
            addCriterion("station_lat <", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatLessThanOrEqualTo(Double value) {
            addCriterion("station_lat <=", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatIn(List<Double> values) {
            addCriterion("station_lat in", values, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatNotIn(List<Double> values) {
            addCriterion("station_lat not in", values, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatBetween(Double value1, Double value2) {
            addCriterion("station_lat between", value1, value2, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatNotBetween(Double value1, Double value2) {
            addCriterion("station_lat not between", value1, value2, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andProfitRateIsNull() {
            addCriterion("profit_rate is null");
            return (Criteria) this;
        }

        public Criteria andProfitRateIsNotNull() {
            addCriterion("profit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andProfitRateEqualTo(Double value) {
            addCriterion("profit_rate =", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateNotEqualTo(Double value) {
            addCriterion("profit_rate <>", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateGreaterThan(Double value) {
            addCriterion("profit_rate >", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateGreaterThanOrEqualTo(Double value) {
            addCriterion("profit_rate >=", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateLessThan(Double value) {
            addCriterion("profit_rate <", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateLessThanOrEqualTo(Double value) {
            addCriterion("profit_rate <=", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateIn(List<Double> values) {
            addCriterion("profit_rate in", values, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateNotIn(List<Double> values) {
            addCriterion("profit_rate not in", values, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateBetween(Double value1, Double value2) {
            addCriterion("profit_rate between", value1, value2, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateNotBetween(Double value1, Double value2) {
            addCriterion("profit_rate not between", value1, value2, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitFeeIsNull() {
            addCriterion("profit_fee is null");
            return (Criteria) this;
        }

        public Criteria andProfitFeeIsNotNull() {
            addCriterion("profit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andProfitFeeEqualTo(Integer value) {
            addCriterion("profit_fee =", value, "profitFee");
            return (Criteria) this;
        }

        public Criteria andProfitFeeNotEqualTo(Integer value) {
            addCriterion("profit_fee <>", value, "profitFee");
            return (Criteria) this;
        }

        public Criteria andProfitFeeGreaterThan(Integer value) {
            addCriterion("profit_fee >", value, "profitFee");
            return (Criteria) this;
        }

        public Criteria andProfitFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("profit_fee >=", value, "profitFee");
            return (Criteria) this;
        }

        public Criteria andProfitFeeLessThan(Integer value) {
            addCriterion("profit_fee <", value, "profitFee");
            return (Criteria) this;
        }

        public Criteria andProfitFeeLessThanOrEqualTo(Integer value) {
            addCriterion("profit_fee <=", value, "profitFee");
            return (Criteria) this;
        }

        public Criteria andProfitFeeIn(List<Integer> values) {
            addCriterion("profit_fee in", values, "profitFee");
            return (Criteria) this;
        }

        public Criteria andProfitFeeNotIn(List<Integer> values) {
            addCriterion("profit_fee not in", values, "profitFee");
            return (Criteria) this;
        }

        public Criteria andProfitFeeBetween(Integer value1, Integer value2) {
            addCriterion("profit_fee between", value1, value2, "profitFee");
            return (Criteria) this;
        }

        public Criteria andProfitFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("profit_fee not between", value1, value2, "profitFee");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdIsNull() {
            addCriterion("dis_account_id is null");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdIsNotNull() {
            addCriterion("dis_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdEqualTo(String value) {
            addCriterion("dis_account_id =", value, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdNotEqualTo(String value) {
            addCriterion("dis_account_id <>", value, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdGreaterThan(String value) {
            addCriterion("dis_account_id >", value, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("dis_account_id >=", value, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdLessThan(String value) {
            addCriterion("dis_account_id <", value, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdLessThanOrEqualTo(String value) {
            addCriterion("dis_account_id <=", value, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdLike(String value) {
            addCriterion("dis_account_id like", value, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdNotLike(String value) {
            addCriterion("dis_account_id not like", value, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdIn(List<String> values) {
            addCriterion("dis_account_id in", values, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdNotIn(List<String> values) {
            addCriterion("dis_account_id not in", values, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdBetween(String value1, String value2) {
            addCriterion("dis_account_id between", value1, value2, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisAccountIdNotBetween(String value1, String value2) {
            addCriterion("dis_account_id not between", value1, value2, "disAccountId");
            return (Criteria) this;
        }

        public Criteria andDisFeeIsNull() {
            addCriterion("dis_fee is null");
            return (Criteria) this;
        }

        public Criteria andDisFeeIsNotNull() {
            addCriterion("dis_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDisFeeEqualTo(Integer value) {
            addCriterion("dis_fee =", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeNotEqualTo(Integer value) {
            addCriterion("dis_fee <>", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeGreaterThan(Integer value) {
            addCriterion("dis_fee >", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dis_fee >=", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeLessThan(Integer value) {
            addCriterion("dis_fee <", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeLessThanOrEqualTo(Integer value) {
            addCriterion("dis_fee <=", value, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeIn(List<Integer> values) {
            addCriterion("dis_fee in", values, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeNotIn(List<Integer> values) {
            addCriterion("dis_fee not in", values, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeBetween(Integer value1, Integer value2) {
            addCriterion("dis_fee between", value1, value2, "disFee");
            return (Criteria) this;
        }

        public Criteria andDisFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("dis_fee not between", value1, value2, "disFee");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIsNull() {
            addCriterion("coupon_fee is null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIsNotNull() {
            addCriterion("coupon_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeEqualTo(Integer value) {
            addCriterion("coupon_fee =", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotEqualTo(Integer value) {
            addCriterion("coupon_fee <>", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeGreaterThan(Integer value) {
            addCriterion("coupon_fee >", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_fee >=", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeLessThan(Integer value) {
            addCriterion("coupon_fee <", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_fee <=", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIn(List<Integer> values) {
            addCriterion("coupon_fee in", values, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotIn(List<Integer> values) {
            addCriterion("coupon_fee not in", values, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_fee between", value1, value2, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_fee not between", value1, value2, "couponFee");
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

        public Criteria andNotifyUrlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("notify_url =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("notify_url <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("notify_url like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("notify_url not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("notify_url in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andBodyIsNull() {
            addCriterion("body is null");
            return (Criteria) this;
        }

        public Criteria andBodyIsNotNull() {
            addCriterion("body is not null");
            return (Criteria) this;
        }

        public Criteria andBodyEqualTo(String value) {
            addCriterion("body =", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotEqualTo(String value) {
            addCriterion("body <>", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThan(String value) {
            addCriterion("body >", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThanOrEqualTo(String value) {
            addCriterion("body >=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThan(String value) {
            addCriterion("body <", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThanOrEqualTo(String value) {
            addCriterion("body <=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLike(String value) {
            addCriterion("body like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotLike(String value) {
            addCriterion("body not like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyIn(List<String> values) {
            addCriterion("body in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotIn(List<String> values) {
            addCriterion("body not in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyBetween(String value1, String value2) {
            addCriterion("body between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotBetween(String value1, String value2) {
            addCriterion("body not between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIsNull() {
            addCriterion("time_expire is null");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIsNotNull() {
            addCriterion("time_expire is not null");
            return (Criteria) this;
        }

        public Criteria andTimeExpireEqualTo(Date value) {
            addCriterion("time_expire =", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotEqualTo(Date value) {
            addCriterion("time_expire <>", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireGreaterThan(Date value) {
            addCriterion("time_expire >", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("time_expire >=", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireLessThan(Date value) {
            addCriterion("time_expire <", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireLessThanOrEqualTo(Date value) {
            addCriterion("time_expire <=", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIn(List<Date> values) {
            addCriterion("time_expire in", values, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotIn(List<Date> values) {
            addCriterion("time_expire not in", values, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireBetween(Date value1, Date value2) {
            addCriterion("time_expire between", value1, value2, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotBetween(Date value1, Date value2) {
            addCriterion("time_expire not between", value1, value2, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNull() {
            addCriterion("pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNotNull() {
            addCriterion("pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayFeeEqualTo(Integer value) {
            addCriterion("pay_fee =", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotEqualTo(Integer value) {
            addCriterion("pay_fee <>", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThan(Integer value) {
            addCriterion("pay_fee >", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_fee >=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThan(Integer value) {
            addCriterion("pay_fee <", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_fee <=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIn(List<Integer> values) {
            addCriterion("pay_fee in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotIn(List<Integer> values) {
            addCriterion("pay_fee not in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeBetween(Integer value1, Integer value2) {
            addCriterion("pay_fee between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_fee not between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andOrderDayIsNull() {
            addCriterion("order_day is null");
            return (Criteria) this;
        }

        public Criteria andOrderDayIsNotNull() {
            addCriterion("order_day is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDayEqualTo(String value) {
            addCriterion("order_day =", value, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayNotEqualTo(String value) {
            addCriterion("order_day <>", value, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayGreaterThan(String value) {
            addCriterion("order_day >", value, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayGreaterThanOrEqualTo(String value) {
            addCriterion("order_day >=", value, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayLessThan(String value) {
            addCriterion("order_day <", value, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayLessThanOrEqualTo(String value) {
            addCriterion("order_day <=", value, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayLike(String value) {
            addCriterion("order_day like", value, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayNotLike(String value) {
            addCriterion("order_day not like", value, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayIn(List<String> values) {
            addCriterion("order_day in", values, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayNotIn(List<String> values) {
            addCriterion("order_day not in", values, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayBetween(String value1, String value2) {
            addCriterion("order_day between", value1, value2, "orderDay");
            return (Criteria) this;
        }

        public Criteria andOrderDayNotBetween(String value1, String value2) {
            addCriterion("order_day not between", value1, value2, "orderDay");
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