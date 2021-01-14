package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;


@WebServlet("/Member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
/*
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
*/
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
		// post ����� ���ڵ� ó��(�ѱ�)
		// ��û
		request.setCharacterEncoding("utf-8");
		Enumeration<String> enu = request.getParameterNames();
		//html �±� ��name���� ��� ���ؼ� getParameterNames() �޼ҵ带 ����ؼ�
		//Enumeration Ÿ������ ���� ����
		
		// ����
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		//hasMoreElements() �޼ҵ�� nextElement() �� ����Ͽ� 
		//name ���� ����
		//getParameter() �޼ҵ带 ����Ͽ� value ���� �� ����Ѵ�.
		while(enu.hasMoreElements()) {
			String name=enu.nextElement();
			String value=request.getParameter(name);
			out.print(name+":" +value+"<br>");
		}
		
		
		
		out.print("</body>");
		out.print("</html>");
	}

}
