package com.be.dao;

import java.util.List;

import com.be.pojo.Goodstype;

public interface IGoodstypeDao {
	public List<Goodstype> selectAll();

	public List<Goodstype> selectAllByid(int id);
	

}
