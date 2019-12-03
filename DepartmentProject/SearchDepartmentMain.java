package com.hcl.dept;



import java.util.Scanner;


public class SearchDepartmentMain {

	public static void main(String[] args) {
		int deptno;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Department No ");
	deptno=sc.nextInt();
	DepartmentDAO dao=new DepartmentDAO();
	Department department=dao.searchDepartment(deptno);
	if(department!=null) {
		System.out.println("DName " +department.getDeptname());
		System.out.println("Loc " +department.getLocation());
		System.out.println("City " +department.getCity());
		System.out.println("Head " +department.getHead());
	} else {
		System.out.println("Record Not Found...");
	}
}
}
