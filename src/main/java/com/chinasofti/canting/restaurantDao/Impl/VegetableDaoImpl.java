package com.chinasofti.canting.restaurantDao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.canting.domain.vegetable;
import com.chinasofti.canting.restaurantDao.VegetableDao;
import com.chinasofti.canting.until.DBUtil;

public class VegetableDaoImpl implements VegetableDao{
	private DBUtil db;
	public List<vegetable> selectAllVeg() {
		this.db=new DBUtil();
		String sql="select *from Vegetabletable";
		List<vegetable> list=new ArrayList<vegetable>();
		try {
			ResultSet rs = this.db.query(sql);
			while(rs.next()){
				list.add(new vegetable(rs.getInt("vid"), rs.getString("vname"), rs.getDouble("vprice"), rs.getDouble("vdiscount")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.db.closed();
		}
		return null;
	}

	public List<vegetable> selectVegByState(int vstate) {
		this.db=new DBUtil();
		String sql="select *from Vegetabletable where vstate="+vstate;
		List<vegetable> list=new ArrayList<vegetable>();
		try {
			ResultSet rs = this.db.query(sql);
			while(rs.next()){
				list.add(new vegetable(rs.getInt("vid"),rs.getString("vname"), rs.getDouble("vprice"), rs.getDouble("vdiscount")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.db.closed();
		}
		return null;
	}

	public boolean updateVegInfoById(String vname,int vprice,double vdiscount,int vid) {
		this.db=new DBUtil();
		
		String sql="update Vegetabletable set vname=?,vprice=?,vdiscount=? where vid="+vid;
		String sql2="select vstate from vegetabletable where vid="+vid;
		try {
			ResultSet rs = this.db.query(sql2);
			if(rs.getInt("vstate")==1){
				int i = this.db.update(sql,vname,vprice,vdiscount);
				return i>0;
			}else{
				System.out.println("菜品已下架，无法修改");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("菜品信息修改错误");
			return false;
		}finally{
			this.db.closed();
		}
	
	}

	public boolean addNewVegInfo(String vname,int vprice,int vtype) {
		this.db=new DBUtil();
		String sql="insert into Vegetabletable(vname,vprice,vtype) values(?,?,?)";
		try {
			int i = this.db.update(sql,vname,vprice,vtype);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("菜品信息插入错误s");
			return false;
		}finally{
			this.db.closed();
		}
	}

	public boolean updateVegState(int vid) {
		this.db=new DBUtil();
		String sql="update Vegetabletable set vstate=? where vid="+vid;
		String sql2="select vstate from vegetabletable where vid="+vid;
		try {
			ResultSet rs = this.db.query(sql2);
			if(rs.getInt("vstate")==0){
				int i = this.db.update(sql,1);
				return i>0;
			}else{
				int i = this.db.update(sql,0);
				return i>0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("菜品信息修改错误s");
			return false;
		}finally{
			this.db.closed();
		}
	}

}
