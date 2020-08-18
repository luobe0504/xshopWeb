package com.be.ServiceImpl;

import java.util.List;

import com.be.Service.IGoodsService;
import com.be.dao.IGoodsDao;
import com.be.daoImpl.GoodsDaoImpl;
import com.be.pojo.Goods;

import com.be.pojo.pageBean;




public class GoodsServiceImpl implements IGoodsService {
	private IGoodsDao goodsdao =new GoodsDaoImpl();
	@Override
	public List<Goods> loadgoods() {
		return goodsdao.select();
	}
	
	@Override
	public int delete(int id) {
		return goodsdao.delete(id);
	}
	@Override
	public int update(Goods goods) {
		
		return goodsdao.update(goods);
	}



	@Override
	public Goods selectOne(int id) {
			return goodsdao.selectOne(id);
	}

	@Override
	public int insert(Goods goods) {
		
			return goodsdao.insert(goods);
		}
	@Override
	public List<Goods> selectAll() {
		return goodsdao.selectAll();
	}
	@Override
	public List<Goods> selectPage(int page,int rows) {
		
		return goodsdao.selectPage(page,rows);
	}

	@Override
	public int rows(String...like) {
		return goodsdao.rows(like);
		
	}

	@Override
	public List<Goods> selectLike(String search,pageBean pb) {
		
		return goodsdao.selectLike(search,pb);
	}
	
	
	}



