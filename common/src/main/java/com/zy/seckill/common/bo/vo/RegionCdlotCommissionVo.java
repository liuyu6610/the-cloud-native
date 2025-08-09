package com.zy.seckill.common.bo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.Tolerate;


/**
 * @author
 * @description
 * @date
 * @param
 * @return
 */
@Getter
@Setter
@Builder
@Accessors(chain=true)
public class RegionCdlotCommissionVo extends BaseVo {

    @Tolerate
    RegionCdlotCommissionVo() {}

    //id
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "区域码")
    private String regionCode;

    @ApiModelProperty(value = "成都物联感知平台委办单位区域码")
    private String cdlotCommissionCode;
}
