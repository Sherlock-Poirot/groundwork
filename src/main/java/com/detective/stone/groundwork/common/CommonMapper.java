package com.detective.stone.groundwork.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.SneakyThrows;

/**
 * @author Detective Stone
 * Create time 2018/12/19 9:26
 */
public interface CommonMapper<T> extends BaseMapper<T> {

    default boolean isExist(Long id) {
        return selectById(id) != null;
    }

    @SneakyThrows
    default boolean isExist(T entity) {
        Long id = (long) entity.getClass().getMethod("getId", null).invoke(entity);
        return selectById(id) != null;
    }

}
