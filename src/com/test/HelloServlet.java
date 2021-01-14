package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Hello")

/*  ���ΰ��� ������ �����ϴ� ����
 *  @WebServlet(name="�����̸�", urlPatterns={"/xxx.aaa","/yyy","/zzz"}
 */
//���ΰ��� ������ �����ϴ� ���
//@WebServlet(name="MyServlet", urlPatterns = {"/xxx.do","/yyy","/zzz"})
@WebServlet(name="MyServlet", value = {"/xxx.do","/yyy.zz","/zzz.cc"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloServlet() { }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("HelloServlet ��û");
		
	}

}
