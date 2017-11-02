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
    @RequestMapping("selectAll")
    public String comList(Model model){
            List<SmCommodity> comList = comService.findAll();
            model.addAttribute("comList",comList);
            return "comList";
    }

    //跳转修改页面
    @RequestMapping("edit")//访问请求 edit.do
    public String edit(Integer id,Model model){
        SmCommodity com = comService.findById(id);

        //页面回显
        model.addAttribute("com",com);

        return "editCom";//访问页面 editCom.jsp
    }

    //修改商品数据
    @RequestMapping("update")
    public String updateCom(SmCommodity com,Model model){
        int flag = comService.updateCom(com);
        model.addAttribute("flag",flag);
        return  "redirect:comList.do";
    }


    //删除商品数据
    @RequestMapping("delete")
    public String deleteCom(SmCommodity com,Model model){

        int flag = comService.deleteCom(com);
        model.addAttribute("flag",flag);

        return "redirect:comList.do";
    }
}
