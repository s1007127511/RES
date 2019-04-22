package com.chinasofti.canting.domain;

public class xiaopiao {
	private String vname;
	private int number;
	private int sum;
	public xiaopiao() {
		super();
	}
	public xiaopiao(String vname, int number, int sum) {
		super();
		this.vname = vname;
		this.number = number;
		this.sum = sum;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.vname+"\t"+this.number+"\t"+this.sum;
}
}
