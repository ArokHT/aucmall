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
        mapping (address => uint) pendingReturns;//出价表
    }
    //开始拍卖
    function start(uint merchId,uint sellerId,address payable sellerAddress) public returns(bool){
        auction memory auc=auction(merchId,sellerId,sellerAddress,0,0x0000000000000000000000000000000000000000,0x0000000000000000000000000000000000000000,0,true);
        auctions[merchId]=auc;
        return true;
    }
    //用户参与竞拍
    function getBid(uint merchId,uint bidderId,uint bidPrice) public payable returns(bool){
        uint temp;//用来查找出价表的出价
        uint account;//
        if(auctions[merchId].highestPrice<bidPrice&&auctions[merchId].onBid==true){
            auctions[merchId].highestPrice=bidPrice;
            auctions[merchId].highestBidderId=bidderId;
            auctions[merchId].highestAddress=msg.sender;
            if(msg.sender == auctions[merchId].latestAddress){//连续出价，先不退回
                temp = auctions[merchId].pendingReturns[msg.sender];
                auctions[merchId].pendingReturns[msg.sender] = msg.value + temp;
                auctions[merchId].latestAddress = msg.sender;
            }else{//不是连续出价，退回Wei给之前的出价者
                account = auctions[merchId].pendingReturns[auctions[merchId].latestAddress];
                if(account > 0){
                    address(auctions[merchId].latestAddress).transfer(account);
                    emit SendEvent(auctions[merchId].latestAddress, account);//日志、
                    //auctions[merchId].latestAddress.send(account * 10**18);
                    //auctions[merchId].latestAddress.call.value(account ether)();
                    auctions[merchId].pendingReturns[auctions[merchId].latestAddress] = 0;//置零
                    auctions[merchId].pendingReturns[msg.sender] = msg.value;
                    auctions[merchId].latestAddress = msg.sender;
                }else{
                    auctions[merchId].pendingReturns[msg.sender] = msg.value;
                    auctions[merchId].latestAddress = msg.sender;
                }
            }
            return true;
        }
        return false;
    }
    function isChanged(uint merchId,uint bidderid,uint bidprice) public view returns(bool){
        if(bidderid==auctions[merchId].highestBidderId&&bidprice==auctions[merchId].highestPrice){
            return true;
        }
        return false;
    }
    //返回指定拍卖信息
    function getAucInfo(uint merchId) public view returns(uint,uint,uint,bool,address,uint){
        address addressA = auctions[merchId].latestAddress;
        uint uu = auctions[merchId].pendingReturns[addressA];
        return (auctions[merchId].merchId,auctions[merchId].highestBidderId,auctions[merchId].highestPrice,auctions[merchId].onBid,auctions[merchId].latestAddress,uu);
    }
    //返回拍卖所有者的地址
    function getSellerAddress(uint merchId) public view returns(address){
        return auctions[merchId].sellerAddress;
    }
    //结束竞拍
    function end(uint merchId) public payable returns(bool){
        auctions[merchId].onBid=false;
        return true;
    }
    //确认收货后进行转账
    function trans(uint merchId) public payable returns(bool){
        uint account = auctions[merchId].pendingReturns[auctions[merchId].latestAddress];
        if(account > 0){
            address(auctions[merchId].sellerAddress).transfer(account);
            emit SendEvent(auctions[merchId].sellerAddress, account);//log
            //auctions[merchId].sellerAddress.send(account * 10**18);//给卖家转账
            auctions[merchId].pendingReturns[auctions[merchId].highestAddress] = 0;
            return true;
        }
        return false;
    }
    //得到账户余额
    function getBalance(address addr) public returns(address, uint){
        uint blc = address(addr).balance;
        emit GetTheBalance(addr, blc);
        return (addr, blc);
    }
    event SendEvent(address, uint);
    event GetTheBalance(address, uint);
}
