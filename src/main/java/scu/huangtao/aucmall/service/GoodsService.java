package scu.huangtao.aucmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.huangtao.aucmall.common.domain.Merchandise;
import scu.huangtao.aucmall.mapper.MerchandiseMapper;

import java.util.Date;
import java.util.List;
@Service
public class GoodsService implements GoodsServiceInt{
    @Autowired
    MerchandiseMapper merchandiseMapper;
    @Override
    public int insert(Merchandise record) {
        return merchandiseMapper.insert(record);
    }

    @Override
    public List<Merchandise> getAllMerchByUserId1(int userid,int page,int limit){
        int index=(page-1)*limit;
        return merchandiseMapper.getAllMerchByUserId1(userid,index,limit);
    }

    @Override
    public List<Merchandise> getAllMerchByUserId(int userid){
        return merchandiseMapper.getAllMerchByUserId(userid);
    }

    @Override
    public List<Merchandise> getOneMerchById(int id){
        return merchandiseMapper.getOneMerchById(id);
    }

    @Override
    public int setMerchOffshelf(int id){
        return merchandiseMapper.setMerchOffshelf(id);
    }

    @Override
    public int updateInfo(int id, String name, String mark, String kind
            , boolean openAuction, int reservePrice, int leastEachPriceIncrease
            , boolean onSale,  boolean haveHighestPrice, int highestPrice
            , Date startTime, Date stopTime, String img, String description){

        return merchandiseMapper.updateInfo(id, name, mark, kind
                , openAuction, reservePrice, leastEachPriceIncrease
                , onSale, haveHighestPrice, highestPrice
                , startTime, stopTime, img, description);
    }

    @Override
    public List<Merchandise> getAllMerch(int page,int limit,int userid) {
        int index=(page-1)*limit;
        return merchandiseMapper.getAllMerch(index,limit,userid);
    }

    @Override
    public List<Merchandise> getAllMerch(int userid) { return merchandiseMapper.getAllMerch1(userid); }


    @Override
    public List<Merchandise> getMerchByKind(String kind, int page, int limit,int userid) {
        int index=(page-1)*limit;
        return merchandiseMapper.getMerchByKind(kind,index,limit,userid);
    }

    @Override
    public List<Merchandise> getMerchByKind(String kind,int userid) {
        return merchandiseMapper.getMerchByKind1(kind,userid);
    }

    @Override
    public List<Merchandise> getAllMerchOrder(int page,int limit) {
        int index=(page-1)*limit;
        return merchandiseMapper.getAllMerchOrder(index,limit);
    }

    @Override
    public List<Merchandise> getAllMerchOrder() { return merchandiseMapper.getAllMerch1Order(); }


    @Override
    public List<Merchandise> getAllMerchonsale(int page,int limit,int userid) {
        int index=(page-1)*limit;
        return merchandiseMapper.getAllMerchonsale(index,limit,userid);
    }

    @Override
    public List<Merchandise> getAllMerchonsale(int userid) { return merchandiseMapper.getAllMerch1onsale(userid); }

    @Override
    public List<Merchandise> getmerchbytime(int userid) {
        return merchandiseMapper.getmerchbytime(userid);
    }

    @Override
    public List<Merchandise> getAllMerchSearch(int page,int limit,int userid,String key) {
        int index=(page-1)*limit;
        return merchandiseMapper.getAllMerchSearch(index,limit,userid,key);
    }

    @Override
    public List<Merchandise> getAllMerchSearch(int userid,String key) { return merchandiseMapper.getAllMerch1Search(userid,key); }

    @Override
    public int updateprice(int merchid,int price){
        return merchandiseMapper.updatePrice(merchid,price);
    };

}
