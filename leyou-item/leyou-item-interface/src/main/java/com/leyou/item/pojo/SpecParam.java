package com.leyou.item.pojo;

import lombok.Data;
//import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

/**
 * @author bystander
 * @date 2018/9/18
 */
@Data
@Table(name = "tb_spec_param")
public class SpecParam {

    @Id
//    @KeySql(useGeneratedKeys = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cid;
    private Long groupId;
    private String name;
    @Column(name = "`numeric`")
    private Boolean numeric;
    private String unit;
    private Boolean generic;
    private Boolean searching;
    private String segments;
}
