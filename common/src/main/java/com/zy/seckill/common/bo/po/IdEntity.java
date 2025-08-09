package com.zy.seckill.common.bo.po;






/*
 * @Author liudeyu
 * @Description //ID实体
 * @Date 上午 9:48 2025/7/27 0027
 * @Param
 * @return
 **/

import java.io.Serializable;

public class IdEntity implements Serializable {


    private Long id;


    public IdEntity(Long id) {
        this.id = id;
    }


    public IdEntity() {
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

