package dal.model.squid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IInvoiceRecDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IInvoiceRecDOExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("CUSTOMER_ID like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("CUSTOMER_ID not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
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

        public Criteria andInvoiceNoIsNull() {
            addCriterion("INVOICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("INVOICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("INVOICE_NO =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("INVOICE_NO <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("INVOICE_NO >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("INVOICE_NO <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("INVOICE_NO like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("INVOICE_NO not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("INVOICE_NO in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("INVOICE_NO not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("INVOICE_NO between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NO not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNull() {
            addCriterion("INVOICE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNotNull() {
            addCriterion("INVOICE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountEqualTo(Long value) {
            addCriterion("INVOICE_AMOUNT =", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotEqualTo(Long value) {
            addCriterion("INVOICE_AMOUNT <>", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThan(Long value) {
            addCriterion("INVOICE_AMOUNT >", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("INVOICE_AMOUNT >=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThan(Long value) {
            addCriterion("INVOICE_AMOUNT <", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThanOrEqualTo(Long value) {
            addCriterion("INVOICE_AMOUNT <=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIn(List<Long> values) {
            addCriterion("INVOICE_AMOUNT in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotIn(List<Long> values) {
            addCriterion("INVOICE_AMOUNT not in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountBetween(Long value1, Long value2) {
            addCriterion("INVOICE_AMOUNT between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotBetween(Long value1, Long value2) {
            addCriterion("INVOICE_AMOUNT not between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("INVOICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("INVOICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("INVOICE_TYPE =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("INVOICE_TYPE <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("INVOICE_TYPE >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("INVOICE_TYPE <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("INVOICE_TYPE like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("INVOICE_TYPE not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("INVOICE_TYPE in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("INVOICE_TYPE not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("AUDIT_STATUS like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("AUDIT_STATUS not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("PAY_STATUS =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("PAY_STATUS <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("PAY_STATUS >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_STATUS >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("PAY_STATUS <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("PAY_STATUS <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("PAY_STATUS like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("PAY_STATUS not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("PAY_STATUS in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("PAY_STATUS not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("PAY_STATUS between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("PAY_STATUS not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("PAY_TYPE like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("PAY_TYPE not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andTragetNameIsNull() {
            addCriterion("TRAGET_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTragetNameIsNotNull() {
            addCriterion("TRAGET_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTragetNameEqualTo(String value) {
            addCriterion("TRAGET_NAME =", value, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameNotEqualTo(String value) {
            addCriterion("TRAGET_NAME <>", value, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameGreaterThan(String value) {
            addCriterion("TRAGET_NAME >", value, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRAGET_NAME >=", value, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameLessThan(String value) {
            addCriterion("TRAGET_NAME <", value, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameLessThanOrEqualTo(String value) {
            addCriterion("TRAGET_NAME <=", value, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameLike(String value) {
            addCriterion("TRAGET_NAME like", value, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameNotLike(String value) {
            addCriterion("TRAGET_NAME not like", value, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameIn(List<String> values) {
            addCriterion("TRAGET_NAME in", values, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameNotIn(List<String> values) {
            addCriterion("TRAGET_NAME not in", values, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameBetween(String value1, String value2) {
            addCriterion("TRAGET_NAME between", value1, value2, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetNameNotBetween(String value1, String value2) {
            addCriterion("TRAGET_NAME not between", value1, value2, "tragetName");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneIsNull() {
            addCriterion("TRAGET_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneIsNotNull() {
            addCriterion("TRAGET_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneEqualTo(String value) {
            addCriterion("TRAGET_PHONE =", value, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneNotEqualTo(String value) {
            addCriterion("TRAGET_PHONE <>", value, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneGreaterThan(String value) {
            addCriterion("TRAGET_PHONE >", value, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("TRAGET_PHONE >=", value, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneLessThan(String value) {
            addCriterion("TRAGET_PHONE <", value, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneLessThanOrEqualTo(String value) {
            addCriterion("TRAGET_PHONE <=", value, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneLike(String value) {
            addCriterion("TRAGET_PHONE like", value, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneNotLike(String value) {
            addCriterion("TRAGET_PHONE not like", value, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneIn(List<String> values) {
            addCriterion("TRAGET_PHONE in", values, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneNotIn(List<String> values) {
            addCriterion("TRAGET_PHONE not in", values, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneBetween(String value1, String value2) {
            addCriterion("TRAGET_PHONE between", value1, value2, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetPhoneNotBetween(String value1, String value2) {
            addCriterion("TRAGET_PHONE not between", value1, value2, "tragetPhone");
            return (Criteria) this;
        }

        public Criteria andTragetAddressIsNull() {
            addCriterion("TRAGET_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTragetAddressIsNotNull() {
            addCriterion("TRAGET_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTragetAddressEqualTo(String value) {
            addCriterion("TRAGET_ADDRESS =", value, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressNotEqualTo(String value) {
            addCriterion("TRAGET_ADDRESS <>", value, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressGreaterThan(String value) {
            addCriterion("TRAGET_ADDRESS >", value, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressGreaterThanOrEqualTo(String value) {
            addCriterion("TRAGET_ADDRESS >=", value, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressLessThan(String value) {
            addCriterion("TRAGET_ADDRESS <", value, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressLessThanOrEqualTo(String value) {
            addCriterion("TRAGET_ADDRESS <=", value, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressLike(String value) {
            addCriterion("TRAGET_ADDRESS like", value, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressNotLike(String value) {
            addCriterion("TRAGET_ADDRESS not like", value, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressIn(List<String> values) {
            addCriterion("TRAGET_ADDRESS in", values, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressNotIn(List<String> values) {
            addCriterion("TRAGET_ADDRESS not in", values, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressBetween(String value1, String value2) {
            addCriterion("TRAGET_ADDRESS between", value1, value2, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andTragetAddressNotBetween(String value1, String value2) {
            addCriterion("TRAGET_ADDRESS not between", value1, value2, "tragetAddress");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIsNull() {
            addCriterion("ORDER_INFO is null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIsNotNull() {
            addCriterion("ORDER_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoEqualTo(String value) {
            addCriterion("ORDER_INFO =", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotEqualTo(String value) {
            addCriterion("ORDER_INFO <>", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoGreaterThan(String value) {
            addCriterion("ORDER_INFO >", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_INFO >=", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoLessThan(String value) {
            addCriterion("ORDER_INFO <", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_INFO <=", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoLike(String value) {
            addCriterion("ORDER_INFO like", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotLike(String value) {
            addCriterion("ORDER_INFO not like", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIn(List<String> values) {
            addCriterion("ORDER_INFO in", values, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotIn(List<String> values) {
            addCriterion("ORDER_INFO not in", values, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoBetween(String value1, String value2) {
            addCriterion("ORDER_INFO between", value1, value2, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotBetween(String value1, String value2) {
            addCriterion("ORDER_INFO not between", value1, value2, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("IMG_URL =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("IMG_URL <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("IMG_URL >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_URL >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("IMG_URL <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("IMG_URL <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("IMG_URL like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("IMG_URL not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("IMG_URL in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("IMG_URL not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("IMG_URL between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("IMG_URL not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNull() {
            addCriterion("OPEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNotNull() {
            addCriterion("OPEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeEqualTo(String value) {
            addCriterion("OPEN_TYPE =", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotEqualTo(String value) {
            addCriterion("OPEN_TYPE <>", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThan(String value) {
            addCriterion("OPEN_TYPE >", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_TYPE >=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThan(String value) {
            addCriterion("OPEN_TYPE <", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThanOrEqualTo(String value) {
            addCriterion("OPEN_TYPE <=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLike(String value) {
            addCriterion("OPEN_TYPE like", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotLike(String value) {
            addCriterion("OPEN_TYPE not like", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIn(List<String> values) {
            addCriterion("OPEN_TYPE in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotIn(List<String> values) {
            addCriterion("OPEN_TYPE not in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeBetween(String value1, String value2) {
            addCriterion("OPEN_TYPE between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotBetween(String value1, String value2) {
            addCriterion("OPEN_TYPE not between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andTaxCodeIsNull() {
            addCriterion("TAX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxCodeIsNotNull() {
            addCriterion("TAX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCodeEqualTo(String value) {
            addCriterion("TAX_CODE =", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotEqualTo(String value) {
            addCriterion("TAX_CODE <>", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeGreaterThan(String value) {
            addCriterion("TAX_CODE >", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_CODE >=", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeLessThan(String value) {
            addCriterion("TAX_CODE <", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeLessThanOrEqualTo(String value) {
            addCriterion("TAX_CODE <=", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeLike(String value) {
            addCriterion("TAX_CODE like", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotLike(String value) {
            addCriterion("TAX_CODE not like", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeIn(List<String> values) {
            addCriterion("TAX_CODE in", values, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotIn(List<String> values) {
            addCriterion("TAX_CODE not in", values, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeBetween(String value1, String value2) {
            addCriterion("TAX_CODE between", value1, value2, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotBetween(String value1, String value2) {
            addCriterion("TAX_CODE not between", value1, value2, "taxCode");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("COMPANY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("COMPANY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("COMPANY_ADDRESS >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("COMPANY_ADDRESS <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("COMPANY_ADDRESS like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("COMPANY_ADDRESS not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("COMPANY_ADDRESS in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("COMPANY_ADDRESS not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDRESS between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDRESS not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneIsNull() {
            addCriterion("COMPANY_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneIsNotNull() {
            addCriterion("COMPANY_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneEqualTo(String value) {
            addCriterion("COMPANY_TELEPHONE =", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneNotEqualTo(String value) {
            addCriterion("COMPANY_TELEPHONE <>", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneGreaterThan(String value) {
            addCriterion("COMPANY_TELEPHONE >", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_TELEPHONE >=", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneLessThan(String value) {
            addCriterion("COMPANY_TELEPHONE <", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_TELEPHONE <=", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneLike(String value) {
            addCriterion("COMPANY_TELEPHONE like", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneNotLike(String value) {
            addCriterion("COMPANY_TELEPHONE not like", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneIn(List<String> values) {
            addCriterion("COMPANY_TELEPHONE in", values, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneNotIn(List<String> values) {
            addCriterion("COMPANY_TELEPHONE not in", values, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneBetween(String value1, String value2) {
            addCriterion("COMPANY_TELEPHONE between", value1, value2, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneNotBetween(String value1, String value2) {
            addCriterion("COMPANY_TELEPHONE not between", value1, value2, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankBranchIsNull() {
            addCriterion("BANK_BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andBankBranchIsNotNull() {
            addCriterion("BANK_BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andBankBranchEqualTo(String value) {
            addCriterion("BANK_BRANCH =", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotEqualTo(String value) {
            addCriterion("BANK_BRANCH <>", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchGreaterThan(String value) {
            addCriterion("BANK_BRANCH >", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_BRANCH >=", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLessThan(String value) {
            addCriterion("BANK_BRANCH <", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLessThanOrEqualTo(String value) {
            addCriterion("BANK_BRANCH <=", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLike(String value) {
            addCriterion("BANK_BRANCH like", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotLike(String value) {
            addCriterion("BANK_BRANCH not like", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchIn(List<String> values) {
            addCriterion("BANK_BRANCH in", values, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotIn(List<String> values) {
            addCriterion("BANK_BRANCH not in", values, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchBetween(String value1, String value2) {
            addCriterion("BANK_BRANCH between", value1, value2, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotBetween(String value1, String value2) {
            addCriterion("BANK_BRANCH not between", value1, value2, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNull() {
            addCriterion("BANK_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNotNull() {
            addCriterion("BANK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankNoEqualTo(String value) {
            addCriterion("BANK_NO =", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("BANK_NO <>", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("BANK_NO >", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NO >=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThan(String value) {
            addCriterion("BANK_NO <", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_NO <=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLike(String value) {
            addCriterion("BANK_NO like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotLike(String value) {
            addCriterion("BANK_NO not like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoIn(List<String> values) {
            addCriterion("BANK_NO in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("BANK_NO not in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("BANK_NO between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("BANK_NO not between", value1, value2, "bankNo");
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("E_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("E_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("E_MAIL =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("E_MAIL <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("E_MAIL >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("E_MAIL >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("E_MAIL <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("E_MAIL <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("E_MAIL like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("E_MAIL not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("E_MAIL in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("E_MAIL not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("E_MAIL between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("E_MAIL not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Integer value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Integer value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Integer value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Integer value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Integer value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Integer> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Integer> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Integer value1, Integer value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Integer value1, Integer value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateAmountIsNull() {
            addCriterion("RATE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRateAmountIsNotNull() {
            addCriterion("RATE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRateAmountEqualTo(Integer value) {
            addCriterion("RATE_AMOUNT =", value, "rateAmount");
            return (Criteria) this;
        }

        public Criteria andRateAmountNotEqualTo(Integer value) {
            addCriterion("RATE_AMOUNT <>", value, "rateAmount");
            return (Criteria) this;
        }

        public Criteria andRateAmountGreaterThan(Integer value) {
            addCriterion("RATE_AMOUNT >", value, "rateAmount");
            return (Criteria) this;
        }

        public Criteria andRateAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RATE_AMOUNT >=", value, "rateAmount");
            return (Criteria) this;
        }

        public Criteria andRateAmountLessThan(Integer value) {
            addCriterion("RATE_AMOUNT <", value, "rateAmount");
            return (Criteria) this;
        }

        public Criteria andRateAmountLessThanOrEqualTo(Integer value) {
            addCriterion("RATE_AMOUNT <=", value, "rateAmount");
            return (Criteria) this;
        }

        public Criteria andRateAmountIn(List<Integer> values) {
            addCriterion("RATE_AMOUNT in", values, "rateAmount");
            return (Criteria) this;
        }

        public Criteria andRateAmountNotIn(List<Integer> values) {
            addCriterion("RATE_AMOUNT not in", values, "rateAmount");
            return (Criteria) this;
        }

        public Criteria andRateAmountBetween(Integer value1, Integer value2) {
            addCriterion("RATE_AMOUNT between", value1, value2, "rateAmount");
            return (Criteria) this;
        }

        public Criteria andRateAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("RATE_AMOUNT not between", value1, value2, "rateAmount");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountIsNull() {
            addCriterion("RATE_COUNT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountIsNotNull() {
            addCriterion("RATE_COUNT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountEqualTo(Integer value) {
            addCriterion("RATE_COUNT_AMOUNT =", value, "rateCountAmount");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountNotEqualTo(Integer value) {
            addCriterion("RATE_COUNT_AMOUNT <>", value, "rateCountAmount");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountGreaterThan(Integer value) {
            addCriterion("RATE_COUNT_AMOUNT >", value, "rateCountAmount");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RATE_COUNT_AMOUNT >=", value, "rateCountAmount");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountLessThan(Integer value) {
            addCriterion("RATE_COUNT_AMOUNT <", value, "rateCountAmount");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountLessThanOrEqualTo(Integer value) {
            addCriterion("RATE_COUNT_AMOUNT <=", value, "rateCountAmount");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountIn(List<Integer> values) {
            addCriterion("RATE_COUNT_AMOUNT in", values, "rateCountAmount");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountNotIn(List<Integer> values) {
            addCriterion("RATE_COUNT_AMOUNT not in", values, "rateCountAmount");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountBetween(Integer value1, Integer value2) {
            addCriterion("RATE_COUNT_AMOUNT between", value1, value2, "rateCountAmount");
            return (Criteria) this;
        }

        public Criteria andRateCountAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("RATE_COUNT_AMOUNT not between", value1, value2, "rateCountAmount");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNull() {
            addCriterion("EXPRESS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNotNull() {
            addCriterion("EXPRESS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNameEqualTo(String value) {
            addCriterion("EXPRESS_NAME =", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotEqualTo(String value) {
            addCriterion("EXPRESS_NAME <>", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThan(String value) {
            addCriterion("EXPRESS_NAME >", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXPRESS_NAME >=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThan(String value) {
            addCriterion("EXPRESS_NAME <", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThanOrEqualTo(String value) {
            addCriterion("EXPRESS_NAME <=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLike(String value) {
            addCriterion("EXPRESS_NAME like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotLike(String value) {
            addCriterion("EXPRESS_NAME not like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameIn(List<String> values) {
            addCriterion("EXPRESS_NAME in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotIn(List<String> values) {
            addCriterion("EXPRESS_NAME not in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameBetween(String value1, String value2) {
            addCriterion("EXPRESS_NAME between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotBetween(String value1, String value2) {
            addCriterion("EXPRESS_NAME not between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIsNull() {
            addCriterion("EXPRESS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIsNotNull() {
            addCriterion("EXPRESS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExpressCodeEqualTo(String value) {
            addCriterion("EXPRESS_CODE =", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotEqualTo(String value) {
            addCriterion("EXPRESS_CODE <>", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeGreaterThan(String value) {
            addCriterion("EXPRESS_CODE >", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXPRESS_CODE >=", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLessThan(String value) {
            addCriterion("EXPRESS_CODE <", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLessThanOrEqualTo(String value) {
            addCriterion("EXPRESS_CODE <=", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLike(String value) {
            addCriterion("EXPRESS_CODE like", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotLike(String value) {
            addCriterion("EXPRESS_CODE not like", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIn(List<String> values) {
            addCriterion("EXPRESS_CODE in", values, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotIn(List<String> values) {
            addCriterion("EXPRESS_CODE not in", values, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeBetween(String value1, String value2) {
            addCriterion("EXPRESS_CODE between", value1, value2, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotBetween(String value1, String value2) {
            addCriterion("EXPRESS_CODE not between", value1, value2, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressAmountIsNull() {
            addCriterion("EXPRESS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExpressAmountIsNotNull() {
            addCriterion("EXPRESS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExpressAmountEqualTo(Integer value) {
            addCriterion("EXPRESS_AMOUNT =", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountNotEqualTo(Integer value) {
            addCriterion("EXPRESS_AMOUNT <>", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountGreaterThan(Integer value) {
            addCriterion("EXPRESS_AMOUNT >", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPRESS_AMOUNT >=", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountLessThan(Integer value) {
            addCriterion("EXPRESS_AMOUNT <", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountLessThanOrEqualTo(Integer value) {
            addCriterion("EXPRESS_AMOUNT <=", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountIn(List<Integer> values) {
            addCriterion("EXPRESS_AMOUNT in", values, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountNotIn(List<Integer> values) {
            addCriterion("EXPRESS_AMOUNT not in", values, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountBetween(Integer value1, Integer value2) {
            addCriterion("EXPRESS_AMOUNT between", value1, value2, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPRESS_AMOUNT not between", value1, value2, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoIsNull() {
            addCriterion("INVOICE_PAY_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoIsNotNull() {
            addCriterion("INVOICE_PAY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoEqualTo(String value) {
            addCriterion("INVOICE_PAY_NO =", value, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoNotEqualTo(String value) {
            addCriterion("INVOICE_PAY_NO <>", value, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoGreaterThan(String value) {
            addCriterion("INVOICE_PAY_NO >", value, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_PAY_NO >=", value, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoLessThan(String value) {
            addCriterion("INVOICE_PAY_NO <", value, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_PAY_NO <=", value, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoLike(String value) {
            addCriterion("INVOICE_PAY_NO like", value, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoNotLike(String value) {
            addCriterion("INVOICE_PAY_NO not like", value, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoIn(List<String> values) {
            addCriterion("INVOICE_PAY_NO in", values, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoNotIn(List<String> values) {
            addCriterion("INVOICE_PAY_NO not in", values, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoBetween(String value1, String value2) {
            addCriterion("INVOICE_PAY_NO between", value1, value2, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andInvoicePayNoNotBetween(String value1, String value2) {
            addCriterion("INVOICE_PAY_NO not between", value1, value2, "invoicePayNo");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("GOODS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("GOODS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("GOODS_TYPE =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("GOODS_TYPE <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("GOODS_TYPE >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("GOODS_TYPE <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("GOODS_TYPE like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("GOODS_TYPE not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("GOODS_TYPE in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("GOODS_TYPE not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameIsNull() {
            addCriterion("customer_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameIsNotNull() {
            addCriterion("customer_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameEqualTo(String value) {
            addCriterion("customer_nick_name =", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameNotEqualTo(String value) {
            addCriterion("customer_nick_name <>", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameGreaterThan(String value) {
            addCriterion("customer_nick_name >", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_nick_name >=", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameLessThan(String value) {
            addCriterion("customer_nick_name <", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameLessThanOrEqualTo(String value) {
            addCriterion("customer_nick_name <=", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameLike(String value) {
            addCriterion("customer_nick_name like", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameNotLike(String value) {
            addCriterion("customer_nick_name not like", value, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameIn(List<String> values) {
            addCriterion("customer_nick_name in", values, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameNotIn(List<String> values) {
            addCriterion("customer_nick_name not in", values, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameBetween(String value1, String value2) {
            addCriterion("customer_nick_name between", value1, value2, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andCustomerNickNameNotBetween(String value1, String value2) {
            addCriterion("customer_nick_name not between", value1, value2, "customerNickName");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIsNull() {
            addCriterion("INVOICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIsNotNull() {
            addCriterion("INVOICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeEqualTo(String value) {
            addCriterion("INVOICE_CODE =", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotEqualTo(String value) {
            addCriterion("INVOICE_CODE <>", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeGreaterThan(String value) {
            addCriterion("INVOICE_CODE >", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_CODE >=", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLessThan(String value) {
            addCriterion("INVOICE_CODE <", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_CODE <=", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLike(String value) {
            addCriterion("INVOICE_CODE like", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotLike(String value) {
            addCriterion("INVOICE_CODE not like", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIn(List<String> values) {
            addCriterion("INVOICE_CODE in", values, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotIn(List<String> values) {
            addCriterion("INVOICE_CODE not in", values, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeBetween(String value1, String value2) {
            addCriterion("INVOICE_CODE between", value1, value2, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotBetween(String value1, String value2) {
            addCriterion("INVOICE_CODE not between", value1, value2, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIsNull() {
            addCriterion("INVOICE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIsNotNull() {
            addCriterion("INVOICE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumEqualTo(String value) {
            addCriterion("INVOICE_NUM =", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotEqualTo(String value) {
            addCriterion("INVOICE_NUM <>", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumGreaterThan(String value) {
            addCriterion("INVOICE_NUM >", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NUM >=", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLessThan(String value) {
            addCriterion("INVOICE_NUM <", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NUM <=", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLike(String value) {
            addCriterion("INVOICE_NUM like", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotLike(String value) {
            addCriterion("INVOICE_NUM not like", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIn(List<String> values) {
            addCriterion("INVOICE_NUM in", values, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotIn(List<String> values) {
            addCriterion("INVOICE_NUM not in", values, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumBetween(String value1, String value2) {
            addCriterion("INVOICE_NUM between", value1, value2, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NUM not between", value1, value2, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlIsNull() {
            addCriterion("INVOICE_URL is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlIsNotNull() {
            addCriterion("INVOICE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlEqualTo(String value) {
            addCriterion("INVOICE_URL =", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlNotEqualTo(String value) {
            addCriterion("INVOICE_URL <>", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlGreaterThan(String value) {
            addCriterion("INVOICE_URL >", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_URL >=", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlLessThan(String value) {
            addCriterion("INVOICE_URL <", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_URL <=", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlLike(String value) {
            addCriterion("INVOICE_URL like", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlNotLike(String value) {
            addCriterion("INVOICE_URL not like", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlIn(List<String> values) {
            addCriterion("INVOICE_URL in", values, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlNotIn(List<String> values) {
            addCriterion("INVOICE_URL not in", values, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlBetween(String value1, String value2) {
            addCriterion("INVOICE_URL between", value1, value2, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlNotBetween(String value1, String value2) {
            addCriterion("INVOICE_URL not between", value1, value2, "invoiceUrl");
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