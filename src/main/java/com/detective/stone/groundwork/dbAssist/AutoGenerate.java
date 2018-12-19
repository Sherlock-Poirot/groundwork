package com.detective.stone.groundwork.dbAssist;

import java.util.ArrayList;
import java.util.List;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @author Detective Stone
 * Create time 2018/12/19 13:30
 */
public class AutoGenerate {

    // TODO 后期使用配置文件读取形式,暂时写死.
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // globalConfig全局设置
        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = System.getProperty("user.dir"); // 获取用户当前项目目录
        globalConfig.setOutputDir(projectPath + "/src/main/java"); // 输出目录
        globalConfig.setAuthor("Detective Stone"); // 作者
        //globalConfig.setFileOverride(false); //是否覆盖已有文件,默认false
        //globalConfig.setSwagger2(true); // TODO 暂时没有集成swagger2稍后集成
        globalConfig.setEntityName("%s"); // 设置实体类名字  %s为占位符
        globalConfig.setMapperName("%sMapper"); // 设置mapper名字  %s为占位符
        globalConfig.setXmlName("%sMapper"); // 设置mapper.xml名字  %s为占位符
        globalConfig.setServiceName("%sService"); // 设置service名字  %s为占位符
        globalConfig.setServiceImplName("%sServiceImpl"); // 设置serviceImpl名字  %s为占位符
        globalConfig.setControllerName("%sController"); // 设置controller名字  %s为占位符
        globalConfig.setBaseResultMap(true);
        globalConfig.setOpen(false);
        mpg.setGlobalConfig(globalConfig);

        // DataSource配置
        DataSourceConfig datasource = new DataSourceConfig();
        datasource.setDbType(DbType.MYSQL); // 数据库类型
        datasource.setDriverName("com.mysql.cj.jdbc.Driver"); // 驱动名称
        // 数据库连接url
        datasource.setUrl(
                "jdbc:mysql://127.0.0.1:3306/groundwork?characterEncoding=UTF-8&useUnicode=true&useSSL=false&allowMultiQueries=true");
        datasource.setUsername("root"); // 数据库连接用户名
        datasource.setPassword("123456"); // 数据库连接密码
        mpg.setDataSource(datasource);

        // packageInfo包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.detective.stone.groundwork");// 父包名如果不写则之后的要写全名
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setEntity("model");
        packageConfig.setMapper("dao");
        mpg.setPackageInfo(packageConfig);

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel); // 数据库转JAVA命名规则 下划线转驼峰
        strategyConfig.setEntityBuilderModel(true); // 构建者模式
        strategyConfig.setEntityLombokModel(true); // lombok模式
        strategyConfig.setRestControllerStyle(true); // restController 模式
        strategyConfig.setEntityColumnConstant(true);
        strategyConfig.setLogicDeleteFieldName("deleted_flag");
        strategyConfig.entityTableFieldAnnotationEnable(true);
        mpg.setStrategy(strategyConfig);


        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {

            }
        };
        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return projectPath + "/src/main/resources/mapper/" + tableInfo.getXmlName() + ".xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        // templateConfig.setEntity();
        // templateConfig.setService();
        templateConfig.setController("/templates/controller.java");
        templateConfig.setMapper("/templates/mapper.java");
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
        System.out.println("代码生成成功");
    }
}
