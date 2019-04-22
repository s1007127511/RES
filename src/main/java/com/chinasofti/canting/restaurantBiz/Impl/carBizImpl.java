package com.chinasofti.canting.restaurantBiz.Impl;

import com.chinasofti.canting.domain.card;
import com.chinasofti.canting.restaurantBiz.carBiz;
import com.chinasofti.canting.restaurantDao.cardDao;
import com.chinasofti.canting.restaurantDao.Impl.cardDaoImpl;

public class carBizImpl implements carBiz{
	//创建Dao对象
	private cardDao cardDao;


	public carBizImpl() {
		super();
		this.cardDao = new cardDaoImpl();
	}

	@Override
	public card selectCardById2(int eid) {
		// TODO Auto-generated method stub
		return this.cardDao.selectCardById(eid);
	}

	@Override
	public int selectMoneyById2(int eid) {
		// TODO Auto-generated method stub
		return this.cardDao.selectMoneyById(eid);
	}

	@Override
	public String addMoneyById2(int eid, int money) {
		// TODO Auto-generated method stub
		return this.cardDao.addMoneyById(eid, money)?"充值成功":"充值失败";
	}

	@Override
	public String updatePasswordById2(int eid, String password) {
		// TODO Auto-generated method stub
		return this.cardDao.updatePasswordById(eid, password)?"修改成功":"修改失败";
	}

	@Override
	public String updateStateById2(int eid) {
		// TODO Auto-generated method stub
		return this.cardDao.updateStateById(eid)?"修改成功":"修改失败";
	}

	@Override
	public String updateIntegralById2(int integral, int eid) {
		// TODO Auto-generated method stub
		return this.cardDao.updateIntegralById(integral, eid)?"修改成功":"修改失败";
	}

	@Override
	public String addIntegralById2(int sum, int eid) {
		// TODO Auto-generated method stub
		return this.cardDao.addIntegralById(sum, eid)?"修改成功":"修改失败";
	}

	@Override
	public String addCardById2(int eid) {
		// TODO Auto-generated method stub
		return this.cardDao.addCardById(eid)?"修改成功":"修改失败";
	}

	@Override
	public String updateCarLeve2(int eid, int newleve) {
		// TODO Auto-generated method stub
		return this.cardDao.updateCarLeve(eid, newleve)?"修改成功":"修改失败";
	}


}
