package com.test;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostPreServlet
 */
@WebServlet("/PostPre")
public class PostPreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    System.out.println("doGet");
	}
	
	// ��ó��(init �޼ҵ尡 ȣ��Ǳ� �� ó��)
	// ��ó���۾� ���� ������̼�
	@PostConstruct
	public void initMethod() {
		System.out.println("initMethod");
	}
	
	// ��ó�� (destroy �޼ҵ尡 ȣ��� �� ����)
	// ��ó�� ���� ������̼�
	@PreDestroy
	public void clean() {
		System.out.println("clean");
	}
	
}
