package com.chinasofti.canting.restaurantBiz;

import java.util.List;

import com.chinasofti.canting.domain.vegetable;

public interface VegetableBiz {
	//显示所有菜品 返回 菜品编号、菜名、单价、特价折扣
		public List<vegetable> selectAllVeg2();
		//按类型显示菜品 返回 菜品
		public List<vegetable> selectVegByState2(int vstate);
		//菜品信息修改按菜品编号（菜名，单价，特价折扣）
		public String updateVegInfoById2(String vname,int vprice,double vdiscount,int vid);
		//增加新菜品（插入到菜品表）
		public String addNewVegInfo2(String vname,int vprice,int vtype);
		//菜品下架，状态改为0
		public String updateVegState2(int vid); 
		
}
