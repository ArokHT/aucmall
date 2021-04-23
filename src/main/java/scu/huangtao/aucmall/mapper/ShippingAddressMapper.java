package scu.huangtao.aucmall.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import scu.huangtao.aucmall.common.domain.ShippingAddress;
import scu.huangtao.aucmall.common.domain.ShippingAddressExample;
@Repository
public interface ShippingAddressMapper {
    long countByExample(ShippingAddressExample example);

    int deleteByExample(ShippingAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShippingAddress record);

    int insertSelective(ShippingAddress record);

    List<ShippingAddress> selectByExample(ShippingAddressExample example);

    ShippingAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShippingAddress record, @Param("example") ShippingAddressExample example);

    int updateByExample(@Param("record") ShippingAddress record, @Param("example") ShippingAddressExample example);

    int updateByPrimaryKeySelective(ShippingAddress record);

    int updateByPrimaryKey(ShippingAddress record);

    List<ShippingAddress> selectByUserId(int userId);

    int setDefault(@Param("afterId") int afterId);
    int setUnDefault(@Param("beforeId") int beforeId);
    int deleteAddress(@Param("id") int id);
}