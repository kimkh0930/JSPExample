package com.test2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ContextSet")
public class ContextSetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//�Ӽ� ����
		String name="ȫ�浿";
		int age =20;
		
		// setAttribute(name, value) �޼ҵ带 ����Ͽ� ������
		getServletContext().setAttribute("name", name);
		getServletContext().setAttribute("age", age);
		
		// �̷��� ����� �Ӽ� ���� ���ø����̼��� ����Ǳ� ������ ��� �����
	
	
	}

}
