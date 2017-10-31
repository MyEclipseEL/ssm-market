package com.market.dao;

import com.market.po.SmShelt;
import com.market.po.SmSheltExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmSheltMapper {
    int countByExample(SmSheltExample example);

    int deleteByExample(SmSheltExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmShelt record);

    int insertSelective(SmShelt record);

    List<SmShelt> selectByExample(SmSheltExample example);

    SmShelt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmShelt record, @Param("example") SmSheltExample example);

    int updateByExample(@Param("record") SmShelt record, @Param("example") SmSheltExample example);

    int updateByPrimaryKeySelective(SmShelt record);

    int updateByPrimaryKey(SmShelt record);
}