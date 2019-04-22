package com.chinasofti.canting.restaurantDao;

import com.chinasofti.canting.domain.card;

public interface cardDao {
	//根据员工id查询餐卡信息（oracle） boolean
public card selectCardById(int eid);
	//余额查询
public int selectMoneyById(int eid);
	//充值
public boolean addMoneyById(int eid,int money);
	//密码修改
public boolean updatePasswordById(int eid,String password);
	//挂失或解冻
public boolean updateStateById(int eid);
	//都在（Oracle）
	//积分兑换（充值？）(输入要兑换的积分)
public boolean updateIntegralById(int integral,int eid);
    //增加积分
public boolean addIntegralById(int sum,int eid);
    //办理新卡（向餐卡数据库插入新的信息，查询工号，之前相同工号的餐卡必须state为0）
public boolean addCardById(int eid); 
    //修改员工餐卡等级
public boolean updateCarLeve(int eid,int newleve);
}
