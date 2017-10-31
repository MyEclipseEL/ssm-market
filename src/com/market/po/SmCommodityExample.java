package com.market.po;

import java.util.ArrayList;
import java.util.List;

public class SmCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmCommodityExample() {
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

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Integer value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Integer value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Integer value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Integer value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Integer> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Integer> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Integer value1, Integer value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_id not between", value1, value2, "comId");
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

        public Criteria andSupIdIsNull() {
            addCriterion("sup_id is null");
            return (Criteria) this;
        }

        public Criteria andSupIdIsNotNull() {
            addCriterion("sup_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupIdEqualTo(Integer value) {
            addCriterion("sup_id =", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotEqualTo(Integer value) {
            addCriterion("sup_id <>", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThan(Integer value) {
            addCriterion("sup_id >", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sup_id >=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThan(Integer value) {
            addCriterion("sup_id <", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThanOrEqualTo(Integer value) {
            addCriterion("sup_id <=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdIn(List<Integer> values) {
            addCriterion("sup_id in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotIn(List<Integer> values) {
            addCriterion("sup_id not in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdBetween(Integer value1, Integer value2) {
            addCriterion("sup_id between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sup_id not between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andComNameIsNull() {
            addCriterion("com_name is null");
            return (Criteria) this;
        }

        public Criteria andComNameIsNotNull() {
            addCriterion("com_name is not null");
            return (Criteria) this;
        }

        public Criteria andComNameEqualTo(String value) {
            addCriterion("com_name =", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotEqualTo(String value) {
            addCriterion("com_name <>", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThan(String value) {
            addCriterion("com_name >", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThanOrEqualTo(String value) {
            addCriterion("com_name >=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThan(String value) {
            addCriterion("com_name <", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThanOrEqualTo(String value) {
            addCriterion("com_name <=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLike(String value) {
            addCriterion("com_name like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotLike(String value) {
            addCriterion("com_name not like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameIn(List<String> values) {
            addCriterion("com_name in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotIn(List<String> values) {
            addCriterion("com_name not in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameBetween(String value1, String value2) {
            addCriterion("com_name between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotBetween(String value1, String value2) {
            addCriterion("com_name not between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andComNumIsNull() {
            addCriterion("com_num is null");
            return (Criteria) this;
        }

        public Criteria andComNumIsNotNull() {
            addCriterion("com_num is not null");
            return (Criteria) this;
        }

        public Criteria andComNumEqualTo(String value) {
            addCriterion("com_num =", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumNotEqualTo(String value) {
            addCriterion("com_num <>", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumGreaterThan(String value) {
            addCriterion("com_num >", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumGreaterThanOrEqualTo(String value) {
            addCriterion("com_num >=", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumLessThan(String value) {
            addCriterion("com_num <", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumLessThanOrEqualTo(String value) {
            addCriterion("com_num <=", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumLike(String value) {
            addCriterion("com_num like", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumNotLike(String value) {
            addCriterion("com_num not like", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumIn(List<String> values) {
            addCriterion("com_num in", values, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumNotIn(List<String> values) {
            addCriterion("com_num not in", values, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumBetween(String value1, String value2) {
            addCriterion("com_num between", value1, value2, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumNotBetween(String value1, String value2) {
            addCriterion("com_num not between", value1, value2, "comNum");
            return (Criteria) this;
        }

        public Criteria andComStateIsNull() {
            addCriterion("com_state is null");
            return (Criteria) this;
        }

        public Criteria andComStateIsNotNull() {
            addCriterion("com_state is not null");
            return (Criteria) this;
        }

        public Criteria andComStateEqualTo(Integer value) {
            addCriterion("com_state =", value, "comState");
            return (Criteria) this;
        }

        public Criteria andComStateNotEqualTo(Integer value) {
            addCriterion("com_state <>", value, "comState");
            return (Criteria) this;
        }

        public Criteria andComStateGreaterThan(Integer value) {
            addCriterion("com_state >", value, "comState");
            return (Criteria) this;
        }

        public Criteria andComStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_state >=", value, "comState");
            return (Criteria) this;
        }

        public Criteria andComStateLessThan(Integer value) {
            addCriterion("com_state <", value, "comState");
            return (Criteria) this;
        }

        public Criteria andComStateLessThanOrEqualTo(Integer value) {
            addCriterion("com_state <=", value, "comState");
            return (Criteria) this;
        }

        public Criteria andComStateIn(List<Integer> values) {
            addCriterion("com_state in", values, "comState");
            return (Criteria) this;
        }

        public Criteria andComStateNotIn(List<Integer> values) {
            addCriterion("com_state not in", values, "comState");
            return (Criteria) this;
        }

        public Criteria andComStateBetween(Integer value1, Integer value2) {
            addCriterion("com_state between", value1, value2, "comState");
            return (Criteria) this;
        }

        public Criteria andComStateNotBetween(Integer value1, Integer value2) {
            addCriterion("com_state not between", value1, value2, "comState");
            return (Criteria) this;
        }

        public Criteria andComBrandIsNull() {
            addCriterion("com_brand is null");
            return (Criteria) this;
        }

        public Criteria andComBrandIsNotNull() {
            addCriterion("com_brand is not null");
            return (Criteria) this;
        }

        public Criteria andComBrandEqualTo(String value) {
            addCriterion("com_brand =", value, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandNotEqualTo(String value) {
            addCriterion("com_brand <>", value, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandGreaterThan(String value) {
            addCriterion("com_brand >", value, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandGreaterThanOrEqualTo(String value) {
            addCriterion("com_brand >=", value, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandLessThan(String value) {
            addCriterion("com_brand <", value, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandLessThanOrEqualTo(String value) {
            addCriterion("com_brand <=", value, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandLike(String value) {
            addCriterion("com_brand like", value, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandNotLike(String value) {
            addCriterion("com_brand not like", value, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandIn(List<String> values) {
            addCriterion("com_brand in", values, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandNotIn(List<String> values) {
            addCriterion("com_brand not in", values, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandBetween(String value1, String value2) {
            addCriterion("com_brand between", value1, value2, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComBrandNotBetween(String value1, String value2) {
            addCriterion("com_brand not between", value1, value2, "comBrand");
            return (Criteria) this;
        }

        public Criteria andComProducedIsNull() {
            addCriterion("com_produced is null");
            return (Criteria) this;
        }

        public Criteria andComProducedIsNotNull() {
            addCriterion("com_produced is not null");
            return (Criteria) this;
        }

        public Criteria andComProducedEqualTo(String value) {
            addCriterion("com_produced =", value, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedNotEqualTo(String value) {
            addCriterion("com_produced <>", value, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedGreaterThan(String value) {
            addCriterion("com_produced >", value, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedGreaterThanOrEqualTo(String value) {
            addCriterion("com_produced >=", value, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedLessThan(String value) {
            addCriterion("com_produced <", value, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedLessThanOrEqualTo(String value) {
            addCriterion("com_produced <=", value, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedLike(String value) {
            addCriterion("com_produced like", value, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedNotLike(String value) {
            addCriterion("com_produced not like", value, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedIn(List<String> values) {
            addCriterion("com_produced in", values, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedNotIn(List<String> values) {
            addCriterion("com_produced not in", values, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedBetween(String value1, String value2) {
            addCriterion("com_produced between", value1, value2, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComProducedNotBetween(String value1, String value2) {
            addCriterion("com_produced not between", value1, value2, "comProduced");
            return (Criteria) this;
        }

        public Criteria andComEslIsNull() {
            addCriterion("com_ESL is null");
            return (Criteria) this;
        }

        public Criteria andComEslIsNotNull() {
            addCriterion("com_ESL is not null");
            return (Criteria) this;
        }

        public Criteria andComEslEqualTo(String value) {
            addCriterion("com_ESL =", value, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslNotEqualTo(String value) {
            addCriterion("com_ESL <>", value, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslGreaterThan(String value) {
            addCriterion("com_ESL >", value, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslGreaterThanOrEqualTo(String value) {
            addCriterion("com_ESL >=", value, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslLessThan(String value) {
            addCriterion("com_ESL <", value, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslLessThanOrEqualTo(String value) {
            addCriterion("com_ESL <=", value, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslLike(String value) {
            addCriterion("com_ESL like", value, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslNotLike(String value) {
            addCriterion("com_ESL not like", value, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslIn(List<String> values) {
            addCriterion("com_ESL in", values, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslNotIn(List<String> values) {
            addCriterion("com_ESL not in", values, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslBetween(String value1, String value2) {
            addCriterion("com_ESL between", value1, value2, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComEslNotBetween(String value1, String value2) {
            addCriterion("com_ESL not between", value1, value2, "comEsl");
            return (Criteria) this;
        }

        public Criteria andComDiscountIsNull() {
            addCriterion("com_discount is null");
            return (Criteria) this;
        }

        public Criteria andComDiscountIsNotNull() {
            addCriterion("com_discount is not null");
            return (Criteria) this;
        }

        public Criteria andComDiscountEqualTo(String value) {
            addCriterion("com_discount =", value, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountNotEqualTo(String value) {
            addCriterion("com_discount <>", value, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountGreaterThan(String value) {
            addCriterion("com_discount >", value, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("com_discount >=", value, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountLessThan(String value) {
            addCriterion("com_discount <", value, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountLessThanOrEqualTo(String value) {
            addCriterion("com_discount <=", value, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountLike(String value) {
            addCriterion("com_discount like", value, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountNotLike(String value) {
            addCriterion("com_discount not like", value, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountIn(List<String> values) {
            addCriterion("com_discount in", values, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountNotIn(List<String> values) {
            addCriterion("com_discount not in", values, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountBetween(String value1, String value2) {
            addCriterion("com_discount between", value1, value2, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComDiscountNotBetween(String value1, String value2) {
            addCriterion("com_discount not between", value1, value2, "comDiscount");
            return (Criteria) this;
        }

        public Criteria andComSellpriceIsNull() {
            addCriterion("com_sellprice is null");
            return (Criteria) this;
        }

        public Criteria andComSellpriceIsNotNull() {
            addCriterion("com_sellprice is not null");
            return (Criteria) this;
        }

        public Criteria andComSellpriceEqualTo(String value) {
            addCriterion("com_sellprice =", value, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceNotEqualTo(String value) {
            addCriterion("com_sellprice <>", value, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceGreaterThan(String value) {
            addCriterion("com_sellprice >", value, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceGreaterThanOrEqualTo(String value) {
            addCriterion("com_sellprice >=", value, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceLessThan(String value) {
            addCriterion("com_sellprice <", value, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceLessThanOrEqualTo(String value) {
            addCriterion("com_sellprice <=", value, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceLike(String value) {
            addCriterion("com_sellprice like", value, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceNotLike(String value) {
            addCriterion("com_sellprice not like", value, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceIn(List<String> values) {
            addCriterion("com_sellprice in", values, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceNotIn(List<String> values) {
            addCriterion("com_sellprice not in", values, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceBetween(String value1, String value2) {
            addCriterion("com_sellprice between", value1, value2, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComSellpriceNotBetween(String value1, String value2) {
            addCriterion("com_sellprice not between", value1, value2, "comSellprice");
            return (Criteria) this;
        }

        public Criteria andComUnitIsNull() {
            addCriterion("com_unit is null");
            return (Criteria) this;
        }

        public Criteria andComUnitIsNotNull() {
            addCriterion("com_unit is not null");
            return (Criteria) this;
        }

        public Criteria andComUnitEqualTo(String value) {
            addCriterion("com_unit =", value, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitNotEqualTo(String value) {
            addCriterion("com_unit <>", value, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitGreaterThan(String value) {
            addCriterion("com_unit >", value, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitGreaterThanOrEqualTo(String value) {
            addCriterion("com_unit >=", value, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitLessThan(String value) {
            addCriterion("com_unit <", value, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitLessThanOrEqualTo(String value) {
            addCriterion("com_unit <=", value, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitLike(String value) {
            addCriterion("com_unit like", value, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitNotLike(String value) {
            addCriterion("com_unit not like", value, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitIn(List<String> values) {
            addCriterion("com_unit in", values, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitNotIn(List<String> values) {
            addCriterion("com_unit not in", values, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitBetween(String value1, String value2) {
            addCriterion("com_unit between", value1, value2, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComUnitNotBetween(String value1, String value2) {
            addCriterion("com_unit not between", value1, value2, "comUnit");
            return (Criteria) this;
        }

        public Criteria andComCountIsNull() {
            addCriterion("com_count is null");
            return (Criteria) this;
        }

        public Criteria andComCountIsNotNull() {
            addCriterion("com_count is not null");
            return (Criteria) this;
        }

        public Criteria andComCountEqualTo(Integer value) {
            addCriterion("com_count =", value, "comCount");
            return (Criteria) this;
        }

        public Criteria andComCountNotEqualTo(Integer value) {
            addCriterion("com_count <>", value, "comCount");
            return (Criteria) this;
        }

        public Criteria andComCountGreaterThan(Integer value) {
            addCriterion("com_count >", value, "comCount");
            return (Criteria) this;
        }

        public Criteria andComCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_count >=", value, "comCount");
            return (Criteria) this;
        }

        public Criteria andComCountLessThan(Integer value) {
            addCriterion("com_count <", value, "comCount");
            return (Criteria) this;
        }

        public Criteria andComCountLessThanOrEqualTo(Integer value) {
            addCriterion("com_count <=", value, "comCount");
            return (Criteria) this;
        }

        public Criteria andComCountIn(List<Integer> values) {
            addCriterion("com_count in", values, "comCount");
            return (Criteria) this;
        }

        public Criteria andComCountNotIn(List<Integer> values) {
            addCriterion("com_count not in", values, "comCount");
            return (Criteria) this;
        }

        public Criteria andComCountBetween(Integer value1, Integer value2) {
            addCriterion("com_count between", value1, value2, "comCount");
            return (Criteria) this;
        }

        public Criteria andComCountNotBetween(Integer value1, Integer value2) {
            addCriterion("com_count not between", value1, value2, "comCount");
            return (Criteria) this;
        }

        public Criteria andComRedlineIsNull() {
            addCriterion("com_redLine is null");
            return (Criteria) this;
        }

        public Criteria andComRedlineIsNotNull() {
            addCriterion("com_redLine is not null");
            return (Criteria) this;
        }

        public Criteria andComRedlineEqualTo(Integer value) {
            addCriterion("com_redLine =", value, "comRedline");
            return (Criteria) this;
        }

        public Criteria andComRedlineNotEqualTo(Integer value) {
            addCriterion("com_redLine <>", value, "comRedline");
            return (Criteria) this;
        }

        public Criteria andComRedlineGreaterThan(Integer value) {
            addCriterion("com_redLine >", value, "comRedline");
            return (Criteria) this;
        }

        public Criteria andComRedlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_redLine >=", value, "comRedline");
            return (Criteria) this;
        }

        public Criteria andComRedlineLessThan(Integer value) {
            addCriterion("com_redLine <", value, "comRedline");
            return (Criteria) this;
        }

        public Criteria andComRedlineLessThanOrEqualTo(Integer value) {
            addCriterion("com_redLine <=", value, "comRedline");
            return (Criteria) this;
        }

        public Criteria andComRedlineIn(List<Integer> values) {
            addCriterion("com_redLine in", values, "comRedline");
            return (Criteria) this;
        }

        public Criteria andComRedlineNotIn(List<Integer> values) {
            addCriterion("com_redLine not in", values, "comRedline");
            return (Criteria) this;
        }

        public Criteria andComRedlineBetween(Integer value1, Integer value2) {
            addCriterion("com_redLine between", value1, value2, "comRedline");
            return (Criteria) this;
        }

        public Criteria andComRedlineNotBetween(Integer value1, Integer value2) {
            addCriterion("com_redLine not between", value1, value2, "comRedline");
            return (Criteria) this;
        }

        public Criteria andShelfIdIsNull() {
            addCriterion("shelf_id is null");
            return (Criteria) this;
        }

        public Criteria andShelfIdIsNotNull() {
            addCriterion("shelf_id is not null");
            return (Criteria) this;
        }

        public Criteria andShelfIdEqualTo(Integer value) {
            addCriterion("shelf_id =", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotEqualTo(Integer value) {
            addCriterion("shelf_id <>", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdGreaterThan(Integer value) {
            addCriterion("shelf_id >", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shelf_id >=", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdLessThan(Integer value) {
            addCriterion("shelf_id <", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdLessThanOrEqualTo(Integer value) {
            addCriterion("shelf_id <=", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdIn(List<Integer> values) {
            addCriterion("shelf_id in", values, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotIn(List<Integer> values) {
            addCriterion("shelf_id not in", values, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdBetween(Integer value1, Integer value2) {
            addCriterion("shelf_id between", value1, value2, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shelf_id not between", value1, value2, "shelfId");
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