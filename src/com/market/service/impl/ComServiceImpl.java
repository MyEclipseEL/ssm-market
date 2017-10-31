package com.market.service.impl;

import com.market.dao.SmCommodityMapper;
import com.market.dao.SmSheltMapper;
import com.market.dao.SmSpeciesMapper;
import com.market.dao.SmSupplierMapper;
import com.market.po.SmCommodity;
import com.market.po.SmSpecies;
import com.market.service.ComService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
public class ComServiceImpl implements ComService {

    @Resource
    private SmCommodityMapper comMapper;
    @Resource
    private SmSpeciesMapper speciesMapper;
    @Resource
    private SmSheltMapper sheltMapper;
    @Resource
    private SmSupplierMapper supplierMapper;

    @Override
    public List<SmCommodity> findAll() {
        List<SmCommodity> comList=comMapper.findAll();
        for(SmCommodity com:comList){
            com.setSpecies(speciesMapper.selectByPrimaryKey(com.getkId()));
            com.setShelt(sheltMapper.selectByPrimaryKey(com.getShelfId()));
            com.setSup(supplierMapper.selectByPrimaryKey(com.getSupId()));
        }
        return comList;
    }
}
