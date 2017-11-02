package com.market.dao;

import com.market.po.SmPermission;
import com.market.po.SmPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SmPermissionMapper {
    int countByExample(SmPermissionExample example);

    int deleteByExample(SmPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmPermission record);

    int insertSelective(SmPermission record);

    List<SmPermission> selectByExample(SmPermissionExample example);

    SmPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmPermission record, @Param("example") SmPermissionExample example);

    int updateByExample(@Param("record") SmPermission record, @Param("example") SmPermissionExample example);

    int updateByPrimaryKeySelective(SmPermission record);

    int updateByPrimaryKey(SmPermission record);
}