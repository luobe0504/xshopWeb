package com.be.Controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.be.Service.IGoodsService;
import com.be.ServiceImpl.GoodsServiceImpl;
import com.be.daoImpl.ShopCart;
import com.be.daoImpl.ShopItem;
import com.be.pojo.Goods;
import com.be.utils.SYS;
import com.be.vo.Msg;


@WebServlet("/cart")
public class CartControler extends BaseControler {
	private IGoodsService goodsservice = new GoodsServiceImpl();

	protected String updateAdd(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		String uids = request.getParameter("uid");
		String gids = request.getParameter("gid");
		int uid = Integer.parseInt(uids);
		int gid = Integer.parseInt(gids);
		HttpSession session = request.getSession();
		Object obj = session.getAttribute(SYS.SYS_CART);
		if (obj != null && obj instanceof ShopCart) {
			ShopCart shopCart = (ShopCart) obj;
			// cart私有属性中存储
			int num=shopCart.updateAdd(gid);
			return num+"";
		}
		
	return "";
	}
	
	protected String show(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Object obj=session.getAttribute(SYS.SYS_CART);
		if(obj!=null && obj instanceof ShopCart){
			ShopCart shopCart=(ShopCart)obj;
			Collection<ShopItem> items=shopCart.showItem();
			request.setAttribute("items", items);
		}
		
	return "forward:cart";
	}
	protected String add(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		String ids=request.getParameter("id");
		int id=Integer.valueOf(ids);
		Goods goods=goodsservice.selectOne(id);
		HttpSession session=request.getSession();
		ShopCart shopCart=new ShopCart();
		Object obj=session.getAttribute(SYS.SYS_CART);
		if(obj!=null){
			shopCart=(ShopCart)obj;
		}
		int res=shopCart.add(goods);
		Msg msg=new Msg<>();
		if(res==1){
		session.setAttribute(SYS.SYS_CART,shopCart);
		msg.setData("加入购物成功");
		msg.setCode(1);
		}else{
			msg.setData("加入购物失败");
		}
		return JSON.toJSONString(msg);
	}

}
