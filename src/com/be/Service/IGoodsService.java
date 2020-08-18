package com.be.Service;

import java.util.List;

import com.be.pojo.Goods;

import com.be.pojo.pageBean;

public interface IGoodsService {
	public List<Goods> loadgoods();

	public int delete(int id);

	public Goods selectOne(int id);

	public int update(Goods goods);

	public int insert(Goods goods);

	public List<Goods> selectAll();

	public List<Goods> selectPage(int page, int rows);

	public int rows(String... like);

	public List<Goods> selectLike(String search, pageBean pb);
}
