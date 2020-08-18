package com.be.daoImpl;

import java.util.List;

import com.be.dao.IPhoneDao;

import com.be.pojo.Phone;

public class PhoneDaoImpl extends BaseDao implements IPhoneDao {

	@Override
	public Phone selectOne(int id) {
			/* select g.*,gt.*,p.* from goods g,goodstype gt , phone p where g.gt_id=gt.gt_id and g.g_id=p.g_id;*/
			String sql="select g.g_id gid,g.gt_id gtid,g_name gname,g_date gdate,g_picture gpicture,g_price gprice,g_star gstar,g_info ginfo,gpic1,gpic2,gpic3,gpic4,";
			sql=sql+"gt.gt_id gtid,gt_name gtname,gt_level gtlevel,gt_parent gtparent,";
			sql=sql+"ph.ph_id phid,ph.g_id gid,ph_chuliqi phchuliqi,ph_neicun phneicun,ph_yanse phyanse,pn_banben pnbanben from goods g,goodstype gt,phone ph  ";
			sql=sql+"where g.g_id=ph.g_id and g.gt_id=gt.gt_id and g.g_id=?";
			List list=queryAll(sql,Phone.class,new Object[]{id});
			return (Phone) list.get(0);
		}
	}

