package com.market.dao;

import com.market.po.SmSupplier;
import com.market.po.SmSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmSupplierMapper {
    int countByExample(SmSupplierExample example);

    int deleteByExample(SmSupplierExample example);

    int deleteByPrimaryKey(Integer supId);

    int insert(SmSupplier record);

    int insertSelective(SmSupplier record);

    List<SmSupplier> selectByExample(SmSupplierExample example);

    SmSupplier selectByPrimaryKey(Integer supId);

    int updateByExampleSelective(@Param("record") SmSupplier record, @Param("example") SmSupplierExample example);

    int updateByExample(@Param("record") SmSupplier record, @Param("example") SmSupplierExample example);

    int updateByPrimaryKeySelective(SmSupplier record);

    int updateByPrimaryKey(SmSupplier record);
}