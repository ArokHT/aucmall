package scu.huangtao.aucmall.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import scu.huangtao.aucmall.common.domain.Merchandise;
import scu.huangtao.aucmall.common.domain.MerchandiseExample;
@Repository
public interface MerchandiseMapper {
    long countByExample(MerchandiseExample example);

    int deleteByExample(MerchandiseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Merchandise record);

    int insertSelective(Merchandise record);

    List<Merchandise> selectByExample(MerchandiseExample example);

    Merchandise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Merchandise record, @Param("example") MerchandiseExample example);

    int updateByExample(@Param("record") Merchandise record, @Param("example") MerchandiseExample example);

    int updateByPrimaryKeySelective(Merchandise record);

    int updateByPrimaryKey(Merchandise record);
    int updateInfo(@Param("id") int id, @Param("name") String name, @Param("mark") String mark, @Param("kind") String kind
            , @Param("openAuction") boolean openAuction, @Param("reservePrice") int reservePrice, @Param("leastEachPriceIncrease") int leastEachPriceIncrease
            , @Param("onSale") boolean onSale, @Param("haveHighestPrice") boolean haveHighestPrice, @Param("highestPrice") int highestPrice
            , @Param("startTime") Date startTime, @Param("stopTime") Date stopTime, @Param("img") String img, @Param("description") String description);

    List<Merchandise> getAllMerchByUserId1(@Param("userid") int userid,@Param("index") int index,@Param("limit") int limit);

    List<Merchandise> getAllMerchByUserId(@Param("userid") int userid);

    List<Merchandise> getOneMerchById(@Param("id") int id);

    int setMerchOffshelf(@Param("id") int id);

    List<Merchandise> getAllMerch1(@Param("userid")int userid);
    List<Merchandise> getAllMerch(@Param("index") int index,@Param("limit") int limit,@Param("userid")int userid);

    List<Merchandise> getMerchByKind(@Param("kind") String kind, @Param("index") int index,@Param("limit") int limit,@Param("userid")int userid);

    List<Merchandise> getMerchByKind1(@Param("kind") String kind,@Param("userid")int userid);

    List<Merchandise> getAllMerch1Order();
    List<Merchandise> getAllMerchOrder(@Param("index") int index,@Param("limit") int limit);

    List<Merchandise> getAllMerch1onsale(@Param("userid")int userid);
    List<Merchandise> getAllMerchonsale(@Param("index") int index,@Param("limit") int limit,@Param("userid")int userid);

    List<Merchandise> getmerchbytime(@Param("userid")int userid);

    List<Merchandise> getAllMerch1Search(@Param("userid")int userid,@Param("key")String key);
    List<Merchandise> getAllMerchSearch(@Param("index") int index,@Param("limit") int limit,@Param("userid")int userid,@Param("key")String key);

    int updatePrice(@Param("merchid")int merchid,@Param("price")int price);
}