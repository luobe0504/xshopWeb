package com.be.Controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.Response;

public class BaseControler extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		try {

			String action = request.getParameter("action");
			if (action == null) {
				action = "show";
			}
			Class clazz = this.getClass();
			Method method = clazz.getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
			Object obj = method.invoke(this, request, arg1);
		
				if (obj instanceof String) {
					String oo = (String) obj;
					if (oo.startsWith("redirect")) {
						arg1.sendRedirect(oo.substring(oo.indexOf(":") + 1));
						return;
					} else if (oo.startsWith("forward")) {

						request.getRequestDispatcher(oo.substring(oo.indexOf(":") + 1) + ".jsp").forward(request, arg1);
						return;		
				}else{
					PrintWriter pw=arg1.getWriter();
					pw.write(oo);
					pw.flush();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
