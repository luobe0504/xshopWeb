package com.be.dao;

import java.util.List;

import com.be.pojo.Goodstype;
import com.be.pojo.pageBean;

public interface IGoodstypeDao {
	public List<Goodstype> selectAll();

	public List<Goodstype> selectAllByid(int id);

	public List<Goodstype> selectcidLike(int id, pageBean pb);
	

}
