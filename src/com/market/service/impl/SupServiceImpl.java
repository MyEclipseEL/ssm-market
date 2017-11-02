package com.market.service.impl;

import com.market.dao.SmSupplierMapper;
import com.market.po.SmSupplier;
import com.market.service.SupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/11/1 0001.
 */@Service
public class SupServiceImpl implements SupService {

     @Resource
     private SmSupplierMapper supMapper;

    @Override
    public int updateSup(SmSupplier sup) {
        return supMapper.updateByPrimaryKey(sup);
    }

    @Override
    public SmSupplier selectOne(SmSupplier sup) {
        sup = supMapper.selectByPrimaryKey(sup.getSupId());
        return sup;
    }

    @Override
    public int deleteSup(SmSupplier sup) {
        return supMapper.deleteByPrimaryKey(sup.getSupId());

    }
}
