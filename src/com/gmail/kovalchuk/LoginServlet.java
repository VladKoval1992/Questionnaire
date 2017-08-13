package com.gmail.kovalchuk;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class LoginServlet extends HttpServlet {

	static final String TEMPLATE = "<html>" +
			"<head><title>Авторизація</title></head>" +
			"<body><h1>%s</h1><a href=\"/login?a=exit\">Назад</a></body></html>";

	static final Map<String, String> pas = new HashMap<String, String>();

	static {
		pas.put("user1", "1");
		pas.put("user2", "2");
		pas.put("user3", "3");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String login = req.getParameter("login");
		String pass = req.getParameter("password");


		String temp = pas.get(login);
		if (pass.equals(temp)) {

			resp.sendRedirect("ancet.jsp");

		}
		else {

			resp.getWriter().println(String.format(TEMPLATE, "Логін або пароль введено не правильно"));

		}

	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
		String a = req.getParameter("a");
			if ("exit".equals(a) )

		resp.sendRedirect("index.jsp");
	}

}
