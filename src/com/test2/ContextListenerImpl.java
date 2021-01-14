package com.test2;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// ������̼��� �߰���
@WebListener
public class ContextListenerImpl implements ServletContextListener {

	// �����̳� (Container) : ����ġ ������ �ǹ���
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println("�� ���ø����̼� ���� ....");

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("�� ���ø����̼� �ʱ�ȭ (������̼�)....");
	}

}
