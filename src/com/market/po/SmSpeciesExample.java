package com.market.po;

import java.util.ArrayList;
import java.util.List;

public class SmSpeciesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmSpeciesExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKIdIsNull() {
            addCriterion("k_id is null");
            return (Criteria) this;
        }

        public Criteria andKIdIsNotNull() {
            addCriterion("k_id is not null");
            return (Criteria) this;
        }

        public Criteria andKIdEqualTo(Integer value) {
            addCriterion("k_id =", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotEqualTo(Integer value) {
            addCriterion("k_id <>", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdGreaterThan(Integer value) {
            addCriterion("k_id >", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("k_id >=", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLessThan(Integer value) {
            addCriterion("k_id <", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLessThanOrEqualTo(Integer value) {
            addCriterion("k_id <=", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdIn(List<Integer> values) {
            addCriterion("k_id in", values, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotIn(List<Integer> values) {
            addCriterion("k_id not in", values, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdBetween(Integer value1, Integer value2) {
            addCriterion("k_id between", value1, value2, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotBetween(Integer value1, Integer value2) {
            addCriterion("k_id not between", value1, value2, "kId");
            return (Criteria) this;
        }

        public Criteria andKNameIsNull() {
            addCriterion("k_name is null");
            return (Criteria) this;
        }

        public Criteria andKNameIsNotNull() {
            addCriterion("k_name is not null");
            return (Criteria) this;
        }

        public Criteria andKNameEqualTo(String value) {
            addCriterion("k_name =", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotEqualTo(String value) {
            addCriterion("k_name <>", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameGreaterThan(String value) {
            addCriterion("k_name >", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameGreaterThanOrEqualTo(String value) {
            addCriterion("k_name >=", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLessThan(String value) {
            addCriterion("k_name <", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLessThanOrEqualTo(String value) {
            addCriterion("k_name <=", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLike(String value) {
            addCriterion("k_name like", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotLike(String value) {
            addCriterion("k_name not like", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameIn(List<String> values) {
            addCriterion("k_name in", values, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotIn(List<String> values) {
            addCriterion("k_name not in", values, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameBetween(String value1, String value2) {
            addCriterion("k_name between", value1, value2, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotBetween(String value1, String value2) {
            addCriterion("k_name not between", value1, value2, "kName");
            return (Criteria) this;
        }

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andKAcronymIsNull() {
            addCriterion("k_acronym is null");
            return (Criteria) this;
        }

        public Criteria andKAcronymIsNotNull() {
            addCriterion("k_acronym is not null");
            return (Criteria) this;
        }

        public Criteria andKAcronymEqualTo(String value) {
            addCriterion("k_acronym =", value, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymNotEqualTo(String value) {
            addCriterion("k_acronym <>", value, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymGreaterThan(String value) {
            addCriterion("k_acronym >", value, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymGreaterThanOrEqualTo(String value) {
            addCriterion("k_acronym >=", value, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymLessThan(String value) {
            addCriterion("k_acronym <", value, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymLessThanOrEqualTo(String value) {
            addCriterion("k_acronym <=", value, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymLike(String value) {
            addCriterion("k_acronym like", value, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymNotLike(String value) {
            addCriterion("k_acronym not like", value, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymIn(List<String> values) {
            addCriterion("k_acronym in", values, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymNotIn(List<String> values) {
            addCriterion("k_acronym not in", values, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymBetween(String value1, String value2) {
            addCriterion("k_acronym between", value1, value2, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKAcronymNotBetween(String value1, String value2) {
            addCriterion("k_acronym not between", value1, value2, "kAcronym");
            return (Criteria) this;
        }

        public Criteria andKRemarkIsNull() {
            addCriterion("k_remark is null");
            return (Criteria) this;
        }

        public Criteria andKRemarkIsNotNull() {
            addCriterion("k_remark is not null");
            return (Criteria) this;
        }

        public Criteria andKRemarkEqualTo(String value) {
            addCriterion("k_remark =", value, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkNotEqualTo(String value) {
            addCriterion("k_remark <>", value, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkGreaterThan(String value) {
            addCriterion("k_remark >", value, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("k_remark >=", value, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkLessThan(String value) {
            addCriterion("k_remark <", value, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkLessThanOrEqualTo(String value) {
            addCriterion("k_remark <=", value, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkLike(String value) {
            addCriterion("k_remark like", value, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkNotLike(String value) {
            addCriterion("k_remark not like", value, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkIn(List<String> values) {
            addCriterion("k_remark in", values, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkNotIn(List<String> values) {
            addCriterion("k_remark not in", values, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkBetween(String value1, String value2) {
            addCriterion("k_remark between", value1, value2, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKRemarkNotBetween(String value1, String value2) {
            addCriterion("k_remark not between", value1, value2, "kRemark");
            return (Criteria) this;
        }

        public Criteria andKAIsNull() {
            addCriterion("k_a is null");
            return (Criteria) this;
        }

        public Criteria andKAIsNotNull() {
            addCriterion("k_a is not null");
            return (Criteria) this;
        }

        public Criteria andKAEqualTo(Integer value) {
            addCriterion("k_a =", value, "kA");
            return (Criteria) this;
        }

        public Criteria andKANotEqualTo(Integer value) {
            addCriterion("k_a <>", value, "kA");
            return (Criteria) this;
        }

        public Criteria andKAGreaterThan(Integer value) {
            addCriterion("k_a >", value, "kA");
            return (Criteria) this;
        }

        public Criteria andKAGreaterThanOrEqualTo(Integer value) {
            addCriterion("k_a >=", value, "kA");
            return (Criteria) this;
        }

        public Criteria andKALessThan(Integer value) {
            addCriterion("k_a <", value, "kA");
            return (Criteria) this;
        }

        public Criteria andKALessThanOrEqualTo(Integer value) {
            addCriterion("k_a <=", value, "kA");
            return (Criteria) this;
        }

        public Criteria andKAIn(List<Integer> values) {
            addCriterion("k_a in", values, "kA");
            return (Criteria) this;
        }

        public Criteria andKANotIn(List<Integer> values) {
            addCriterion("k_a not in", values, "kA");
            return (Criteria) this;
        }

        public Criteria andKABetween(Integer value1, Integer value2) {
            addCriterion("k_a between", value1, value2, "kA");
            return (Criteria) this;
        }

        public Criteria andKANotBetween(Integer value1, Integer value2) {
            addCriterion("k_a not between", value1, value2, "kA");
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