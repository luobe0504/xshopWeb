package com.be.daoImpl;

import java.util.List;

import com.be.dao.IGoodstypeDao;
import com.be.pojo.Goods;
import com.be.pojo.Goodstype;
import com.be.pojo.pageBean;
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

	@Override
	public List<Goodstype> selectcidLike(int id, pageBean pb) {
		String sql="select g_id gid,gt_id gtid,g_name gname,g_date gdate,g_picture gpicture,g_price gprice,g_star gstar,g_info ginfo ,gpic1 gpic1,gpic2 gpic2,gpic3 gpic3,gpic4 gpic4 from goods where gt_id=? limit ?,?";
		Object[] obj=new Object[]{id,(pb.getPage()-1)*pb.getRows(),pb.getRows()};	
		return queryAll(sql,Goods.class,obj);
	}

}
