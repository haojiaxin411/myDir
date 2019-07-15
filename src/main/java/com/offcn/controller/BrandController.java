package com.offcn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.offcn.pojo.TbBrand;
import com.offcn.service.BrandService;

@RestController
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/find")
	public List<TbBrand> findAll(){
		PageInfo<TbBrand> pageInfo = brandService.findAll();
		List<TbBrand> list = pageInfo.getList();
		return list;
	}
}
