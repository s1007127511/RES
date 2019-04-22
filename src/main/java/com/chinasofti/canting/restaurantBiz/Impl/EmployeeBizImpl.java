package com.chinasofti.canting.restaurantBiz.Impl;

import java.util.List;

import com.chinasofti.canting.domain.Employee;
import com.chinasofti.canting.restaurantBiz.EmployeeBiz;
import com.chinasofti.canting.restaurantDao.EmployeeDao;
import com.chinasofti.canting.restaurantDao.Impl.EmployeeDaoImpl;

public class EmployeeBizImpl implements EmployeeBiz{
	private EmployeeDao empDao;
	
	public EmployeeBizImpl() {
		super();
		this.empDao = new EmployeeDaoImpl();
	}

	@Override
	public String insertEmp2(Employee e) {
		// TODO Auto-generated method stub
		return this.empDao.insertEmp(e)?"插入成功":"插入失败";
	}

	@Override
	public String deleteEmpById2(int eid) {
		// TODO Auto-generated method stub
		return this.empDao.deleteEmpById(eid)?"删除成功":"删除失败";
	}

	@Override
	public List<Employee> selectAllEmp2() {
		// TODO Auto-generated method stub
		return this.empDao.selectAllEmp();
	}

	@Override
	public Employee selectEmpById2(int id) {
		// TODO Auto-generated method stub
		return this.empDao.selectEmpById(id);
	}

	@Override
	public Employee login2(int eid, String epassword) {
		// TODO Auto-generated method stub
		return this.empDao.login(eid, epassword);
	}

	@Override
	public String logup2(int eid, String newepassword) {
		// TODO Auto-generated method stub
		return this.empDao.logup(eid, newepassword)?"修改成功":"修改失败";
	}

	@Override
	public String updateCarIntegral2(int leve) {
		// TODO Auto-generated method stub
		return this.empDao.updateCarLeveDiscount(leve)?"修改成功":"修改失败";
	}


}
