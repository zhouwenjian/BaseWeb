
package com.wen.business.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wen.business.model.Demo;

@Api(value = "base", tags = {"基础服务"})
@RestController
@RequestMapping("/baseService")
public class BaseService {

	@ApiOperation(value = "Jackson2", notes = "", httpMethod = "POST")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "id", value = "序号", paramType = "query"),
		@ApiImplicitParam(name = "name", value = "名称", paramType = "query"),
	  })
	@RequestMapping(value ="/getDemoForJackson2")
	public Demo getDemoForJackson2(Demo demo) throws Exception{
		
		return demo;
	}
}