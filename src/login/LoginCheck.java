package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		/*  db���� ����� ������ ��ȸ�ؼ� ���̵� �� ��й�ȣ�� �����;���
		 *   ������ ���̵�� ��й�ȣ�� ��ġ�ϴ����� üũ
		 *   ��ġ�� ��� ����� ������ HttpSession ��ü�� ������Ѽ� ������
		 */
		
		String dbID ="test";
		String dbPWD ="1234";
		
		// db���� ������ ���̵�� ����ڰ� �Է��� ���̵� ��
		
		if(dbID.equals(id) && dbPWD.equals(pwd)) {
			// ���̵�� ��й�ȣ�� ��ġ�Ѱ��
			// ���ǰ�ü�� ����
			HttpSession session = request.getSession();
			// ������� ������ ���ǿ� ����
			session.setAttribute("user", id);
		
		}
		
		response.sendRedirect("Login");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
