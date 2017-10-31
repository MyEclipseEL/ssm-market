package com.market.dao;

import com.market.po.SmStaff;
import com.market.po.SmStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmStaffMapper {
    int countByExample(SmStaffExample example);

    int deleteByExample(SmStaffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmStaff record);

    int insertSelective(SmStaff record);

    List<SmStaff> selectByExampleWithBLOBs(SmStaffExample example);

    List<SmStaff> selectByExample(SmStaffExample example);

    SmStaff selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmStaff record, @Param("example") SmStaffExample example);

    int updateByExampleWithBLOBs(@Param("record") SmStaff record, @Param("example") SmStaffExample example);

    int updateByExample(@Param("record") SmStaff record, @Param("example") SmStaffExample example);

    int updateByPrimaryKeySelective(SmStaff record);

    int updateByPrimaryKeyWithBLOBs(SmStaff record);

    int updateByPrimaryKey(SmStaff record);
}