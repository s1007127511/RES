package com.chinasofti.canting.restaurantDao;

import java.util.List;

import com.chinasofti.canting.domain.vegetable;

public interface VegetableDao {
	//显示所有菜品 返回 菜品编号、菜名、单价、特价折扣
	public List<vegetable> selectAllVeg();
	//按类型显示菜品 返回 菜品
	public List<vegetable> selectVegByState(int vstate);
	
	//菜品信息修改按菜品编号（菜名，单价，特价折扣）
	public boolean updateVegInfoById(String vname,int vprice,double vdiscount,int vid);
	//增加新菜品（插入到菜品表）
	public boolean addNewVegInfo(String vname,int vprice,int vtype);
	//菜品下架，状态改为0
	public boolean updateVegState(int vid); 
	

}
