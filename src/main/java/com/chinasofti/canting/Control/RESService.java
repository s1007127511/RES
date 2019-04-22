package com.chinasofti.canting.Control;

import java.util.List;

import com.chinasofti.canting.domain.Dailysale;
import com.chinasofti.canting.domain.Employee;
import com.chinasofti.canting.domain.Shoppingcar;
import com.chinasofti.canting.domain.card;
import com.chinasofti.canting.domain.vegetable;

public interface RESService {
	//根据员工id查询餐卡信息（oracle） boolean
	public card selectCardById2(int eid);
	//余额查询
	public int selectMoneyById2(int eid);
	//充值
	public String addMoneyById2(int eid,int money);
	//密码修改
	public String updatePasswordById2(int eid,String password);
	//挂失或解冻
	public String updateStateById2(int eid);
	//都在（Oracle）
	//积分兑换（充值？）(输入要兑换的金额)
	public String updateIntegralById2(int integral,int eid);
	//增加积分
	public String addIntegralById2(int sum,int eid);
	//办理新卡（向餐卡数据库插入新的信息，查询工号，之前相同工号的餐卡必须state为0）
	public String addCardById2(int eid);
	//修改员工餐卡等级
	public String updateCarLeve2(int eid,int newleve);
	//插入新员工信息的方法
	public String insertEmp2(Employee e);
	//根据id删除员工信息的方法
	public String deleteEmpById2(int eid);
	//查询所有员工的方法
	public List<Employee> selectAllEmp2();
	//按id查询单个员工的方法
	public Employee selectEmpById2(int id);
	//登录的方法
	public Employee login2(int eid,String epassword);
	//注册的方法
	public String logup2(int eid,String newepassword);
	//修改餐卡不同等级的折扣
	public String updateCarIntegral2(int leve);
	//按菜品id插入菜品信息（进购物车）
	public String addVegById2(int vid,int number,int eid);
	//按 菜品id删除菜品信息（从购物车）如果数量大于1，减少数量
	public String delVegById2(int vid,int number);
	//将购物车内 订单号 金额总和  系统时间 存入日营业额表；如果已经登录，则增加积分金额/10取整
	public String insertDailySale2(Shoppingcar shopcar);
	//根据购物车消费金额返回应得积分.
	public String addIntegral2(Shoppingcar shopcar);
	//打印小票
	public void printReceipts2(Shoppingcar shopcar);
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
