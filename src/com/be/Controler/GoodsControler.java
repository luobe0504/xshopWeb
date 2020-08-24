package com.be.Controler;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.be.Service.IGoodsService;
import com.be.Service.IGoodstypeService;
import com.be.Service.IPhoneService;
import com.be.ServiceImpl.GoodsServiceImpl;
import com.be.ServiceImpl.GoodstypeServiceImpl;
import com.be.ServiceImpl.PhoneServiceImpl;
import com.be.pojo.Goods;
import com.be.pojo.Goodstype;
import com.be.pojo.Phone;
import com.be.pojo.pageBean;
import com.be.utils.Tools;

public class GoodsControler extends BaseControler {
	private IGoodstypeService goodstypeservice = new GoodstypeServiceImpl();
	private IGoodsService goodsservice = new GoodsServiceImpl();
	private IPhoneService phoneservice = new PhoneServiceImpl();
	private Integer rows = 2;

	protected String delete(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		String ids = request.getParameter("id");
		int id = ids == null ? 0 : Integer.valueOf(ids);
		int res = goodsservice.delete(id);
		if (res == 1) {
			return "redirect:load";
		} else {
			return "err";
		}
	}

	protected String selectOne(HttpServletRequest request, HttpServletResponse arg1)
			throws ServletException, IOException {
		String ids = request.getParameter("id");

		if (ids != null) {
			int id = Integer.valueOf(ids);
			Phone goods = phoneservice.selectOne(id);
			String gpug=Tools.format(goods.getGdate());
			goods.setGpug(gpug);
			request.setAttribute("goods", goods);
		}
		return "forward:goodsDetail";
	}

	protected String update(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		String gids = request.getParameter("gid");
		int gid = 0;
		if (gids != null && gids.length() > 0)
			gid=Integer.valueOf(gids);

		String tid = request.getParameter("gtid");
		int gtid = Integer.valueOf(tid);

		String gname = request.getParameter("gname");
		gname = new String(gname.getBytes("iso-8859-1"), "utf-8");
		String dates = request.getParameter("gdate");
		Date gdate = Tools.format(dates);
		
		/* String gpic = request.getParameter("gpicture"); */
		String price = request.getParameter("gprice");
		int gprice = Integer.valueOf(price);
		String star = request.getParameter("gstar");
		int gstar = Integer.valueOf(star);
		String ginfo = request.getParameter("ginfo");
		ginfo = new String(ginfo.getBytes("iso-8859-1"), "utf-8");
		Goods goods = new Goods(gid, gtid, gname, gdate, null, gprice, gstar, ginfo);
		
		
		if (gids.length() > 0) {
			int res = goodsservice.update(goods);
			if (res == 1) {
				return "redirect:load";
			} else {
				return "err";
			}
		} else {
			int res = goodsservice.insert(goods);
			if (res == 1) {
				return "redirect:load";
			} else {
				return "err";
			}
		}
	}



	protected String selectPage(HttpServletRequest request, HttpServletResponse arg1)
			throws ServletException, IOException {
		try {
			String ps = request.getParameter("page");

			int page = ps == null ? 1 : Integer.valueOf(ps);
			List<Goods> list = goodsservice.selectPage(page, rows);
			request.setAttribute("plist", list);
			// request.setAttribute("page", page);
			int Mrows = goodsservice.rows();
			// int mpage=Mrows%2==0?(Mrows/2):(Mrows/2+1);
			// request.setAttribute("mpage", mpage);
			pageBean pb = new pageBean();

			pb.setRows(rows);
			pb.setMrows(Mrows);
			if (page > pb.getMpage()) {
				page = pb.getMpage();
			}
			pb.setPage(page);
			request.setAttribute("pb", pb);
			/*List<Goodstype> clist=goodstypeservice.selectAll();
			request.setAttribute("clist", clist);*/
			return "forward:list";
		} catch (NumberFormatException e) {
			return "forward:err";
		}

	}
	protected String selectAll(HttpServletRequest request, HttpServletResponse arg1)
			throws ServletException, IOException {

		List<Goods> list = goodsservice.selectAll();
		// 存储
		request.setAttribute("glist", list);
		
		return "forward:list";
	}
	protected String selectcidLike(HttpServletRequest request, HttpServletResponse arg1)
			throws ServletException, IOException {
		String ps = request.getParameter("page");
		int page = ps == null ? 1 : Integer.valueOf(ps);
		String ids = request.getParameter("id");
		int id = ids == null ? 0 : Integer.valueOf(ids);
		pageBean pb = new pageBean();
		pb.setRows(rows);
		pb.setMrows(3);
		pb.setPage(page);
		request.setAttribute("pb", pb);
		List<Goodstype> list = goodstypeservice.selectcidLike(id, pb);
		request.setAttribute("plist", list);
		return "forward:list";
	}
	protected String selectLike(HttpServletRequest request, HttpServletResponse arg1)
			throws ServletException, IOException {
		String ps = request.getParameter("page");
		int page = ps == null ? 1 : Integer.valueOf(ps);
		String search = request.getParameter("search");
		search = new String(search.getBytes("iso-8859-1"), "utf-8");
		int Mrows = goodsservice.rows(search);
		pageBean pb = new pageBean();
		pb.setRows(rows);
		pb.setMrows(Mrows);
		if (page > pb.getMpage()) {
			page = pb.getMpage();
		}
		pb.setPage(page);
		request.setAttribute("pb", pb);
		request.setAttribute("search", search);
		List<Goods> list = goodsservice.selectLike(search, pb);
		request.setAttribute("plist", list);
		return "forward:list";

	}
}
