package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sport")
public class SportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// post ��Ŀ����� ���ڵ� ó��
		request.setCharacterEncoding("utf-8");
	    // post ������� ��û�� ��쿡�� �Ķ���Ͱ��� ��� ���� ������ doGet �Ǵ�
		// doPost �޼ҵ峻���� request.setCharacterEncoding("utf-8")�޼ҵ带 
		// ����ؼ� �ѱ� ���ڵ��� ó������
		
	     /* Get ������� ó���Ҷ�
	      *  - get ������� ó���ϳ� ��� ������ ���� ������ server.xml ���Ͽ���
	      *    ������    URIEncoding="UTF-8"�� ó����
	      */
		
		// checkbox���� ������ ���� �迭�� ���Ϲ���
		String[]  sports = request.getParameterValues("sports");
		String gender = request.getParameter("gender");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head><title>�����ϴ� ��� ����</title></head>");
		out.print("<body>");
		
		for(String sport : sports) 
		{
			out.print("�����ϴ� � :"+sport+"<br>");
		}
		
		out.print("���� :"+gender+"<br>");
		out.print("</body>");
		out.print("</html>");
		
		
	}

}
