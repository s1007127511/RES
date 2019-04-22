package com.chinasofti.canting.restaurantDao.Impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.chinasofti.canting.domain.Dailysale;
import com.chinasofti.canting.domain.Shoppingcar;
import com.chinasofti.canting.domain.xiaopiao;
import com.chinasofti.canting.restaurantDao.ShoppingCarDao;
import com.chinasofti.canting.until.DBUtil;

public class ShoppingCarDaoImpl implements ShoppingCarDao{
	private DBUtil db;
	private cardDaoImpl cardao;
	public boolean addVegById(int vid,int number,int eid) {
		this.db=new DBUtil();
		UUID uid=UUID.randomUUID();
		String did = uid.toString().replaceAll("-","");
		String sql="insert into Shoppingtable values(?,?,?,?,?,?)";
		String sql2="select*from Vegetabletable where vid="+vid;
		String sql3="select ediscount form Cardtable c,Cardleveltable cl where c.leve=cl.leve and c.eid="+eid;
		try {
			ResultSet rs2 = this.db.query(sql2);
			ResultSet rs3 = this.db.query(sql3);
			double sum=rs2.getInt("vprice")*number*rs2.getDouble("vdiscount")*rs3.getDouble("ediscount");
			int i = this.db.update(sql,did,eid,vid,number,rs2.getInt("vprice"),sum);
			return i>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}finally{
			this.db.closed();
		}	

	}

	public boolean delVegById(int vid,int number) {
        this.db=new DBUtil();
        String sql="select number from Shoppingtable where vid="+vid;
        String sql2="update Shoppingtable set number=number-? where vid="+vid;
        String sql3="delete from Shoppingtable where vid="+vid;
        try {
			ResultSet rs = this.db.query(sql);
			int i = rs.getInt("number");
			if(i>number){
				int j = this.db.update(sql2,number);
				return j>0;
			}else if(i==number){
				int j = this.db.update(sql3);
				return j>0;
			}else{
				System.out.println("数量输入错误！");
			return false;	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally{
			this.db.closed();
		}
       
	}

	public boolean insertDailySale(Shoppingcar shopcar) {
		 this.db=new DBUtil();
	     String sql="insert into Dailysaletable(did,sales) values(?,?)";
		 try {
			int i = this.db.update(sql,shopcar.getDid(),shopcar.getSum());
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.db.closed();
		}
	     return false;
	}

	public boolean addIntegral(Shoppingcar shopcar) {
		 this.db=new DBUtil();
		 this.cardao=new cardDaoImpl();
	     String sql="select sum from Shoppingtable where eid="+shopcar.getEid();
		 try {
			ResultSet rs = this.db.query(sql);
			int sum = rs.getInt("sum");
			cardao.addIntegralById(sum,shopcar.getEid());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.db.closed();
		}
		 
	     return false;
	}

	public void printReceipts(Shoppingcar shopcar) {
		 this.db=new DBUtil();
		 Date date=new Date(System.currentTimeMillis());
		 int su = 0;
		 List<xiaopiao> list=new ArrayList<xiaopiao>();
	     String sql="select * from Shoppingtable s,Vegetabletable v where s.vid=v.vid and did="+shopcar.getDid();
	     try {
			ResultSet rs = this.db.query(sql);
			System.out.println("\t\t小票:\n"+rs.getString("did")+"*****************"+"菜名\t数量\t金额");
			while(rs.next()){
				list.add(new xiaopiao(rs.getString("vname"),rs.getInt("number"),rs.getInt("sum")));
			}
			for (xiaopiao xiaopiao : list) {
				System.out.println(xiaopiao);
			    su+=xiaopiao.getSum();
			}
			System.out.println("总计："+su+"\n*****************\n\t\t"+date);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.db.closed();
		}
		
	}

}
