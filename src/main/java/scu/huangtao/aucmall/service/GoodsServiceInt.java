package scu.huangtao.aucmall.service;

import scu.huangtao.aucmall.common.domain.Merchandise;

import java.util.Date;
import java.util.List;

public interface GoodsServiceInt {
    int insert(Merchandise record);

    List<Merchandise> getAllMerchByUserId1(int userid, int page, int limit);

    List<Merchandise> getAllMerchByUserId(int userid);

    List<Merchandise> getOneMerchById(int id);

    int setMerchOffshelf(int id);

    List<Merchandise> getAllMerch(int userid);

    int updateInfo(int id, String name, String mark, String kind
            , boolean openAuction, int reservePrice, int leastEachPriceIncrease
            , boolean onSale, boolean haveHighestPrice, int highestPrice
            , Date startTime, Date stopTime, String img, String description);

    List<Merchandise> getAllMerch(int page,int limit,int userid);

    List<Merchandise> getMerchByKind(String kind, int page, int limit,int userid);
    List<Merchandise> getMerchByKind(String kind,int userid);

    List<Merchandise> getAllMerchOrder();
    List<Merchandise> getAllMerchOrder(int page,int limit);

    List<Merchandise> getAllMerchonsale(int userid);
    List<Merchandise> getAllMerchonsale(int page,int limit,int userid);

    List<Merchandise> getmerchbytime(int userid);

    List<Merchandise> getAllMerchSearch(int userid,String key);
    List<Merchandise> getAllMerchSearch(int page,int limit,int userid,String key);

    int updateprice(int merchid,int price);
}
