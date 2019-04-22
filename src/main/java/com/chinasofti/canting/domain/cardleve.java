package com.chinasofti.canting.domain;

import java.io.Serializable;

public class cardleve implements Serializable {
	private int leve;
	private double ediscount;
	public cardleve() {
		super();
	}
	public cardleve(int leve, double ediscount) {
		super();
		this.leve = leve;
		this.ediscount = ediscount;
	}
	public int getLeve() {
		return leve;
	}
	public void setLeve(int leve) {
		this.leve = leve;
	}
	public double getEdiscount() {
		return ediscount;
	}
	public void setEdiscount(double ediscount) {
		this.ediscount = ediscount;
	}
	

}
