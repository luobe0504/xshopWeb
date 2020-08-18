package com.be.daoImpl;

import java.util.List;

import com.be.dao.IGoodsDao;
import com.be.pojo.Goods;

import com.be.pojo.pageBean;





public class GoodsDaoImpl extends BaseDao implements IGoodsDao {

	@Override
	public List<Goods> select() {
		String sql = "select g_id gid,gt_id gtid,g_name gname,g_date gdate,g_picture gpicture,g_price gprice,g_star gstar,g_info ginfo from goods limit 0,5";
		return queryAll(sql, Goods.class, null);
	}
	@Override
	public int delete(int id) {
		String sql="delete from goods where g_id=?";

		return delete(sql,Goods.class,new Object[]{id});
	}	
	@Override
	public Goods selectOne(int id) {
		/* select g.*,gt.*,p.* from goods g,goodstype gt , phone p where g.gt_id=gt.gt_id and g.g_id=p.g_id;*/
		String sql="select g_id gid,gt_id gtid,g_name gname,g_date gdate,g_picture gpicture,g_price gprice,g_star gstar,g_info ginfo from goods where g_id=?";
		List list=queryAll(sql,Goods.class,new Object[]{id});
		return (Goods) list.get(0);
	}
	@Override
	public int update(Goods goods) {
		String sql="update goods set gt_id=?,g_name=?,g_date=?,g_price=?,g_star=?,g_info=? where g_id=?";
		Object[] obj=new Object[]{goods.getGtid(),goods.getGname(),goods.getGdate(),goods.getGprice(),goods.getGstar(),goods.getGinfo(),goods.getGid()};
				return update(sql,Goods.class,obj);
	}
	@Override
	public int insert(Goods goods) {
	
			String sql="insert into goods values (null,?,?,?,?,?,?,?)"; 
			Object[] obj=new Object[]{goods.getGtid(),goods.getGname(),goods.getGdate(),"static/img/pinpai2.png",goods.getGprice(),goods.getGstar(),goods.getGinfo()};
			return insert(sql,Goods.class,obj);
		}
	@Override
	public List<Goods> selectAll() {
		String sql="select g_id gid,gt_id gtid,g_name gname,g_date gdate,g_picture gpicture,g_price gprice,g_star gstar,g_info ginfo  from goods";
		return queryAll(sql,Goods.class,null);
	}
	@Override
	public List<Goods> selectPage(int page, int rows) {
		//String sql="select g_id gid,gt_id gtid,g_name gname,g_date gdate,g_picture gpicture,g_price gprice,g_star gstar,g_info ginfo from goods limit ?,?";
		String sql="select g.g_id gid,g.gt_id gtid,g.g_name gname,g.g_date gdate,g.g_picture gpicture,g.g_price gprice,g.g_star gstar,g.g_info ginfo ,gt.gt_name gtname from goods g,goodstype gt where g.gt_id=gt.gt_id  limit ?,?";
		return queryAll(sql,Goods.class,new Object[]{(page-1)*rows,rows});
		
	}

	@Override
	public int rows(String...like) {
		String sql;
		if(like.length>0){
			 sql="select g_id,gt_id,g_name,g_date,g_picture,g_price,g_star,g_info from goods where g_name like '%"+like[0]+"%'";
		}else{
			sql="select g_id gid,gt_id gtid,g_name gname,g_date gdate,g_picture gpicture,g_price gprice,g_star gstar,g_info ginfo from goods";
		}
		List list= queryAll(sql,Goods.class,null);
		return list.size();
	}

	@Override
	public List<Goods> selectLike(String search,pageBean pb) {
		String sql="select g_id gid,gt_id gtid,g_name gname,g_date gdate,g_picture gpicture,g_price gprice,g_star gstar,g_info ginfo from goods where g_name like ? limit ?,?";
		Object[] obj=new Object[]{"%"+search+"%",(pb.getPage()-1)*pb.getRows(),pb.getRows()};	
		return queryAll(sql,Goods.class,obj);
	}

	
	}

