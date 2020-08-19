package com.be.daoImpl;

import java.util.List;

import com.be.dao.IGoodstypeDao;
import com.be.pojo.Goodstype;
public class GoodstypeDaoImpl extends BaseDao<Goodstype> implements IGoodstypeDao {

	@Override
	public List<Goodstype> selectAll() {
		String sql="select gt_id gtid,gt_name gtname,gt_level gtlevel,gt_parent gtparent,gtpic gtpic from goodstype where gt_level=1";
		return queryAll(sql, Goodstype.class,null);
	}

	@Override
	public List<Goodstype> selectAllByid(int id) {
		String sql="select gt_id gtid,gt_name gtname,gt_level gtlevel,gt_parent gtparent,gtpic gtpic from goodstype where gt_parent=?";
		return queryAll(sql, Goodstype.class,new Object[]{id});
	}

}
