
package com.wen.business.service;

import java.util.HashMap;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.wen.business.dao.DemoMapper;
import com.wen.business.model.Demo;

@Api(value = "base", tags = {"基础服务"})
@RestController
@RequestMapping("/baseService")
public class BaseService {
	
	@Autowired
	private DemoMapper demoMapper;

	@ApiOperation(value = "获取Demo列表", notes = "", httpMethod = "POST")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "page", value = "当前页", paramType = "query"),
		@ApiImplicitParam(name = "limit", value = "每页条数", paramType = "query"),
	  })
	@RequestMapping(value ="/getDemoListByPage")
	public List getDemoForJackson2(Integer page,Integer limit) throws Exception{
		
		if(page==null){page=1;}
		if(limit==null){limit=2;}
		PageHelper.startPage(page, limit);
		List list=demoMapper.selectAll();
		
		return list;
	}
	
	@ApiOperation(value = "查询Demo实例", notes = "", httpMethod = "POST")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "d_id", value = "序号", paramType = "query"),
		@ApiImplicitParam(name = "d_name", value = "名称", paramType = "query"),
	  })
	@RequestMapping(value ="/getDemoByParam")
	public List getDemoByParam(Long d_id,String d_name) throws Exception{
		
		HashMap<String, Object> map=new HashMap<>();
		
		map.put("dId", d_id);
		
		map.put("dName", d_name);
		
		List list=demoMapper.selectDemoByParam(map);
		
		return list;
	}
}