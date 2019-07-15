package com.offcn.service;

import com.github.pagehelper.PageInfo;
import com.offcn.pojo.TbBrand;

public interface BrandService {

	public PageInfo<TbBrand> findAll();
}
