package com.chinasofti.canting.domain;

import java.io.Serializable;

public class vegetable implements Serializable {
	private int vid;
	private String vname;
	private double vprice;
	private double vdiscount;
	private int vstate;
	private int vtype;
	public vegetable() {
		super();
	}
	
	public vegetable(int vid, String vname, double vprice, double vdiscount) {
		super();
		this.vid=vid;
		this.vname = vname;
		this.vprice = vprice;
		this.vdiscount = vdiscount;
	}

	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public double getVprice() {
		return vprice;
	}
	public void setVprice(double vprice) {
		this.vprice = vprice;
	}
	public double getVdiscount() {
		return vdiscount;
	}
	public void setVdiscount(double vdiscount) {
		this.vdiscount = vdiscount;
	}
	public int getVstate() {
		return vstate;
	}
	public void setVstate(int vstate) {
		this.vstate = vstate;
	}
	public int getVtype() {
		return vtype;
	}
	public void setVtype(int vtype) {
		this.vtype = vtype;
	}
	
	

}
