package com.market.dao;

import com.market.po.SmStaffSp;
import com.market.po.SmStaffSpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmStaffSpMapper {
    int countByExample(SmStaffSpExample example);

    int deleteByExample(SmStaffSpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmStaffSp record);

    int insertSelective(SmStaffSp record);

    List<SmStaffSp> selectByExample(SmStaffSpExample example);

    SmStaffSp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmStaffSp record, @Param("example") SmStaffSpExample example);

    int updateByExample(@Param("record") SmStaffSp record, @Param("example") SmStaffSpExample example);

    int updateByPrimaryKeySelective(SmStaffSp record);

    int updateByPrimaryKey(SmStaffSp record);
}