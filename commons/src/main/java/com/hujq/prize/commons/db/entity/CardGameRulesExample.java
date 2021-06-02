package com.hujq.prize.commons.db.entity;

import java.util.ArrayList;
import java.util.List;

public class CardGameRulesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    public CardGameRulesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
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

        public Criteria andGameidIsNull() {
            addCriterion("gameid is null");
            return (Criteria) this;
        }

        public Criteria andGameidIsNotNull() {
            addCriterion("gameid is not null");
            return (Criteria) this;
        }

        public Criteria andGameidEqualTo(Integer value) {
            addCriterion("gameid =", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidNotEqualTo(Integer value) {
            addCriterion("gameid <>", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidGreaterThan(Integer value) {
            addCriterion("gameid >", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gameid >=", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidLessThan(Integer value) {
            addCriterion("gameid <", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidLessThanOrEqualTo(Integer value) {
            addCriterion("gameid <=", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidIn(List<Integer> values) {
            addCriterion("gameid in", values, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidNotIn(List<Integer> values) {
            addCriterion("gameid not in", values, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidBetween(Integer value1, Integer value2) {
            addCriterion("gameid between", value1, value2, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidNotBetween(Integer value1, Integer value2) {
            addCriterion("gameid not between", value1, value2, "gameid");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNull() {
            addCriterion("userlevel is null");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNotNull() {
            addCriterion("userlevel is not null");
            return (Criteria) this;
        }

        public Criteria andUserlevelEqualTo(Integer value) {
            addCriterion("userlevel =", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotEqualTo(Integer value) {
            addCriterion("userlevel <>", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThan(Integer value) {
            addCriterion("userlevel >", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("userlevel >=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThan(Integer value) {
            addCriterion("userlevel <", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThanOrEqualTo(Integer value) {
            addCriterion("userlevel <=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelIn(List<Integer> values) {
            addCriterion("userlevel in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotIn(List<Integer> values) {
            addCriterion("userlevel not in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelBetween(Integer value1, Integer value2) {
            addCriterion("userlevel between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("userlevel not between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andEnterTimesIsNull() {
            addCriterion("enter_times is null");
            return (Criteria) this;
        }

        public Criteria andEnterTimesIsNotNull() {
            addCriterion("enter_times is not null");
            return (Criteria) this;
        }

        public Criteria andEnterTimesEqualTo(Integer value) {
            addCriterion("enter_times =", value, "enterTimes");
            return (Criteria) this;
        }

        public Criteria andEnterTimesNotEqualTo(Integer value) {
            addCriterion("enter_times <>", value, "enterTimes");
            return (Criteria) this;
        }

        public Criteria andEnterTimesGreaterThan(Integer value) {
            addCriterion("enter_times >", value, "enterTimes");
            return (Criteria) this;
        }

        public Criteria andEnterTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("enter_times >=", value, "enterTimes");
            return (Criteria) this;
        }

        public Criteria andEnterTimesLessThan(Integer value) {
            addCriterion("enter_times <", value, "enterTimes");
            return (Criteria) this;
        }

        public Criteria andEnterTimesLessThanOrEqualTo(Integer value) {
            addCriterion("enter_times <=", value, "enterTimes");
            return (Criteria) this;
        }

        public Criteria andEnterTimesIn(List<Integer> values) {
            addCriterion("enter_times in", values, "enterTimes");
            return (Criteria) this;
        }

        public Criteria andEnterTimesNotIn(List<Integer> values) {
            addCriterion("enter_times not in", values, "enterTimes");
            return (Criteria) this;
        }

        public Criteria andEnterTimesBetween(Integer value1, Integer value2) {
            addCriterion("enter_times between", value1, value2, "enterTimes");
            return (Criteria) this;
        }

        public Criteria andEnterTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("enter_times not between", value1, value2, "enterTimes");
            return (Criteria) this;
        }

        public Criteria andGoalTimesIsNull() {
            addCriterion("goal_times is null");
            return (Criteria) this;
        }

        public Criteria andGoalTimesIsNotNull() {
            addCriterion("goal_times is not null");
            return (Criteria) this;
        }

        public Criteria andGoalTimesEqualTo(Integer value) {
            addCriterion("goal_times =", value, "goalTimes");
            return (Criteria) this;
        }

        public Criteria andGoalTimesNotEqualTo(Integer value) {
            addCriterion("goal_times <>", value, "goalTimes");
            return (Criteria) this;
        }

        public Criteria andGoalTimesGreaterThan(Integer value) {
            addCriterion("goal_times >", value, "goalTimes");
            return (Criteria) this;
        }

        public Criteria andGoalTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("goal_times >=", value, "goalTimes");
            return (Criteria) this;
        }

        public Criteria andGoalTimesLessThan(Integer value) {
            addCriterion("goal_times <", value, "goalTimes");
            return (Criteria) this;
        }

        public Criteria andGoalTimesLessThanOrEqualTo(Integer value) {
            addCriterion("goal_times <=", value, "goalTimes");
            return (Criteria) this;
        }

        public Criteria andGoalTimesIn(List<Integer> values) {
            addCriterion("goal_times in", values, "goalTimes");
            return (Criteria) this;
        }

        public Criteria andGoalTimesNotIn(List<Integer> values) {
            addCriterion("goal_times not in", values, "goalTimes");
            return (Criteria) this;
        }

        public Criteria andGoalTimesBetween(Integer value1, Integer value2) {
            addCriterion("goal_times between", value1, value2, "goalTimes");
            return (Criteria) this;
        }

        public Criteria andGoalTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("goal_times not between", value1, value2, "goalTimes");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table card_game_rules
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
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