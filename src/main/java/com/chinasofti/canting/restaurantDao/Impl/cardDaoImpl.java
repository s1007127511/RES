package com.chinasofti.canting.restaurantDao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.chinasofti.canting.domain.Employee;
import com.chinasofti.canting.domain.card;
import com.chinasofti.canting.restaurantDao.cardDao;
import com.chinasofti.canting.until.DBUtil;

public class cardDaoImpl implements cardDao{
	private DBUtil db;
	public card selectCardById(int eid) {
		this.db=new DBUtil();
		String sql="select * from cardtable where eid="+eid;
			try {
				ResultSet rs = this.db.query(sql);
				if(rs.next()){
					card c=new card();
					c.setCid(rs.getInt("cid"));
					c.setCmoney(rs.getDouble("cmoney"));
					c.setEid(rs.getInt("eid"));
					c.setIntegral(rs.getInt("integral"));
					c.setLeve(rs.getInt("leve"));
					return c;
				}
			} catch (SQLException e) {
				System.out.println("查询餐卡错误");
				e.printStackTrace();
				return null;
			}finally{
				this.db.closed();
			}
			return null;
	}

	public int selectMoneyById(int eid) {
		this.db=new DBUtil();
		int m = 0;
		String sql="select cmoney from cardtable where eid="+eid;
		try {
			ResultSet rs = this.db.query(sql);
			if(rs.next()){
				m = rs.getInt("cmoney");
			}
		} catch (SQLException e) {
			System.out.println("余额查询错误");
			e.printStackTrace();
			return 0;
		}finally{
			this.db.closed();
		}
		
		return m;
	}

	public boolean addMoneyById(int eid,int money) {
		this.db=new DBUtil();
        int i;
		String sql="update cardtable set cmoney=cmoney+? where eid=?";
		try {
		i = this.db.update(sql,money,eid);
			return i>0;
		} catch (SQLException e) {
			System.out.println("充值错误");
			e.printStackTrace();
			return false;
		}finally{
			this.db.closed();
		}
	}

	public boolean updatePasswordById(int eid,String password) {
		this.db=new DBUtil();
        int i;
		String sql="update Employeetable set epassword=? where eid=?";
		try {
		i = this.db.update(sql,password,eid);
			return i>0;
		} catch (SQLException e) {
			System.out.println("修改密码错误！");
			e.printStackTrace();
			return false;
		}finally{
			this.db.closed();
		}
	}

	public boolean updateStateById(int eid) {
		this.db=new DBUtil();
        int i = 0,n;
        String s="select state from cardtable where eid="+eid;
		String sql="update cardtable set state=? where eid=?";
		try {
			ResultSet rs = this.db.query(s);
			if(rs.next()){
				int m = rs.getInt("state");
			 if(m==1){
				 n=0;
				 i = this.db.update(sql,n,eid);
			 }else if(m==0){
				 n=1;
				 i = this.db.update(sql,n,eid);
			 }
			}
			return i>0;
		} catch (SQLException e) {
			System.out.println("餐卡状态修改错误！");
			e.printStackTrace();
			return false;
		}finally{
			this.db.closed();
		}
	}

	public boolean updateIntegralById(int integral,int eid) {
		this.db=new DBUtil();
        int i;
        String s="select integral from cardtable where eid="+eid;
		String sql="update cardtable set integral=integral-? where eid=?";
		try {
			ResultSet rs = this.db.query(s);
			int jf = rs.getInt("integral");
			if(jf<integral){
				return false;
			}else{
				i = this.db.update(sql,integral,eid);
				return i>0;
			}
		} catch (SQLException e) {
			System.out.println("积分兑换错误");
			e.printStackTrace();
			return false;
		}finally{
			this.db.closed();
		}                                                            
	}

	public boolean addCardById(int eid) {
		this.db=new DBUtil();
		String s="select state,integral,cmoney,leve from cardtable where eid="+eid;
		        try {
					ResultSet rs = this.db.query(s);
					int state = rs.getInt("state");
					int integral = rs.getInt("integral");
					int cmoney = rs.getInt("cmoney");
					int leve = rs.getInt("leve");
					if(state==0){
						String sql="insert into cardtable(cmoney,eid,leve,integral) values(?,?,?,?)";
						int i = this.db.update(sql,cmoney,eid,leve,integral);
						return i>0;
						
					}else{
						return false;
					}
				} catch (SQLException e) {
					e.printStackTrace();
					return false;
				}   finally{
					this.db.closed();
				}  
	}

	public boolean updateCarLeve(int eid,int newleve) {
		this.db=new DBUtil();
		String s="select state from cardtable where eid="+eid;
		try {
			ResultSet rs = this.db.query(s);
			int state = rs.getInt("state");
			if(state==0){
				return false;
			}else{
				String sql="update cardtable set leve="+newleve+" where eid="+eid;
				int i = this.db.update(sql);
				return i>0;
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		   return false;
		}finally{
			this.db.closed();
		}
	}

	public boolean addIntegralById(int sum,int eid) {
		this.db=new DBUtil();
		int n=sum/10;
		String s="update Cardtable set integral=integral"+n+" where eid="+eid;
		try {
			int i = this.db.update(s);
			return i>0;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return false;
		}finally{
			this.db.closed();
		}
		
		
	}

}