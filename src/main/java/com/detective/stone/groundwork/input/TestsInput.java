package com.detective.stone.groundwork.input;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 测试input
 * </p>
 *
 * @author Detective Stone
 * Create time 2018-12-21 17:30:04.238
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TestsInput", description="测试input")
public class TestsInput implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private LocalDateTime insertedAt;

    private LocalDateTime updatedAt;

    private Boolean deletedFlag;

    @ApiModelProperty(value = "宠物名字")
    private String name;

    @ApiModelProperty(value = "宠物年龄")
    private BigDecimal age;

    @ApiModelProperty(value = "铲屎官名字")
    private String ownerName;

    @ApiModelProperty(value = "铲屎官年龄")
    private Integer ownerAge;

    @ApiModelProperty(value = "家庭住址")
    private String place;



}
