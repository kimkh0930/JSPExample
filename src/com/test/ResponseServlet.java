package com.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/Response")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			//MIME Ÿ�Լ��� (Multipurpose Internet Mail Extensions)
			// MIME : ���Ϻ�ȯ 
			// - ������ �ؽ�Ʈ���ڷ� ��ȯ�Ͽ� �����, ���� ���ؼ� ���� ������ ������ �����Ҷ� ���
			response.setContentType("text/html;charset=utf-8");
			
			// PrintWriter ��ü ����
			PrintWriter out = response.getWriter(); 
			// ���� �����͸� ���
			
			// ���ڿ��� �̿��Ͽ� html �ۼ� �� ���
			out.print("<html>");
			out.print("<body>");
			
			out.print("ResponseServelt ��û ����!!!");
		
			out.print("</body>");
			out.print("</html>");
		
		
		}

}
