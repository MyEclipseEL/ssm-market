package com.market.service;

import com.market.po.SmSupplier;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/1 0001.
 */
public interface SupService {

    //修改供货商信息
    int updateSup(SmSupplier sup);

    SmSupplier selectOne(SmSupplier sup);
}
