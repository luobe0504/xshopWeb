package com.be.dao;

import java.util.List;

import com.be.pojo.Goods;
import com.be.pojo.pageBean;

public interface IGoodsDao {

	public List<Goods> select();

	public int delete(int id);

	public Goods selectOne(int id);

	public int update(Goods goods);

	public int insert(Goods goods);

	public List<Goods> selectAll();

	public List<Goods> selectPage(int page, int rows);

	public int rows(String[] like);

	public List<Goods> selectLike(String search, pageBean pb);

}
