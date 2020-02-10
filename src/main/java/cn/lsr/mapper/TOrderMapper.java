package cn.lsr.mapper;

import cn.lsr.entity.TOrder;
import java.util.List;

public interface TOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TOrder record);

    TOrder selectByPrimaryKey(Integer id);

    List<TOrder> selectAll();

    int updateByPrimaryKey(TOrder record);
}