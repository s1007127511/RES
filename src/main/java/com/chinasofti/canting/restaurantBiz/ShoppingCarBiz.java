package com.chinasofti.canting.restaurantBiz;

import com.chinasofti.canting.domain.Shoppingcar;

public interface ShoppingCarBiz {
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
}
