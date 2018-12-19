package com.detective.stone.groundwork.dao;

import org.apache.ibatis.annotations.Mapper;
import com.detective.stone.groundwork.model.Pet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.detective.stone.groundwork.common.CommonMapper;

/**
 * <p>
 * 宠物信息 Mapper 接口
 * </p>
 *
 * @author Detective Stone
 * @since 2018-12-19
 */
@Mapper
public interface PetMapper extends CommonMapper<Pet> {
}
