package com.be.Controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.be.Service.IUserService;
import com.be.ServiceImpl.UserServiceImpl;
import com.be.pojo.Goods;
import com.be.pojo.User;
import com.be.pojo.pageBean;
import com.be.utils.SYS;

public class UserControler extends BaseControler {
	private IUserService userService = new UserServiceImpl();
	private Integer rows = 2;
	protected String selectOne(HttpServletRequest request, HttpServletResponse arg1)
			throws ServletException, IOException {
		String ids = request.getParameter("ids");
		int id = ids == null ? 0 : Integer.valueOf(ids);
		if (id != 0) {
			User user = userService.selectOne(id);
			request.setAttribute("user", user);
		}
		return "forward:user";
	}
	protected String regist(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		String name = request.getParameter("username");
		name = new String(name.getBytes("iso-8859-1"), "utf-8");
		String pass = request.getParameter("userpass");
		String email = request.getParameter("useremail");
		String gender = request.getParameter("usergender");
		gender = new String(gender.getBytes("iso-8859-1"), "utf-8");
		String flags = request.getParameter("userflag");
		int flag = Integer.valueOf(flags);
		User user=new User(null, name, pass, email, gender, flag, null, null);
		userService.insert(user);

		return "redirect:user";
	}
	protected String deleteAll(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		String ids=request.getParameter("ids");
		ids=ids.substring(0, ids.length()-1);
		String[] id=ids.split(",");
		int[] uids=new int[id.length];
		for(int i=0;i<id.length;i++){
			uids[i]=Integer.valueOf(id[i]);
		}
		userService.deleteAll(uids);
		
		return "{\"res\":\"删除成功\"}";
	}
	
	protected String show(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		String ps = request.getParameter("page");
		int page=1;
		page = ps == null ? 1 : Integer.valueOf(ps);
		pageBean pb = new pageBean();
		pb.setRows(rows);
		pb.setMrows(userService.getRows());
		if (page > pb.getMpage()) {
			page = pb.getMpage();
		}
		pb.setPage(page);
		request.setAttribute("pb", pb);
	
		List<User> list=userService.selectAll(pb);
		request.setAttribute("ulist", list);
		return "forward:user";
	}
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
