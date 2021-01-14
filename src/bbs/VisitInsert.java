package bbs;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.sql.*;

//@WebServlet("/VisitInsert")
public class VisitInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		// Ŭ���̾�Ʈ�� write.html�� ��û���� ������ ���� �о��
		String writer=request.getParameter("writer");
		String memo=request.getParameter("memo");
		
		System.out.println("�ۼ��� :"+writer);
		System.out.println("��   �� :"+memo);
		
		// ������ �Ķ���� ���� �����ͺ��̽��� ����
		StringBuffer sql = new StringBuffer();
		sql.append("insert into visit(no, writer, memo, regdate) ");
		sql.append("values(visit_seq.nextval, ?,?,sysdate)");
		
		// ������ ���̽� ����
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
/*			
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ����̹� �Ŵ��� (url, id, pw)
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",
			        "scott", "tiger");
	*/		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//����̹� �Ŵ���(url, id, pw)
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl"
					,"scott",
					"tiger");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, writer);
			pstmt.setString(2, memo);
			pstmt.executeUpdate();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}finally {
			try {if(pstmt != null) pstmt.close();}catch(SQLException ss) {}
			try {if(con != null) con.close();}catch(SQLException ss) {}
		}
		
		
		// ���� ������ �̵� sendRedirect(�̵��� ������)
		response.sendRedirect("VisitList");
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
