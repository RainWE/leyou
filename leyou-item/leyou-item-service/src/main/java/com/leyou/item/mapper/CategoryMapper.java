package com.leyou.item.mapper;


import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Auther:cdx
 * @Date:2020-05-20
 * @Description:com.leyou.item.mapper
 * @Version:1.0
 */
public interface CategoryMapper extends Mapper<Category>, SelectByIdListMapper<Category,Long> {
}
