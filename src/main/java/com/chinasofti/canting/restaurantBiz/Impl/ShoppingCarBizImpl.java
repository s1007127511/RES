package com.chinasofti.canting.restaurantBiz.Impl;

import com.chinasofti.canting.domain.Shoppingcar;
import com.chinasofti.canting.restaurantBiz.ShoppingCarBiz;
import com.chinasofti.canting.restaurantDao.ShoppingCarDao;
import com.chinasofti.canting.restaurantDao.Impl.ShoppingCarDaoImpl;

public class ShoppingCarBizImpl implements ShoppingCarBiz{
	private ShoppingCarDao shopDao;
	

	public ShoppingCarBizImpl( ) {
		super();
		this.shopDao = new ShoppingCarDaoImpl();
	}

	@Override
	public String addVegById2(int vid, int number, int eid) {
		// TODO Auto-generated method stub
		return this.shopDao.addVegById(vid, number, eid)?"添加成功":"添加失败";
	}

	@Override
	public String delVegById2(int vid, int number) {
		// TODO Auto-generated method stub
		return this.shopDao.delVegById(vid, number)?"删除成功":"删除失败";
	}

	@Override
	public String insertDailySale2(Shoppingcar shopcar) {
		// TODO Auto-generated method stub
		return this.shopDao.insertDailySale(shopcar)?"插入成功":"插入失败";
	}

	@Override
	public String addIntegral2(Shoppingcar shopcar) {
		// TODO Auto-generated method stub
		return this.shopDao.addIntegral(shopcar)?"修改成功":"修改失败";
	}

	@Override
	public void printReceipts2(Shoppingcar shopcar) {
		this.shopDao.printReceipts(shopcar);
		
	}


}
