pragma solidity ^0.5.0;

contract Auctions {
    //mapping类型存储拍卖的key、value
    mapping (uint=>auction) auctions;
    //拍卖
    struct auction{
        uint merchId;//商品id
        uint sellerId;//拥有者id
        address payable sellerAddress;
        uint highestBidderId;//当前最高出价者id
        address payable highestAddress;
        address payable latestAddress;
        uint highestPrice;//当前最高出价
        bool onBid;//拍卖进行中或已结束
    }
    //开始拍卖
    function start(uint merchid,uint sellerid,uint highestbidderid,uint highestprice,address payable sellerAddress) public returns(bool){
        auction memory auc=auction(merchid,sellerid,sellerAddress,highestbidderid,0x0000000000000000000000000000000000000000,0x0000000000000000000000000000000000000000,highestprice,true);
        auctions[merchid]=auc;
        return true;
    }
    //用户参与竞拍
    function getBid(uint merchid,uint bidderid,uint bidprice) public returns(bool){
        if(auctions[merchid].highestPrice<bidprice&&auctions[merchid].onBid==true){
            auctions[merchid].highestPrice=bidprice;
            auctions[merchid].highestBidderId=bidderid;
            auctions[merchid].highestAddress=msg.sender;
            auctions[merchid].latestAddress=msg.sender;
            return true;
        }
        return false;
    }
    function isChanged(uint merchid,uint bidderid,uint bidprice) public view returns(bool){
        if(bidderid==auctions[merchid].highestBidderId&&bidprice==auctions[merchid].highestPrice){
            return true;
        }
        return false;
    }
    //返回指定拍卖信息
    function getAucInfo(uint merchid) public view returns(uint,uint,uint,bool,address){
        return (auctions[merchid].merchId,auctions[merchid].highestBidderId,auctions[merchid].highestPrice,auctions[merchid].onBid,auctions[merchid].highestAddress);
    }
    //结束竞拍
    function end(uint merchid) public returns(bool){
        auctions[merchid].onBid=false;
        return true;
    }
}
