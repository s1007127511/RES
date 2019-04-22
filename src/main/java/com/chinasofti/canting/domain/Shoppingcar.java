package com.chinasofti.canting.domain;

import java.io.Serializable;

public class Shoppingcar implements Serializable {
	private int vid;
	private int number;
	private double price;
	private int eid;
	private String did;
	private double sum;
	public Shoppingcar() {
		super();
	}
	public Shoppingcar(int vid, int number, double price, int eid, String did, double sum) {
		super();
		this.vid = vid;
		this.number = number;
		this.price = price;
		this.eid = eid;
		this.did = did;
		this.sum = sum;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	

}
