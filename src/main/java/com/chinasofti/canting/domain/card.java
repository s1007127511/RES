package com.chinasofti.canting.domain;

import java.io.Serializable;

public class card implements Serializable {
	private int cid;
	private double cmoney;
	private int eid;
	private int leve;
	private int state;
	private int integral;
	public card() {
		super();
	}
	public card(int cid, double cmoney, int eid, int leve, int integral) {
		super();
		this.cid = cid;
		this.cmoney = cmoney;
		this.eid = eid;
		this.leve = leve;
		this.integral = integral;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public double getCmoney() {
		return cmoney;
	}
	public void setCmoney(double cmoney) {
		this.cmoney = cmoney;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getLeve() {
		return leve;
	}
	public void setLeve(int leve) {
		this.leve = leve;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	

}
