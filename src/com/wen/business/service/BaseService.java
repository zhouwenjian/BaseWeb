
package com.wen.business.service;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		//@ApiImplicitParam(name = "id", value = "序号", paramType = "query"),
		//@ApiImplicitParam(name = "name", value = "名称", paramType = "query"),
	  })
	@RequestMapping(value ="/getDemoAll")
	public List getDemoForJackson2() throws Exception{
		
		List list=demoMapper.selectAll();
		
		return list;
	}
}