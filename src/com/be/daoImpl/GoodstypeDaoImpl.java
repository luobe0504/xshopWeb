package com.be.daoImpl;

import java.util.List;

import com.be.dao.IGoodstypeDao;
import com.be.pojo.Goodstype;
public class GoodstypeDaoImpl extends BaseDao<Goodstype> implements IGoodstypeDao {

	@Override
	public List<Goodstype> selectAll() {
		String sql="select gt_id,gt_name,gt_level,gt_parent from goodstype";
		return queryAll(sql, Goodstype.class,null);
	}

}
