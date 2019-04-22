package com.chinasofti.canting.domain;

import java.io.Serializable;

public class Employee implements Serializable {
	private int eid;
	private String ename;
	private String epassword;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, String epassword) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.epassword = epassword;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEpassword() {
		return epassword;
	}
	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}
	@Override
	public String toString() {
		return this.eid+"\t"+this.ename+"\t"+this.epassword;
	}

}
