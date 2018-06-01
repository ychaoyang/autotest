package ${packageName};

import java.util.List;
import java.util.Date;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import dal.dao.${projectName}.*;
import dal.model.${projectName}.*;

/**
 * @author ${author!'huairen'}
 * Created on ${time}.
 */
@Service
public class ${className} {
	<#list tableList as table>

	@Autowired
	${table.tableName}DAO ${table.tableName?uncap_first}DAO;
	</#list>

    <#list tableList as table>
	<#--insert插入方法-->
    /**
	 * 插入${table.table}表数据
	 */
	public void insert${table.tableName}(${table.tableName}DO ${table.tableName?uncap_first}DO) {
		${table.tableName?uncap_first}DAO.insert(${table.tableName?uncap_first}DO);
	}

    <#--insert插入方法-->
    /**
	 * 插入${table.table}表数据
	 */
	public void insert${table.tableName}(
			<#list table.pars as par>
			${par.typeName} ${par.name}<#if (par_has_next)>, </#if>
			</#list>
	) {
	    <#list table.pars as par>
	      <#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		  </#if >
	      <#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		  </#if >
		</#list>
		${table.tableName}DO ${table.tableName?uncap_first}DO = new ${table.tableName}DO();
		<#list table.pars as par>
			<#if par.annotation ??>
		${table.tableName?uncap_first}DO.set${par.name}(${par.name});
			<#else>
		${table.tableName?uncap_first}DO.set${par.name?cap_first}(${par.name});
			</#if >
	    </#list>
		${table.tableName?uncap_first}DAO.insert(${table.tableName?uncap_first}DO);
	}
	
	<#list table.pars as par>
		  <#if par.name?index_of("versionId")!=-1>
			  <#continue>
		  </#if>
		  <#if par.name?index_of("Id")!=-1 || par.name?index_of("id")!=-1>

	/**
	 * 根据${par.name}删除${table.table}表数据
	 */
	public void clean${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name}) {
	      <#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		  </#if >
	      <#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		  </#if >
	      <#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
		  </#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		${table.tableName?uncap_first}DAO.deleteByExample(exam);
	}
		  </#if>
		  <#if par.name?index_of("No")!=-1 || par.name?index_of("loginAccount")!=-1>

	/**
	 * 根据${par.name}删除${table.table}表数据
	 */
	public void clean${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name}) {
	      <#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		  </#if >
	      <#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		  </#if >
	      <#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
		  </#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		${table.tableName?uncap_first}DAO.deleteByExample(exam);
	}
		  </#if>
		<#if par.name?index_of("Name")!=-1 || par.name?index_of("name")!=-1>

	/**
	* 根据${par.name}删除${table.table}表数据
	*/
	public void clean${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name}) {
		<#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		</#if >
		<#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		</#if >
		<#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
			</#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		${table.tableName?uncap_first}DAO.deleteByExample(exam);
	}
		</#if>
		<#if par.name?index_of("Number")!=-1>

	/**
	* 根据${par.name}删除${table.table}表数据
	*/
	public void clean${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name}) {
		<#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		</#if >
		<#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		</#if >
		<#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
			</#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		${table.tableName?uncap_first}DAO.deleteByExample(exam);
	}
		</#if>
	</#list>

	<#list table.pars as par>
		<#if par.name?index_of("versionId")!=-1>
			<#continue>
		</#if>
		  <#if par.name?index_of("Id")!=-1 || par.name?index_of("id")!=-1>

    /**
	 * 根据${par.name}查询${table.table}表数据
	 */
	public List<${table.tableName}DO> find${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name}) {
	      <#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		  </#if >
	      <#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		  </#if >
	      <#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
		  </#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		return ${table.tableName?uncap_first}DAO.selectByExample(exam);
	}
		  </#if>
		  <#if par.name?index_of("No")!=-1 || par.name?index_of("loginAccount")!=-1>

    /**
	 * 根据${par.name}查询${table.table}表数据
	 */
	public List<${table.tableName}DO> find${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name}) {
	      <#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		  </#if >
	      <#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		  </#if >
	      <#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
		  </#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		return ${table.tableName?uncap_first}DAO.selectByExample(exam);
	}
		  </#if>
		<#if par.name?index_of("Name")!=-1 || par.name?index_of("name")!=-1>

	/**
	* 根据${par.name}查询${table.table}表数据
	*/
	public List<${table.tableName}DO> find${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name}) {
		<#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		</#if >
		<#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		</#if >
		<#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
		</#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		return ${table.tableName?uncap_first}DAO.selectByExample(exam);
	}
		</#if>
		<#if par.name?index_of("Number")!=-1>

	/**
	* 根据${par.name}查询${table.table}表数据
	*/
	public List<${table.tableName}DO> find${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name}) {
		<#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		</#if >
		<#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		</#if >
		<#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
		</#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		return ${table.tableName?uncap_first}DAO.selectByExample(exam);
	}
		</#if>
	</#list>
    <#list table.pars as par>
		<#if par.name?index_of("versionId")!=-1>
			<#continue>
		</#if>
		  <#if par.name?index_of("Id")!=-1 || par.name?index_of("id")!=-1>

    /**
	 * 根据${par.name}更新${table.table}表数据
	 */
	public void update${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name},${table.tableName}DO ${table.tableName?uncap_first}DO) {
	      <#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		  </#if >
	      <#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		  </#if >
	      <#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
		  </#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		${table.tableName?uncap_first}DAO.updateByExampleSelective(${table.tableName?uncap_first}DO, exam);
	}
		  </#if>
	  <#if par.name?index_of("No")!=-1 || par.name?index_of("loginAccount")!=-1>

    /**
	 * 根据${par.name}更新${table.table}表数据
	 */
	public void update${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name},${table.tableName}DO ${table.tableName?uncap_first}DO) {
	      <#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		  </#if >
	      <#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		  </#if >
	      <#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
		  </#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		${table.tableName?uncap_first}DAO.updateByExampleSelective(${table.tableName?uncap_first}DO, exam);
	}
	  </#if>
		<#if par.name?index_of("Name")!=-1 || par.name?index_of("name")!=-1>

	/**
	* 根据${par.name}更新${table.table}表数据
	*/
	public void update${table.tableName}By${par.name?cap_first}(${par.typeName} ${par.name},${table.tableName}DO ${table.tableName?uncap_first}DO) {
		<#if "Date"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Date();
		}
		</#if >
		<#if "Money"==par.typeName>
		if (${par.name} == null) {
			${par.name} = new Money(0);
		}
		</#if >
		<#if "String"==par.typeName>
		if (StringUtils.isBlank(${par.name})){
			${par.name} = "test_${par.name}";
		}
		</#if >
		${table.tableName}DOExample exam = new ${table.tableName}DOExample();
		exam.createCriteria().and${par.name?cap_first}EqualTo(${par.name});
		${table.tableName?uncap_first}DAO.updateByExampleSelective(${table.tableName?uncap_first}DO, exam);
	}
		</#if>
	</#list>
	</#list>

}
