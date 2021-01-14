package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="InitParamAnnoServlet", 
                     urlPatterns = {"/InitParamAnno"},
                     initParams = {
                    		 @WebInitParam(name="dirPath", value="c:\\pk"),
                             @WebInitParam(name="userid", value="admin")})
public class InitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		// �ʱ� �Ķ���� ���
		String dirPath = getInitParameter("dirPath");
		/*  getInitParameter : name�� �ش��ϴ� �ʱ�ȭ �Ķ���� ���� ������
		 *                              name�� �ش��ϴ� �Ķ���� ���̾����� null �� ������
		 */
		String userid= getInitParameter("userid");
		
		System.out.println("���丮 ���:"+dirPath);
		System.out.println("���̵� :"+userid);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("���丮 ���:"+dirPath+"<br>");
		out.print("���̵� ��:"+userid+"<br>");
		out.print("</body></html>");
		
		
	}

}
