package scu.huangtao.aucmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.huangtao.aucmall.common.domain.MallOrders;
import scu.huangtao.aucmall.common.domain.OrdersView;
import scu.huangtao.aucmall.mapper.MallOrdersMapper;

import java.util.List;
@Service
public class OrdersService implements OrdersServiceInt{
    @Autowired
    MallOrdersMapper mallOrdersMapper;
    @Override
    public List<MallOrders> getOrdersByUserId(int userId) {
        return mallOrdersMapper.selectByUserId(userId);
    }

    @Override
    public List<OrdersView> getOrdersView(int page,int limit, int uerId) {
        int index=(page-1)*limit;
        return mallOrdersMapper.selectView(index, limit, uerId);
    }

    @Override
    public List<OrdersView> getOrdersView1(int uerId) {
        return mallOrdersMapper.selectView1(uerId);
    }

    @Override
    public List<OrdersView> getSellOrdersView(int page,int limit, int uerId) {
        int index=(page-1)*limit;
        return mallOrdersMapper.selectSellView(index, limit, uerId);
    }

    @Override
    public int getMerchId(int orderId) {
        return mallOrdersMapper.getMerchId(orderId);
    }

    @Override
    public int getOrdersNum(int uerId) {
        return mallOrdersMapper.selectOrderNum(uerId);
    }

    @Override
    public int getSellOrdersNum(int uerId) {
        return mallOrdersMapper.selectSellOrderNum(uerId);
    }

    @Override
    public int addMallOrder(int merchid,int owerid,int buyerid,int price,String address){
        return mallOrdersMapper.addMallOrder(merchid,owerid,buyerid,price,address);
    }

    @Override
    public int updateByConfirm(int orderId) {
        return mallOrdersMapper.updateByConfirm(orderId);
    }

    @Override
    public int updateByDeliver(int orderId) {
        return mallOrdersMapper.updateByDeliver(orderId);
    }

    @Override
    public int updateByComment(int orderId, int commentId) {
        return mallOrdersMapper.updateByComment(orderId, commentId);
    }
}
