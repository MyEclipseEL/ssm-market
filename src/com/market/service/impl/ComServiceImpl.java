package com.market.service.impl;

import com.market.dao.SmCommodityMapper;
import com.market.dao.SmSheltMapper;
import com.market.dao.SmSpeciesMapper;
import com.market.dao.SmSupplierMapper;
import com.market.po.SmCommodity;
import com.market.po.SmSpecies;
import com.market.service.ComService;
import com.market.service.StaffService;
import com.market.service.SupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
@Service
public class ComServiceImpl implements ComService {
    @Resource
    private SupService supService;
    @Resource
    private StaffService staffService;

    @Resource
    private SmCommodityMapper comMapper;
    @Resource
    private SmSheltMapper sheltMapper;
    @Resource SmSpeciesMapper speciesMapper;

    @Override
    public List<SmCommodity> findAll() {
        List<SmCommodity> comList=comMapper.findAll();
        for(SmCommodity com:comList){
            com.setSpecies(speciesMapper.selectByPrimaryKey(com.getkId()));
            com.setShelt(sheltMapper.selectByPrimaryKey(com.getShelfId()));
            com.setSup(supService.selectOne(com.getSup()));
        }
        return comList;
    }

    @Override
    public int updateCom(SmCommodity com) {
        return comMapper.updateByPrimaryKey(com);

    }

    @Override
    public int deleteCom(SmCommodity com) {
        return comMapper.deleteByPrimaryKey(com.getComId());
    }


}
