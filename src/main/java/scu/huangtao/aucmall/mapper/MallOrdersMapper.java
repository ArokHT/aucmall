package scu.huangtao.aucmall.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import scu.huangtao.aucmall.common.domain.MallOrders;
import scu.huangtao.aucmall.common.domain.MallOrdersExample;
import scu.huangtao.aucmall.common.domain.OrdersView;

@Repository
public interface MallOrdersMapper {
    long countByExample(MallOrdersExample example);

    int deleteByExample(MallOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallOrders record);

    int insertSelective(MallOrders record);

    List<MallOrders> selectByExample(MallOrdersExample example);

    MallOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallOrders record, @Param("example") MallOrdersExample example);

    int updateByExample(@Param("record") MallOrders record, @Param("example") MallOrdersExample example);

    int updateByPrimaryKeySelective(MallOrders record);

    int updateByPrimaryKey(MallOrders record);

    List<MallOrders> selectByUserId(@Param("userid") int userid);
    List<OrdersView> selectView(@Param("index") int index,@Param("limit") int limit, @Param("userid") int userid);
    List<OrdersView> selectSellView(@Param("index") int index,@Param("limit") int limit, @Param("userid") int userid);
    List<OrdersView> selectView1(@Param("userid") int userid);
    int selectOrderNum(@Param("userid") int userid);
    int selectSellOrderNum(@Param("userid") int userid);
    int addMallOrder(@Param("merchid")int merchid,@Param("owerid")int owerid,@Param("buyerid")int buyerid,@Param("price")int price,@Param("address")String address);
}