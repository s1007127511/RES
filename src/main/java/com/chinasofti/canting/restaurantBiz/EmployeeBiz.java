package com.chinasofti.canting.restaurantBiz;

import java.util.List;

import com.chinasofti.canting.domain.Employee;

public interface EmployeeBiz {
	//插入新员工信息的方法
		public String insertEmp2(Employee e);
	//根据id删除员工信息的方法
	    public String deleteEmpById2(int eid);
	//查询所有员工的方法
		public List<Employee> selectAllEmp2();
	//按id查询单个员工的方法
		public Employee selectEmpById2(int id);
	//登录的方法
		public Employee login2(int eid,String epassword);
	//注册的方法
		public String logup2(int eid,String newepassword);
	//修改餐卡不同等级的折扣
		public String updateCarIntegral2(int leve);
}
