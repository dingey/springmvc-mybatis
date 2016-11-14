package com.di.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPayingIdIsNull() {
            addCriterion("paying_id is null");
            return (Criteria) this;
        }

        public Criteria andPayingIdIsNotNull() {
            addCriterion("paying_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayingIdEqualTo(String value) {
            addCriterion("paying_id =", value, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdNotEqualTo(String value) {
            addCriterion("paying_id <>", value, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdGreaterThan(String value) {
            addCriterion("paying_id >", value, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdGreaterThanOrEqualTo(String value) {
            addCriterion("paying_id >=", value, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdLessThan(String value) {
            addCriterion("paying_id <", value, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdLessThanOrEqualTo(String value) {
            addCriterion("paying_id <=", value, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdLike(String value) {
            addCriterion("paying_id like", value, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdNotLike(String value) {
            addCriterion("paying_id not like", value, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdIn(List<String> values) {
            addCriterion("paying_id in", values, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdNotIn(List<String> values) {
            addCriterion("paying_id not in", values, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdBetween(String value1, String value2) {
            addCriterion("paying_id between", value1, value2, "payingId");
            return (Criteria) this;
        }

        public Criteria andPayingIdNotBetween(String value1, String value2) {
            addCriterion("paying_id not between", value1, value2, "payingId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNull() {
            addCriterion("refund_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNotNull() {
            addCriterion("refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIdEqualTo(Long value) {
            addCriterion("refund_id =", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotEqualTo(Long value) {
            addCriterion("refund_id <>", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThan(Long value) {
            addCriterion("refund_id >", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThanOrEqualTo(Long value) {
            addCriterion("refund_id >=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThan(Long value) {
            addCriterion("refund_id <", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThanOrEqualTo(Long value) {
            addCriterion("refund_id <=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIn(List<Long> values) {
            addCriterion("refund_id in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotIn(List<Long> values) {
            addCriterion("refund_id not in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdBetween(Long value1, Long value2) {
            addCriterion("refund_id between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotBetween(Long value1, Long value2) {
            addCriterion("refund_id not between", value1, value2, "refundId");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOppTypeIsNull() {
            addCriterion("opp_type is null");
            return (Criteria) this;
        }

        public Criteria andOppTypeIsNotNull() {
            addCriterion("opp_type is not null");
            return (Criteria) this;
        }

        public Criteria andOppTypeEqualTo(Integer value) {
            addCriterion("opp_type =", value, "oppType");
            return (Criteria) this;
        }

        public Criteria andOppTypeNotEqualTo(Integer value) {
            addCriterion("opp_type <>", value, "oppType");
            return (Criteria) this;
        }

        public Criteria andOppTypeGreaterThan(Integer value) {
            addCriterion("opp_type >", value, "oppType");
            return (Criteria) this;
        }

        public Criteria andOppTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("opp_type >=", value, "oppType");
            return (Criteria) this;
        }

        public Criteria andOppTypeLessThan(Integer value) {
            addCriterion("opp_type <", value, "oppType");
            return (Criteria) this;
        }

        public Criteria andOppTypeLessThanOrEqualTo(Integer value) {
            addCriterion("opp_type <=", value, "oppType");
            return (Criteria) this;
        }

        public Criteria andOppTypeIn(List<Integer> values) {
            addCriterion("opp_type in", values, "oppType");
            return (Criteria) this;
        }

        public Criteria andOppTypeNotIn(List<Integer> values) {
            addCriterion("opp_type not in", values, "oppType");
            return (Criteria) this;
        }

        public Criteria andOppTypeBetween(Integer value1, Integer value2) {
            addCriterion("opp_type between", value1, value2, "oppType");
            return (Criteria) this;
        }

        public Criteria andOppTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("opp_type not between", value1, value2, "oppType");
            return (Criteria) this;
        }

        public Criteria andOppCodeIsNull() {
            addCriterion("opp_code is null");
            return (Criteria) this;
        }

        public Criteria andOppCodeIsNotNull() {
            addCriterion("opp_code is not null");
            return (Criteria) this;
        }

        public Criteria andOppCodeEqualTo(String value) {
            addCriterion("opp_code =", value, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeNotEqualTo(String value) {
            addCriterion("opp_code <>", value, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeGreaterThan(String value) {
            addCriterion("opp_code >", value, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeGreaterThanOrEqualTo(String value) {
            addCriterion("opp_code >=", value, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeLessThan(String value) {
            addCriterion("opp_code <", value, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeLessThanOrEqualTo(String value) {
            addCriterion("opp_code <=", value, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeLike(String value) {
            addCriterion("opp_code like", value, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeNotLike(String value) {
            addCriterion("opp_code not like", value, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeIn(List<String> values) {
            addCriterion("opp_code in", values, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeNotIn(List<String> values) {
            addCriterion("opp_code not in", values, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeBetween(String value1, String value2) {
            addCriterion("opp_code between", value1, value2, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppCodeNotBetween(String value1, String value2) {
            addCriterion("opp_code not between", value1, value2, "oppCode");
            return (Criteria) this;
        }

        public Criteria andOppFeeIsNull() {
            addCriterion("opp_fee is null");
            return (Criteria) this;
        }

        public Criteria andOppFeeIsNotNull() {
            addCriterion("opp_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOppFeeEqualTo(Integer value) {
            addCriterion("opp_fee =", value, "oppFee");
            return (Criteria) this;
        }

        public Criteria andOppFeeNotEqualTo(Integer value) {
            addCriterion("opp_fee <>", value, "oppFee");
            return (Criteria) this;
        }

        public Criteria andOppFeeGreaterThan(Integer value) {
            addCriterion("opp_fee >", value, "oppFee");
            return (Criteria) this;
        }

        public Criteria andOppFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("opp_fee >=", value, "oppFee");
            return (Criteria) this;
        }

        public Criteria andOppFeeLessThan(Integer value) {
            addCriterion("opp_fee <", value, "oppFee");
            return (Criteria) this;
        }

        public Criteria andOppFeeLessThanOrEqualTo(Integer value) {
            addCriterion("opp_fee <=", value, "oppFee");
            return (Criteria) this;
        }

        public Criteria andOppFeeIn(List<Integer> values) {
            addCriterion("opp_fee in", values, "oppFee");
            return (Criteria) this;
        }

        public Criteria andOppFeeNotIn(List<Integer> values) {
            addCriterion("opp_fee not in", values, "oppFee");
            return (Criteria) this;
        }

        public Criteria andOppFeeBetween(Integer value1, Integer value2) {
            addCriterion("opp_fee between", value1, value2, "oppFee");
            return (Criteria) this;
        }

        public Criteria andOppFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("opp_fee not between", value1, value2, "oppFee");
            return (Criteria) this;
        }

        public Criteria andOppCommitIsNull() {
            addCriterion("opp_commit is null");
            return (Criteria) this;
        }

        public Criteria andOppCommitIsNotNull() {
            addCriterion("opp_commit is not null");
            return (Criteria) this;
        }

        public Criteria andOppCommitEqualTo(String value) {
            addCriterion("opp_commit =", value, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitNotEqualTo(String value) {
            addCriterion("opp_commit <>", value, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitGreaterThan(String value) {
            addCriterion("opp_commit >", value, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitGreaterThanOrEqualTo(String value) {
            addCriterion("opp_commit >=", value, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitLessThan(String value) {
            addCriterion("opp_commit <", value, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitLessThanOrEqualTo(String value) {
            addCriterion("opp_commit <=", value, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitLike(String value) {
            addCriterion("opp_commit like", value, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitNotLike(String value) {
            addCriterion("opp_commit not like", value, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitIn(List<String> values) {
            addCriterion("opp_commit in", values, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitNotIn(List<String> values) {
            addCriterion("opp_commit not in", values, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitBetween(String value1, String value2) {
            addCriterion("opp_commit between", value1, value2, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppCommitNotBetween(String value1, String value2) {
            addCriterion("opp_commit not between", value1, value2, "oppCommit");
            return (Criteria) this;
        }

        public Criteria andOppReturnIsNull() {
            addCriterion("opp_return is null");
            return (Criteria) this;
        }

        public Criteria andOppReturnIsNotNull() {
            addCriterion("opp_return is not null");
            return (Criteria) this;
        }

        public Criteria andOppReturnEqualTo(String value) {
            addCriterion("opp_return =", value, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnNotEqualTo(String value) {
            addCriterion("opp_return <>", value, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnGreaterThan(String value) {
            addCriterion("opp_return >", value, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnGreaterThanOrEqualTo(String value) {
            addCriterion("opp_return >=", value, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnLessThan(String value) {
            addCriterion("opp_return <", value, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnLessThanOrEqualTo(String value) {
            addCriterion("opp_return <=", value, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnLike(String value) {
            addCriterion("opp_return like", value, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnNotLike(String value) {
            addCriterion("opp_return not like", value, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnIn(List<String> values) {
            addCriterion("opp_return in", values, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnNotIn(List<String> values) {
            addCriterion("opp_return not in", values, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnBetween(String value1, String value2) {
            addCriterion("opp_return between", value1, value2, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppReturnNotBetween(String value1, String value2) {
            addCriterion("opp_return not between", value1, value2, "oppReturn");
            return (Criteria) this;
        }

        public Criteria andOppNotifyIsNull() {
            addCriterion("opp_notify is null");
            return (Criteria) this;
        }

        public Criteria andOppNotifyIsNotNull() {
            addCriterion("opp_notify is not null");
            return (Criteria) this;
        }

        public Criteria andOppNotifyEqualTo(String value) {
            addCriterion("opp_notify =", value, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyNotEqualTo(String value) {
            addCriterion("opp_notify <>", value, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyGreaterThan(String value) {
            addCriterion("opp_notify >", value, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyGreaterThanOrEqualTo(String value) {
            addCriterion("opp_notify >=", value, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyLessThan(String value) {
            addCriterion("opp_notify <", value, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyLessThanOrEqualTo(String value) {
            addCriterion("opp_notify <=", value, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyLike(String value) {
            addCriterion("opp_notify like", value, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyNotLike(String value) {
            addCriterion("opp_notify not like", value, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyIn(List<String> values) {
            addCriterion("opp_notify in", values, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyNotIn(List<String> values) {
            addCriterion("opp_notify not in", values, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyBetween(String value1, String value2) {
            addCriterion("opp_notify between", value1, value2, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andOppNotifyNotBetween(String value1, String value2) {
            addCriterion("opp_notify not between", value1, value2, "oppNotify");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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