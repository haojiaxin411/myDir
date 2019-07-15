package com.offcn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.offcn.dao.TbBrandMapper;
import com.offcn.pojo.TbBrand;

@Service
public class BrandServiceImpl  implements BrandService{

	@Autowired
	private TbBrandMapper brandMapper;

	public PageInfo<TbBrand> findAll() {
			PageHelper.startPage(1, 10);
			List<TbBrand> list = brandMapper.selectByExample(null);
			PageInfo<TbBrand> page = new PageInfo<TbBrand>(list);
			return page;
	}
	
	

}
