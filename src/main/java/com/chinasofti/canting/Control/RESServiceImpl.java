package com.chinasofti.canting.Control;

import java.util.List;

import com.chinasofti.canting.domain.Dailysale;
import com.chinasofti.canting.domain.Employee;
import com.chinasofti.canting.domain.Shoppingcar;
import com.chinasofti.canting.domain.card;
import com.chinasofti.canting.domain.vegetable;
import com.chinasofti.canting.restaurantBiz.EmployeeBiz;
import com.chinasofti.canting.restaurantBiz.ShoppingCarBiz;
import com.chinasofti.canting.restaurantBiz.VegetableBiz;
import com.chinasofti.canting.restaurantBiz.carBiz;
import com.chinasofti.canting.restaurantBiz.Impl.EmployeeBizImpl;
import com.chinasofti.canting.restaurantBiz.Impl.ShoppingCarBizImpl;
import com.chinasofti.canting.restaurantBiz.Impl.VegetableBizImpl;
import com.chinasofti.canting.restaurantBiz.Impl.carBizImpl;

public class RESServiceImpl implements RESService{
	private carBiz carb;
	private EmployeeBiz empb;
	private ShoppingCarBiz shopb;
	private VegetableBiz vegb;
	

	public RESServiceImpl() {
		this.carb = new carBizImpl();
		this.empb = new EmployeeBizImpl();
		this.shopb = new ShoppingCarBizImpl();
		this.vegb = new VegetableBizImpl();
	}


	@Override
	public card selectCardById2(int eid) {
		// TODO Auto-generated method stub
		return this.carb.selectCardById2(eid);
	}


	@Override
	public int selectMoneyById2(int eid) {
		// TODO Auto-generated method stub
		return this.carb.selectMoneyById2(eid);
	}


	@Override
	public String addMoneyById2(int eid, int money) {
		// TODO Auto-generated method stub
		return this.carb.addMoneyById2(eid, money);
	}


	@Override
	public String updatePasswordById2(int eid, String password) {
		// TODO Auto-generated method stub
		return this.carb.updatePasswordById2(eid, password);
	}


	@Override
	public String updateStateById2(int eid) {
		// TODO Auto-generated method stub
		return this.carb.updateStateById2(eid);
	}


	@Override
	public String updateIntegralById2(int integral, int eid) {
		// TODO Auto-generated method stub
		return this.carb.updateIntegralById2(integral, eid);
	}


	@Override
	public String addIntegralById2(int sum, int eid) {
		// TODO Auto-generated method stub
		return this.carb.addIntegralById2(sum, eid);
	}


	@Override
	public String addCardById2(int eid) {
		// TODO Auto-generated method stub
		return this.carb.addCardById2(eid);
	}


	@Override
	public String updateCarLeve2(int eid, int newleve) {
		// TODO Auto-generated method stub
		return this.carb.updateCarLeve2(eid, newleve);
	}


	@Override
	public String insertEmp2(Employee e) {
		// TODO Auto-generated method stub
		return this.empb.insertEmp2(e);
	}


	@Override
	public String deleteEmpById2(int eid) {
		// TODO Auto-generated method stub
		return this.empb.deleteEmpById2(eid);
	}


	@Override
	public List<Employee> selectAllEmp2() {
		// TODO Auto-generated method stub
		return this.empb.selectAllEmp2();
	}


	@Override
	public Employee selectEmpById2(int id) {
		// TODO Auto-generated method stub
		return this.empb.selectEmpById2(id);
	}


	@Override
	public Employee login2(int eid, String epassword) {
		// TODO Auto-generated method stub
		return this.empb.login2(eid, epassword);
	}


	@Override
	public String logup2(int eid, String newepassword) {
		// TODO Auto-generated method stub
		return this.empb.logup2(eid, newepassword);
	}


	@Override
	public String updateCarIntegral2(int leve) {
		// TODO Auto-generated method stub
		return this.empb.updateCarIntegral2(leve);
	}


	@Override
	public String addVegById2(int vid, int number, int eid) {
		// TODO Auto-generated method stub
		return this.shopb.addVegById2(vid, number, eid);
	}


	@Override
	public String delVegById2(int vid, int number) {
		// TODO Auto-generated method stub
		return this.shopb.delVegById2(vid, number);
	}


	@Override
	public String insertDailySale2(Shoppingcar shopcar) {
		// TODO Auto-generated method stub
		return this.shopb.insertDailySale2(shopcar);
	}


	@Override
	public String addIntegral2(Shoppingcar shopcar) {
		// TODO Auto-generated method stub
		return this.shopb.addIntegral2(shopcar);
	}


	@Override
	public void printReceipts2(Shoppingcar shopcar) {
		this.shopb.printReceipts2(shopcar);

	}


	@Override
	public List<vegetable> selectAllVeg2() {
		// TODO Auto-generated method stub
		return this.vegb.selectAllVeg2();
	}


	@Override
	public List<vegetable> selectVegByState2(int vstate) {
		// TODO Auto-generated method stub
		return this.vegb.selectVegByState2(vstate);
	}


	@Override
	public String updateVegInfoById2(String vname, int vprice, double vdiscount, int vid) {
		// TODO Auto-generated method stub
		return this.vegb.updateVegInfoById2(vname, vprice, vdiscount, vid);
	}


	@Override
	public String addNewVegInfo2(String vname, int vprice, int vtype) {
		// TODO Auto-generated method stub
		return this.vegb.addNewVegInfo2(vname, vprice, vtype);
	}


	@Override
	public String updateVegState2(int vid) {
		// TODO Auto-generated method stub
		return this.vegb.updateVegState2(vid);
	}

	

}
