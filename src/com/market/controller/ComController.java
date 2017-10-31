package com.market.controller;

import com.market.po.SmCommodity;
import com.market.service.ComService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
public class ComController {

    @Resource
    private ComService comService;

    //查找所有商品
    @RequestMapping("comList")
    public String comList(Model model){
        List<SmCommodity> comList = comService.findAll();
        model.addAttribute("comList",comList);
        return "comList";
    }

}
