package com.be.Service;

import java.util.List;

import com.be.pojo.Goodstype;
import com.be.pojo.pageBean;

public interface IGoodstypeService {
	public List<Goodstype> selectAll();
	
	public List<Goodstype> selectAllByid(int id);

	public List<Goodstype> selectcidLike(int id, pageBean pb);
	
}
