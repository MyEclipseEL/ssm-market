package com.market.controller;

import com.market.po.SmCommodity;
import com.market.service.ComService;
import com.market.service.StaffService;
import com.market.service.SupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
@Controller
@RequestMapping("com")
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

    @RequestMapping("update")
    public String updateCom(SmCommodity com,Model model){
        int flag = comService.updateCom(com);
        model.addAttribute("flag",flag);
        return  "redirect:comList.do";
    }

    @RequestMapping("deleteCom")
    public String deleteCom(SmCommodity com,Model model){

        comService.deleteCom(com);

        return "redirect:comList.do";
    }
}
