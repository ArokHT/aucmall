package scu.huangtao.aucmall.service;

import scu.huangtao.aucmall.common.domain.MallOrders;
import scu.huangtao.aucmall.common.domain.OrdersView;

import java.util.List;

public interface OrdersServiceInt {
    public List<MallOrders> getOrdersByUserId(int userId);
    public List<OrdersView> getOrdersView(int page,int limit,int uerId);
    public List<OrdersView> getOrdersView1(int uerId);
    public List<OrdersView> getSellOrdersView(int page,int limit, int uerId);
    public int getOrdersNum(int uerId);
    public int getSellOrdersNum(int uerId);
}
