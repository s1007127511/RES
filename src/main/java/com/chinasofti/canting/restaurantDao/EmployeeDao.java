package com.chinasofti.canting.restaurantDao;

import java.util.List;

import com.chinasofti.canting.domain.Employee;

public interface EmployeeDao {
//插入新员工信息的方法
	public boolean insertEmp(Employee e);
//删除根据id员工信息的方法
    public boolean deleteEmpById(int eid);
//查询所有员工的方法
	public List<Employee> selectAllEmp();
//按id查询单个员工的方法
	public Employee selectEmpById(int id);
//登录的方法
	public Employee login(int eid,String epassword);
//修改初始密码的方法（）
	public boolean logup(int eid,String newepassword);
//修改餐卡不同等级的折扣
    public boolean updateCarLeveDiscount(int leve);
	
}
