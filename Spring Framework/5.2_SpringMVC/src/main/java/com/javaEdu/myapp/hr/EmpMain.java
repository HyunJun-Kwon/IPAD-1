package com.javaEdu.myapp.hr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javaEdu.myapp.hr.model.EmpVO;
import com.javaEdu.myapp.hr.service.IEmpService;

public class EmpMain {
	public static void main(String[] args) {
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("spring/application-config.xml");
		IEmpService empService = context.getBean("empService", IEmpService.class);
		
		System.out.print("-- ��ü ����� �� ��ȸ : ");
		System.out.println(empService.getEmpCount());
		System.out.print("-- �μ��� 50�� ����� �� ��ȸ : ");
		System.out.println(empService.getEmpCount(50));
		
		System.out.println("--103�� ����� ������ ��ȸ�մϴ�.");
		System.out.println(empService.getEmpInfo(103));
		
		System.out.println("-- ��� ��ü ������ ��ȸ�մϴ�.");
		System.out.println(empService.getEmpList());
		
		System.out.println("-- ���ο� ��� ������ �Է��մϴ�.");
		EmpVO emp = new EmpVO();
		emp.setEmployeeId(230);
		emp.setFirstName("gilDDong");
		emp.setLastName("kwon");
		emp.setEmail("honghong@gmail.com");
		emp.setPhoneNumber("222-222");
		emp.setJobId("IT_PROG");
		emp.setSalary(8000);
		emp.setCommissionPct(0.2);
		emp.setManagerId(100);
		emp.setDepartmentId(10);
		try {
			empService.insertEmp(emp);
			System.out.println("insert ok");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("���⼭ �ȵ�");
		}
		
		System.out.println("--�ű� ����� ������ ��ȸ/��� �մϴ�.");
		EmpVO emp210 = empService.getEmpInfo(210);
		System.out.println(emp210);
		
		context.close();
	}
}
