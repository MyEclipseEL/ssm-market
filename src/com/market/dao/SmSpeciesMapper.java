package com.market.dao;

import com.market.po.SmSpecies;
import com.market.po.SmSpeciesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SmSpeciesMapper {
    int countByExample(SmSpeciesExample example);

    int deleteByExample(SmSpeciesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmSpecies record);

    int insertSelective(SmSpecies record);

    List<SmSpecies> selectByExample(SmSpeciesExample example);

    SmSpecies selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmSpecies record, @Param("example") SmSpeciesExample example);

    int updateByExample(@Param("record") SmSpecies record, @Param("example") SmSpeciesExample example);

    int updateByPrimaryKeySelective(SmSpecies record);

    int updateByPrimaryKey(SmSpecies record);
}