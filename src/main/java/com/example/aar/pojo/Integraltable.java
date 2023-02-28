package com.example.aar.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author huyelin
 * @since 2023-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Integraltable对象", description="")
public class Integraltable implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "身份证号")
    private String id;

    @ApiModelProperty(value = "积分")
    private Integer integral;


}
