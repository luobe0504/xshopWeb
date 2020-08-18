package com.be.Controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.be.Service.IGoodsService;
import com.be.ServiceImpl.GoodsServiceImpl;
import com.be.pojo.Goods;


@WebServlet("/cart")
public class CartControler extends BaseControler {
	private IGoodsService goodsservice = new GoodsServiceImpl();
	protected void add(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		String ids=request.getParameter("id");
		int id=Integer.valueOf(ids);
		Goods goods=goodsservice.selectOne(id);
	}

}
