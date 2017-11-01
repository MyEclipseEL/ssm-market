package com.market.service;

import com.market.po.SmCommodity;

import java.util.List;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
public interface ComService {
    List<SmCommodity> findAll();


    int updateCom(SmCommodity com);

    int deleteCom(SmCommodity com);
}
