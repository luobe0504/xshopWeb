package com.be.Service;

import java.util.List;

import com.be.pojo.Goodstype;

public interface IGoodstypeService {
	public List<Goodstype> selectAll();
	
	public List<Goodstype> selectAllByid(int id);
	
}
