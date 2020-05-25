package com.leyou.item.bo;

import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.Spu;
import com.leyou.item.pojo.SpuDetail;
import lombok.Data;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-24
 * @Description:com.leyou.item.bo
 * @Version:1.0
 */
@Data
public class SpuBo extends Spu {

    private String cname;
    private String bname;

    private SpuDetail spuDetail;
    private List<Sku> skus;
}
