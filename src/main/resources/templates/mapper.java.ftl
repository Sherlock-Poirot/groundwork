package ${package.Mapper};

    import ${package.Entity}.${entity};
    import ${superMapperClassPackage};
    import com.detective.stone.groundwork.common.CommonMapper;

    /**
    * <p>
    * ${table.comment!} Mapper 接口
    * </p>
    *
    * @author ${author}
    * @since ${date}
    */
<#if kotlin>
    interface ${table.mapperName} : ${superMapperClass}<${entity}>
<#else>
    public interface ${table.mapperName} extends CommonMapper<${entity}> {

    }
</#if>
