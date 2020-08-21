package com.sjm.bill.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PublicBillMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublicBillMainExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBillNameIsNull() {
            addCriterion("BILL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBillNameIsNotNull() {
            addCriterion("BILL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBillNameEqualTo(String value) {
            addCriterion("BILL_NAME =", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotEqualTo(String value) {
            addCriterion("BILL_NAME <>", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameGreaterThan(String value) {
            addCriterion("BILL_NAME >", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_NAME >=", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameLessThan(String value) {
            addCriterion("BILL_NAME <", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameLessThanOrEqualTo(String value) {
            addCriterion("BILL_NAME <=", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameLike(String value) {
            addCriterion("BILL_NAME like", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotLike(String value) {
            addCriterion("BILL_NAME not like", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameIn(List<String> values) {
            addCriterion("BILL_NAME in", values, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotIn(List<String> values) {
            addCriterion("BILL_NAME not in", values, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameBetween(String value1, String value2) {
            addCriterion("BILL_NAME between", value1, value2, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotBetween(String value1, String value2) {
            addCriterion("BILL_NAME not between", value1, value2, "billName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andLableIsNull() {
            addCriterion("LABLE is null");
            return (Criteria) this;
        }

        public Criteria andLableIsNotNull() {
            addCriterion("LABLE is not null");
            return (Criteria) this;
        }

        public Criteria andLableEqualTo(String value) {
            addCriterion("LABLE =", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotEqualTo(String value) {
            addCriterion("LABLE <>", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableGreaterThan(String value) {
            addCriterion("LABLE >", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableGreaterThanOrEqualTo(String value) {
            addCriterion("LABLE >=", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableLessThan(String value) {
            addCriterion("LABLE <", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableLessThanOrEqualTo(String value) {
            addCriterion("LABLE <=", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableLike(String value) {
            addCriterion("LABLE like", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotLike(String value) {
            addCriterion("LABLE not like", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableIn(List<String> values) {
            addCriterion("LABLE in", values, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotIn(List<String> values) {
            addCriterion("LABLE not in", values, "lable");
            return (Criteria) this;
        }

        public Criteria andLableBetween(String value1, String value2) {
            addCriterion("LABLE between", value1, value2, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotBetween(String value1, String value2) {
            addCriterion("LABLE not between", value1, value2, "lable");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutIsNull() {
            addCriterion("TOTLE_AMOUT is null");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutIsNotNull() {
            addCriterion("TOTLE_AMOUT is not null");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutEqualTo(Double value) {
            addCriterion("TOTLE_AMOUT =", value, "totleAmout");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutNotEqualTo(Double value) {
            addCriterion("TOTLE_AMOUT <>", value, "totleAmout");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutGreaterThan(Double value) {
            addCriterion("TOTLE_AMOUT >", value, "totleAmout");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutGreaterThanOrEqualTo(Double value) {
            addCriterion("TOTLE_AMOUT >=", value, "totleAmout");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutLessThan(Double value) {
            addCriterion("TOTLE_AMOUT <", value, "totleAmout");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutLessThanOrEqualTo(Double value) {
            addCriterion("TOTLE_AMOUT <=", value, "totleAmout");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutIn(List<Double> values) {
            addCriterion("TOTLE_AMOUT in", values, "totleAmout");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutNotIn(List<Double> values) {
            addCriterion("TOTLE_AMOUT not in", values, "totleAmout");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutBetween(Double value1, Double value2) {
            addCriterion("TOTLE_AMOUT between", value1, value2, "totleAmout");
            return (Criteria) this;
        }

        public Criteria andTotleAmoutNotBetween(Double value1, Double value2) {
            addCriterion("TOTLE_AMOUT not between", value1, value2, "totleAmout");
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