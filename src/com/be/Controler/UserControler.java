package com.be.Controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.be.Service.IUserService;
import com.be.ServiceImpl.UserServiceImpl;
import com.be.pojo.User;
import com.be.utils.SYS;

public class UserControler extends BaseControler {
	private IUserService userService = new UserServiceImpl();
	protected String logout(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.invalidate();
		return "redirect:load";
	}
		
		
		
		protected String login(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		User user = userService.login(name, pass);
		if (user == null) {
			request.setAttribute(SYS.SYS_ERROR, "输入信息有误");
			return "forward:login";
		} else {
			HttpSession session=request.getSession();
			session.setAttribute(SYS.SYS_USER, user);
			return "redirect:load";
		}
	}
}
