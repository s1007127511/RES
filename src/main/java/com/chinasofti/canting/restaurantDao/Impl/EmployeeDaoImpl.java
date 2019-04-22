package com.chinasofti.canting.restaurantDao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.canting.domain.Employee;
import com.chinasofti.canting.restaurantDao.EmployeeDao;
import com.chinasofti.canting.until.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{
	private DBUtil db;
	public boolean insertEmp(Employee e) {
		this.db=new DBUtil();
		String sql="insert into employeetable values(?,?,?)";
		try {
			int i = this.db.update(sql,e.getEid(),e.getEname(),e.getEpassword());
			return i>0;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return false;
		}	finally{
			this.db.closed();
		}	
	}

	public boolean deleteEmpById(int eid) {
		this.db=new DBUtil();
		String sql="delete from employeetable where eid="+eid;
		try {
			int i = this.db.update(sql);
			return i>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}finally{
			this.db.closed();
		}
	}

	public List<Employee> selectAllEmp() {
		this.db=new DBUtil();
		String sql="select*from employeetable";
		try {
			ResultSet rs = this.db.query(sql);
			List<Employee> list=new ArrayList<Employee>();
			while(rs.next()){
				list.add(new Employee(rs.getInt("eid"), rs.getString("ename"),rs.getString("epassword")));
			}
			return list;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}finally{
			this.db.closed();
		}
	}

	public Employee selectEmpById(int id) {
		this.db=new DBUtil();
		String sql="select*from employeetable where eid="+id;
		try {
			ResultSet rs = this.db.query(sql);
			Employee emp=new Employee(rs.getInt("eid"),rs.getString("ename"),rs.getString("epassword"));
			return emp;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return null;
		}finally{
			this.db.closed();
		}
	}

	public Employee login(int eid, String epassword) {
		db=new DBUtil();
		String sql="select*from employeetable where eid=? and epassword=?";
		try {
			ResultSet rs = this.db.query(sql,eid,epassword);
			if(rs.next()){
				return new Employee(rs.getInt("eid"),rs.getString("ename"),rs.getString("epassword"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.db.closed();
		}

		return null;
	}

	public boolean logup(int eid,String newepassword) {
		db=new DBUtil();
		String sql="select*from employeetable where eid="+eid;
		try {
			ResultSet rs = this.db.query(sql);
			if(rs.next()){
				String s="update employeetable set epassword=? where eid=?";
				int i = this.db.update(sql,newepassword,eid);
				return i>0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.db.closed();
		}
		return false;
		
	}
	public boolean updateCarLeveDiscount(int leve) {
		db=new DBUtil();
		String sql="update Cardleveltable set ediscount=? where leve="+leve;
		try {
			int i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			this.db.closed();
		}
		
	}

}
