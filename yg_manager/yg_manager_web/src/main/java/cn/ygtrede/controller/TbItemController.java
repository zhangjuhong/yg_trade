package cn.ygtrede.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ygtrade.pojo.TbItem;
import cn.ygtrade.service.ItemService;

@Controller
public class TbItemController {
     @Autowired
     private ItemService itemService;
     
     @RequestMapping("/item/{id}")
     @ResponseBody
     public TbItem getTbItemById(@PathVariable Long id){
    	 TbItem tbItem = itemService.getTbItemById(id);
    	 return tbItem;
     }
     
}
