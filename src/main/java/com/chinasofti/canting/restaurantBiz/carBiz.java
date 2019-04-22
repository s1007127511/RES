package com.chinasofti.canting.restaurantBiz;

import com.chinasofti.canting.domain.card;

public interface carBiz {
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
}
