package com.detective.stone.groundwork.config;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.injector.methods.additional.LogicDeleteByIdWithFill;

/**
 * @author Detective Stone
 * Create time 2018/12/19 17:12
 * <p>
 * mybatis-plus 配置类
 */
@Configuration
public class MybatisPlusConfig {

    /**
     * 逻辑删除配置
     */
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
}
