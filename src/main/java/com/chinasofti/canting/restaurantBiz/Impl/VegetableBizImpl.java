package com.chinasofti.canting.restaurantBiz.Impl;

import java.util.List;

import com.chinasofti.canting.domain.vegetable;
import com.chinasofti.canting.restaurantBiz.VegetableBiz;
import com.chinasofti.canting.restaurantDao.VegetableDao;
import com.chinasofti.canting.restaurantDao.Impl.VegetableDaoImpl;

public class VegetableBizImpl implements VegetableBiz{
	private VegetableDao vegDao;
	
	public VegetableBizImpl() {
		super();
		this.vegDao = new VegetableDaoImpl();
	}

	@Override
	public List<vegetable> selectAllVeg2() {
		// TODO Auto-generated method stub
		return this.vegDao.selectAllVeg();
	}

	@Override
	public List<vegetable> selectVegByState2(int vstate) {
		// TODO Auto-generated method stub
		return this.vegDao.selectVegByState(vstate);
	}

	@Override
	public String updateVegInfoById2(String vname, int vprice, double vdiscount, int vid) {
		// TODO Auto-generated method stub
		return this.vegDao.updateVegInfoById(vname, vprice, vdiscount, vid)?"修改成功":"修改失败";
	}

	@Override
	public String addNewVegInfo2(String vname, int vprice, int vtype) {
		// TODO Auto-generated method stub
		return this.vegDao.addNewVegInfo(vname, vprice, vtype)?"修改成功":"修改失败";
	}

	@Override
	public String updateVegState2(int vid) {
		// TODO Auto-generated method stub
		return this.vegDao.updateVegState(vid)?"修改成功":"修改失败";
	}

}
