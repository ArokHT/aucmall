package scu.huangtao.aucmall.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallOrdersExample() {
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

        public Criteria andMerchIdIsNull() {
            addCriterion("merch_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchIdIsNotNull() {
            addCriterion("merch_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchIdEqualTo(Integer value) {
            addCriterion("merch_id =", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotEqualTo(Integer value) {
            addCriterion("merch_id <>", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdGreaterThan(Integer value) {
            addCriterion("merch_id >", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merch_id >=", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdLessThan(Integer value) {
            addCriterion("merch_id <", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdLessThanOrEqualTo(Integer value) {
            addCriterion("merch_id <=", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdIn(List<Integer> values) {
            addCriterion("merch_id in", values, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotIn(List<Integer> values) {
            addCriterion("merch_id not in", values, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdBetween(Integer value1, Integer value2) {
            addCriterion("merch_id between", value1, value2, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merch_id not between", value1, value2, "merchId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Integer value) {
            addCriterion("owner_id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Integer value) {
            addCriterion("owner_id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Integer value) {
            addCriterion("owner_id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Integer value) {
            addCriterion("owner_id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("owner_id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Integer> values) {
            addCriterion("owner_id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Integer> values) {
            addCriterion("owner_id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("owner_id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_id not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Integer value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Integer value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Integer value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Integer value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Integer> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Integer> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andDealTimeIsNull() {
            addCriterion("deal_time is null");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNotNull() {
            addCriterion("deal_time is not null");
            return (Criteria) this;
        }

        public Criteria andDealTimeEqualTo(Date value) {
            addCriterion("deal_time =", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotEqualTo(Date value) {
            addCriterion("deal_time <>", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThan(Date value) {
            addCriterion("deal_time >", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deal_time >=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThan(Date value) {
            addCriterion("deal_time <", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThanOrEqualTo(Date value) {
            addCriterion("deal_time <=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIn(List<Date> values) {
            addCriterion("deal_time in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotIn(List<Date> values) {
            addCriterion("deal_time not in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeBetween(Date value1, Date value2) {
            addCriterion("deal_time between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotBetween(Date value1, Date value2) {
            addCriterion("deal_time not between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealPriceIsNull() {
            addCriterion("deal_price is null");
            return (Criteria) this;
        }

        public Criteria andDealPriceIsNotNull() {
            addCriterion("deal_price is not null");
            return (Criteria) this;
        }

        public Criteria andDealPriceEqualTo(Integer value) {
            addCriterion("deal_price =", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotEqualTo(Integer value) {
            addCriterion("deal_price <>", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceGreaterThan(Integer value) {
            addCriterion("deal_price >", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_price >=", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLessThan(Integer value) {
            addCriterion("deal_price <", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLessThanOrEqualTo(Integer value) {
            addCriterion("deal_price <=", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceIn(List<Integer> values) {
            addCriterion("deal_price in", values, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotIn(List<Integer> values) {
            addCriterion("deal_price not in", values, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceBetween(Integer value1, Integer value2) {
            addCriterion("deal_price between", value1, value2, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_price not between", value1, value2, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andIsCanceledIsNull() {
            addCriterion("is_canceled is null");
            return (Criteria) this;
        }

        public Criteria andIsCanceledIsNotNull() {
            addCriterion("is_canceled is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanceledEqualTo(Boolean value) {
            addCriterion("is_canceled =", value, "isCanceled");
            return (Criteria) this;
        }

        public Criteria andIsCanceledNotEqualTo(Boolean value) {
            addCriterion("is_canceled <>", value, "isCanceled");
            return (Criteria) this;
        }

        public Criteria andIsCanceledGreaterThan(Boolean value) {
            addCriterion("is_canceled >", value, "isCanceled");
            return (Criteria) this;
        }

        public Criteria andIsCanceledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_canceled >=", value, "isCanceled");
            return (Criteria) this;
        }

        public Criteria andIsCanceledLessThan(Boolean value) {
            addCriterion("is_canceled <", value, "isCanceled");
            return (Criteria) this;
        }

        public Criteria andIsCanceledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_canceled <=", value, "isCanceled");
            return (Criteria) this;
        }

        public Criteria andIsCanceledIn(List<Boolean> values) {
            addCriterion("is_canceled in", values, "isCanceled");
            return (Criteria) this;
        }

        public Criteria andIsCanceledNotIn(List<Boolean> values) {
            addCriterion("is_canceled not in", values, "isCanceled");
            return (Criteria) this;
        }

        public Criteria andIsCanceledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_canceled between", value1, value2, "isCanceled");
            return (Criteria) this;
        }

        public Criteria andIsCanceledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_canceled not between", value1, value2, "isCanceled");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredIsNull() {
            addCriterion("is_delivered is null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredIsNotNull() {
            addCriterion("is_delivered is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredEqualTo(Boolean value) {
            addCriterion("is_delivered =", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredNotEqualTo(Boolean value) {
            addCriterion("is_delivered <>", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredGreaterThan(Boolean value) {
            addCriterion("is_delivered >", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delivered >=", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredLessThan(Boolean value) {
            addCriterion("is_delivered <", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delivered <=", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredIn(List<Boolean> values) {
            addCriterion("is_delivered in", values, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredNotIn(List<Boolean> values) {
            addCriterion("is_delivered not in", values, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delivered between", value1, value2, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delivered not between", value1, value2, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsReceivedIsNull() {
            addCriterion("is_received is null");
            return (Criteria) this;
        }

        public Criteria andIsReceivedIsNotNull() {
            addCriterion("is_received is not null");
            return (Criteria) this;
        }

        public Criteria andIsReceivedEqualTo(Boolean value) {
            addCriterion("is_received =", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedNotEqualTo(Boolean value) {
            addCriterion("is_received <>", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedGreaterThan(Boolean value) {
            addCriterion("is_received >", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_received >=", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedLessThan(Boolean value) {
            addCriterion("is_received <", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_received <=", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedIn(List<Boolean> values) {
            addCriterion("is_received in", values, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedNotIn(List<Boolean> values) {
            addCriterion("is_received not in", values, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_received between", value1, value2, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_received not between", value1, value2, "isReceived");
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