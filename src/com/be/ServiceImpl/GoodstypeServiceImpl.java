package com.be.ServiceImpl;

import java.util.List;

import com.be.Service.IGoodstypeService;

import com.be.dao.IGoodstypeDao;

import com.be.daoImpl.GoodstypeDaoImpl;
import com.be.pojo.Goodstype;
import com.be.pojo.pageBean;

public class GoodstypeServiceImpl implements IGoodstypeService {
	private IGoodstypeDao goodstypedao =new GoodstypeDaoImpl();

	@Override
	public List<Goodstype> selectAll() {
		
		return goodstypedao.selectAll();
	}

	@Override
	public List<Goodstype> selectAllByid(int id) {
		
		return goodstypedao.selectAllByid(id);
	}

	@Override
	public List<Goodstype> selectcidLike(int id, pageBean pb) {
	
		return goodstypedao.selectcidLike(id,pb);
	}
}
