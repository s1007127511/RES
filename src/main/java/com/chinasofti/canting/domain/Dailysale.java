package com.chinasofti.canting.domain;

import java.io.Serializable;
import java.sql.Date;

public class Dailysale implements Serializable {
	private String did;
	private double sales;
	private Date date;
	
	public Dailysale() {
		super();
	}

	public Dailysale(String did, double sales, Date date) {
		super();
		this.did = did;
		this.sales = sales;
		this.date = date;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
