package com.market.dao;

import com.market.po.SmCommodity;
import com.market.po.SmCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmCommodityMapper {
    int countByExample(SmCommodityExample example);

    int deleteByExample(SmCommodityExample example);

    int deleteByPrimaryKey(Integer comId);

    int insert(SmCommodity record);

    int insertSelective(SmCommodity record);

    List<SmCommodity> selectByExample(SmCommodityExample example);

    SmCommodity selectByPrimaryKey(Integer comId);

    int updateByExampleSelective(@Param("record") SmCommodity record, @Param("example") SmCommodityExample example);

    int updateByExample(@Param("record") SmCommodity record, @Param("example") SmCommodityExample example);

    int updateByPrimaryKeySelective(SmCommodity record);

    int updateByPrimaryKey(SmCommodity record);

    List<SmCommodity> findAll();
}