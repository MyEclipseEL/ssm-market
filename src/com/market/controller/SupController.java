package com.market.controller;

import com.market.po.SmSupplier;
import com.market.service.SupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
@Controller
@RequestMapping("sup")
public class SupController {

    @Resource
    private SupService supService;

    @RequestMapping("deleteSup")
    public String deleteSup(SmSupplier sup, Model model){
        supService.deleteSup(sup);
        return "deleteSup";
    }

}
