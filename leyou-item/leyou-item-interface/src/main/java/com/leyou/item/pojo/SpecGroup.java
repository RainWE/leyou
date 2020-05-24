package com.leyou.item.pojo;

import lombok.Data;
//import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.util.List;

/**
 * @author bystander
 * @date 2018/9/18
 */
@Data
@Table(name = "tb_spec_group")
public class SpecGroup {

    @Id
//    @KeySql(useGeneratedKeys = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cid;
    private String name;

    @Transient
    private List<SpecParam> params;
}
