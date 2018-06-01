package ${packageName};

import com.autotest.base.SpringBootTestBase;
import com.autotest.annotation.AutoTest;
import org.junit.jupiter.api.DisplayName;
import com.alibaba.dubbo.config.annotation.Reference;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import ${resultType};
import ${facadeType};
<#list importlist as im>
import ${im};
</#list>



/**
 * @author ${author!'huairen'}
 * Created on ${time}.
 */
public class ${className} extends SpringBootTestBase{

	@Reference(version = "1.0")
    ${facadeName} ${facadeName?uncap_first};

	@AutoTest(file = "${projectName}/${funcName}Success.csv")
	public void ${funcName}Success(
			// 基本参数
			int testId,
			// 业务参数
			<#list childlist as child>
				<#if child ??>
					<#list pars as parm>
						<#if 0 == parm.layer>
			${parm.typeName} ${parm.name}<#if (child_has_next)>,</#if>
						</#if>
					</#list>
				</#if>
			</#list>
			<#list pars_order as parm>
			${parm.typeName} ${parm.name}<#if (parm_has_next)>,</#if>
			</#list>
	) {
		// 清除数据
		// 准备数据
		// 测试过程
		<#--次子订单-->
		<#list pars as parm>
		  <#if 2 == parm.layer>
		    <#if "List" ==parm.typeName>
		      <#list pars_order as p>
                  <#if p.name == parm.children>
        List<${p.name?cap_first}> ${parm.secondName} = new ArrayList<${p.name?cap_first}>();
        ${parm.name}.add(${parm.children});
                  </#if>
               </#list>
		    </#if>
            <#if "Map" == parm.typeName>
        Map<String, String>  ${parm.name} = new HashMap<>();
            </#if>
		  </#if>
		</#list>
		<#--子订单-->
		<#list pars as parm>
		  <#if 1 == parm.layer>
		    <#if "List" ==parm.typeName>
		        <#list pars_order as p>
                  <#if p.name == parm.children>
        List<${p.name?cap_first}> ${parm.secondName} = new ArrayList<${p.name?cap_first}>();
        ${parm.name}.add(${parm.children});
                  </#if>
                </#list>
		    </#if>
            <#if "Map" == parm.typeName>
        Map<String, Object>  ${parm.name} = new HashMap<>();
            </#if>
		  </#if>
		</#list>
		<#--主订单-->
		<#list pars_order as parm>
		  <#if 0 == parm.layer>
              <#list pars_order as par>
			    <#if 1 == par.layer>
		${parm.name}.set${par.name?cap_first}(${par.name});
                </#if>
              </#list>
		  </#if>
		</#list>
		// 调用接口
		${resultName} result = ${facadeName?uncap_first}.${methodName}(<#list baselist as base>${base}<#if (base_has_next)>,</#if></#list>);
		// 结果验证
		// 数据验证
		<#--
		-->
	}
}
