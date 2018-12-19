package com.detective.stone.groundwork.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 宠物信息
 * </p>
 *
 * @author Detective Stone
 * @since 2018-12-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("pet")
@Builder
public class Pet implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("inserted_at")
    private LocalDateTime insertedAt;

    @TableField("updated_at")
    private LocalDateTime updatedAt;

    @TableField("deleted_flag")
    @TableLogic
    private Boolean deletedFlag;

    /**
     * 宠物名字
     */
    @TableField("name")
    private String name;

    /**
     * 宠物年龄
     */
    @TableField("age")
    private BigDecimal age;

    /**
     * 铲屎官名字
     */
    @TableField("owner_name")
    private String ownerName;

    /**
     * 铲屎官年龄
     */
    @TableField("owner_age")
    private Integer ownerAge;

    /**
     * 家庭住址
     */
    @TableField("place")
    private String place;

    public static final String ID = "id";

    public static final String INSERTED_AT = "inserted_at";

    public static final String UPDATED_AT = "updated_at";

    public static final String DELETED_FLAG = "deleted_flag";

    public static final String NAME = "name";

    public static final String AGE = "age";

    public static final String OWNER_NAME = "owner_name";

    public static final String OWNER_AGE = "owner_age";

    public static final String PLACE = "place";

}
