package scu.huangtao.aucmall.common.domain;

import java.util.Date;

public class Merchandise {
    private Integer id;

    private String img;

    private Integer userId;

    private Integer orderId;

    private String name;

    private String mark;

    private String description;

    private String kind;

    private Date addedTime;

    private Date startTime;

    private Date stopTime;

    private Boolean openAuction;

    private Integer reservePrice;

    private Boolean onSale;

    private Boolean haveHighestPrice;

    private Integer highestPrice;

    private Integer currentBidPrice;

    private String status;

    private Integer leastEachPriceIncrease;

    private Boolean isDeleted;

    public Merchandise() {
        this.name="unknow";
        //this.id=1;
        this.userId=0;
        this.description="This is initial";
        this.kind="unknow";
        this.openAuction=true;
        this.reservePrice=0;
        this.onSale=false;
        this.haveHighestPrice=false;
        this.status="sale";
        this.leastEachPriceIncrease=0;
        this.isDeleted=false;
        this.img="1";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Boolean getOpenAuction() {
        return openAuction;
    }

    public void setOpenAuction(Boolean openAuction) {
        this.openAuction = openAuction;
    }

    public Integer getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(Integer reservePrice) {
        this.reservePrice = reservePrice;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    public Boolean getHaveHighestPrice() {
        return haveHighestPrice;
    }

    public void setHaveHighestPrice(Boolean haveHighestPrice) {
        this.haveHighestPrice = haveHighestPrice;
    }

    public Integer getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(Integer highestPrice) {
        this.highestPrice = highestPrice;
    }

    public Integer getCurrentBidPrice() {
        return currentBidPrice;
    }

    public void setCurrentBidPrice(Integer currentBidPrice) {
        this.currentBidPrice = currentBidPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getLeastEachPriceIncrease() {
        return leastEachPriceIncrease;
    }

    public void setLeastEachPriceIncrease(Integer leastEachPriceIncrease) {
        this.leastEachPriceIncrease = leastEachPriceIncrease;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}