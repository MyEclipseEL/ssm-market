package com.market.dao;

import com.market.po.SmSave;
import com.market.po.SmSaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SmSaveMapper {
    int countByExample(SmSaveExample example);

    int deleteByExample(SmSaveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmSave record);

    int insertSelective(SmSave record);

    List<SmSave> selectByExample(SmSaveExample example);

    SmSave selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmSave record, @Param("example") SmSaveExample example);

    int updateByExample(@Param("record") SmSave record, @Param("example") SmSaveExample example);

    int updateByPrimaryKeySelective(SmSave record);

    int updateByPrimaryKey(SmSave record);
}