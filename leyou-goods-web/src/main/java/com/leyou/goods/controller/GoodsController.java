package com.leyou.goods.controller;

import com.leyou.goods.service.GoodsHtmlService;
import com.leyou.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * @Auther:cdx
 * @Date:2020-06-02
 * @Description:com.leyou.goods.controller
 * @Version:1.0
 */
@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private GoodsHtmlService goodsHtmlService;

    /**
     * 获取商品详情页信息
     * @param id
     * @param model
     * @return
     */
    @GetMapping("item/{id}.html")
    public String toItemPage(@PathVariable("id")Long id, Model model){

        Map<String, Object> map = this.goodsService.loadData(id);
        model.addAllAttributes(map);

        this.goodsHtmlService.createHtml(id);

        return "item";
    }


}
