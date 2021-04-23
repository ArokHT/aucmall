package scu.huangtao.aucmall.service;

import scu.huangtao.aucmall.common.domain.ShippingAddress;

import java.util.List;

public interface ShippingAddressServiceInt {
    public List<ShippingAddress> getAddress(int userId);
    public int addAddress(int userId, String address);
    public int setDefault(int afterId);
    public int setDefault(int beforeId, int afterId);
    public int deleteAddress(int id);
}
