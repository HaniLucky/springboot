package com.covet.vue.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Integer value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Integer value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Integer value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Integer value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Integer> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Integer> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Integer value1, Integer value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCSexIsNull() {
            addCriterion("c_sex is null");
            return (Criteria) this;
        }

        public Criteria andCSexIsNotNull() {
            addCriterion("c_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCSexEqualTo(String value) {
            addCriterion("c_sex =", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotEqualTo(String value) {
            addCriterion("c_sex <>", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThan(String value) {
            addCriterion("c_sex >", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThanOrEqualTo(String value) {
            addCriterion("c_sex >=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThan(String value) {
            addCriterion("c_sex <", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThanOrEqualTo(String value) {
            addCriterion("c_sex <=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLike(String value) {
            addCriterion("c_sex like", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotLike(String value) {
            addCriterion("c_sex not like", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexIn(List<String> values) {
            addCriterion("c_sex in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotIn(List<String> values) {
            addCriterion("c_sex not in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexBetween(String value1, String value2) {
            addCriterion("c_sex between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotBetween(String value1, String value2) {
            addCriterion("c_sex not between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCAgeIsNull() {
            addCriterion("c_age is null");
            return (Criteria) this;
        }

        public Criteria andCAgeIsNotNull() {
            addCriterion("c_age is not null");
            return (Criteria) this;
        }

        public Criteria andCAgeEqualTo(String value) {
            addCriterion("c_age =", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeNotEqualTo(String value) {
            addCriterion("c_age <>", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeGreaterThan(String value) {
            addCriterion("c_age >", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeGreaterThanOrEqualTo(String value) {
            addCriterion("c_age >=", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeLessThan(String value) {
            addCriterion("c_age <", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeLessThanOrEqualTo(String value) {
            addCriterion("c_age <=", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeLike(String value) {
            addCriterion("c_age like", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeNotLike(String value) {
            addCriterion("c_age not like", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeIn(List<String> values) {
            addCriterion("c_age in", values, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeNotIn(List<String> values) {
            addCriterion("c_age not in", values, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeBetween(String value1, String value2) {
            addCriterion("c_age between", value1, value2, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeNotBetween(String value1, String value2) {
            addCriterion("c_age not between", value1, value2, "cAge");
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