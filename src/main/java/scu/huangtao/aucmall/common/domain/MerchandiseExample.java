package scu.huangtao.aucmall.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchandiseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchandiseExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(String value) {
            addCriterion("kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(String value) {
            addCriterion("kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(String value) {
            addCriterion("kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(String value) {
            addCriterion("kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(String value) {
            addCriterion("kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(String value) {
            addCriterion("kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLike(String value) {
            addCriterion("kind like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotLike(String value) {
            addCriterion("kind not like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<String> values) {
            addCriterion("kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<String> values) {
            addCriterion("kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(String value1, String value2) {
            addCriterion("kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(String value1, String value2) {
            addCriterion("kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andAddedTimeIsNull() {
            addCriterion("added_time is null");
            return (Criteria) this;
        }

        public Criteria andAddedTimeIsNotNull() {
            addCriterion("added_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddedTimeEqualTo(Date value) {
            addCriterion("added_time =", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeNotEqualTo(Date value) {
            addCriterion("added_time <>", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeGreaterThan(Date value) {
            addCriterion("added_time >", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("added_time >=", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeLessThan(Date value) {
            addCriterion("added_time <", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeLessThanOrEqualTo(Date value) {
            addCriterion("added_time <=", value, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeIn(List<Date> values) {
            addCriterion("added_time in", values, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeNotIn(List<Date> values) {
            addCriterion("added_time not in", values, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeBetween(Date value1, Date value2) {
            addCriterion("added_time between", value1, value2, "addedTime");
            return (Criteria) this;
        }

        public Criteria andAddedTimeNotBetween(Date value1, Date value2) {
            addCriterion("added_time not between", value1, value2, "addedTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNull() {
            addCriterion("stop_time is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(Date value) {
            addCriterion("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(Date value) {
            addCriterion("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(Date value) {
            addCriterion("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(Date value) {
            addCriterion("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(Date value) {
            addCriterion("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<Date> values) {
            addCriterion("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<Date> values) {
            addCriterion("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(Date value1, Date value2) {
            addCriterion("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(Date value1, Date value2) {
            addCriterion("stop_time not between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionIsNull() {
            addCriterion("open_auction is null");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionIsNotNull() {
            addCriterion("open_auction is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionEqualTo(Boolean value) {
            addCriterion("open_auction =", value, "openAuction");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionNotEqualTo(Boolean value) {
            addCriterion("open_auction <>", value, "openAuction");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionGreaterThan(Boolean value) {
            addCriterion("open_auction >", value, "openAuction");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("open_auction >=", value, "openAuction");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionLessThan(Boolean value) {
            addCriterion("open_auction <", value, "openAuction");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionLessThanOrEqualTo(Boolean value) {
            addCriterion("open_auction <=", value, "openAuction");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionIn(List<Boolean> values) {
            addCriterion("open_auction in", values, "openAuction");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionNotIn(List<Boolean> values) {
            addCriterion("open_auction not in", values, "openAuction");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionBetween(Boolean value1, Boolean value2) {
            addCriterion("open_auction between", value1, value2, "openAuction");
            return (Criteria) this;
        }

        public Criteria andOpenAuctionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("open_auction not between", value1, value2, "openAuction");
            return (Criteria) this;
        }

        public Criteria andReservePriceIsNull() {
            addCriterion("reserve_price is null");
            return (Criteria) this;
        }

        public Criteria andReservePriceIsNotNull() {
            addCriterion("reserve_price is not null");
            return (Criteria) this;
        }

        public Criteria andReservePriceEqualTo(Integer value) {
            addCriterion("reserve_price =", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotEqualTo(Integer value) {
            addCriterion("reserve_price <>", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceGreaterThan(Integer value) {
            addCriterion("reserve_price >", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve_price >=", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceLessThan(Integer value) {
            addCriterion("reserve_price <", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceLessThanOrEqualTo(Integer value) {
            addCriterion("reserve_price <=", value, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceIn(List<Integer> values) {
            addCriterion("reserve_price in", values, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotIn(List<Integer> values) {
            addCriterion("reserve_price not in", values, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceBetween(Integer value1, Integer value2) {
            addCriterion("reserve_price between", value1, value2, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andReservePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("reserve_price not between", value1, value2, "reservePrice");
            return (Criteria) this;
        }

        public Criteria andOnSaleIsNull() {
            addCriterion("on_sale is null");
            return (Criteria) this;
        }

        public Criteria andOnSaleIsNotNull() {
            addCriterion("on_sale is not null");
            return (Criteria) this;
        }

        public Criteria andOnSaleEqualTo(Boolean value) {
            addCriterion("on_sale =", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleNotEqualTo(Boolean value) {
            addCriterion("on_sale <>", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleGreaterThan(Boolean value) {
            addCriterion("on_sale >", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("on_sale >=", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleLessThan(Boolean value) {
            addCriterion("on_sale <", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleLessThanOrEqualTo(Boolean value) {
            addCriterion("on_sale <=", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleIn(List<Boolean> values) {
            addCriterion("on_sale in", values, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleNotIn(List<Boolean> values) {
            addCriterion("on_sale not in", values, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleBetween(Boolean value1, Boolean value2) {
            addCriterion("on_sale between", value1, value2, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("on_sale not between", value1, value2, "onSale");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceIsNull() {
            addCriterion("have_highest_price is null");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceIsNotNull() {
            addCriterion("have_highest_price is not null");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceEqualTo(Boolean value) {
            addCriterion("have_highest_price =", value, "haveHighestPrice");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceNotEqualTo(Boolean value) {
            addCriterion("have_highest_price <>", value, "haveHighestPrice");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceGreaterThan(Boolean value) {
            addCriterion("have_highest_price >", value, "haveHighestPrice");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("have_highest_price >=", value, "haveHighestPrice");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceLessThan(Boolean value) {
            addCriterion("have_highest_price <", value, "haveHighestPrice");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceLessThanOrEqualTo(Boolean value) {
            addCriterion("have_highest_price <=", value, "haveHighestPrice");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceIn(List<Boolean> values) {
            addCriterion("have_highest_price in", values, "haveHighestPrice");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceNotIn(List<Boolean> values) {
            addCriterion("have_highest_price not in", values, "haveHighestPrice");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceBetween(Boolean value1, Boolean value2) {
            addCriterion("have_highest_price between", value1, value2, "haveHighestPrice");
            return (Criteria) this;
        }

        public Criteria andHaveHighestPriceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("have_highest_price not between", value1, value2, "haveHighestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceIsNull() {
            addCriterion("highest_price is null");
            return (Criteria) this;
        }

        public Criteria andHighestPriceIsNotNull() {
            addCriterion("highest_price is not null");
            return (Criteria) this;
        }

        public Criteria andHighestPriceEqualTo(Integer value) {
            addCriterion("highest_price =", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceNotEqualTo(Integer value) {
            addCriterion("highest_price <>", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceGreaterThan(Integer value) {
            addCriterion("highest_price >", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("highest_price >=", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceLessThan(Integer value) {
            addCriterion("highest_price <", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceLessThanOrEqualTo(Integer value) {
            addCriterion("highest_price <=", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceIn(List<Integer> values) {
            addCriterion("highest_price in", values, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceNotIn(List<Integer> values) {
            addCriterion("highest_price not in", values, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceBetween(Integer value1, Integer value2) {
            addCriterion("highest_price between", value1, value2, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("highest_price not between", value1, value2, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceIsNull() {
            addCriterion("current_bid_price is null");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceIsNotNull() {
            addCriterion("current_bid_price is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceEqualTo(Integer value) {
            addCriterion("current_bid_price =", value, "currentBidPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceNotEqualTo(Integer value) {
            addCriterion("current_bid_price <>", value, "currentBidPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceGreaterThan(Integer value) {
            addCriterion("current_bid_price >", value, "currentBidPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_bid_price >=", value, "currentBidPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceLessThan(Integer value) {
            addCriterion("current_bid_price <", value, "currentBidPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceLessThanOrEqualTo(Integer value) {
            addCriterion("current_bid_price <=", value, "currentBidPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceIn(List<Integer> values) {
            addCriterion("current_bid_price in", values, "currentBidPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceNotIn(List<Integer> values) {
            addCriterion("current_bid_price not in", values, "currentBidPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceBetween(Integer value1, Integer value2) {
            addCriterion("current_bid_price between", value1, value2, "currentBidPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentBidPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("current_bid_price not between", value1, value2, "currentBidPrice");
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

        public Criteria andLeastEachPriceIncreaseIsNull() {
            addCriterion("least_each_price_increase is null");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseIsNotNull() {
            addCriterion("least_each_price_increase is not null");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseEqualTo(Integer value) {
            addCriterion("least_each_price_increase =", value, "leastEachPriceIncrease");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseNotEqualTo(Integer value) {
            addCriterion("least_each_price_increase <>", value, "leastEachPriceIncrease");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseGreaterThan(Integer value) {
            addCriterion("least_each_price_increase >", value, "leastEachPriceIncrease");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("least_each_price_increase >=", value, "leastEachPriceIncrease");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseLessThan(Integer value) {
            addCriterion("least_each_price_increase <", value, "leastEachPriceIncrease");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseLessThanOrEqualTo(Integer value) {
            addCriterion("least_each_price_increase <=", value, "leastEachPriceIncrease");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseIn(List<Integer> values) {
            addCriterion("least_each_price_increase in", values, "leastEachPriceIncrease");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseNotIn(List<Integer> values) {
            addCriterion("least_each_price_increase not in", values, "leastEachPriceIncrease");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseBetween(Integer value1, Integer value2) {
            addCriterion("least_each_price_increase between", value1, value2, "leastEachPriceIncrease");
            return (Criteria) this;
        }

        public Criteria andLeastEachPriceIncreaseNotBetween(Integer value1, Integer value2) {
            addCriterion("least_each_price_increase not between", value1, value2, "leastEachPriceIncrease");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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