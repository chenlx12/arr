package com.example.aar.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Year;
import java.sql.Date;

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
public class Applicationorm implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "身份证号")
    private String id;

    @ApiModelProperty(value = "部门")
    private String department;

    @ApiModelProperty(value = "职务")
    private String post;

    @ApiModelProperty(value = "职称")
    private String prat;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "职称获取时间")
    private Date otfprt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy", timezone = "GMT+8")
    @ApiModelProperty(value = "参加工作时间")
    private Date WorkingTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "来猿码时代工作时间")
    private Date YworkingTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "来青岛工作时间")
    private Date PworkingTime;

    @ApiModelProperty(value = "表彰与荣誉")
    private String honor;

    @ApiModelProperty(value = "是否双职工")
    private byte mawbaw;

    @ApiModelProperty(value = "配偶姓名与工作单位")
    private String spouse;

    @ApiModelProperty(value = "援疆，援外,援鄂救灾情况")
    private String provideDisasterRelief;

}
