package com.be.Controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.be.Service.IGoodsService;
import com.be.Service.IGoodstypeService;
import com.be.ServiceImpl.GoodsServiceImpl;
import com.be.ServiceImpl.GoodstypeServiceImpl;
import com.be.pojo.Goods;
import com.be.pojo.Goodstype;

@WebServlet("/load")
public class LoadControler extends BaseControler {
	private IGoodsService goodsService = new GoodsServiceImpl();
	private IGoodstypeService goodstypeservice = new GoodstypeServiceImpl();
	protected String show(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {

		List<Goods> list = goodsService.loadgoods();
		// 存储
		request.setAttribute("glist", list);
		// 跳转
		List<Goodstype> gtlist=goodstypeservice.selectAll();
		request.setAttribute("gtlist", gtlist);
		return "forward:index";
	}

}
