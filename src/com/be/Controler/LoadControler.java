package com.be.Controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.be.Service.IGoodsService;
import com.be.ServiceImpl.GoodsServiceImpl;
import com.be.pojo.Goods;

@WebServlet("/load")
public class LoadControler extends BaseControler {
	private IGoodsService goodsService = new GoodsServiceImpl();

	protected String show(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {

		List<Goods> list = goodsService.loadgoods();
		// 存储
		request.setAttribute("glist", list);
		// 跳转

		return "index";
	}

}
