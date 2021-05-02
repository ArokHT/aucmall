package scu.huangtao.aucmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.huangtao.aucmall.common.domain.ShippingAddress;
import scu.huangtao.aucmall.mapper.ShippingAddressMapper;

import java.util.List;
@Service
public class ShippingAddressService implements ShippingAddressServiceInt{
    @Autowired
    ShippingAddressMapper shippingAddressMapper;

    @Override
    public List<ShippingAddress> getAddress(int userId) {
        return shippingAddressMapper.selectByUserId(userId);
    }

    @Override
    public int addAddress(int userId, String address) {
        ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setUserId(userId);
        shippingAddress.setAddress(address);
        shippingAddress.setIsDefault(false);
        shippingAddress.setIsDeleted(false);
        return shippingAddressMapper.insert(shippingAddress);
    }

    @Override
    public int setDefault(int afterId) {
        return shippingAddressMapper.setDefault(afterId);
    }

    @Override
    public int setDefault(int beforeId, int afterId) {
        shippingAddressMapper.setUnDefault(beforeId);
        return shippingAddressMapper.setDefault(afterId);
    }

    @Override
    public int deleteAddress(int id) {
        return shippingAddressMapper.deleteAddress(id);
    }

    @Override
    public ShippingAddress getDefaultById(int userid){
        return shippingAddressMapper.getDefaultById(userid);
    }

}
